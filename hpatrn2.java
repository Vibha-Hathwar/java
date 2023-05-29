import java.util.*;
public class hpatrn2
{
    public static void main(String args[])
    {
    //11
        /*
            n=3
            *
            *1*
            *121*
            *12321*
            *121*
            *1*
            *
        */
        
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        System.out.println("*");
        while(i<=n)
        {
            System.out.print("*");
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
            System.out.print("*");
            System.out.print("\n");
            i=i+1;

        }
        i=i-2;
        while(i>=1)
        {
            System.out.print("*");
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
            System.out.print("*");
            System.out.print("\n");
            i=i-1;
        }
        System.out.println("*");*/
        
        
  //12
        /*
                *
               **
              ***
             ****
            *****
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
        
        
  //13
        /*
            ****
             ****
              ****
               ****
        */
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n)
        {
            
            int js=2;
            while(js<=i)
            {
                System.out.print(" ");
                js=js+1;
            }
            int j=1;
            while(j<=n)
            {
                System.out.print("*");
                j=j+1;
            }
            System.out.print("\n");
            i=i+1;
        }*/
        
        
  //14
        /*
            1=1
            1+2=3
            1+2+3=6
            1+2+3+4=10
        */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,sum=0;
        String str="";
        for(i=1;i<=n;i++)
        {
            if(i==1)
                str+=i;
            else
                 str+="+"+i;
            sum+=i;
            System.out.println(str+"="+sum);
        }
       
        
  //15
            /*
                1357
                3571
                5713
                7135
            */  
        
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1,num=1;
        int j=1;
        while(j<=n)
            {
                System.out.print(num);
                j=j+1;
                num=num+2;
            }
         */
             
        //pradeep    
       /* Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a;
        for(int i=1;i<=n;i++)
        {
             a=2*i-1;
            for(int j=0;j<n;j++)
            {
                System.out.print(a%(2*n));
                a+=2;
            }
            System.out.print("\n"); 
        }*/
            
        //github  
        /*Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        
        for(int i=0;i<N;i++)
        {
            int val=(2*i)+1;
            for (int j=0;j<N;j++)
            {
                System.out.print(val);
                if (val==(2*N-1))
                    val=1;
                else
                    val=val+2;
            }
            System.out.println(" ");
        }*/
    }
}
