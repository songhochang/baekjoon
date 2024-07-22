class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int count = 0;
        int a = n;
        
        for(int i = 0;; i++){
            if(a % 2 == 0){
                a = a / 2;
            }
            else{
                a = 3 * a + 1;
            }
            count += 1;
            if(a == 1){
                break;
            }
        }
        
        int[] arr = new int[count + 1];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = n;
            if(n % 2 == 0){
                n = n / 2;
            }
            else{
                n = 3 * n + 1;
            }
        }
        
        answer = arr;
        
        return answer;
    }
}