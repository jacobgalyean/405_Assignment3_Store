package store;

public class Checkout_Cmd implements Customer_Cmd {

    Cart_Cmds cart = new Cart_Cmds();

    public void execute() {
        System.out.println("Checking out...");
        cart.cartDisplayAll();
        
        while(!cart.cartEmpty()) {
            cart.cartRmvItem(0);
        }

        System.out.println("The total price is " + cart.totalPrice);
    }
}
