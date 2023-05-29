import java.util.*;
public class hpatrn1
{
    public static void main(String args[])
    {
        /*
        
        * * * *     4 4 4 4     4 3 2 1
        * * * *     4 4 4 4     4 3 2 1
        * * * *     4 4 4 4     4 3 2 1
        * * * *     4 4 4 4     4 3 2 1
        
        */
        
        //1
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n)
            {
                System.out.print("* ");
                j=j+1;
            }
            System.out.print("\n");
            i=i+1;
        }
        
        
        //2
        /*
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n)
            {
                System.out.print(n);
                j=j+1;
            }
            System.out.print("\n");
            i=i+1;
        */
        
        
        //3
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=n;
        while(i>=1)
        {
            int j=n;
            while(j>=1)
            {
                System.out.print(j+" ");
                j=j-1;
            }
            System.out.print("\n");
            i=i-1;
        }*/
        
        //3
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n)
            {
                System.out.print(n-j+1+" ");
                j=j+1;
            }
            System.out.print("\n");
            i=i+1;
        }*/
        
        
        //4
       /*
        1
        2 1
        3 2 1
        4 3 2 1
       */
		/*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1,m=1;
        while(i<=n)
        {
            int j=1;
            //int m=i;
            while(j<=i)
            {
                System.out.print(m+" ");
                m--;
                j=j+1;
            }
            System.out.print("\n");
            i=i+1;
            m=i;
        }*/
        
        
        //5
        /*
            *
           **
          ***
         ****
        */
		/*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1,m=1;
        while(i<=n)
        {
            int sp=1,st=1;
            while(sp<=n-i)
            {
                System.out.print(" ");
                sp++;
            }
            while(st<=i)
            {
                System.out.print("*");
                st++;
            }
            System.out.print("\n");
            i=i+1;
            m=i;
        }*/
        
        
        
        //6
        /*
            1
           12
          123
         1234
        */
       /* Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n)
        {
            int sp=1,st=1;
            while(sp<=n-i)
            {
                System.out.print(" ");
                sp++;
            }
            int m=1;
            while(st<=i)
            {
                System.out.print(m);
                st++;
                m++;
            }
            System.out.print("\n");
            i=i+1;
        }
        */
        
        
        //7
        /*
               *
              ***
             *****
            *******
        */
       /* Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n)
        {
            int sp=1,st=1;
            while(sp<=n-i)
            {
                System.out.print(" ");
                sp++;
            }
            while(st<=2*i-1)
            {
                System.out.print("*");
                st++;
            }
            System.out.print("\n");
            i=i+1;
        }*/
        
        
        
        //8
        /*
              1
             121
            12321
           1234321
        */
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n)
        {
            int sp=1,st=1;
            while(sp<=n-i)
            {
                System.out.print(" ");
                sp++;
            }
            int num=1;
            while(num<=i)
            {
                System.out.print(num);
                 num++;
            }
            int dec=i-1;
            while(dec>=1)
            {
                System.out.print(dec);
                dec--;
            }
            System.out.print("\n");
            i=i+1;
        }*/
        
        
        //9
        /*
            1
           232
          34543
         4567654
        */
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1,m=1,num=1;
        while(i<=n)
        {
            int sp=1;
            while(sp<=n-i)
            {
                System.out.print(" ");
                sp++;
            }
            int j=1;
            while(j<=i)
            {
                System.out.print(num);
                 num++;
                 j++;
            }
            int dec=num-2;
            while(dec>=i)
            {
                System.out.print(dec);
                dec--;
            }
            System.out.print("\n");
            i=i+1;
            num=i;
        }*/
        
        
        //10
       /* 
            *
           ***
          *****
           ***
            *
       */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=0,sp=n/2,val=n-2;
        while(i<=(int)n/2)
        {
            int j=1;
            while(j<=sp)
            {
                System.out.print(" ");
                j++;
            }
            sp--;
            int st=1;
            while(st<=2*i+1)
            {
                System.out.print("*");
                st++;
            }
            System.out.print("\n");
            i=i+1;
        }
        while(i<n)
        {
            sp++;
           int j=0;
            while(j<=sp)
            {
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=val)
            {
				System.out.print("*");
                j=j+1;
            }
           System.out.println();
            i=i+1;
            val=val-2;
        }
        /* Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=1+n/2;i++)
        {
            for(int j=1;j<=(1+n/2)+i-1;j++)
            {
                if(j<=(n/2)-i+1)
                {
                    System.out.print(" "); 
                }
                else
                    System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=1;i<=n/2;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                if(j<=i)
                     System.out.print(" ");
                else
                     System.out.print("*");
              }
             System.out.print("\n");
        }
        */
    }
}
