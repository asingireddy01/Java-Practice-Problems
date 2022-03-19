import java.util.Scanner;
public class Donuts {
  
    /* Given a number of donuts, write a program that will tell the
    user how many dozens there are and how many left over donuts there
    are. ie-13 donuts should yield 1 dozen and 1 left over. */

    public static void main(String[] args) {
    
       int donuts;    
       int dozens;  
       int extras; 
        
       Scanner reader = new Scanner(System.in);
       donuts = reader.nextInt();
       System.out.println(donuts+" donuts");
       
       dozens = donuts / 12;
       extras = donuts % 12;
       
       System.out.println(dozens+" dozens");
       System.out.println(extras+" left over");
    }  
 }  