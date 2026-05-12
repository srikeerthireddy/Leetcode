class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(candidates,0,new ArrayList<>(),result,target);
        return result;

    }
    private void backtrack(int[] candidates,int start,List<Integer> current,List<List<Integer>> result,int target){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            current.add(candidates[i]);
            backtrack(candidates,i,current,result,target-candidates[i]);
            current.remove(current.size()-1);
        }
    }
}