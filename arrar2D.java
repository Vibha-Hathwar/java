import java.util.*;
public class arrar2D
{
	public static int[][] inputa()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter rows : ");
		int n=s.nextInt();
		System.out.print("Enter cols : ");
		int m=s.nextInt();
		int [][]a=new int[n][m];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=s.nextInt();
		return a;
	}
	public static void printarray(int[][] a)
	{
		int n=a.length;
		int m=a[0].length;
		for(int i=0;i<n;i++)
		{	for(int j=0;j<m;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
	public static void rowSum(int[][] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{	
			sum=0;
			for(int j=0;j<a[0].length;j++)
				sum=sum+a[i][j];
			System.out.print(sum+" ");
		}
		System.out.println();
	}
	public static void largest(int a[][])
	{
		int n=a.length;
		int m=a[0].length;
		int sum=0;
		for(int i=0;i<n;i++)
		{	
			sum=0;
			for(int j=0;j<m;j++)
				sum=sum+a[i][j];
		}
	}
	public static int larCol(int[][] a)
	{
		int row=a.length;
		int col=a[0].length;
		int lar=Integer.MIN_VALUE;
		for(int j=0;j<col;j++)
		{
			int sum=0;
			for(int i=0;i<row;i++)
				sum=sum+a[i][j];
			if(sum>lar)
				lar=sum;
		}
		return lar;
	}
	public static void findLargest(int mat[][])
	{
		if (mat.length == 0)
	            System.out.print("row 0 " + Integer.MIN_VALUE);
	    else
	    {
	    	int rowidx=-1,colidx=-1,rowsum=Integer.MIN_VALUE,colsum=Integer.MIN_VALUE;
	        for (int i=0;i<mat.length;i++)
	        {
	           	int rsum=0;
	           	int j;
	           	for (j=0;j<mat[0].length;j++)
	               	rsum=rsum+mat[i][j];
	           	if (rowsum<rsum)
            	{
	               	rowsum=rsum;
	               	rowidx=i;
	           	}
	      	}
	        for (int i=0;i<mat[0].length;i++)
            {
                int j;
	            int csum=0;
	            for (j=0;j<mat.length;j++)
	                  csum=csum+mat[j][i];
	             if (colsum<csum)
	           	{
	               	colsum=csum;
	               	colidx=i;
	           	}
            }
	         if (rowsum >= colsum)
	        	 System.out.print("row " + rowidx + " " + rowsum);
	         else
	        	 System.out.print("column " + colidx + " " + colsum);
	    } 
	}
	public static void totalSum(int[][] a)
	{
		/*int sum=0;
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
					sum=sum+a[i][j];
			}
		System.out.println(sum);*/
		
		 if (a.length == 0)
	        {
	            System.out.print("0");
	        }
		else
		{
		int sum=a[0][0];
        for (int i=1;i<a.length;i++)
    	{
        	sum=sum+a[i][0];
        	sum=sum+a[0][i];
        	sum=sum+a[i][i];
    	}
        //System.out.println("1st row ,1st column, principal diagonal elements added");
        //System.out.println(sum);
        for (int i=1;i<a[0].length-1;i++)
    	{
        	//System.out.println("Elements added: "+a[a[0].length-1][i]+", "+a[i][a[0].length-1]);
            sum=sum+a[a[0].length-1][i];
        	sum=sum+a[i][a[0].length-1];
        	for (int j=1;j<a.length-1;j++)
             {
                 if (i+j == (a.length-1) && i != j)
                 {
                     //System.out.println("Elements added: " + a[i][j]);
                     sum=sum+a[i][j];
                 }
             }
        	 //System.out.println(sum);
    	}
        System.out.println(sum);
		}
	}
	public static void wavePrint(int[][] mat)
	{
		if (mat.length == 0)
            System.out.print("");
        else
            for (int i=0;i<mat[0].length;i++)
        	{
            	if (i % 2 == 0)
                	for (int j=0;j<mat.length;j++)
                    	System.out.print(mat[j][i] + " ");
            	else
                	for (int j=mat.length-1;j>=0;j--)
                		System.out.print(mat[j][i] + " ");
        	}  
	}
	public static void spiralPrint(int[][] mat)
	{
		/*if (matrix.length == 0)
            System.out.print("");
        else
        {
            int rstart=0,cstart=0;
            int rend=matrix.length-1,cend=matrix[0].length-1;
            int count=matrix.length*matrix[0].length;
            while (count>0)
        {
            //System.out.println("Left to right");//
            for (int i=cstart;i<=cend;i++)
            {
                System.out.print(matrix[rstart][i] + " ");
                count--;
            }
            rstart++;
            //System.out.println();
            //System.out.println("Top to bottom");       
            for (int i=rstart;i<=rend;i++)
            {
                System.out.print(matrix[i][cend] + " ");
                count--;
            }
            cend--;
            //System.out.println("");
            //System.out.println("Right to left");
            for (int i=cend;i>=cstart;i--)
            {
                System.out.print(matrix[rend][i] + " ");
                count--;
            }
            rend--;
            //System.out.println();
            //System.out.println("Bottom to top");
            for (int i=rend;i>=rstart;i--)
            {
                System.out.print(matrix[i][cstart] + " ");
                count--;
            }
            //System.out.println("");
            cstart++;       
        }
        }*/
		
		/*int n=a.length;
		int m=a[0].length;
		int i,k=0,l=0;
		 while (k < m && l < n)
		 {
	            // Print the first row from the remaining rows
	            for (i = l; i < n; ++i)
	            	System.out.print(a[k][i] + " ");
	            k++;
	            // Print the last column from the remaining columns
	            for (i = k; i < m; ++i)
	                System.out.print(a[i][n - 1] + " ");
	            n--;
	            // Print the last row from the remaining rows 
	            if (k < m)
	            {
	                for (i = n - 1; i >= l; --i)
	                    System.out.print(a[m - 1][i] + " ");
	                m--;
	            }
	            // Print the first column from the remaining columns 
	            if (l < n)
	            {
	                for (i = m - 1; i >= k; --i)
	                    System.out.print(a[i][l] + " ");
	                l++;
	            }
	        }*/
		
		if(mat==null||mat.length==0)
            return ;
        int top=0,bottom=mat.length-1;
        int left =0,right=mat[0].length-1;
        while(true)
        {
            if(left>right)
                break;
            for(int i=left;i<=right;i++)
                System.out.print(mat[top][i]+" ");
            top++;
            if(top>bottom)
                break;
            for(int i=top;i<=bottom;i++)
                System.out.print(mat[i][right]+" ");
            right--;
            if(left>right)
                break;
            for(int i=right;i>=left;i--)
                System.out.print(mat[bottom][i]+" ");
            bottom--;
            if(top>bottom)
                break;
            for(int i=bottom;i>=top;i--)
                System.out.print(mat[i][left]+" ");
            left++;
        }
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Scanner s=new Scanner(System.in);
		System.out.print("Enter size : ");
		int n=s.nextInt();
		int m=s.nextInt();
		int [][]a=new int[n][m];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=s.nextInt();
		for(int i=0;i<n;i++)
		{	for(int j=0;j<m;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}*/
		
		//	rowise sum
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int k=0;k<t;k++)
		{	
			int n=s.nextInt();
			int m=s.nextInt();
			int [][] a = new int[n][m];
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					a[i][j]=s.nextInt();
			rowSum(a);
		}*/
	
		/*int[][]arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);*/
		
		//	largest column sum
		/*int[][] a=inputa();
		System.out.println(larCol(a));*/
		
		//	largest column or row Sum
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int k=0;k<t;k++)
		{	
			int n=s.nextInt();
			int m=s.nextInt();
			int [][] a = new int[n][m];
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					a[i][j]=s.nextInt();
			findLargest(a);
		}*/
		
	/*	int [][]a=new int[4][];
		//int[][] a=new int[][6];	//error
	//	System.out.println(a);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		System.out.println(a[0][0]);
	//	for(int i=0;i<a.length;i++)
			a[i]=new int[5];
		System.out.println(a[0][1]);
	//	JAGGED ARRAYS
		//	NO OF COLUMNS NOT EQUAL
	//	for(int i=0;i<a.length;i++)
			a[i]=new int[i+2];
		//System.out.println(a[0][1]);
		for(int i=0;i<a.length;i++)
		{	for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}*/
		
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int k=0;k<t;k++)
		{	
			int n=s.nextInt();
			int [][] a = new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					a[i][j]=s.nextInt();
			totalSum(a);
		}*/
		
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int k=0;k<t;k++)
		{	
			int n=s.nextInt();
			int m=s.nextInt();
			int [][] a = new int[n][m];
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					a[i][j]=s.nextInt();
			//wavePrint(a);
			spiralPrint(a);
		}
		
	}
}