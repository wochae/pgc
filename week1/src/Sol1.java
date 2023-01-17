package week1.src;

import java.util.LinkedList;
import java.util.Queue;

// 기지국 설치
public class Sol1 {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;

        Queue<Integer> sq = new LinkedList<>();
        for (int s : stations) sq.offer(s);

        int pos = 1;
        while (pos <= n) {
            if (!sq.isEmpty() && sq.peek() - w <= pos) {
                pos = sq.poll() + w + 1;
            } else {
                answer += 1;
                pos += w * 2 + 1;
            }
        }
        return answer;
    }
}
