class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        if(str1.length() >= str2.length()){
            for(int i = 0; i < str1.length()-str2.length()+1; i++){
                if(str2.equals(str1.substring(i,i+str2.length()))){
                    answer = 1;
                    break;
                }
                else{
                    answer = 2;
                }
            }
        }
        else{
            answer = 2;
        }

        
        return answer;
    }
}