/*
 * @lc app=leetcode id=283 lang=kotlin
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var pointer = 0
        for (i in 0 until nums.size) {
            if (nums[i] != 0) {
                swap(nums, i, pointer)
                pointer++
            }
        }
    }

    fun swap(nums: IntArray, left: Int, right: Int) {
        val temp = nums[left]
        nums[left] = nums[right]
        nums[right] = temp
    }
}
// @lc code=end

