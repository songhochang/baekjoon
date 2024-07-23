class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int index = 0;

        while(true){
            int sum = 0;
            for(int i = index; i < num + index; i++){
                sum = sum + i;
            }

            if(sum > total){
                index--;
                index--;
            }

            if(sum == total){
                for(int i = 0; i < num; i++){
                    answer[i] = index;
                    index++;
                }
                break;
            }

            index++;

        }
        return answer;
    }
}