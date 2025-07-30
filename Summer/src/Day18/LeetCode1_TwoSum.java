package Day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1_TwoSum {
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> checked= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer diff = target - nums[i];
            if(checked.containsKey(diff)){
                return new int[] {checked.get(diff),i};
            }else {
                checked.put(nums[i], i);
            }
        }
        return null;
    }

}
