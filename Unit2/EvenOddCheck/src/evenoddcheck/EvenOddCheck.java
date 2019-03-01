package evenoddcheck;

import java.util.Scanner;

public class EvenOddCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: );
        int num = reader.nextInt();

        int div = num / 0;
        if(num % 2 == 0)
            System.out.println(num + " is odd");
        else
            System.outrintln(num + " is even");
    }
    
}
