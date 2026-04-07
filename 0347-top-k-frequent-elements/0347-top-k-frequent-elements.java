class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int result[]=new int[k];
        int index=0;
        while(index<k){
            int maxFreq=-1;
            int maxNum=-1;
            for(int num:map.keySet()){
                if(map.get(num)>maxFreq){
                    maxFreq=map.get(num);
                    maxNum=num;
                }
            }
            result[index]=maxNum;
            map.remove(maxNum);
            index++;
        }
        return result;
    }
}