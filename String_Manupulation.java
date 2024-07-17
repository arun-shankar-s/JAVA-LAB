class StringMan{
public static void main(String[] args){
String str="Hello World";
System.out.println("Original String:"+str);
String str1=str.toUpperCase();
String str2=str.toLowerCase();
String str3=str.replace("Hello","Hi");
String[] words=str.split(" ");
char[] char1=str.toCharArray();

System.out.println("UpperCase:"+str1);
System.out.println("LoweCase:"+str2);
System.out.println("Replace String:"+str3);

System.out.println();

for(String word:words){
System.out.println(word);
}

System.out.println();

for(char c:char1){
System.out.println(c);
}

}
}
