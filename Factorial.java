public class Factorial {
    // naive method
    public static int fact(int n){
        int f=1;
      for(int i=1;i<=n;i++){
        f=f*i;
      }
      return f;
    }
    // using recursion
    public  static int fc(int n){
        if(n==1){
            return 1;
        }
        return n*(fc(n-1));
    } 
    public static void main(String[] args) {
        int m=5;
       System.out.println(fact(m));
       System.out.println(fc(m));


    }
}
