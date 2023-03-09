package week1.sort;

import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {
    public String solution1(int[] numbers) {
        String answer = "";
        String[] numberToStr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(numberToStr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if (numberToStr[0].equals("0")) return "0";

        for(String str : numberToStr)
            answer += str;
        return answer;
    }
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        boolean except = true;
        String[] num = new String[numbers.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = String.valueOf(numbers[i]);
            if (numbers[i] != 0) except = false;
        }
        Arrays.sort(num, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        for (int i = 0; i < num.length; i++)
            answer.append(num[i]);
        if(except) answer = new StringBuilder("0");
        return answer.toString();
    }

}
