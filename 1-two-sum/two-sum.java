class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0 ; i < nums.length ; i++){
            int pointer1 = nums[i];

            for(int j = i + 1 ; j < nums.length ; j++){
                int pointer2 = nums[j];
                if(pointer1 + pointer2 == target){
                    return new int[] {i,j};
                }
            }

        }
        return new int[] {};
    }
    
}