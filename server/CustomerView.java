//The purpose of this file is to allow the user to select from a given menu what they would like to do.
//The view then uses a factory in order to accomplish what the user requests.

package server;

import java.rmi.Naming;
import java.util.Scanner;

import common.CustomerCmds;

public class CustomerView {

    CmdFactory factory = new CmdFactory();

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
                    System.out.println("Please enter in the SKU of the item you would like to add to your cart. Type 0 if you want to quit: \n");
                    itemSKU = readObj.nextLine();
                    if(itemSKU != "0") {
                        System.out.println("How many would you like to add?");
                        String num = readObj.nextLine();
                        stub.addItem(itemSKU, num);
                    }
                }

                else if(userResponse == "2") {
                    System.out.println("Please type in the name of the item you would like to lookup, or '0' to cancel: \n");
                    itemName = readObj.nextLine();

                    if(userResponse != "0") {
                        stub.itemLookup(itemName);
                    }
                }

                else if(userResponse == "3") {
                    stub.viewCart();
                }

                else if(userResponse == "4") {
                    stub.checkout();
                }
            }

        } catch(Exception e) {
            System.out.println("Client err :" + e.getMessage());
            e.printStackTrace();
        }
    }
}
