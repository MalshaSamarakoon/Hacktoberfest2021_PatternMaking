import java.util.*;
public class HollowFullPyramid
{
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=6;i++)
		{
			for(int k=6;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==1 || i==6 || j==1 || j==i)
				System.out.print("* ");
				else
				System.out.print("  ");
					
			}
			System.out.println();
		}
		
	}
}