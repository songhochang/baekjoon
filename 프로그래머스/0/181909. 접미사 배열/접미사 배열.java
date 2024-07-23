import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        String[] msarr = new String[my_string.length()];

        for(int i = 0; i < my_string.length(); i++){
            msarr[i] = my_string.substring(i);
        }
        
        String[] answer = msarr;
        
        Arrays.sort(answer);
        
        return answer;
    }
}