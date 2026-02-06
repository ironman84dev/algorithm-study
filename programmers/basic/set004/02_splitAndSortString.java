import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        Arrays.sort(arr);
        
        List<String> list = new ArrayList<>();
        for(String a : arr) {
            if(!a.equals("")){
                list.add(a);
            }
        }
        
        // list.size()에 맞춰 String 타입의 배열 생성
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}
