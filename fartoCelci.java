import java.util.*;
public class fartoCelci {

	public static void main(String[] args)
    {	
		/*Scanner sc=new Scanner(System.in);
    	int s,e,w,f;
        s=sc.nextInt();
    	e=sc.nextInt();
    	w=sc.nextInt();
        while(s<=e)
        {
            f=(s-32)*5/9;
            System.out.println(s+" "+f);
            s=s+w;
        }*/    
		
		//fahrenheit to celsius 0
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		/*Scanner sc=new Scanner(System.in);
    	int s,e,w,f;
    	s=sc.nextInt();
    	e=sc.nextInt();
    	w=sc.nextInt();
    	while(s<=e)
        {
            f=(s-32)*5/9;
            System.out.println(s+" "+f);
            s=s+w;
        }*/
		Scanner sc=new Scanner(System.in);
    	int start,end,step,f;
    	start=sc.nextInt();
    	end=sc.nextInt();
    	step=sc.nextInt();
		while(start<=end)
        {
            f=(start-32)*5/9;
            System.out.println(start+" "+f);
            start=start+step;
        }
		
	}

}