

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        
        int mom = denom1*denom2;
        int son = (denom1*numer2)  + (denom2*numer1);
        int gcd = getGcd(son, mom);
        
        
        answer[0] = son/gcd;
        answer[1] = mom/gcd;
        
        
        return answer;
    }
    public int getGcd(int a, int b) {
            
            while(a%b == 0) {
                return b;
            }
            return getGcd(b, a%b);
        }
}