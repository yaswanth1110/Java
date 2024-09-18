package javafullstack;

public class Squares_Array {
    public static void main(String[] args) {
        int[] nums=new int[10];
//        int i;
////        for ( i = 0; i < nums.length; i++) {
////            for (int j = 1; j <=10 ; j++) {
////                nums[i]=j*j;
////            }
////        }System.out.println(nums[i]);
        System.out.println(nums.length);

        for (int i = 0; i < nums.length ; i++) {
            nums[i]=(i+1)*(i+1);

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
