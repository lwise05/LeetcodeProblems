class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> romanNum= new HashMap<>();
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);

        int total = 0;

         for(int i = 0 ; i < s.length() ; i++){
            if(i < s.length() - 1 && romanNum.get(s.charAt(i)) < romanNum.get(s.charAt(i + 1))){
                total -= romanNum.get(s.charAt(i));
            }
            else {
                total += romanNum.get(s.charAt(i));
            }
         }
         return total;
    }
}