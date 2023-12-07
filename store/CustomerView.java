//The purpose of this file is to allow the user to select from a given menu what they would like to do.
//The view then uses a factory in order to accomplish what the user requests.

package store;

import java.io.File;
import java.rmi.Naming;
import java.util.Scanner;

import common.CustomerCmds;

public class CustomerView {

    Customer_Cmd_Factory factory = new Customer_Cmd_Factory();
    Cart_Cmds cart = new Cart_Cmds();

    CustomerView(){

    }

    public void show() {
      try{
            String userResponse;
            boolean keepGoing = true;

            while(keepGoing) {
                Scanner readObj = new Scanner(System.in);

                System.out.println("Successfully connected. \n Please type the number associated with what you'd like to do: \n");
                System.out.println("0.) Quit \n 1.) Add Item to Cart \n 2.) Lookup Item \n 3.) View Cart \n 4.) Checkout");

                userResponse = readObj.nextLine();

                if (userResponse == "0") {
                    keepGoing = false;
                }

                else if(userResponse == "1") {
                    System.out.println("Please enter the item you would like to add to your cart: ");
                    String itemName = readObj.nextLine();
                    
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
                            System.out.println("How many would you like of " + itemName + "? \n");
                            quantity = readObj.nextLine();

                            cart.cartAddItem(itemName, quantity, price);
                        }
                    }
                    readItem.close();
                } 
            }
        }catch(Exception e) {
            System.out.println("Server err :" + e.getMessage());
            e.printStackTrace();
        }
    }
}
