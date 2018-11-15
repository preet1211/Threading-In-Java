
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
class  hello extends Thread{
    public void run()
    {
        String a;int i;
           Scanner s=new Scanner(System.in);
           System.out.println("enter your name");
            a=s.nextLine();
            i=a.length();
         try {
             System.out.println(a);
             Thread.sleep(1000);
          } catch (Exception e) {
        }
    }
}

           public class neww {
               public static void main(String[] args) {
                   hello h=new hello();
                   h.start();
               }
     
    }
        
    }
}
    

