import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class House extends Applet implements MouseListener{
private boolean DoorIsBlue=true;
public void init(){
addMouseListener(this);
}

public void paint(Graphics g){
g.drawRect(100,200,200,150);
g.drawLine(100,200,200,100);
g.drawLine(200,100,300,200);
g.drawRect(120,220,50,50);
g.drawRect(230,220,50,50);
if(DoorIsBlue){
g.setColor(Color.blue);
}
else{
g.setColor(Color.red);
}
g.fillRect(170,250,60,100);
}

public void mouseClicked(MouseEvent e){
DoorIsBlue=!DoorIsBlue;
repaint();

}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){}
public void mousePressed(MouseEvent e){}
public void mouseReleased(MouseEvent e){}
}



