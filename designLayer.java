package main.huffman;
import java.util.Scanner;
interface calcii
{
public void add(int a,int b);
public void sub(int a,int b);
public void mul(int a,int b);
public void div(int a,int b);
}

public  class designLayer implements calcii{
public  void add(int a,int b)
{
System.out.println("ADD:"+(a+b));
}
public void sub(int a,int b)
{
System.out.println("SUB:"+(a-b));
}
public void mul(int a,int b)
{
System.out.println("MUL:"+(a*b));
}
public void div(int a,int b)
{
System.out.println("DIV:"+(a/b));
}
public static void main(String[] args) {
designLayer a=new designLayer();
// calci ba=new designLayer();
System.out.println("enter no's");
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
a.add(n1,n2);
a.sub(n1,n2);
a.mul(n1,n2);
a.div(n1,n2);

}
}
class liskov extends  designLayer
{
public void count()
{
designLayer a=new liskov();
System.out.println("enter no of chocolates that are there with 2 persons");
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
System.out.println("Total chocolates present:");
a.add(n1,n2);
}



class DesignPatterns {
public void main(String[] args) {
designLayer.main(null);
}
}
}











