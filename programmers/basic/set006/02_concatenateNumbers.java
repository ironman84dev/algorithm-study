class Solution {
    public int solution(int[] num_list) {
        
        StringBuilder sbEven = new StringBuilder();
        StringBuilder sbOdd = new StringBuilder();
        
        for(int i = 0; i < num_list.length; i++) {
            int num = num_list[i];
            if(num % 2 == 0) sbEven.append(num);
            else sbOdd.append(num);
        }
        
        return Integer.parseInt(sbEven.toString()) 
                + Integer.parseInt(sbOdd.toString());
    }
}
