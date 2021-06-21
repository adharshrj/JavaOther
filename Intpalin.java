import java.util.*;

public class Intpalin {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        //int n=5445;
        System.out.println("Enter the number");
         int n=sc.nextInt();
        int r,rev_num=0,num;
        num=n;
        while(n>0)
        {
            r=n%10;
            rev_num=(rev_num*10)+r;
            n=n/10;
        }
        //System.out.println(rev_num);
        if(rev_num==num)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");
    }
}