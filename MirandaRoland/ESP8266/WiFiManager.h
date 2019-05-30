#include <ESP8266WiFi.h>          //  ---> https://github.com/esp8266/Arduino

//#include <DNSServer.h>  --> must be implemented later
//#include <DHCPserver.h> --> must be implemented later
#include <ESP8266WebServer.h>
#include <WiFiManager.h>         // ----> https://github.com/tzapu/WiFiManager

//for LED status
#include <Ticker.h>
Ticker ticker;

String macToStr(const uint8_t* mac) {
  String result;
  for (int i = 4; i < 6; ++i) {
    result += String(mac[i], 16);
  }
  return result;
}

void tick()
{
  //state
  int state = digitalRead(BUILTIN_LED);  // get the current state of GPIO1 pin
  digitalWrite(BUILTIN_LED, !state);     // set pin to the opposite state
}

void configModeCallback (WiFiManager *myWiFiManager) {
  Serial.println("Config mode");
  Serial.println(WiFi.softAPIP());
  //if you used auto generated SSID, print it
  Serial.println(myWiFiManager->getConfigPortalSSID());
  //entered config mode (led toggle faster)
  ticker.attach(0.2, tick);  
}

void setup() {
  // console speed to run once:
  Serial.begin(115200);

  //set led pin as output
  pinMode(BUILTIN_LED, OUTPUT);
  // start ticker with 0.5 because we start in AP mode and try to connect
  ticker.attach(0.6, tick);

  //WiFiManager
  //Local intialization
  WiFiManager wifiManager;
  //reset saved settings
  wifiManager.resetSettings();

  //set custom ip for portal
  wifiManager.setAPConfig(IPAddress(192,168,0,20), IPAddress(192,168,0,1), IPAddress(255,255,255,0)); //Configuration is: IP, GW, MASK
  //Modify later

  wifiManager.setDebugOutput(true);
  //Introduce ssid and pass from eeprom and tries to connect
  //if it does not connect it starts an access point with the specified name
  //here  "AutoConnectAP"
  //and goes into a blocking loop awaiting configuration

  String APNAME = "AutoConnectAP-";
  uint8_t mac[6];
  WiFi.macAddress(mac);
  APNAME += macToStr(mac);

  wifiManager.setAPCallback(configModeCallback);
/*  
  wifiManager.autoConnect(APNAME.c_str(), "password123");
  //or use this for auto generated name ESP + ChipID
  //wifiManager.autoConnect();
*/

  //introduce ssid and pass and tries to connect
  //if it does not connect it starts an access point with the specified name
  //here  "AutoConnectAP"
  //and goes into a blocking loop awaiting configuration
  if(!wifiManager.autoConnect(APNAME.c_str(), "password123")) {
    Serial.println("failed to connect and hit timeout");
    //reset and try again, or maybe put it to deep sleep
    ESP.reset();
    delay(1000);
  } 

  //if you get here you have connected to the WiFi
  Serial.println("connected :)");

  ticker.detach();
  //keep LED on
  digitalWrite(BUILTIN_LED, LOW);
    
}

void loop() {
  // put your main code here, to run repeatedly:
}