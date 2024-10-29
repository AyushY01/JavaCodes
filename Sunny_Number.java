public class Sunny_Number {
    public static void main(String[] args) {
        int m=88;
        int h=m/2;
        int n=m+1;
        int s=0;
        for(int i=1;i<=h;i++){
             s=i*i;
            if(s==n){
                System.out.println("It is "+s);
                break;
            }else if(s>n){
                System.out.println("It is not");
                break;
            }

            
        }
    }
}
