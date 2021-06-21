import java.util.Scanner;
public class calculator {
    public static void main(String []args){
        Scanner ref=new Scanner(System.in);
        System.out.println("ENTER THE NO OF ITERATIONS");
        int n=ref.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("ENTER THE FIRST NUMBER");
        double first=ref.nextDouble();
        System.out.println("ENTER THE SECOND NUMBER");
        double second=ref.nextDouble();
        System.out.println("ENTER THE OPERATION");
        String result=ref.next();
        double c=0;
            switch(result) {
                case "+":
                    c = first + second;
                    System.out.println("addition of two numbers=" + c);
                    break;
                case "-":
                    c = first - second;
                    System.out.println("subtraction of two numbers=" + c);
                    break;
                case "/":
                    c = first / second;
                    System.out.println("division of two numbers=" + c);
                    break;
                case "*":
                    c = first * second;
                    System.out.println("multiplication of two numbers=" + c);
                     break;
                case "%":
                    c = first % second;
                    System.out.println("modulus of two numbers=" + c);
                    break;
                default:
                    System.out.println("nothing matches");
                    break;


            }
        }

    }
}




