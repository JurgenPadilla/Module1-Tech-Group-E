package projectmarket.market;

import projectmarket.products.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Purchase {
    public ArrayList<Double> quantities;
    public ArrayList<PurchaseItem> itemList;

    public ArrayList<Double> selectQuantities(ArrayList<Integer> products, String[] merchantData)throws Exception{
        Scanner scannerConsole;
        quantities = new ArrayList<Double>();
        for(int i=0; i < products.size();i++){
            PurchaseItem purchaseItem = new PurchaseItem();
            String[] productData = Product.getProductData(products.get(i),Integer.getInteger(merchantData[0]));
            purchaseItem.productName=productData[1];
            purchaseItem.merchantAdress=merchantData[2];
            purchaseItem.unit=productData[4];
            purchaseItem.unitPrice = Double.parseDouble(productData[2]);

            System.out.println("Enter a quantity by 'Product ID':"+products.get(i));
            scannerConsole = new Scanner(System.in);
            purchaseItem.quantity=scannerConsole.nextDouble();
            quantities.add(purchaseItem.quantity);

        }
        return quantities;
    }
}
