/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Random;

/**
 *
 * @author student
 */
public class Zadanie4_1 {

    public Zadanie4_1() {
    }
    
    public void zdanie()
    {
         int ile =0;
        
        for(int i=0;i<10;i++)
        {
         
         Random generator = new Random();
         int z=generator.nextInt(10);
         int j=generator.nextInt(10);
         int wynik=0;
         try
         {
           wynik=z/j;
         }
         catch(ArithmeticException e)
         {
             ile++;
             if(ile==3)
             {
                 System.exit(0);
             }
         }
         
        }
    }
}
