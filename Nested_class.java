class Cpu{
int price;
public Cpu(int price){
this.price=price;
}
public void display() {
System.out.println("Price = " + price);
}
class processor{
int noc;
String manu;
public processor(int noc,String manu){
this.noc=noc;
this.manu=manu;
}
public void display(){
System.out.println("No.of cores="+noc);
System.out.println("Manufacture="+manu);
}
}
static class RAM{
int memory;
String manu1;
RAM(int memory,String manu1){
this.memory=memory;
this.manu1=manu1;
}
public void display(){
System.out.println("Memory="+memory);
System.out.println("RAM Manufacturer="+manu1);
}
}
}
public class Main{
public static void main(String[] args){
Cpu c1=new Cpu(100);
Cpu.processor p1=c1.new processor(4,"Intel");
Cpu.RAM p2=new Cpu.RAM(8,"Kingston");
c1.display();
p1.display();
p2.display();
}
}

