package store;

import java.io.File;
import java.util.Scanner;

public class Item_Lookup_Cmd implements Customer_Cmd {
    
    Scanner readObj = new Scanner(System.in);

    public void execute() {
        System.out.println("What item name would you like to look up?");
        String itemName = readObj.nextLine();
                    
        String name;
        String description;
        String quantity;
        String price;
                        
        try {
            Scanner readItem = new Scanner (new File("items.txt"));
            readItem.useDelimiter(",");

            while(readItem.hasNext()) {
                name = readItem.next();
                description = readItem.next();
                quantity = readItem.next();
                price = readItem.next();

                if(name == itemName) {
                    System.out.println(name + " " + description + " " + quantity + " " + price);
                    break;
                }
                readItem.close();
            }
        }catch(Exception e) {
            System.out.println("Server err :" + e.getMessage());
            e.printStackTrace();
        }
        
    }
}
