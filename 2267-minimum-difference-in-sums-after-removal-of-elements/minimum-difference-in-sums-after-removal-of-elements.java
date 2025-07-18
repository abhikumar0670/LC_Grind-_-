class Solution {
    public long minimumDifference(int[] nums) {
        int n = nums.length / 3;
        int ttl = nums.length;

        long[] minLeft = new long[ttl];
        long[] maxRight = new long[ttl];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long leftSum = 0;

        for (int i = 0; i < n; i++) {
            pq.offer(nums[i]);
            leftSum += nums[i];
        }
        minLeft[n - 1] = leftSum;

        for (int i = n; i < 2 * n; i++) {
            pq.offer(nums[i]);
            leftSum += nums[i];
            leftSum -= pq.poll();
            minLeft[i] = leftSum;
        }
        PriorityQueue<Integer> minq = new PriorityQueue<>();
        long rightSum = 0;

        for (int i = ttl - 1; i >= 2 * n; i--) {
            minq.offer(nums[i]);
            rightSum += nums[i];
        }
        maxRight[2 * n] = rightSum;

        for (int i = 2 * n - 1; i >= n; i--) {
            minq.offer(nums[i]);
            rightSum += nums[i];
            rightSum -= minq.poll();
            maxRight[i] = rightSum;
        }
        long res = Long.MAX_VALUE;
        for (int i = n - 1; i < 2 * n; i++) {
            res = Math.min(res, minLeft[i] - maxRight[i + 1]);
        }
        return res;
    }
}

