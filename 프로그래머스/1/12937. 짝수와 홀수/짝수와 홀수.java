class Solution {
    public String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0){
            answer = answer + "Even";
        }
        else{
            answer = answer + "Odd";
        }
        
        return answer;
    }
}