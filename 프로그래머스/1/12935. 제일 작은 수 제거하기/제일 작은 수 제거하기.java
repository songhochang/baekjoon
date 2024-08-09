class Solution {
    public int[] solution(int[] arr) {
        if(arr.length > 1){
            int min = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            int k = 0;
            int[] answer = new int[arr.length - 1];
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != min){
                    answer[k] = arr[i];
                    k += 1;
                }
            }
            return answer;
        }
        else{
            int[] answer = {-1};
            return answer;
        }
        
    }
}