import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Manager {
    public Store UoGStore;
    private String FileName;
    public Manager(Store a,String FileName) throws IOException, ClassNotFoundException{
        this.FileName=FileName;
        File StoreData= new File(FileName);
        if(StoreData.exists()){
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(StoreData));
            UoGStore = (Store)ois.readObject();
        }else{
            UoGStore=a;
        }
    }
    public static int mainMenu(){
        String menu = "MAIN MENU\n"
                + "       1)Store menu\n"
                + "       2)Help\n"
                + "       3)About\n"
                + "       4)Change user interface\n"
                + "       0)Exit";
        return getInt(menu,"Main Menu",0,4);
    }
    public static int storeMenu(){
        String menu = " STORE MENU\n" +
                "       1)Register package\n" +
                "       2)Display packages\n" +
                "       3)Dispatch packages\n" +
                "       4)Issue packages\n" +
                "       5)Sort packages\n" +
                "       6)REPORT MENU\n" +
                "       7)Export package list to other file format\n" +
                "       0)Back to MAIN MENU\n";

        return getInt(menu,"STORE MENU",0,7);

    }
    public static int reportMenu(){
        String menu = " REPORT MENU\n" +
                "      1)Display report\n" +
                "      2)Export report to other file formats\n" +
                "      0)Back to MAIN MENU";
        return getInt(menu,"REPORT MENU",0,2);
    }
    public static int exportListMenu(){
        String menu = " EXPORTING LIST OF PACKAGES\n" +
                "      1)HTML (web page)\n" +
                "      2)CSV(spreed sheet)\n" +
                "      3)TXT(text file)\n" +
                "      0)back to MAIN MENU";
        return getInt(menu,"REPORT MENU",0,3);
    }
    public int update() throws IOException{
        int sle=mainMenu();
        switch(sle){
            case 0:
                return 0;
            case 1:
            {
                int seleSto;
                do{
                    seleSto = storeMenu();
                    switch(seleSto){
                        // list all the cases here
                        case 0:
                            return 1;
                        case 1:
                            register();
                            break;
                        case 2:
                            UoGStore.display();
                            break;
                        case 3:
                            //dispatch package after searching it
                            UoGStore.dispatch();
                            UoGStore.saveStoreTo(FileName);
                            break;
                        case 4:
                            UoGStore.issue();
                            UoGStore.saveStoreTo(FileName);
                            break;
                        case 5:
                            UoGStore.sort();
                            UoGStore.saveStoreTo(FileName);//save the Store class after sorting packages
                            break;
                        case 6:{
                            int selRep;
                            do{
                                Report StoreReport = UoGStore.toReport();
                                if(StoreReport==null){
                                    if(GUI.DEFAULT_UI==userInterface.GRAPHICAL){
                                        JOptionPane.showMessageDialog(null,"some packages are needed to generate report.","the store is empty.",JOptionPane.ERROR_MESSAGE);
                                    }else{
                                        System.out.println("some packages are needed to generate report.\n but the store is empty.");
                                    }
                                    break;
                                }
                                selRep = reportMenu();
                                switch(selRep){
                                    // list all the cases here
                                    case 0:
                                        break;
                                    case 1:
                                        StoreReport.display();
                                        break;
                                    case 2:
                                    {   int expoSel;
                                        do{
                                            expoSel = exportListMenu();
                                            switch(expoSel){
                                                // list all the cases here
                                                case 0:
                                                    break;
                                                case 1:
                                                    StoreReport.exportTo(FileType.HTML);
                                                    break;
                                                case 2:
                                                    StoreReport.exportTo(FileType.CSV);
                                                    break;
                                                case 3:
                                                    StoreReport.exportTo(FileType.TXT);
                                                    break;
                                            }
                                        }while(expoSel!=0);
                                    }
                                }
                            }while(selRep!=0);
                        }
                        break;
                        case 7:
                        {
                            int selRep;
                            do{
                                selRep = exportListMenu();
                                switch(selRep){
                                    // list all the cases here
                                    case 0:
                                        break;
                                    case 1:
                                        UoGStore.exportTo(FileType.HTML);
                                        break;
                                    case 2:
                                        UoGStore.exportTo(FileType.CSV);
                                        break;
                                    case 3:
                                        UoGStore.exportTo(FileType.TXT);
                                        break;
                                }
                            }while(selRep!=0);
                        }
                    }
                }while(seleSto!=0);
            }
            break;
            case 2:
                help();
                return 1;
            case 3:
                about();
                return 1;
            case 4:
                UoGStore.setting();
                return 1;
        }
        return 0;
    }
    public static int getInt(String prompt,String promptTitle, int startInt, int endInt){
        if(GUI.DEFAULT_UI!=userInterface.TERMINAL){
            try{
                int temp=Integer.parseInt(JOptionPane.showInputDialog(null,prompt,promptTitle,JOptionPane.INFORMATION_MESSAGE));
                while(true){
                    if(temp>=startInt&&temp<=endInt){
                        return temp;
                    }else{
                        JOptionPane.showMessageDialog(null,"invalid input","invalid input detected",JOptionPane.ERROR_MESSAGE);
                        temp=Integer.parseInt(JOptionPane.showInputDialog(null,prompt,promptTitle,JOptionPane.INFORMATION_MESSAGE));
                    }
                }

            }catch(HeadlessException | NumberFormatException e){
                JOptionPane.showMessageDialog(null,"invalid input","invalid input detected",JOptionPane.ERROR_MESSAGE);
                return getInt(prompt,promptTitle,startInt,endInt);
            }
        }else{
            System.out.println(prompt);
            Scanner in = new Scanner(System.in);
            int temp;
            try{
                temp =in.nextInt();
                while(true){
                    if(temp>=startInt&&temp<=endInt){
                        return temp;
                    }else{
                        System.out.println("invalid input detected, try again.");
                        temp = in.nextInt();
                    }
                }
            }catch(InputMismatchException e){
                System.out.println("invalid input try again.");
                return getInt(prompt,promptTitle,startInt,endInt);
            }

        }
    }
    public static void about(){
        String MESSAGE = " ABOUT\n" +
                "                                                 \n" +
                "       Name :Store Management\n" +
                "       Version: 0.01                             \n";
        if(GUI.DEFAULT_UI==userInterface.GRAPHICAL){
            JOptionPane.showMessageDialog(null,MESSAGE,"ABOUT",JOptionPane.INFORMATION_MESSAGE);
        }else{
            System.out.println(MESSAGE);
            System.out.println("press enter to continue.");
            try {
                System.in.read();
            } catch (IOException ex) {
                System.out.println("there was an error reading the input.");
            }
        }
    }
    public static void help(){
        String MESSAGE = "Store management system is a program          \n" +
                "that helps to manage a store\n";
        if(GUI.DEFAULT_UI==userInterface.GRAPHICAL){
            JOptionPane.showMessageDialog(null,MESSAGE,"HELP",JOptionPane.INFORMATION_MESSAGE);
        }else{
            System.out.println(MESSAGE);
            System.out.println("press enter to continue.");
            try {
                System.in.read();
            } catch (IOException ex) {
                System.out.println("there was an error reading the input.");
            }
        }
    }
    public void register() throws IOException{
        //register a package here
        boolean isCont;
        do{
            isCont=false;
            UoGStore.enterPackage();
            if(GUI.DEFAULT_UI==userInterface.GRAPHICAL){
                if(0==JOptionPane.showConfirmDialog(null,"do you want to continue registering?","registering",JOptionPane.YES_NO_OPTION)){
                    isCont=true;
                }
            }else{
                Scanner in=new Scanner(System.in);
                System.out.println("do you want to continue registering? (Y/n)");
                String isTrue = in.next();
                isCont=isTrue.equalsIgnoreCase("Y");
            }
        }while(isCont);
        UoGStore.saveStoreTo(FileName);//save the Store to a file after registering packages
    }
}
