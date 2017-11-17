import java.applet.*;
import java.awt.*;
public class Name extends Applet
{
public void paint(Graphics g)
{
setBackground(Color.cyan);
setForeground(Color.black);
g.setColor(Color.red);
Font f1=new Font("helvetica",Font.BOLD,30);
g.setFont(f1);
g.drawString("Nithya",100,120);
g.setColor(Color.blue);
Font f2=new Font("TimesNewRoman",Font.BOLD,30);
g.setFont(f2);
g.drawString("Nithya",100,160);
g.setColor(Color.black);
Font f3=new Font("Arial",Font.BOLD,30);
g.setFont(f3);
g.drawString("Nithya",100,200);
}
}
/*<applet code="Name.class" height=500 width=500>
</applet>*/
