class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t1 = m - 1;
        int t2 = n - 1;

        for (int i = m + n - 1; i >= 0; i--) {
            if (t2 < 0) {
                break;
            }

            if (t1 >= 0 && nums1[t1] > nums2[t2]) {
                nums1[i] = nums1[t1];
                t1--;
            } else {
                nums1[i] = nums2[t2];
                t2--;
            }
        }
    }
}