class Solution {
    public String solution(String my_string, int m, int c) {
        char[] ca = my_string.toCharArray();

        char[][] ch = new char[my_string.length()/m][m];

        int k = 0;

        for(int i = 0; i < my_string.length()/m; i++){
            for(int j = 0; j < m; j++){
                ch[i][j] = ca[k];
                k++;
            }
        }

        char[] ca1 = new char[ch.length];

        for(int i = 0; i < ch.length; i++){
            ca1[i] = ch[i][c-1];
        }

        String answer = new String(ca1);
        return answer;
    }
}