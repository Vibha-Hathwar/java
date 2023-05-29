import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
/*<applet code="CardLayoutExm" width=300 height=400>
</applet>
*/
public class CardLayoutExm extends Applet implements ActionListener
{
JPanel cardPanel;
JPanel firstp,secondp,thirdp,fourthp;
JPanel buttonp;
JButton first,second,third;
CardLayout ourLayout;
public void init()
{
cardPanel=new JPanel();
ourLayout=new CardLayout();
cardPanel.setLayout(ourLayout);
firstp=new JPanel();
firstp.setBackground(Color.blue);
secondp=new JPanel();
secondp.setBackground(Color.yellow);
thirdp=new JPanel();
thirdp.setBackground(Color.green);
fourthp=new JPanel();
first=new JButton("blue");
first.addActionListener(this);
second=new JButton("yellow");
second.addActionListener(this);
third=new JButton("green");
third.addActionListener(this);
buttonp=new JPanel();
buttonp.add(first);
buttonp.add(second);
buttonp.add(third);
this.setLayout(new BorderLayout());
this.add(buttonp,BorderLayout.SOUTH);
this.add(cardPanel,BorderLayout.CENTER);cardPanel.add(fourthp,"Fourth");
cardPanel.add(firstp,"First");
cardPanel.add(secondp,"Second");
cardPanel.add(thirdp,"Third");
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==first)
ourLayout.show(cardPanel,"First");
if(e.getSource()==second)
ourLayout.show(cardPanel,"Second");
if(e.getSource()==third)
ourLayout.show(cardPanel,"Third");
}
}
