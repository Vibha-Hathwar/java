import java.util.*;

import javax.swing.table.JTableHeader;

import java.io.*;
/*public class node
{
	int data;
	node next;
	node(int data)
	{
		this.data=data;
		//next=null;	as default is null
	}	
}
public class ll
{
	public static void main(String args[])
	{
    	node n1=new node(10);
    	System.out.println(n1.data);
    	System.out.println(n1.next);
	}
}
*/

class node<T>	//generic type
{
	T data;
	node<T>next;
	node(T data)
	{
		this.data=data;
		//next=null;
	}
}
public class ll
{
	public static node<Integer> create()
	{
		node<Integer> n1=new node<>(10);
		node<Integer> n2=new node<>(20);
		n1.next=n2;
		n2.next=null;
		return n1;
	}
	public static node<Integer> takeinput()
	{
		Scanner s=new Scanner(System.in);
		node<Integer>head=null,tail=null;
		int in=s.nextInt();
		while(in!=-1)
		{
			node<Integer>n=new node<Integer>(in);
			if(head==null)
			{
				head=n;
				tail=n;
			}
			else
			{
				/*node<Integer>t=head;
				while(t.next!=null)
					t=t.next;			//O(n^2)
				t.next=n;*/
				tail.next=n;			// order n
				tail=n;
			}
			in=s.nextInt();
		}
		return head;
	}
	public static void print(node<Integer>head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	public static void increment(node<Integer>head)
	{
		node<Integer>temp=head;
		while(temp!=null)
		{
			temp.data++;
			temp=temp.next;
		}
	}
	public static int length(node<Integer>head)
	{
		//if(head==null)
		if(head==null)
			return 0;
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}
	public static void printIthNode(node<Integer> head, int i)
	{
		node<Integer> n=head;
        while (n!=null && i>0)
        {
            i=i-1;
            n=n.next;
        }
        if (n==null)
            System.out.println();
        else
            System.out.println(n.data);
	}
	public static node<Integer> insertati(node<Integer>head,int e,int p)
	{
		node<Integer>newn=new node<Integer>(e);
		if(p==0)
		{
			newn.next=head;
			//head=newn;
			return newn;
		}
		else
		{
			int count =0;
			node<Integer>prev=head;
			while(count<p-1&&prev!=null)
			{
				count++;
				prev=prev.next;
			}
			if(prev!=null)
			{
				newn.next=prev.next;
				prev.next=newn;
			}
		}
		return head;
	}
	public static node<Integer> deleteati(node<Integer>head,int p)
	{
		if(p==0)
		{
			return head.next;
		}
		else
		{
			int count =0;
			node<Integer>prev=head;
			while(count<p-1&&prev!=null)
			{
				count++;
				prev=prev.next;
			}
			if(prev!=null)
				prev.next=prev.next.next;
		}
		return head;
	}
	public static void rprint(node<Integer> head)
	{
		if(head==null)
			return;
		System.out.print(head.data+" ");
		rprint(head.next);
	}
	public static node<Integer> rinsert(node<Integer>head,int e,int pos)
	{
		if(head==null&&pos>0)
			return head;
		if(pos==0)
		{
			node<Integer>newn=new node<>(e);
			newn.next=head;
			return newn;
		}
		else
		{
			head.next=rinsert(head.next,e,pos-1);
			return head;
		}
	}
	public static node<Integer> rdelete(node<Integer>head,int pos)
	{
		if(pos==0)
			return head.next;
		else 
		{
			head.next=rdelete(head.next,pos-1);
			return head;
		}
		//if(pos>lengthoflist)return head;
	}
	public static node<Integer> rreverse(node<Integer> head)
	{
		if(head==null||head.next==null)
			return head;
		node<Integer>rhead=rreverse(head.next);
		node<Integer>tail=rhead;
		while(tail.next!=null)
			tail=tail.next;
		tail.next=head;
		head.next=null;
		return rhead;
	}
	public static void main(String[] args)
	{
    	/*node<Integer> n1=new node<>(10);
    	System.out.println(n1.data);
    	System.out.println(n1.next);*/
    	
		/*node<Integer>n=create();
		print(n);
		increment(n);
		print(n);
		System.out.println(length(n));*/
		
		/*Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
		    node<Integer>n=takeinput();
		    System.out.println("length "+length(n));
		    t--;
	    }*/
		
		/*node<Integer>n=create();
		Scanner s=new Scanner(System.in);
		System.out.print("enter i : ");
		int i=s.nextInt();
		printIthNode(n,i);
		print(n);*/
	    
	    /*node<Integer>n=takeinput();
	    //System.out.print("element and postion to insert ");
	    Scanner s=new Scanner(System.in);
	    int e=s.nextInt();
	    int p=s.nextInt();
	    n=insertati(n,e,p);
	    print(n);*/
	    
	    /*node<Integer>n=takeinput();
	    Scanner s=new Scanner(System.in);
	    int p=s.nextInt();
	    n=deleteati(n,p);
	    print(n);*/
	    
	    node<Integer>n=takeinput();
	    n=rreverse(n);
	    rprint(n);
	    /*n=rinsert(n,20,0);
	    rprint(n);
	    System.out.println();*/
	}
}
