import java.awt.*;
import java.applet.*;
import java.util.*;
import java.text.*;
import java.io.*;

public class Clock extends Applet{
DateFormat dateFormat;
Thread t;
Date date;
public void paint(Graphics g){
try{
Font f=new Font("ARIAL",Font.BOLD,50);
g.setFont(f);
g.setColor(Color.DARK_GRAY);
dateFormat=new SimpleDateFormat("hh:mm:ss a");
date=new Date();
g.drawString(dateFormat.format(date),5,100);
t.sleep(1000);
repaint();
}
catch(Exception e){
}
}
}
