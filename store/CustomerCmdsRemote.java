package store;

import java.io.File;
import java.io.FileWriter;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import common.CustomerCmds;

public class CustomerCmdsRemote extends UnicastRemoteObject implements CustomerCmds {

    static public Cart_Cmds cart = new Cart_Cmds();

    protected CustomerCmdsRemote() throws RemoteException {
        super();

    }

    public boolean addItem(String itemName, String num) {
        try {
            String name;
            String description;
            String quantity;
            String price;
            
            Scanner readItem = new Scanner (new File("items.txt"));
            readItem.useDelimiter(",");

            while(readItem.hasNext()) {
                name = readItem.next();
                description = readItem.next();
                quantity = readItem.next();
                price = readItem.next();

                if(name == itemName) {
                    cart.cartAddItem(itemName, quantity, price);
                    return true;
                }
            }
            readItem.close();

        } catch(Exception e) {
            System.out.println("Server err :" + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    public void viewCart() {
        cart.cartDisplayAll();
    }

    public boolean checkout() {
        return true;
    }

    public void itemLookup(String itemName) {
        
    }

}
