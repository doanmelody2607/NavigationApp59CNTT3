package vn.edu.ntu.ngocdoan.controller;

import java.util.ArrayList;

import vn.edu.ntu.ngocdoan.model.Product;

public class CartController implements ICartController
{
    ArrayList<Product> listProduct = new ArrayList<>();

    @Override
    public ArrayList<Product> getListProduct() {
        return listProduct;
    }
}
