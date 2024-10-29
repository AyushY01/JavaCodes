import java.util.Scanner;
public class ascii_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
            int [] ans=new int[size];

            /////////////////////
           for(int i=0;i<size;i++){
           String ques=sc.next();
            int length=ques.length();
            int j=1;
            int sum=0;
            int multiply=1;
            //
            while(--length>=0){
                char ch=ques.charAt(length);
                int ascii=ch;
                sum=(ascii*multiply)+sum;
                multiply=multiply*10;
            }
            ans[i]=sum;
        }
            /////////////////////
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i]);
            }
}}