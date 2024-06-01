package BinarySearch;


//Input: nums = [5,7,7,8,8,10], target = 8
// ------- Output: [3,4]
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class FirstandLastPostion {


    public static void main(String[] args) {

        int[] nums ={5,7,7,7,8,8,9,10};
        int target = 7;
        int[] ans = new FirstandLastPostion().searchRange(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
