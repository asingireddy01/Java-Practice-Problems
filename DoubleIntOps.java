public class DoubleIntOps
{
    public static void main(String[] args)
    { 
        /*Declare integer variables x = 11, y = 8, z = 3, and
    counter = 0. Display the results of x – y, y % z, z * x,
    x / y, and x – y / 3 each on a separate line. After each
    calculation, use the counter value to keep track of the
    number of operations you have performed. Display the value
    of counter at the end of the program. */
        
    int x = 11;
    int y = 8;
    int z = 3;
    int counter = 0;

    System.out.println(x-y);
    System.out.println(y%z);
    System.out.println(z*x);
    System.out.println(x/y);
    System.out.println(x - y / 3);

    for(int i=0; i<5; i++)
        {    
        counter = counter + 1;    
        }
        System.out.println(counter);  
    }
}