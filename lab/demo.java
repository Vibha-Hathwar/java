import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class login extends JFrame implements ActionListener
{
	JButton SUMBIT;
	JPanel panel;
	JLabel label1,label2;
	final JTextField text1,text2;
	login()
	{
		label1=new JLabel();
		label1.setText("username");
		text1=new JTextField(15);
		label2=new JLabel();
		label2.setText("password");
		text2=new JTextField(15);
		SUMBIT=new JButton("SUMBIT");
		panel=new JPanel(new GridLayout(3,1));
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);panel.add(text2);
		panel.add(SUMBIT);
		add(panel,BorderLayout.CENTER);
		SUMBIT.addActionListener(this);
		setTitle("login form");
	}
public void actionPerformed(ActionEvent ae)
{
	String value1=text1.getText();
	String value2=text2.getText();
	java.sql.Connection conn=null;
	try
	{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		conn=java.sql.DriverManager.getConnection("jdbc:mysql://localhost/sit?user=root&password=root");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("errorindriverloader"+e);
		System.exit(1);
	}
	catch(Exception e)
	{
		System.out.println("error inconnction"+e);
		System.exit(0);
	}
	System.out.println("connection established");
	try
	{
	java.sql.Statement s=conn.createStatement();
	String query="select * from users where username='"+value1+"'and password='"+value2+"'";
	java.sql.ResultSet r=s.executeQuery(query);
	r.next();
	int x=r.getRow();
	if (x>0)
	{
		JOptionPane.showMessageDialog(null,"HELLOO");
	}
	else
	{
	JOptionPane.showMessageDialog(this,"incoreect login of password","error",JOptionPane.ERROR_MESSAGE);
	}
	}
catch(Exception e)
{
	System.out.println(e);
	System.exit(0);
}
}
}
class demo
{
   public static void main(String args[])
   {
     try
     {
	login frame=new login();
	frame.setSize(300,100);
	frame.setVisible(true);
     }
    catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,e.getMessage());
    }
  }
 }
