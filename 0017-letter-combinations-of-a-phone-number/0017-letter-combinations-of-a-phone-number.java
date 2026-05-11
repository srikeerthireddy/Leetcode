class Solution {
    public static final String[] KEYPAD={
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return ans;
        }
        backtrack(ans,new StringBuilder(),digits,0);
        return ans;
    }
    public static void backtrack(List<String> ans, StringBuilder current,String digits,int index){
        if(index==digits.length()){
            ans.add(current.toString());
            return;
        }
        String letters=KEYPAD[digits.charAt(index)-'0'];
        for(char letter:letters.toCharArray()){
            current.append(letter);
            backtrack(ans,current,digits,index+1);
            current.deleteCharAt(current.length()-1);
        }
    }
}