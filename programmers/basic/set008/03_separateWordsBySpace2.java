class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(String a : arr) {
            if(!a.isEmpty()) sb.append(a).append(":");
        }
        
        return sb.toString().split(":");
    }
}
