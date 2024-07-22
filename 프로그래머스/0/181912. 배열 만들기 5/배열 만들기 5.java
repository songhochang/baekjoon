class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        int count = 0;
        for(int i = 0; i < intStrs.length; i++){
            int a = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(a > k){
                count++;
            }
        }
        int[] answer = new int[count];
        int index = 0;
        for(int i = 0; i < intStrs.length; i++){
            int a = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(a > k){
                answer[index] = a;
                index++;
            }
        }
            
        return answer;
    }
}