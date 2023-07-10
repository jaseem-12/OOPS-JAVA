class multiple extends Thread{
public void run()
{
int n=5;
for(int i=1;i<=10;i++){

		System.out.println(n+" * "+i+" = "+n*i);
		}
		}
		}

class prime extends Thread{
public void run()
{
int i, j, chk,n=59;
      
      for(i=2; i<=n; i++)
      {
         chk = 0;
         for(j=2; j<i; j++)
         {
            if(i%j==0)
            {
               chk++;
               break;
            }
         }
         if(chk==0)
            System.out.println(i);
      }
   }
 public static void main(String[] args)
{
Thread t1=new multiple ();
Thread t2=new prime();
t1.start();
t2.start();
}
}


		
