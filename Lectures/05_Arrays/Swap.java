package arrays2d;

public class Swap {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int ind1,int ind2){
       int temp=arr[ind1];
       arr[ind1]=arr[ind2];
       arr[ind2]=temp;
    }
}
