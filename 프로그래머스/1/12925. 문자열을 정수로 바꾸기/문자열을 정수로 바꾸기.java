class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String code = s.charAt(0) +"";
        
        if (code == "-"){
            int n = Integer.parseInt(s.substring(1));
            answer -= n;
        }
        else {
            int n = Integer.parseInt(s);
            answer += n;
        }
            
        return answer;
    }
}