class r extends Thread{
    public void run()
    {
        for (int i = 10; i <=20; i++) {
            try {
                System.out.println("\t\t"+i);
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            
        }
    }
}
 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
public class NewClass3 extends Thread{
        public void run()
    {
        for (int j = 20; j <=30; j++) {
            try {
                System.out.println(j);
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
        public static void main(String[] args) {
            NewClass3 m=new NewClass3();
            m.start();
            r q=new r();
            q.start();
            for (int i =30; i <=40; i++) {
                try {
                    System.out.println("\t"+i);
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        
    }
}
