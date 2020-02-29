import java.util.Scanner;
public class Prime_Factors
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Prime Factors of your number except 1 and the number itself are: ");
        int i = 2;
        while(number>1)
        {
            
            if((number%i)==0)
            {
                System.out.println(i);
                number = number/i;
            }
            
            else
            {
                i++;
            }
        }
    }
}
