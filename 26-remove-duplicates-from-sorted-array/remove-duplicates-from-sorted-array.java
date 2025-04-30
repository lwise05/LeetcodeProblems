class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for(int i = 0 ; i < nums.length - 1 ; i++){
            int leftPointer = nums[i];
            int rightPointer = nums[i + 1];
            if(leftPointer != rightPointer){
                //originally attempted to use l&rpointer values for k index and nums[i + 1] 
                nums[k] = nums[i + 1];
                k++;
            }
        }
        return k;
    }
}