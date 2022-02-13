public class Variables
{
    public static void main(String[] args)
    {
        String name = "Ruben Gaspard";
        System.out.println("Name: " +name);
        int test1 = 95;
        int test2 = 76;
        int test3 = 88;

        System.out.println("Test 1: " +test1);
        System.out.println("Test 2: " +test2);
        System.out.println("Test 3: " +test3+"\n");

        int sum = test1+test2+test3;
        System.out.println("Sum: " +sum);
        int average = (test1+test2+test3)/(3);
        System.out.println("Average: " +average);

        System.out.print("Hi\tmy name is\nBob\nBut you can call me \"Bobby\"");
    }
}