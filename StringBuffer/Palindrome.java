import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a,b="";
        int i;
        System.out.println("Enter the string:");
        a=s.nextLine();
        for(i=a.length()-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        if(a.equals(b))
        {
            System.out.println("String is palindron");
        }
        else
        {
             System.out.println("String is not palindron");
        }
    }
}
