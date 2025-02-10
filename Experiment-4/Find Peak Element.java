public class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid; // Peak is on the left side (including mid)
            } else {
                left = mid + 1; // Peak is on the right side
            }
        }

        return left; // Peak index
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

        System.out.println(sol.findPeakElement(nums1)); // Output: 2
        System.out.println(sol.findPeakElement(nums2)); // Output: 1 or 5
    }
}
