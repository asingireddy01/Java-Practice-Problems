public class AvgSum
{
    /*Given the integer variables a = 81, b = 62, and c = 76, write
    a program that will do the following. Declare a variable for sum and
    a variable for average (be sure to use the proper type) and display
    the results as follows. Calculate average and sum using the variables
    a, b, and c, not the numbers 81, 62, and 76. */
    public static void main(String[] args)
    {
        int a = 81;
        int b = 62;
        int c = 76;
        int sum;
        double avg;

        sum = (a+b+c);
        avg = (sum/3);
        System.out.println("Numbers: "+a+", "+b+", and "+c);
        System.out.println("Sum:     "+sum);
        System.out.println("Average: "+avg);
    }
}