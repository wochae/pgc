package week1.src;

import java.util.Arrays;

public class Sol3 {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        int aPos = 0;
        int bPos = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[aPos] > B[bPos])
                bPos++;
            else if (A[aPos] == B[bPos])
                bPos++;
            else {
                aPos++;
                bPos++;
                answer++;
            }
        }
        return answer;
    }
}
