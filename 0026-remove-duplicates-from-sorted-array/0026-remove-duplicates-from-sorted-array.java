class Solution {
    public int removeDuplicates(int[] nums) {
        int x = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] > nums[x]) {
                x = x + 1;
                nums[x] = nums[i];
            }
        }
        return x + 1;
    }
}