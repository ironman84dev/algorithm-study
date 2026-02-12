import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        List<Integer> list = new ArrayList<>();
        for(int a : arr) {
            list.add(a);
        }
        
        for(int i = 0; i < queries.length; i++) {
            int sNum = queries[i][0];
            int eNum = queries[i][1];
            
            for(int j = sNum; j <= eNum; j++) {
                list.set(j, (arr[j] += 1));
            }
        }
        
        int[] answer = list.stream()
                           .mapToInt(i -> i.intValue())
                           .toArray();
        
        return answer;
    }
}
