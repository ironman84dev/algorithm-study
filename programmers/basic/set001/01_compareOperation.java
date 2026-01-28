class Solution {
    public int solution(int a, int b) {
        
        int sumResult = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int productResult = 2 * a * b;
        
        int answer = (sumResult >= productResult) ? sumResult : productResult;
        return answer;
    }
}
