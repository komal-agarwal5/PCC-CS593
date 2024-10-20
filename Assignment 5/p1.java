// Declare MyThread class
import java.util.Scanner;
class MyThread implements Runnable
{
    // Declare members
    int n;
    String name;
    // Declare Constructor
    MyThread(String nm,int num)
    {
        n=num;
        name=nm;
    }
    public void run()
    {
       System.out.println(name+" Thread: Started");
       int fact=1;
       if(n<0)
       {
             System.out.println(name+" Thread: ERROR");
       }
       else
       {
             for(int i=1;i<=n;i++)
             {
                 fact*=i;
             }
             System.out.println(name+" Thread: "+fact);  
       }
       System.out.println(name+" Thread: Ended");     
    }
}