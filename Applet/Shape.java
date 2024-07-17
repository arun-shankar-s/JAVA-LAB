import java.awt.*;
import java.applet.*;
public class Shape extends Applet{
public void paint(Graphics g){
g.drawLine(30,100,70,100);
g.drawLine(30,100,50,30);
g.drawLine(50,30,70,100);
g.drawString("Triangle",30,120);

//

g.drawRect(100,30,100,70);
g.drawString("Rectangle",120,120);

//

g.drawOval(230,20,100,100);
g.drawString("Circle",260,140);

}
}
