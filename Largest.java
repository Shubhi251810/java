//WAP to find the largest number of three numbers.
import java.util.Scanner;

public class largest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();
        if(a >= b && a >= c)
        {
            System.out.println("a is largest");
        }
        else if(b >= c && b>=a)
        {
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
        sc.close();
    }
}
