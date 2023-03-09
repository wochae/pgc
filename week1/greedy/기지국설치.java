package week1.greedy;

import java.util.LinkedList;
import java.util.Queue;


public class 기지국설치 {
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

    public int solution2(int n, int [] stations, int w) {
        int answer = 0;
        int pos = 1;

        Queue<Integer> q = new LinkedList<>();

        for (int s : stations) q.offer(s);

        while(pos <= n) {
            if (!q.isEmpty() && q.peek() - w <= pos) {
                pos = q.poll() + w + 1;
            }
            else {
                answer += 1;
                pos += w * 2 + 1;
            }
        }
        return answer;
    }
}
