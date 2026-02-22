import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        
        // upper: 65 ~ 90, lower: 97 ~ 122
        List<Integer> list = new ArrayList<>(52);
        for(int n = 0; n < 52; n++) {
            list.add(0);
        }
        
        for(int i = 0; i < my_string.length(); i++) {
            int s = my_string.charAt(i);
            
            for(int u = 65; u <= 90; u++) {
                int uIndex = (u-65);
                if(s == u) {
                    list.set(uIndex, (list.get(uIndex))+1);       
                } else continue;
            }
            
            for(int l = 97; l <= 122; l++) {
                int lIndex = (l-97)+26;
                if(s == l) {
                    list.set(lIndex, (list.get(lIndex))+1);
                } else continue;
            }
        }    
            
        return list.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}
