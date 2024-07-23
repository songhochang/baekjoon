class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int nsum = 0;
        int dsum = 0;

        int[] answer = new int[2];

        if(denom1 > denom2){
            if(denom1 % denom2 == 0){
                nsum = numer1 + numer2*(denom1 / denom2);
                dsum = denom1;
            }
            else{
                nsum = numer1*denom2 + numer2*denom1;
                dsum = denom1*denom2;
            }
        }
        else if(denom1 < denom2){
            if(denom2 % denom1 == 0){
                nsum = numer2 + numer1*(denom2 / denom1);
                dsum = denom2;
            }
            else{
                nsum = numer1*denom2 + numer2*denom1;
                dsum = denom1*denom2;
            }
        }
        else{
            nsum = numer1 + numer2;
            dsum = denom1;
        }
        
        int max = 0;

        if(nsum == dsum){
            nsum = 1;
            dsum = 1;
        }
        else if(nsum > dsum){
            for(int i = 1; i <= dsum; i++){
                if(nsum % i == 0 && dsum % i == 0){
                    max = i;
                }
            }
            nsum = nsum / max;
            dsum = dsum / max;
        }
        else{
            for(int i = 1; i <= nsum; i++){
                if(nsum % i == 0 && dsum % i == 0){
                    max = i;
                }
            }
            nsum = nsum / max;
            dsum = dsum / max;
        }

        answer[0] = nsum;
        answer[1] = dsum;
        return answer;
    }
}