class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int len = str1.length();
        
        for(int i = 0; i < len; i++ ) {
            answer += (Character.toString(str1.charAt(i))+
                       Character.toString(str2.charAt(i)));
        };
        
        return answer;
    }
}
