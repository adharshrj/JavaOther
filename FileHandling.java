class FileHandling{
    public static void main(String args[])
    {
        //NUMBER DIV BY ZERO
        try
        {
         int a= 10, b= 0;
         int c=a/b;
            System.out.println("Result="+c);
        }
        catch(Exception e) { System.out.println("Number cannot divide by Zero"); }


        //NUMBER FORMAT EXCEPTION
        try
        {
            int num = Integer.parseInt("Whatever");
            System.out.println(num);
        }
        catch(NumberFormatException e) { System.out.println("Number Format Exception"); }


        //ARRAY INDEX OUT OF BOUND EXCEPTION
        try
        {
            int a[]=new int[5];
            a[7]=9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
    }
}