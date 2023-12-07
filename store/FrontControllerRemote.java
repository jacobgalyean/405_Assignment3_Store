package store;

import java.io.File;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import common.FrontController;

public class FrontControllerRemote extends UnicastRemoteObject implements FrontController{
    
    Dispatcher dispatcher = new Dispatcher();

    protected FrontControllerRemote() throws RemoteException {
        super();
    }

    private boolean isAuthenticUser(String username, String password, String type) {
         try {
            String acctName;
            String acctPassword;
            String acctType;
            
            Scanner readAcct = new Scanner (new File("accounts.txt"));
            readAcct.useDelimiter(",");

            while(readAcct.hasNext()) {
                acctName = readAcct.next();
                acctPassword = readAcct.next();
                acctType = readAcct.next();

                if(username == acctName) {
                    if(acctPassword == password) {
                        if(acctType == type) {
                            return true;
                        }
                    }
                }
            }
            readAcct.close();

        } catch(Exception e) {
            System.out.println("Server err :" + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    public void dispatchRequest(String type) {
        String username;
        String password;
        Scanner readObj = new Scanner(System.in);

        try {

            System.out.println("Found server object, enter in your username... ");
            username = readObj.nextLine();

            System.out.println("Please enter in your password... ");
            password = readObj.nextLine();

            if(isAuthenticUser(username, password, type)) {
                dispatcher.dispatch(type);
            }
        }
        catch(Exception e) {
            System.out.println("Server ran into error, please try again: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
