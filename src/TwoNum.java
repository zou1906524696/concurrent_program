public class TwoNum {
    public static int[] find_target(int[] nums,int target){
        int[] find_number = {0,0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    find_number[0] = i;
                    find_number[1] = j;
                }
            }
        }
        return find_number;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15,16,19};
        int target = 13;
        int[] result = find_target(nums,target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
