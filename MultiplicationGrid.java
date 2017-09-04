import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationGrid
{   
    public static void multiply(int size)
    {
        int row;
        int column;
        for (column = 0; column <= size; column++)
        {   
            System.out.print(column);
            for (row = 0; row <= size; row++)
            {
                //System.out.println(row);
                //System.out.println();
                System.out.printf("%4d",row*column);

            }
            System.out.println();

        }
    }    
    public static void main(String[] args)
    {
        System.out.println("Welcome to Muliplication Tables");
        System.out.println("");
        System.out.println("How large would you like to see them? ");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        if (size > 20)
        {
            System.out.println("Requested size is too large.  Please choose a size between 1 and 20.");   
            size = keyboard.nextInt();
        }      
        boolean multiply = true;

        do
        {
            multiply(size);
            if (size <= size)
            { 
                multiply = false;
            
            }
        }while (multiply == true);
    }
}    
    
    
      
    
    
  
        
