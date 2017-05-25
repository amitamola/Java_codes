public class Quadcmd
{
    public static void main(String [] args) 
      {
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
        double root1, root2, d;
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        d = b * b - 4 * a * c;
        if(d > 0)
        {
            System.out.println("Roots are real and unequal");
            root1 = (-b + Math.sqrt(d))/(2*a);
            root2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("First root is:"+root1);
            System.out.println("Second root is:"+root2);
        }
        else if(d==0)
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
C:\Users\AmOLa's\Desktop>java Quadcmd 8 23 7
Given quadratic equation:8.0x^2 + 23.0x + 7.0
Roots are real and unequal
First root is:-0.3459844252141888
Second root is:-2.529015574785811
*/