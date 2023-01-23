package week1.src;

import java.util.Arrays;

public class Sol4 {
    public long solution(int goal, int[] durations) {
        int maxDuration = 0;

        for (int d : durations) maxDuration = Math.max(maxDuration, d);

        long hours = finishHours(goal, durations, maxDuration);

        return calcPay(hours, durations, maxDuration);
    }


    private long finishHours(int goal, int[] durations, int maxDuration) {
        long min = 0;
        long max = maxDuration * (goal / durations.length + 1L);

        while (min < max) {
            long mid = (min + max) / 2;
            int count = 0;

            for (int d : durations) count += mid / d;
            if (count < goal) min = mid + 1;
            else
                max = mid;
        }
        return max;
    }

    private long calcPay(long hours, int[] durations, int maxDuration) {
        long minCount = hours / maxDuration;
        long incentive = 0;

        for (int d : durations) incentive += hours / d - minCount;

        return incentive * 10_000L;
    }
}