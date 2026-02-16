import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        for(int a : arr) {
            list.add(a);
        }
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j = s; j <= e; j++) {
                if(j % k == 0) list.set(j, list.get(j)+1);
            }
        }
        
        return list.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}
