class Solution {
    public boolean isPalindrome(int x) {
    if(x < 0){
        return false;
    }
    String nums = Integer.toString(x);

    for(int i = 0 ; i < nums.length()/2 ; i++){
        if(nums.charAt(i) != nums.charAt(nums.length() -1 -i)){
            return false;
        }
       
    }
    return true;
    } 
}