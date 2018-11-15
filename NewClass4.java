
import java.util.Random;
import java.util.Scanner;
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
public class NewClass4 extends Thread{
    static int i=0;
    public void run()
    {
        try {
            Thread.sleep(60000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass4.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("total score ="+i);
        System.exit(0);
    }
    public static void main(String[] args) {
       NewClass4 n = new NewClass4();
       n.start();
       while(true)
       {
           Random r = new Random();
           int j=r.nextInt(10)+1;
           System.out.println("guess the no ");
           jatin o = new jatin();
           o.start();
           Scanner s= new Scanner(System.in);
           int p=s.nextInt();
          
           if(p==j)
               i++;
            }
    }
}
class jatin extends Thread
{
    public void run()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(jatin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("time over game over");
        System.exit(0);
    }
}
