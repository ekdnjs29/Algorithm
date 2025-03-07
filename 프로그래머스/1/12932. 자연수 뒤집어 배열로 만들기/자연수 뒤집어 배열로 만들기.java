class Solution {
    public int[] solution(long n) {
        // int[] answer = {};
        
        String reversedStr = new StringBuilder(String.valueOf(n)).reverse().toString();
        
        int[] answer = new int[reversedStr.length()];
        for(int i=0; i< reversedStr.length(); i++){
            answer[i] = reversedStr.charAt(i) - '0';
        }
        
        return answer;
    }
}