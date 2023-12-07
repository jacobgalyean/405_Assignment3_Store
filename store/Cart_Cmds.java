package store;

import java.util.ArrayList;

public class Cart_Cmds {
    ArrayList<String> contents = new ArrayList<String>();
    int totalPrice = 0;

    public void cartAddItem(String itemName, String quantity, String itemPrice) {
        contents.add(itemName + " " + quantity  + " " + itemPrice);
        int price = Integer.parseInt(itemPrice);
        totalPrice += price;
    }

    public void cartRmvItem(int index) {
        contents.remove(index);
    }

    public boolean cartEmpty() {
        if(contents.size() == 0) {
            return true;
        }
        return false;
    }

    public void cartDisplayAll() {
        for(int i = 0; i < contents.size(); i++) {
            System.out.println(contents.get(i) + "\n");
        }
    }
}
