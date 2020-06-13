package vn.edu.ntu.ngocdoan.controller;

import android.content.Context;

import androidx.room.Room;

import java.util.ArrayList;
import java.util.List;

import vn.edu.ntu.ngocdoan.model.AppDatabase;
import vn.edu.ntu.ngocdoan.model.DAOProduct;
import vn.edu.ntu.ngocdoan.model.Product;

public class CartControllerDB implements ICartController
{
    AppDatabase database;
    ArrayList<Product> shoppingCart = new ArrayList<>();
    DAOProduct daoProduct;

    public CartControllerDB(Context context)
    {
        database = Room.databaseBuilder(context,
                AppDatabase.class, "appdb")
                .allowMainThreadQueries()
                .build();
        daoProduct = database.getProductDAO();
    }

    @Override
    public ArrayList<Product> getListProduct() {
//        return daoProduct.getListProduct();
    }

    @Override
    public ArrayList<Product> getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public boolean addToShoppingCart(Product p)
    {
        if (!shoppingCart.contains(p))
        {
            shoppingCart.add(p);
            return true;
        }
        return false;
    }

    @Override
    public void clearShoppingCart()
    {
        shoppingCart.clear();
    }
}
