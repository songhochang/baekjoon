class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        answer = n;
        char[] c = control.toCharArray();
        
        for(int i = 0; i < c.length; i++){
            if(c[i] == 'w'){
                answer = answer + 1;
            }
            else if(c[i] == 's'){
                answer = answer - 1;
            }
            else if(c[i] == 'd'){
                answer = answer + 10;
            }
            else{
                answer = answer - 10;
            }
        }
        
        
        return answer;
    }
}