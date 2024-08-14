class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        char c = letter.charAt(0);
        char[] carr = my_string.toCharArray();

        for(int i = 0; i < carr.length; i++){
            if(c != carr[i]){
                answer = answer + carr[i];
            }
        }
        
        return answer;
    }
}