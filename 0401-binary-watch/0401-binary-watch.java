class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result=new ArrayList<>();

        for(int hour=0;hour<12;hour++){
            for(int minutes=0;minutes<60;minutes++){
                int count=Integer.bitCount(hour)+Integer.bitCount(minutes);

                if(count==turnedOn){
                    result.add(String.format("%d:%02d",hour,minutes));
                }
            }
        } 
        return result;
    }
}