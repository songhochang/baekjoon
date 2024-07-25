class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toCharArray();

        for(int i = 0; i < c.length; i++){
            if(c[i] <= 90){
                c[i] = (char)(c[i] + 32);
            }
            else if(c[i] <= 122){
                c[i] = (char)(c[i] -32);
            }
        }

        String answer = new String(c);
        return answer;
    }
}