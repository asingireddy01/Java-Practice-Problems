import java.util.Scanner;

public class softwareCompany  {

   public static void main(String []args)
    {
      Scanner reader = new Scanner(System.in);
      
      int price = 99;
      double discount = 0;
      double totalcost;
      int quantity;

        System.out.println("Enter the number of unit sold: ");
        quantity = reader.nextInt();
        if (quantity<=19 && quantity>=10)
        {
            discount = 0.2;
        }
        else if (quantity<=49 && quantity>=20)
        {
            discount = 0.3;
        }
        else if (quantity<=99 && quantity>=50)
        {
            discount = 0.4;
        }
        else if (quantity>=100)
        {
            discount = 0.5;
        }
        
        double totalprice = quantity*price;
        totalcost = totalprice-(totalprice*discount);

        System.out.println("The total cost is: "+totalcost);
   }
}