/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converting;

import java.util.Scanner;

/**
 *
 * @author lauren
 */
public class Converting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        // TODO code application logic here
        // Write how many denars you want to convert in dollars
        System.out.println ("Enter how many denars you want to convert in dollars");
        int denars = input.nextInt();
        
        // The number divide with 50
        int dollars = denars / 50;
        
        // That answer is how many dollars you have
        System.out.println (dollars + " is how many dollars you have");
    }
    
}
