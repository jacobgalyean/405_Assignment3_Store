//Login is the file that contains the main function.
//It's purpose is to recieve initial user input in order to correctly inform the Front Controller of where to go and what to check.

package client;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

import common.FrontController;
import store.AdminView;
import store.CustomerView;

public class Login {

    public static void main(String args[]) {
        Scanner readObj = new Scanner(System.in);
        String accType;
        Boolean keepGoing = true;
        
        try {
            while(keepGoing) {

                //Create connection to the Front Controller, which is in the server folder.
                String name = "//in-csci-rrpc01.cs.iupui.edu:2323/FrontControllerRemote";
                FrontController stub = (FrontController)Naming.lookup(name);

                System.out.println("Found server object, enter in the type of account you are logging into. \n");
                System.out.println("If you are logging into a customer account, type 'customer', if you are logging into an admin account, type 'admin' or type 'QUIT' to exit...");
                accType = readObj.nextLine();
                
                if(accType == "QUIT" ) {
                    keepGoing = false;
                }

                //If the user enters in anything other than QUIT (hopefully an account type), a dispatch request will be sent to the server.
                else {
                    stub.dispatchRequest(accType);
                }
            }
        } catch(Exception e) {
            System.out.println("Client err :" + e.getMessage());
            e.printStackTrace();
        }
    }
}