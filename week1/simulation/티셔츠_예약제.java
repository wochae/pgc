package week1.simulation;

import java.util.Arrays;

public class 티셔츠_예약제 {
    public int solution_1(int[] people, int[] tshirts) {
        int answer = 0;
        Arrays.sort(people);
        Arrays.sort(tshirts);

        int tlen = tshirts.length;
        int plen = people.length;
        for (int i = 0; i < plen; i++) {
            if (people[plen - i - 1] <= tshirts[tlen - 1]) {
                answer++;
                tlen--;
            }
        }
        return answer;
    }

    public int solution_2(int[] people, int[] tshirts) {
        Arrays.sort(people);
        Arrays.sort(tshirts);

        int answer = 0;
        int tshIdx = tshirts.length - 1;
        for (int i = 0 ; i < people.length ; i++) {
            if (people[people.length-i-1] <= tshirts[tshIdx]) {
                answer++;
                tshIdx--;
            }
        }
        return answer;
    }
}
