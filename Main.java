import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] res = (new Solution()).twoSum(nums, target);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}

class Solution{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(target - nums[i]))
                return new int[]{hashMap.get(target - nums[i]), i};
            hashMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
