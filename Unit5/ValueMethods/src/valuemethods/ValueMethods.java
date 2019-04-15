/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valuemethods;

import java.util.Scanner;

/**
 *
 * @author lauren
 */
public class ValueMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();

        double absoluteValue = Math.abs(value);
        System.out.println("The absolute Value of " + value + " is " + absoluteValue);
    }

}
