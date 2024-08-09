class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
            return answer;
        }
        else if(dot[0] < 0 && dot[1] > 0){
            answer = 2;
            return answer;
        }
        else if(dot[0] < 0 && dot[1] < 0){
            answer = 3;
            return answer;
        }
        else{
            answer = 4;
            return answer;
        }
        
    }
}