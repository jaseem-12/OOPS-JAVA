import java.util.Scanner;
class addmatrix
{
public static void main(String args[])
{
int row,col,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of rows\n");
row=sc.nextInt();
System.out.println("enter the no of columns\n");
col=sc.nextInt();
int mat1[][]=new int[row][col];
int mat2[][]=new int[row][col];
int res[][]=new int[row][col];
System.out.println("enter2 the elements of first matrix\n");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
mat1[i][j]=sc.nextInt();
}
}
System.out.println("enter the elements of second matrix\n");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
mat2[i][j]=sc.nextInt();
}
}
System.out.println("elements of first matrix is\n");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(mat1[i][j]+"\t");
}
System.out.print("\n");
}
System.out.println("elements of second matrix is\n");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(mat2[i][j]+"\t");
}
System.out.print("\n");
}
System.out.println("sum of matrices is\n");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
res[i][j]=mat1[i][j]+mat2[i][j];
System.out.print(res[i][j]+"\t");
}
System.out.print("\n");
}
}
}
