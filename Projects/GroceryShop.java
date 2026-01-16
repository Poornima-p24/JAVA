package Projects;
import java.util.Scanner;
public class GroceryShop {

    public static void main(String args[])
    {
        
    String[] item = new String[10];
    float[] price = new float[10];
    
    item[0] = "Apple"; price[0] = 0.50f;
    item[1] = "Banana"; price[1] = 0.30f;
    item[2] = "Bread"; price[2] = 2.00f;
    item[3] = "Milk"; price[3] = 1.50f;
    item[4] = "Eggs"; price[4] = 2.50f;
    item[5] = "Cheese"; price[5] = 3.00f;
    item[6] = "Chicken"; price[6] = 5.00f;
    item[7] = "Rice"; price[7] = 1.00f;
    item[8] = "Pasta"; price[8] = 1.20f;
    item[9] = "Tomato"; price[9] = 0.80f;
    
    
    Scanner scan=new Scanner(System.in);
    float total=0;
   
    class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}

   
while(true)
{
System.out.println("choose  your item name");
    String name=scan.nextLine();
    if(name.equalsIgnoreCase("exit"))
    {
        System.out.println("your bill"+total);
        System.out.println("Thanks for shopping");
          break;
    }
    
    int index=-1;
    for(int i=0;i<item.length;i++)
    {
    if(item[i].equalsIgnoreCase(name))
    {
        index=i;
        break;
    }
}
try{
if(index==-1)
{
    throw new ItemNotFoundException("Item"+name+"not found sryy!");
}
else{
    total=total+price[index];
}
}
catch(ItemNotFoundException e)
{
    System.out.println(e.getMessage());
}
}
scan.close();
    }
}