public class Change {
    public static int findRepeatNumber(int[] nums) {
        int temp;
        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums.length;j++){
//                System.out.print(nums[j] + ",");
//            }
            System.out.println();
            while (nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
                for(int j=0;j<nums.length;j++){
                    System.out.print(nums[j] + ",");
                }
                System.out.println();
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println("我找打了是" + findRepeatNumber(nums));
    }
}
