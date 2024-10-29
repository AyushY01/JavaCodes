import java.util.*;

public class Frequency_Element {
    public static void main(String[] args) {
        int []arr={1,2,2,3,3,3,4,5,5,5};
        int n=arr.length;
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hp.containsKey(arr[i])){
                hp.put(arr[i],hp.get(arr[i])+1);
            }else{
                hp.put(arr[i],1);
            }
        }
        for(Map.Entry entry:hp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue()); 
        }
        

    }
}
