class Solution {
    public String solution(String code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = code.length();
        int mode = 0;
        
        for(int i = 0; i < len; i++) {
            char ch = code.charAt(i);
            
            if(mode == 0) {
                if(ch == '1') { mode = 1; continue; }
                else if(i%2 == 0) { sb.append(ch); }
                
            } else if(mode == 1) {
                if(ch == '1') { mode = 0; continue; }
                else if(i%2 == 1) { sb.append(ch); }
            }
            
        }
        
        
        return sb.toString().isEmpty() ? "EMPTY" : sb.toString();
    }
}
