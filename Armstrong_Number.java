public class Armstrong_Number {
    public static void main(String[] args) {
        int m=153;
        int o=m;
        int count=0;
        
         
        while(o>0){
         o=o/10;
         count++;

        }
        o=m;
        int arm=0;
        while(o>0){
            o=o%10;
            arm +=Math.pow(o,count);
            o=o/10;
        }
        System.out.println(arm);
        if(m==arm){
            System.out.println("It is");
        }else{
            System.out.println("It is not");
        }
       
       
    }
}
