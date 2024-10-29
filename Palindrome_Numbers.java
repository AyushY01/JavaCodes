//Palindrome Numbers is a number which is same as reverse of a number.
public class Palindrome_Numbers{

    //Without stringbuilder function
    public static void main(String[]args){
         String s="Hello";
    //    String r="";
    //    int n=s.length();
    //    for(int i=1;i<=s.length();i++){
    //     r=r+s.charAt(n-1);
    //    }
    //    if(r.equals(s)){
    //     System.out.println("It is");
    //    }else{
    //     System.out.println("It is not");
    //    }
    Stringreverse(s);
}
public static void Stringreverse(String m){
    
    StringBuilder str=new StringBuilder(m);
    str.reverse();
    if (str.toString().equalsIgnoreCase(m.toString())) {
        System.out.println("It is");
    } else {
        System.out.println("It is not");
    }

}



}