/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class Zadanie2 {

    int[] tablica =new int[10];
    public Zadanie2() {
    }
    
    public void zadanie(int[] tab)
    {
        try
        {
            tablica=tab;
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
          System.out.println("Prawdopodobnie za duzy rozmiat tablicy ");
        }
        finally{
            System.out.println("Udało sie ");
        }
    }
}
