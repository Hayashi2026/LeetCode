/*
 * @lc app=leetcode id=80 lang=kotlin
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var left = 0
        var right = 1
        var isDuplicateTwice = false
        while (right < nums.size) {
            if (nums[right] == nums[left]) {
                if (!isDuplicateTwice) {
                    isDuplicateTwice = true
                    left++
                }
            } else {
                left++
                nums[left] = nums[right]
                isDuplicateTwice = false
            }
            right++
        }
        return left + 1
    }
}
// @lc code=end

