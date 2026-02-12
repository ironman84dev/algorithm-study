import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        List<Integer> resultList = new ArrayList<>();
        
        for(int i = 0; i < queries.length; i++) {
        
            List<Integer> list = new ArrayList<>();
            int sNum = queries[i][0];
            int eNum = queries[i][1];
            int kNum = queries[i][2];
            
            for(int j = sNum; j <= eNum; j++) {
                if(arr[j] > kNum) { list.add(arr[j]); }
                else { continue; }
            }
            
            resultList.add(list.size() <=0 ? -1 : Collections.min(list));
        }
        
        int[] answer = resultList.stream()
                                 .mapToInt(i -> i.intValue())
                                 .toArray();
        
        return answer;
    }
}
