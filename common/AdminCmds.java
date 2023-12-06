package common;

import java.rmi.*;

public interface AdminCmds extends Remote {

    public boolean addItem(String itemName, String description, String quantity, String price);

    public boolean removeItem(String itemName);

    public void editItem(String itemName);

    public boolean addAcct(String acctName, String acctPassword, String acctType);

    public boolean rmvAcct(String acctName);
}