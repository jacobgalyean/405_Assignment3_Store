package server;

import java.util.ArrayList;

public class Cart {
    ArrayList<String> contents = new ArrayList<String>();

    public void cartAddItem(String itemName, String quantity, String itemPrice) {
        contents.add(itemName + " " + quantity  + " " + itemPrice);
    }

    public void cartRmvItem(int index) {
        contents.remove(index);
    }

    public void cartDisplayAll() {
        for(int i = 0; i < contents.size(); i++) {
            System.out.println(contents.get(i) + "\n");
        }
    }
}
