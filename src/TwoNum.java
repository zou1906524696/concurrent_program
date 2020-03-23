import java.util.ArrayList;

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
        int k = 0;
        int result = ++k + k++ + ++k + k;
        System.out.println("res=" + result);
        ArrayList a = new ArrayList(20);
    }
}
