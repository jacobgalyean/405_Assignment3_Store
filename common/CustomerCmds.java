package common;

import java.rmi.*;

public interface CustomerCmds extends Remote {

    public boolean addItem(String itemName, String num);

    public void viewCart();

    public boolean checkout();

    public void itemLookup(String itemName);
}