// problem statement -> https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0){
            ArrayList<String> bres = new ArrayList<String>();
            return bres;
        }
        if(digits.length() == 1){
            ArrayList<String> new_bres = new ArrayList<>();
            char ch = digits.charAt(0);
            String code_for_number = codes[ch - 48];
        
        for(int i = 0; i < code_for_number.length(); i++){
            new_bres.add("" + code_for_number.charAt(i));
        }
            return new_bres;
        }
        
        char ch = digits.charAt(0);
        String ss = digits.substring(1);
        
        List<String> pans = letterCombinations(ss);
        ArrayList<String> ans = new ArrayList<String>();
        String code_for_number = codes[ch - 48];
        
        for(int i = 0; i < code_for_number.length(); i++){
            char chval = code_for_number.charAt(i);
            for(String val : pans){
                ans.add(chval + val);
            }
        }
        
        return ans;
    }
    
    static String[] codes = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
}
