import java.util.*;
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a:");
int a=sc.nextInt();
System.out.println("enter b:");
int b=sc.nextInt();
System.out.println("enter c:");
int c=sc.nextInt();
if(a>b){
if(a>c){
System.out.println(a);
}
else{
System.out.println(c);
}
}
else{
if(b>c){
System.out.println(b);
}
else{
System.out.println(c);
}
}
}
}
