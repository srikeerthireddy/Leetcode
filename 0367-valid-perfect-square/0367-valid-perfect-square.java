class Solution {
    public boolean isPerfectSquare(int num) {
        long square=(long)Math.sqrt(num);
        if(square*square==num){
            return true;
        }else{
            return false;
        }
    }
}