package store;

public class Customer_Cmd_Factory {

    public Customer_Cmd cmd_Checkout() {
        Checkout_Cmd command = new Checkout_Cmd();
        return command;
    }

    public Customer_Cmd cmd_Add_Item_Cart() {
        Add_Item_Cart_Cmd command = new Add_Item_Cart_Cmd();
        return command;
    }

    public Customer_Cmd cmd_Remove_Item_Cart() {
        Create_Admin_Cmd command = new Create_Admin_Cmd();
        return command;
    }

    public Admin_Cmd Cmd_Create_Customer() {
        Create_Customer_Cmd command = new Create_Customer_Cmd();
        return command;
    }
    
}
