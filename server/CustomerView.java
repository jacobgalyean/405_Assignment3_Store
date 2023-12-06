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

                readObj.close();
            }

        } catch(Exception e) {
            System.out.println("Client err :" + e.getMessage());
            e.printStackTrace();
        }
    }
}
