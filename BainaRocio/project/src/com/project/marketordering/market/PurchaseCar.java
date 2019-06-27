package com.project.marketordering.market;

import java.util.Date;
import java.util.List;

public class PurchaseCar {
    private List<PurchaseItem> purchaseItemList;
    private Date purchaseDate;

    public PurchaseCar(List<PurchaseItem> purchaseItemList) {
        this.purchaseItemList = purchaseItemList;
    }

    public List<PurchaseItem> getPurchaseItemList() {
        return purchaseItemList;
    }

    public void setPurchaseItemList(List<PurchaseItem> purchaseItemList) {
        this.purchaseItemList = purchaseItemList;
    }
}
