import java.util.Scanner;
class transposematrix
{
public static void main(String args[])
{
int row,col,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of rows\n");
row=sc.nextInt();
System.out.println("enter the no of columns\n");
col=sc.nextInt();
int mat1[][]=new int [row][col];
System.out.println("enter the elements of matrix\n");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
mat1[i][j]=sc.nextInt();
}
}
System.out.println("matrix is\n");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(mat1[i][j]+"\t");
}
System.out.print("\n");
}
System.out.println("the transpose of the matrix is\n");
for(i=0;i<col;i++)
{
for(j=0;j<row;j++)
{
System.out.print(mat1[j][i]+"\t");
}
System.out.print("\n");
}

if (row!=col)
	{
		System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
	}
else
	{
		boolean symmetric = true;
		for (i=0;i<row;i++ )
			{
				for (j=0;j<col;j++ )
				{
					if ( mat1[i][j]!= mat1[j][i] )
				{
		symmetric = false;
		break;
				}
				}
			}
if (symmetric)
{
System.out.println("The given matrix is symmetric.");
}
else
{
System.out.println("The given matrix is not symmetric.");
}
}

     
}
}

