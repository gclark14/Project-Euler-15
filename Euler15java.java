/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler15java;

import java.math.BigInteger;

/**
 *
 * @author gabriel
 */
public class Euler15java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factorial f = new Factorial();
        
        BigInteger numerator = new BigInteger("40");
        BigInteger denominator = new BigInteger("20");
        BigInteger result = new BigInteger("0");
        
        //Calculate factorial for each
        numerator = f.fac(numerator);
        denominator = f.fac(denominator).multiply(f.fac(denominator));
        
        // Evaluate 2n! / n!n!
        result = numerator.divide(denominator);
        
        System.out.println(result);
    }
    
}
