
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
 class t extends Thread{
     public void run()
     {
         for (int k = 101; k <=150; k++) {
             try {
                 System.out.println("\t\t"+k);
                 Thread.sleep(1000);
             } catch (InterruptedException ex) {
                 Logger.getLogger(t.class.getName()).log(Level.SEVERE, null, ex);
             }
             
         }
     }
 }
     

public class NewClass1 extends Thread{

        
   public void run()
    {
        for (int j =51; j <=100; j++) {
            try {
                System.out.println(j);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }
        public static void main(String[] args) {
        
    
        NewClass1 n=new NewClass1();
        n.start();
        t q=new t();
        q.start();
        for (int i =1; i <=50; i++) {
            try {
                System.out.println("\t"+i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}


    



