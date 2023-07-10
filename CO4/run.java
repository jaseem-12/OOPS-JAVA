class fibonacci implements Runnable
{
 public void run()
 {
 int n1=0,n2=1,n3,i;    
 System.out.print(n1+" "+n2);  
    
 for(i=2;i<10;i++)
 {
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}
}

class evenno implements Runnable
{
 public void run()
 {
int n=50;
int even;
 for (int i=0;i<=n;i++)
 if (i%2==0)
    {
      System.out.println(i);
    }
 }
}

public class run 
{
  public static void main(String[] args)
  {
     fibonacci r = new fibonacci();
	 evenno e = new evenno();
     Thread t1 = new Thread(r);
     Thread t2 = new Thread(e);
     t1.start();
     t2.start();


  }
}
