class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
            
        for(int i = 0; i < code.length(); i++){
           if(mode == 0){
                if(code.charAt(i) != '1' && (i % 2) == 0){
                    answer = answer + code.charAt(i);
                }
                if(code.charAt(i) == '1'){
                    mode = mode + 1;
                }
            }
            else{
                if(code.charAt(i) != '1' && (i % 2) == 1){
                    answer = answer + code.charAt(i);
                }
                if(code.charAt(i) == '1'){
                    mode = mode - 1;
                }
            }
        }
        if(answer.equals("")){
            return "EMPTY";
        }
        
        return answer;
    }
}