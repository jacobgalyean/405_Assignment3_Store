package store;

public class Customer_Cmd_Factory {

    public Customer_Cmd cmd_Checkout() {
        Checkout_Cmd command = new Checkout_Cmd();
        return command;
    }

    public Customer_Cmd cmd_Item_Lookup() {
        Item_Lookup_Cmd command = new Item_Lookup_Cmd();
        return command;
    }
    
}
