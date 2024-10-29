public class LeftRotate_Number {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int temp=0;
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
            
        }
        System.out.print("{");

        for(int element:arr){
        System.out.print(element+" ");
     }
     System.out.print("}");

    }
}
