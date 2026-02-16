import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        List<Integer> list = new ArrayList<>();
        for(int a : arr) {
            list.add(a);
        }
        
        for(int i = 0; i < queries.length; i++) {
            int iIdx = queries[i][0];
            int jIdx = queries[i][1];
            int iVal = list.get(iIdx);
            int jVal = list.get(jIdx);
            
            list.set(iIdx, jVal);
            list.set(jIdx, iVal);
        }  
        
        return list.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}
