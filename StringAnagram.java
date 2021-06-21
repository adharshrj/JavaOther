import java.util.Arrays;
public class StringAnagram
{
    public static void main(String args[])
    {
        String s1="amma";
        String s2="mvama";
        if(s1.length()!=s2.length())
        {
            System.out.println("false");
        }
        else
        {
            char[] a1=s1.toCharArray();
            char[] a2=s2.toCharArray();
            Arrays.sort(a1);  //aamm
            Arrays.sort(a2);  //aamm
            if(a1==a2)
            {
                System.out.println("true");

            }
            else
            {
                System.out.println("False");
            }
        }
    }
}