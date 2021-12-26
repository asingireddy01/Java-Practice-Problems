import java.util.Scanner;

public class GradingSystem  {

   public static void main(String []args)
    {
      Scanner reader = new Scanner(System.in);
      
      int score1;
      int score2;
      int score3;
      double average;

      char grade = 'A';

        System.out.println("Enter the first score: ");
        score1 = reader.nextInt();
        System.out.println("Enter the second score: ");
        score2 = reader.nextInt();
        System.out.println("Enter the third score: ");
        score3 = reader.nextInt();

        average = (score1+score2+score3)/3;
        if (average<=100 && average>=90)
            {
            grade = 'A';
            }
        else if (average<=89 && average>=80)
            {
            grade = 'B';
            }
        else if (average<=79 && average>=70)
            {
            grade = 'C';
            }
        else if (average<=69 && average>=60)
            {
            grade = 'D';
            }
        else 
            {
            grade = 'F';
            }

        System.out.println("You have accquired the grade"+grade);
   }
}