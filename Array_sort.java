import java.util.*;
class StringSort{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of strings: ");
int n = sc.nextInt();
String[] a1=new String[n];
System.out.println("Enter Strings:");
for(int i=0;i<n;i++){
a1[i]=sc.next();
}
System.out.println();
Arrays.sort(a1);
for(String str:a1){
System.out.print(str+" ");

}
}
}
