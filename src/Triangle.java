import java.util.Scanner;

public class Triangle
{
    public static String returnType(int a, int b, int c)
    {
        int match = 0;
        System.out.println("Side A is " + a);
        System.out.println("Side B is " + b);
        System.out.println("Side C is " + c);

        if (a == b)
        {
            match = match + 1;
        }

        if (a == c)
        {
            match = match + 2;
        }

        if (b == c)
        {
            match = match + 3;
        }

        if (match == 0)
        {
            if (((a + b) <= c) || ((b + c) <= a) || ((a + c) <= b)) // second and third conditions are kind of else if || means or
            {
                return "Not a triangle";
            }
            else
                return "Scalene";
        }
        else if (match == 1)
        {
            if ((a + c) <= b)
                return "Not a triangle";
            else
                return "Isosceles";
        }
        else if (match == 2)
        {
            if ((a + c) <= b)
                return "Not a triangle";
            else
                return "Isosceles";
        }
        else if (match == 3)
        {
            if ((b + c) <= a)
               return "Not a triangle";
            else
                return "Isosceles";
        }
        else
            return "Equilateral";
    }




    public static void main(String[] args)
    {

        System.out.println("Enter 3 integers which are sides of a triangle");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        returnType(a,b,c);
    }
}



