/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
class d extends Thread{
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(60000);
            } catch (Exception e) {
            }
        }
    }
}
        
public class game extends Thread{
    public void run()
    {
        try {
            System.out.println("enter any number");
            Thread.sleep(60000);
            int i;
            for ( i = 0; i < 10; i++) {
             if(i==0){
             i++;
             System.out.println("you win");
             }
             else
                    System.out.println("you lose");
            }
           
    
            
   } catch (Exception e) {
      
        }
    }

public static void main(String[] args) {
   game g=new game();
   g.start();
   d f=new d();
   f.start();
    for (int i = 0; i < 10; i++) {
        try {
            System.out.println(i);
            
            Thread.sleep(60000);
        } 
        catch (Exception e) {
        }
  
    }
}
}