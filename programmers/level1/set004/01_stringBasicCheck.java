class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();

        if(len == 4 || len == 6) {    
            for(int i = 0; i < len; i++) {
                int ch = s.charAt(i);
                if(48 > ch || ch > 57) {
                    answer = false;
                    break;
                }
            }
        } else answer = false;

        return answer;
    }
}
