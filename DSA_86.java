import java.util.*;
public class DSA_86 {
    public static int longest_subarray(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == 0){
                maxLen = i+1;
            } 
            else if(map.containsKey(sum)){
                maxLen = Math.max(maxLen , i - map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[] nums = {15, -2, 2, 8, -8, 9};
        System.out.println("THE LONGEST SUBARRAY WITH SUM 0 : "+longest_subarray(nums));
    }
}
