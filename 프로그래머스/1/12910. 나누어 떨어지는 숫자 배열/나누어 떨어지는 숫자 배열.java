import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                count += 1;
            }
        }
        
        if(count != 0){
            int[] answer = new int[count];
            int a = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] % divisor == 0){
                    answer[a] = arr[i];
                    a += 1;
                }
            }
            return answer;
        }
        else{
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
    }
}