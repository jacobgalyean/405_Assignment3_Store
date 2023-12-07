package store;

import java.io.File;
import java.util.Scanner;

public class Add_Item_Cart_Cmd implements Customer_Cmd{
    
    public void execute() {
        Scanner readObj = new Scanner(System.in);

        System.out.println("Please enter the item you would like to add to your cart: ");
        String itemName = readObj.nextLine();

        try {
            String name;
            String description;
            String quantity;
            String price;
            
            Scanner readItem = new Scanner (new File("items.txt"));
            readItem.useDelimiter(",");

            while(readItem.hasNext()) {
                name = readItem.next();
                description = readItem.next();
                quantity = readItem.next();
                price = readItem.next();

                if(name == itemName) {
                
                }
            }
            readItem.close();

        } catch(Exception e) {
            System.out.println("Server err :" + e.getMessage());
            e.printStackTrace();
        }
    }
}
