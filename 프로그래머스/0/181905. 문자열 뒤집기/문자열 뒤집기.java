class Solution {
    public String solution(String my_string, int s, int e) {
        char[] c = my_string.substring(s,e+1).toCharArray();

        for(int i = 0; i < c.length/2; i++){
            char ch = c[i];
            c[i] = c[c.length -1 - i];
            c[c.length -1 - i] = ch;
        }

        String str = new String(c);

        String answer = my_string.substring(0,s) + str + my_string.substring(e+1);
        
        return answer;
    }
}