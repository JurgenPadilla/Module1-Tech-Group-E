public class DbTable {


    public void insertDistributor(){

        // Create query
        String query = "insert into brb.br_entity_mt (CONTROL_NUMBER, ORG_ID, ORG_NAME, OFA_CUSTOMER_ID, CUSTOMER_NAME, SALES_CHANNEL, BR_CUSTOMER_TYPE, RETAILER_PIN, RETAILER_NAME, 
ENTITY_TYPE, BR_LAST_INVOICED, BR_LAST_CHARGED, BR_NEXT_INVOICED, CLASS, BR_AUTO_CHARGE_FLAG, MASTER_ACCOUNT_ID, BR_BILLING_INTERVAL, BR_INTERVAL_MPX, BR_INTERVAL_MAP, 
BR_PAYMENT_TERMS, BILL_TO_SITE_USE_ID, ADDRESS_ID, BR_LINKED, SERVICE_ACCOUNT_TYPE, RETAILER_BILL_TYPE, BR_CREDIT_LIMIT, STATE, PROVINCE, COUNTRY, DUE_DATE, DISTRIBUTOR_CTLNUM, 
SERVICE_PRODUCT_CATEGORY_ID, PRODUCT_CATEGORY, REGULATION_LEVEL, PARENT_RETAILER_CTLNUM, FINANCE_ORG_ID, ACCOUNT_START_DATE, BILL_CYCLE, BILL_DAY, BILL_DD, CURRENCY_CODE, LOB, 
RAM_RESELLER, RAM_CUSTOMER, TOTAL_DUE, BRB_NEXT_INVOICED, BILLING_SCHEME, BR_LAST_CREDITED, BR_AUTO_CREDIT_FLAG, EMAIL, WW_AGENT_NUM, OVERRIDE_PAYMENT_DATE, CHARGE_HOLD) values ( 
2003832970, 2, 'Union Telecard Alliance LLC', 695687, 'TOUCH-N-BUY LLC', 'BR_US', 'DISTRIBUTOR', null, null, 'D', null, null, null, null, 'Y', 695687, 'd', 1, null, null, 79616, 74286, 
null, 'CL', 'POSTPAID', 0, 'FL', null, 'US', null, 2003832970, 6, 'REG', 'R', null, 0, '23-08-2011 03:08:33', 'M', null, '1', 'USD', 'UTA', 'N', 'N', 0, '09-01-2018', null, null, null, 
'test1011@gmail.com', null, null, null)";

        // Validate query accord requirement
        boolean isQueryValid = false;
        String columns = query.substring(31,848);
        String values = query.substring(859,1267);
        String[] valuesByColumn = values.split(",");

        // 1.- control_number == distributor_ctlnum - c1 = c31
        boolean controlNumberValidation = valuesByColumn[0].equals(valuesByColumn[30]);

        // 2.- ofa_customer_id == master_account_id - c4 = c16
        boolean masterAccountValidation = valuesByColumn[3].equals(valuesByColumn[15]);

        // 3.- Br_customer_type == 'DISTRIBUTOR' - c60 = 'DISTRIBUTOR'
        boolean distributorValidation = valuesByColumn[6].equals("DISTRIBUTOR");

        isQueryValid = controlNumberValidation && masterAccountValidation && distributorValidation;

        if (isQueryValid){
            // insert
            System.out.println("Distributor was created!");
        } else {
            System.out.println("Data for distributor is not valid!");
        }
    }
    public static void main (String args[]){

        DbTable distributor = new DbTable();

        // perform an insert.
        distributor.insertDistributor();
    }
}

