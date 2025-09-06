class Solution {
    private long sumStepsUpTo(long n) {
        if (n <= 0) return 0L;
        long sum = 0L;
        long pow = 1L;
        int k = 1;
        while (pow <= n) {
            long nextPow;
            if (pow > Long.MAX_VALUE / 4) nextPow = Long.MAX_VALUE;
            else nextPow = pow * 4L;
            long upper = nextPow - 1L;
            long hi = Math.min(n, upper);
            long cnt = hi - pow + 1L;
            if (cnt > 0) sum += cnt * (long) k;
            if (nextPow == Long.MAX_VALUE) break;
            pow = nextPow;
            k++;
        }
        return sum;
    }

    public long minOperations(int[][] queries) {
        long total = 0L;
        for (int[] q : queries) {
            long l = q[0];
            long r = q[1];
            long sumSteps = sumStepsUpTo(r) - sumStepsUpTo(l - 1);
            long ops = (sumSteps + 1) / 2;
            total += ops;
        }
        return total;
    }
}

