import java.util.Scanner;

public class smallMedium {

   public static void main(String []args)
    {
      Scanner reader = new Scanner(System.in);
      
      System.out.println("Enter three numbers: ");
      int a = reader.nextInt();
      int b = reader.nextInt();
      int c = reader.nextInt();

      /*if((a-b==b-c) || (a-c==c-b) || (b-a==a-c))
      System.out.println("Evenly spaced");
      else
      System.out.println("Not evenly spaced");
      */

        if(a>=13 && a<=19 && a!=15 && a!=16)
        {
            a=0;
        }
        if(b>=13 && b<=19 && b!=15 && b!=16)
        {
            b=0;
        }
        if(c>=13 && c<=19 && c!=15 && c!=16)
        {
            c=0;
        }

        int sum = (a+b+c);
        System.out.println(sum);
    }
}