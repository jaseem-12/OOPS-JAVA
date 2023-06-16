import java.util.Scanner;
public class array {
public static int i,n,pos,flag,key;
public static int arr[]=new int[20];
public static Scanner sc=new Scanner(System.in);

public static void  search() {
System.out.println("enter the element\n");
key=sc.nextInt();
pos=1;
flag=0;
for(i=0;i<=n;i++)
{
if(key==arr[i])
{
System.out.println("elements found"+pos+"the position");
flag++;
}
else
{
pos++;
}
}
if(flag==0)
{
System.out.println("elements not found");
}
}
public static void create() {
System.out.println("enter the size of the array:");
n=sc.nextInt();
System.out.println("enter the elements of the array:");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
}

public static void display() {
System.out.println(" elements of the array:");
for(i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}

public static void main(String args[]){
int opt;
do
{
System.out.println("1.create\n2.search\n3.display\n enter your option");
opt=sc.nextInt();
switch(opt)
{
case 1:create();
break;
case 2:search();
break;
case 3:display();
break;
default:System.out.println("invalid choice");
}
}
while(opt!=4);
}
}


