package com.project.marketordering.market;

import com.project.marketordering.person.Empleado;
import com.project.marketordering.products.Product;

import java.util.List;

public class Mercado {
    private List<Empleado> empleadoList;
    private List<PurchaseCar> purchaseCarList;
    private List<Product> productList;

    public Mercado(List<Empleado> empleadoList, List<PurchaseCar> purchaseCarList, List<Product> productList) {
        this.empleadoList = empleadoList;
        this.purchaseCarList = purchaseCarList;
        this.productList = productList;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public List<PurchaseCar> getPurchaseCarList() {
        return purchaseCarList;
    }

    public void setPurchaseCarList(List<PurchaseCar> purchaseCarList) {
        this.purchaseCarList = purchaseCarList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
