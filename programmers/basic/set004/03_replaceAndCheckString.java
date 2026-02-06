class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len = myString.length();
        StringBuilder sb = new StringBuilder(myString);
        
        for(int i = 0; i < len; i++) {
            char string = myString.charAt(i);
            if('A' == myString.charAt(i)) sb.setCharAt(i, 'B');
            else sb.setCharAt(i, 'A');
        }
        
        return sb.toString().contains(pat) ? 1 : 0;
        
    }
}
