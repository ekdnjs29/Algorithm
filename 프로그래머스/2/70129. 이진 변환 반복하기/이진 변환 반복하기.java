class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;
        
        while (!s.equals("1")) {
            count++;
            int len = s.length();
            s = s.replace("0", "");
            zeroCount += len - s.length();
            
            s = Integer.toBinaryString(s.length());
        }
        
        int[] answer = {count, zeroCount};
        return answer;
    }
}