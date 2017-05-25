import java.util.Scanner;
public class Quad
{
    public static void main(String[] args) 
      {
        double a, b, c;
        double root1, root2, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Given quadratic equation:ax^2 + bx + c");
        System.out.print("Enter a:");
        a = s.nextDouble();
        System.out.print("Enter b:");
        b = s.nextDouble();
        System.out.print("Enter c:");
        c = s.nextDouble();
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        d = b * b - 4 * a * c;
        if(d > 0)
        {
            System.out.println("Roots are real and unequal");
            root1 = ( - b + Math.sqrt(d))/(2*a);
            root2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("First root is:"+root1);
            System.out.println("Second root is:"+root2);
        }
        else if(d == 0)
        {
            System.out.println("Roots are real and equal");
            root1 = (-b+Math.sqrt(d))/(2*a);
            System.out.println("Root:"+root1);
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
    }
}


/*Output:

Given quadratic equation:ax^2 + bx + c
Enter a:1
Enter b:8
Enter c:3.75
Given quadratic equation:1.0x^2 + 8.0x + 3.75
Roots are real and unequal
First root is:-0.5
Second root is:-7.5

*/