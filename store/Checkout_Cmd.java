package store;

//command that allows the user to checkout.

public class Checkout_Cmd implements Customer_Cmd {

    Cart_Cmds cart = new Cart_Cmds();

    public void execute() {
        System.out.println("Checking out...");
        //display the cart so the user can see all of what they're purchasing.
        cart.cartDisplayAll();
        
        //go through the entire cart and delete each item.
        while(!cart.cartEmpty()) {
            cart.cartRmvItem(0);
        }
        
        //output the price of all the items together.
        System.out.println("The total price is " + cart.totalPrice);
    }
}
