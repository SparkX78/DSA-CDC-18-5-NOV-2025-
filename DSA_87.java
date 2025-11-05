import java.util.HashMap;

public class DSA_87 {
    

    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // base case: sum 0 at index -1
        int maxLength = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1) ? 1 : -1;

            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }

        return maxLength;
    }
    public static void main(String[] args){
        int[] nums = {0, 1, 0 , 1, 1, 1, 1, 0, 0};
        System.out.println(findMaxLength(nums));
    }
}


