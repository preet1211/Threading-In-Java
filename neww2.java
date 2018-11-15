/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
class preet extends Thread{
    String a;
    preet(String a){
        this.a=a;
       }
    public void run()
    {
        synchronized(System.in)
        {
    a.length();
        for (int i =0; i <a.length(); i++) {
            try {
                System.out.println(a.charAt(i));
                System.in.notify();
                System.in.wait();
            } catch (Exception e) {
            }
        }
        System.in.notify();
        }
        }
}
    class singh extends Thread{
        String b;
        singh(String b){
            this.b=b;
        }
        public void run(){
            synchronized(System.in)
            {
               
                for (int j = 0; j <b.length(); j++) {
                    try {
                        System.out.println(b.charAt(j));
                        System.in.notify();
                        System.in.wait();
                    } catch (Exception e) {
                    }
                }
                System.in.notify();
            }
        }
    }

public class neww2 {
    public static void main(String[] args) throws InterruptedException {
        
        String a = "java";
        String b = "php";
        int i = a.length();
        int j = b.length();
        if(i>j)
        {
            preet p= new preet(a.substring(0,j));
            singh n=new singh(b);
            p.start();
            n.start();
            p.join();
            n.join();
            System.out.println(a.substring(j));
            
            
        }
        else if(j>i){
            preet p=new preet(a);
            singh n=new singh(b.substring(0,i));
            p.start();
            n.start();
            p.join();
            n.join();
            System.out.println(b.substring(i));
        }
        else
        {
            preet p= new preet(a);
            singh n=new singh(b);
            p.start();
            n.start();
        }
    }
}
    

