class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (mid <= right) {

            // If element is 0
            if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            }

            // If element is 2
            else if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            }

            // If element is 1
            else {
                mid++;
            }
        }
    }

    // Swap function
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}