package store;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import common.AdminCmds;

public class AdminCmdsRemote extends UnicastRemoteObject implements AdminCmds{

    protected AdminCmdsRemote() throws RemoteException {
        super();

    }

    public boolean addItem(String itemName, String description, String quantity, String price) {
        return true;
    }

    public boolean removeItem(String itemName) {
        return true;
    }

    public void editItem(String itemName) {
        
    }

    public boolean addAcct(String acctName, String acctPassword, String acctType) {
        return true;
    }

    public boolean rmvAcct(String acctName) {
        return true;
    }
}
