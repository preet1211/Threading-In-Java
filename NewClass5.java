/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
class p extends Thread{
    public void run()
    {
        synchronized(System.in)
        {
        for (int i =1; i <=51; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
                if(i%10==0)
                {
                    System.in.notify();
                    System.in.wait();
                }
            } catch (Exception e) {
            }
            
        }
        }
    }
}
public class NewClass5 extends Thread {
    public void run()
    {
          synchronized(System.in)
        {
        for (int j =51; j <=101; j++) {
        try {
            System.out.println("\t"+j);
             if(j%10==0)
                {
                    System.in.notify();
                    System.in.wait();
                }
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        }
    }
    }
    public static void main(String[] args) {
        NewClass5 m=new NewClass5 ();
        m.start();
        p r=new p();
        r.start();
    }
}
