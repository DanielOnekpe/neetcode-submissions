class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> exists = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int other = target - nums[i];

            if(exists.containsKey(other)){
                return new int[]{exists.get(other), i};
            }

            exists.put(nums[i], i);
        }

        return new int[]{};
    }
}
