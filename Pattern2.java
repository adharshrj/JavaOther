public class Pattern2
{
        public static void main(String[] args)
        {
            int rows = 5;
            
            System.out.println("** Printing the pattern... **");
            
            for (int i = rows; i >= 1; i--)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print(j);
                }
                
                for (int j= i*2 ; j < rows*2-1; j++) 
                { 
                    System.out.print("*"); 
                } 
                for (int l = i; l >= 1; l--)
                {
                    if(l!=rows)
                        System.out.print(l);
                }
                System.out.println();
            }
        }
}