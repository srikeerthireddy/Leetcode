class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int friend:friends){
            map.put(friend,1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:order){
           if(map.containsKey(num)){
            list.add(num);
        }
        }
        int ans[]=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
        
    }
}