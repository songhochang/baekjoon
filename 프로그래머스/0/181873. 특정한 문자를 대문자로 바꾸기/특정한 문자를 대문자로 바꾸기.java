class Solution {
    public String solution(String my_string, String alp) {
        char[] alpc = alp.toCharArray();

        char[] c = my_string.toCharArray();

        for(int i = 0; i < c.length; i++){
            if(c[i] == alpc[0]){
                c[i] = (char) (c[i] - 32);
            }
        }
        
        String answer = new String(c);
        
        return answer;
    }
}