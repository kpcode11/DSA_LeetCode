class Solution {
    public void moveZeroes(int[] nums) {
        int ptr = 0;

        if(nums.length == 1){
            return;
        }

        for(int j=0; j<=nums.length - 1; j++){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[ptr];
                nums[ptr] = temp;
                ptr++;
            }
        }
        return;
    }
}