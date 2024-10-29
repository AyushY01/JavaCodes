
import java.util.Scanner;
public class array_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int arr_size=0;
            if(sc.hasNextInt()){
                arr_size=sc.nextInt();
            }
            int []arr=new int[arr_size];
            for(int i=0;i<arr_size;i++){
                if(sc.hasNextInt()){
                    arr[i]=sc.nextInt();
                }
            }
             int min=Integer.MAX_VALUE;
             int index=0;
           for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
           }
           System.out.println(arr_size-index);
    }
}
