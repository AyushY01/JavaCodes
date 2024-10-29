public class Peterson_Number {
// Suppose, we have to check the number (n) 145 is Peterson or not.

// Number = 145

// 145 = !1 + !4 + !5

// =1+4*3*2*1+5*4*3*2*1

// =1+24+120

// 145=145

// We observe that the number and the sum of factorials of digits are equal to the number itself. Hence, 145 is a Peterson number.

// Let's implement the above logic in a Java program.
public static void main(String[] args) {
    int m=145;
    int n=m;
    int d=0;
    int p=0;
    while(n>0){
        d=n%10;
        int fact=1;
        for(int i=1;i<=d;i++){
            fact=fact*i;
        }
        p =p+fact;

         n=n/10;

    }
    System.out.println(p);
    if(p==m){
        System.out.println("True");

    }else{
        System.out.println("False");
    }
}
}
