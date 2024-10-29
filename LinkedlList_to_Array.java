import java.util.LinkedList;

public class LinkedlList_to_Array {
public static void main(String[] args) {

    //Integer
    LinkedList<Integer> array=new LinkedList<>();
      array.add(1);
      array.add(2);
      array.add(3);
      array.add(4);
      array.add(5);
      Object []arr=array.toArray();
      for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
      }

      //String
      LinkedList<String> array2=new LinkedList<>();
      array2.add("ABV");
      array2.add("VBN");
      array2.add("MBN");
      array2.add("KJK");
      array2.add("PKJ");
      String []srr=new String[array.size()];
      array2.toArray(srr);
      for(int i=0;i<arr.length;i++){
       System.out.println(srr[i]);
      }

}    
}
