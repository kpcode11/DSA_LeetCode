class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstBound(nums, target, true);
        if (first == -1) {
            return new int[] { -1, -1 };
        }

        int last = firstBound(nums, target, false);
        return new int[] { first, last };
    }

    private int firstBound(int[] nums, int target, boolean findFirst) {
        int low = 0;
        int high = nums.length - 1;
        int res = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                res = mid;
                if (findFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}