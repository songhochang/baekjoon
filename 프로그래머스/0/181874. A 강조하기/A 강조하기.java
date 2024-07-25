class Solution {
    public String solution(String myString) {
        char[] c = myString.toCharArray();

        for(int i = 0; i < c.length; i++){
            if(c[i] > 65 && c[i] <= 90) {
                c[i] = (char)(c[i] + 32);
            }
            else if(c[i] == 97){
                c[i] = (char)(c[i] - 32);
            }
        }

        String answer = new String(c);
        return answer;
    }
}