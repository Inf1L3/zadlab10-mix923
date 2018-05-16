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
public class WprowadzZKonsoli {
    
    private int a;
    private String z;
    private  char p;
    
    public void wprowadzInt (int  b)
    {
        try
        {
            a=b;
        }
        catch(Exception e)
        {
              System.out.println("Blad");
        }
    }
    
    public void wprowadzString (String  b)
    {
        try
        {
            z=b;
        }
        catch(Exception e)
        {
              System.out.println("Blad");
        }
    }
    
    public void wprowadzChar (char  b)
    {
        try
        {
            p=b;
        }
        catch(Exception e)
        {
              System.out.println("Blad");
        }
    }
}
