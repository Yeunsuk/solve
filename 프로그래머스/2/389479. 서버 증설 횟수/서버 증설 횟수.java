class Solution {
    public int solution(int[] players, int m, int k) {
        int[] arr = new int[24+k];
        int answer=0, num=0;
        
        for(int i=0; i<24; i++) {
            int tmp = players[i]/m;
            num -= arr[i];
            
            if(num<tmp) {
                int diff = tmp - num;
                answer += diff;
                num += diff;
                
                arr[i+k] += diff;
            }
        }
        
        return answer;
    }
}