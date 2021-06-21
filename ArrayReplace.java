import java.util.ArrayList;
import java.util.Scanner;



public class ArrayReplace {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Enter the list of names (only four)");
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names= new ArrayList<String>();
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        String d=sc.nextLine();
        names.add(a);
        names.add(b);
        names.add(c);
        names.add(d);
        System.out.println(names);
        System.out.println();
        System.out.println("Enter which name should be replaced(place no)");
        int replace_no=sc.nextInt();
        System.out.println("Enter correct name");
        Scanner sc1=new Scanner(System.in);
        String rep_name=sc1.nextLine();
        names.set(replace_no-1,rep_name);
        System.out.println(names);


    }
}