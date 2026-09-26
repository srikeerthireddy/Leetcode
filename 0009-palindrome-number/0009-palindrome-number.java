class Solution {
    public boolean isPalindrome(int x) {
        int reversed=0;
        int original=x;
        while(x>0){
            int lastdigit=x%10;
            reversed=reversed*10+lastdigit;
            x=x/10;
        }
        if(reversed==original){
            return true;
        }else{
            return false;
        }
        
    }
}