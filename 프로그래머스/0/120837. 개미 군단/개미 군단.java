class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general_ant = 5;
        int soldier_ant = 3;
        int work_ant = 1;
        
        if(hp < 3){
            answer = hp / work_ant;
        }
        else if(hp < 5){
            answer = (hp / soldier_ant) + ((hp % soldier_ant) / work_ant);
        }
        else{
            answer = (hp / general_ant) + ((hp % general_ant) / soldier_ant) + (((hp % general_ant) % soldier_ant) / work_ant);
        }
        
        return answer;
    }
}