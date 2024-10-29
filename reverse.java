
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        string=string.toLowerCase();
        StringBuilder str=new StringBuilder(string);
           str=str.reverse();
           string=str.toString();
           System.out.println(string);
       
    }
}
