import java.util.Scanner;

public class od
{
    public static void main(String args[])
    {
        int octnum, decnum=0, i=0, orig;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Octal Number : ");
        octnum = scan.nextInt();
		
        orig = octnum;
		
        while(octnum != 0)
        {
            decnum = decnum + (octnum%10) * (int) Math.pow(8, i);
            i++;
            octnum = octnum/10;
        }
		
        System.out.print("Equivalent Decimal Value of " + orig + " is :\n");
        System.out.print(decnum);
    }
}