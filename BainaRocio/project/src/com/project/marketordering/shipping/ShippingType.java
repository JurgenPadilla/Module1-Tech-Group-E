package com.project.marketordering.shipping;

public class ShippingType {
    private String shippingType = REGULAR;
    public static final String REGULAR = "regular";
    public static final String FAST = "fast";

    public ShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }
}
