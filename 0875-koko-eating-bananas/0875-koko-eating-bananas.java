class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1, hi = 0;
        for (int pile : piles) {
            hi = Math.max(hi, pile);
        }

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (hoursNeeded(piles, mid) <= h) {
                hi = mid; // mid works, try a slower (smaller) speed
            } else {
                lo = mid + 1; // too slow, need a faster speed
            }
        }

        return lo;
    }

    private long hoursNeeded(int[] piles, int speed) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed; // ceil(pile / speed)
        }
        return hours;
    }
}