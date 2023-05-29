import java.util.*;
public class player
{
	private String name;
	private char symbol;
	public player(String name,char symbol)
	{
		setname(name);
		setsymbol(symbol);
	}
	public void setname(String name)
	{
		if(!name.isEmpty())
			this.name=name;
	}
	public String getname()
	{
		return this.name;
	}
	public void setsymbol(char symbol)
	{
		if(symbol!='\0')
			this.symbol=symbol;
	}
	public char getsymbol()
	{
		return this.symbol;
	}
}
public class board
{
	private char board[][];
	private int boardsize=3;
	private char p1sym,p2sym;
	private int count;//count of no of cells that are filled
	private static final char EMPTY=' ';
	
	public static final int p1wins=1;
	public static final int p2wins=2;
	public static final int draw=3;
	public static final int incomplete=4;
	public static final int invalid=5;
	
	public board(char p1sym,char p2sym)
	{
		board=new char[boardsize][boardsize];
		for(int i=0;i<boardsize;i++)
			for(int j=0;j<boardsize;j++)
				board[i][j]=EMPTY;
		this.p1sym=p1sym;
		this.p2sym=p2sym;
	}
	public int move(char symb,int x,int y)
	{
		
	}
	public void print()
	{
		for(int i=0;i<boardsize;i++)
		{
			for(int j=0;j<boardsize;j++)
				System.out.print("board[i][j] "+" ");
			System.out.println();
		}
		System.out.println();
	}
public class TicTacToe
{
	private player p1,p2;
	private board b;
	
	private player takepinput(int num)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter player "+num+" name : ");
		String name=s.nextLine();
		System.out.print("enter player "+num+" symbol : ");
		char symbol=s.next().charAt(0);
		player p=new player(name,symbol);
		return p;
	}
	
	public void startgame()
	{
		//	take player input
		Scanner s=new Scanner(System.in);
		p1=takepinput(1);
		p2=takepinput(2);
		while(p1.getsymbol()==p2.getsymbol())
		{
			System.out.print("Symbol already taken !! Please enter symbol again : ");
			p2.setsymbol(s.next().charAt(0));
		}
		//create the board
		b= new board(p1.getsymbol(),p2.getsymbol());
		
		//	play game
		boolean p1turn = true;
		int status=b.incomplete;
		while(status==b.incomplete||status==b.invalid)
		{
			if(p1turn)
			{
				System.out.println("player 1 : "+p1.getname()+ "'s turn");
				System.out.print("enter a: ");
				int x=s.nextInt();
				System.out.print("enter b: ");
				int y=s.nextInt();
				b.move(p1.getsymbol(),x,y);
				if(status==b.invalid)
				{
					System.out.println("Invalid move !! please try again");
					continue;	
				}
			}
			else
			{
				System.out.println("player 2 : "+p2.getname()+ "'s turn");
				System.out.print("enter a: ");
				int x=s.nextInt();
				System.out.print("enter b: ");
				int y=s.nextInt();
				b.move(p2.getsymbol(),x,y);
				if(status==b.invalid)
				{	
					System.out.println("Invalid move !! please try again");
					continue;
				}
			}
			p1turn=!p1turn;
			b.print();
		}
		if(status==b.p1wins)
			System.out.println("player 1 "+p1.getname()+" wins !!");
		else if(status==b.p2wins)
			System.out.println("player 2 "+p2.getname()+" wins !!");
		else
			System.out.println("Draw !!");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TicTacToe t=new TicTacToe();
		t.startgame();
	}

}
