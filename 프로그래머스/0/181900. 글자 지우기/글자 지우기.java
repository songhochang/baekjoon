class Solution {
    public String solution(String my_string, int[] indices) {
         String[] msarr = my_string.split("");

        for(int i = 0; i < indices.length; i++){
            msarr[indices[i]] = "";
        }

        String answer = "";

        for(int i = 0; i < msarr.length; i++){
            answer = answer + msarr[i];
        }
        
        return answer;
    }
}