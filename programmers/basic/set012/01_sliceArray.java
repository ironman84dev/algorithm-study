import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        List<Integer> list = new ArrayList<>();
        for(int a : arr) {
            list.add(a);
        }      
        
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                list.subList(query[i]+1, list.size()).clear();
            } else {
                list.subList(0, query[i]).clear();
            }    
        }
        
        return list.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}
