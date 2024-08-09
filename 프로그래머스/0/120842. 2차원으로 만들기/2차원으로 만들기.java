class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        
        int k = 0;
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[0].length; j++){
                answer[i][j] = num_list[k];
                k += 1;
            }
        }
        
        return answer;
    }
}