class Solution {
    public String toLowerCase(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ans+=Character.toLowerCase(ch);
        }
        return ans;
    }
}