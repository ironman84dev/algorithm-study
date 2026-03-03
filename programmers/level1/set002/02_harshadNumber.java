class Solution {
    public boolean solution(int x) {
        
        String strX = Integer.toString(x);
        int sumX = 0;
        
        for(int i = 0; i < strX.length(); i++) {
            sumX += Integer.parseInt(String.valueOf(strX.charAt(i)));
        }
        
        return (x % sumX == 0) ? true : false;
    }
}
