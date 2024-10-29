//Fibonaaci Serie in Java
class Java_All_Program{
//using loop
 static int n1=0,n2=1,n3=0;
public void fib(int a){
System.out.print(n1+","+n2);//for 0 and 1;
for(int i=2;i<a;i++){
    n3=n2+n1;
    System.out.print(","+n3);
    n1=n2;
    n2=n3;
}
System.out.println("Using loop");
}

//using recursion
public static void fibrecrusion(int a){
if(a>0){
    n3=n2+n1;
    n1=n2;
    n2=n3;
    System.out.print(","+n3);
    fibrecrusion(a-1);
}

}

public static void main(String[] args) {
    Java_All_Program f=new Java_All_Program();
  //  f.fib(5);
    //with recursion
    System.out.print(n1+","+n2);//for 0 and 1;
  f.fibrecrusion(5-2);

}
}