package com.project.marketordering.market;

import com.project.marketordering.products.Product;

public class PurchaseItem {
    private Product product;
    private Double salePrice;
    private Double discount;

    public PurchaseItem(Product product, Double salePrice, Double discount) {
        this.product = product;
        this.salePrice = salePrice;
        this.discount = discount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
