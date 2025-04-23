class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) { return "" ;}
        
        String prefix = strs[0]; // using first word to compare

        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0){
                //substracting end letter until prefix matches
                prefix = prefix.substring(0, prefix.length() -1); 
            }
        }

        return prefix;
    }
}