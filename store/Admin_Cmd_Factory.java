package store;

import store.Add_Item_Cmd;
import store.Cmd;

public class Admin_Cmd_Factory {

    public Admin_Cmd Cmd_Add_Item() {
        Add_Item_Cmd command = new Add_Item_Cmd();
        return command;
    }

    public Admin_Cmd Cmd_Remove_Item() {
        Remove_Item_Cmd command = new Remove_Item_Cmd();
        return command;
    }

    public Admin_Cmd Cmd_Remove_Customer() {
        Remove_Customer_Cmd command = new Remove_Customer_Cmd();
        return command;
    }

    public Admin_Cmd Cmd_Create_Admin() {
        Create_Admin_Cmd command = new Create_Admin_Cmd();
        return command;
    }

    public Admin_Cmd Cmd_Create_Customer() {
        Create_Customer_Cmd command = new Create_Customer_Cmd();
        return command;
    }
    
}
