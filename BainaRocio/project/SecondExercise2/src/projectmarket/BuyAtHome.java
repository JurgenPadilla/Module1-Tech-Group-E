package projectmarket;

import projectmarket.market.Merchant;
import projectmarket.market.Purchase;
import projectmarket.products.Product;

import java.util.ArrayList;
import java.util.List;


public class BuyAtHome {
    public static void main(String[] args){
        Merchant merchant = new Merchant();
        Product product = new Product();
        Purchase purchase = new Purchase();
        try {
            merchant.showMerchants();
            Integer merchantId = merchant.selectMerchant();
            product.showProductByMerchantId(merchantId);
            ArrayList<Integer> productsSelected = product.selectProducts();
            String[] partialMerchant = Merchant.getMerchantData(merchantId);
            purchase.selectQuantities(productsSelected, partialMerchant);
        } catch (Exception e){
            System.out.println("Error in application "+e.getStackTrace());
        }
    }
}
