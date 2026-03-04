class Solution {
    public String solution(String s) {
        
        int sLen = s.length();
        StringBuilder sb = new StringBuilder();
        
        return (sLen % 2 != 0) ? String.valueOf(s.charAt(sLen/2)) 
                                 : sb.append(s.charAt((sLen/2)-1)).append(s.charAt((sLen/2))).toString();

    }
}
