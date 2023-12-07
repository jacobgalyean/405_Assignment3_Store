package store;

import java.rmi.*;
import java.rmi.registry.*;

import common.FrontController;

public class Server{

    public static void main(String args[]) {
        try {

            FrontController remote_obj = new FrontControllerRemote();

            String name = "//in-csci-rrpc01.cs.iupui.edu:2323/FrontControllerRemote";

            Naming.rebind(name,remote_obj);

            System.out.println("Server is ready");

        } catch(Exception e) {
            System.out.println("Server err: " + e.getMessage());
                e.printStackTrace();
        }
    }

}