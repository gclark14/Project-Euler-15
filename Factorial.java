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
public class Factorial {
 
    public BigInteger fac(BigInteger n){

        BigInteger f = new BigInteger("1");
        for(int i = n.intValue(); i > 0; --i){
            f = f.multiply(new BigInteger(Integer.toString(i))); 
        }
        
        return f;
    }
    
}
