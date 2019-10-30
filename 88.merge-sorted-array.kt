/*
 * @lc app=leetcode id=88 lang=kotlin
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var left = m - 1
        var right = n - 1
        var cur = nums1.size - 1
        while (left >= 0 && right >= 0) {
            if (nums1[left] >= nums2[right]) {
                nums1[cur] = nums1[left]
                left--
            } else {
                nums1[cur] = nums2[right]
                right--
            }
            cur--
        }
        for (i in right downTo 0) {
            nums1[cur] = nums2[i]
            cur--
        }
    }
}
// @lc code=end

