package javafullstack;

public class Arrays {
    public static void main(String[] args) {
        int[] nums;
        nums=new int[5];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=101;
        nums[0]=200;
        for (int i = 0; i <nums.length; i++) {
            System.out.print(nums[i]+" ");

        }
        //System.out.println(nums[4]);
    }
}
