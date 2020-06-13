package vn.edu.ntu.ngocdoan.controller;

import java.util.ArrayList;

import vn.edu.ntu.ngocdoan.model.Product;

public interface ICartController
{
    public ArrayList<Product> getListProduct();
    public ArrayList<Product> getShoppingCart();
    public boolean addToShoppingCart(Product p);
    public void clearShoppingCart();
}
