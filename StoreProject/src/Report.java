import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;


public final class Report implements displayable{
    private Package[] list;
    private String header;
    private String bodyText;
    private double TotalAsset;
    private double costOFissuedItems;
    private double costOFdispatched;
    private final Object[][] comparePackagesTable;

    public Report(Package[] list,String header,String bodyText){
        this.list=list;
        this.header=header;
        this.bodyText=bodyText;
        comparePackagesTable = new Object[list.length+1][2];//two columns, plus one row for columns titles
        comparePackagesTable[0][0]="code";
        comparePackagesTable[0][1]="percentage";
        calculate();
    }
    @Override
    public void display(){
        if(GUI.DEFAULT_UI!=userInterface.GRAPHICAL){
            gShow();
        }else{
            tShow();
        }
    }
    @Override
    public String toString(){
        String temp=header+"\r\n"+bodyText+"\r\n"+
                "the following table shows property model with its\r\n" +
                "corresponding percentage of its price compared with\r\n" +
                "the total asset of the store. note that the percentage\r\n" +
                "is rounded.\r\n"+
                "____________________________\r\n";
        temp+=String.format("%15s|%5s %n",comparePackagesTable[0][0],comparePackagesTable[0][1]);
        for(int i=1,listWithColumen=list.length+1;i<listWithColumen;i++){
            temp+=String.format("%15s|%10f %n",comparePackagesTable[i][0],(double)comparePackagesTable[i][1]);
        }
        temp+="____________________________\r\n"
                +"total asset of the store is "+TotalAsset+" $\r\n"
                + "the issued items will cost "+costOFissuedItems+" $\r\n"
                + "the disptched items cost "+costOFdispatched+" $\r\n\r\n"
                + "this is generated using store management program.";
        return temp;
    }

    public double getTotalAsset(){
        return TotalAsset;
    }
    public void calculate(){
        TotalAsset=0;
        costOFdispatched=0;
        costOFissuedItems=0;
        for (Package l : list) {
            TotalAsset += l.getAsset();
            costOFdispatched += l.getDispatched() * l.getPrice();
            costOFissuedItems += l.getIssued() * l.getPrice();
        }
        for(int i=0;i<list.length;i++){
            comparePackagesTable[i+1][0]=list[i].getCode();
            comparePackagesTable[i+1][1]=((list[i].getAsset() * 100)/TotalAsset);
        }
    }

    @Override
    public void gShow() {
        String temp="<html><h3>"+header+"</h3><br>"+bodyText+"<br>the table shows property model with its<br/>" +
                "corresponding percentage of its price compared with<br/>" +
                "the total asset of the store. note that the percentage<br/>" +
                "is rounded.</html>";
        String shortSummery="<html>total asset of the store is "+TotalAsset+" $$<br/>"
                + "the issued items will cost "+costOFissuedItems+" $$<br/>"
                + "the dispatched items cost "+costOFdispatched+" $$<br/>"
                + "this is generated using store management.<html>";
        JPanel panel = new JPanel();
        JLabel jl = new JLabel(temp);
        JLabel jl2 = new JLabel(shortSummery);
        JTable t = new JTable(comparePackagesTable,new String[]{"code","percentage"});
        panel.add(jl);
        panel.add(t);
        panel.add(jl2);
        JOptionPane.showMessageDialog(null,panel,"Report",JOptionPane.INFORMATION_MESSAGE);

    }

    public void exportTo(FileType type) throws IOException{
        switch(type){
            case HTML:{
            }
            break;
            case CSV:{
            }
            break;
            case TXT:{
            }
            break;
        }
    }
    @Override
    public void tShow() {
        System.out.println(toString());
    }

}
