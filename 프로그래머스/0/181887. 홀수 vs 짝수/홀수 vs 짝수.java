class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int hsum = 0;
        int jsum = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if((i + 1) % 2 == 0){
                jsum = jsum + num_list[i];
            }
            else{
                hsum = hsum + num_list[i];
            }
        }
        
        if(hsum > jsum){
            answer = hsum;
            return answer;
        }
        else if(jsum > hsum){
            answer = jsum;
            return answer;
        }
        else{
            answer = hsum;
            return answer;
        }
        
        
    }
}