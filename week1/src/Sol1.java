package week1.src;

import java.util.LinkedList;
import java.util.Queue;

// 기지국 설치
public class Sol1 {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int si = 0;
        int pos = 1;
        while (pos <= n) {
            if (si < stations.length && stations[si] - w <= pos) {
                pos = stations[si] + w + 1;
                si++;
            } else {
                answer += 1;
                pos += w * 2 + 1;
            }
        }
        return answer;
    }
}
