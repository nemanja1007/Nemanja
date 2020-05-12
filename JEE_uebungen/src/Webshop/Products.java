package Webshop;

import java.util.ArrayList;
import java.util.List;

public class Products {

    List<Item> items = new ArrayList<>();
    static Products products = null;
    public static Products getProducts() {
        if(products == null)
            products = new Products();
        return products;
    }
    public boolean addItem(Item item) {
        if(items.add(item)) 
            return true;
        return false;
    }
    public List<Item> getItems(){
        return items;
    }
}
