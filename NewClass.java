
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
class Student1{
    String name;
    int rollno,eng,pbi,hindi,sum;

void input()
{
       Scanner s=new Scanner(System.in);
            System.out.println("enter name");
            name =s.next();
            System.out.println("enter rollno");
            rollno=s.nextInt();
            System.out.println("eng,hindi,pbi");
            eng=s.nextInt();
            hindi=s.nextInt();
            pbi=s.nextInt();
            System.out.println("sum=");
            sum=eng+hindi+pbi;
         
}
}
public class NewClass {
    public static void main(String[] args) {
        
    
        Student1 a[]=new Student1[3];
        for (int i = 0; i <=2; i++) {
            a[i]=new Student1();
            a[i].input();
            System.out.println(a[i].sum);
        }
     int l=0;
            for (int i = 0; i <=2; i++) {
            if(a[i].sum > l){
              l=  a[i].sum;
                
      
            
        }
    }
            System.out.println("largest marks"+" "+ l);
    for(int i=0;i<=2;i++)
    {
        if(l==a[i].sum)
        {
            System.out.println("Name:" + " " + a[i].name + "Rollno:" + " " + a[i].rollno);
        }
    }
}
}
