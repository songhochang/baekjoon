class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        String str = "";
        for(int i = 0; i < parts.length; i++){
            int a = parts[i][0];
            int b = parts[i][1];
            
            for(int j = 0; j < my_strings.length; j++){
                str = my_strings[i].substring(a,b+1);
            }
            answer = answer + str;
        }
        
        
        return answer;
    }
}