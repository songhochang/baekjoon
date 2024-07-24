class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] c = my_string.toCharArray();
        for(int i = 0; i < c.length; i++){
            if(c[i] > 48 && c[i] < 58){
                answer = answer + c[i] - 48;
            }
        }
        return answer;
    }
}