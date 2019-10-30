/*
 * @lc app=leetcode id=28 lang=kotlin
 *
 * [28] Implement strStr()
 */

// @lc code=start
class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) {
            return 0
        }
        var start = 0
        while (start < haystack.length && start < haystack.length - needle.length) {
            for (i in 0 until needle.length) {
                if (haystack[start + i] != needle[i]) {
                    start++
                    break
                }
                if (i == needle.length - 1) {
                    return start
                }
            }
        }
        return -1
    }
}
// @lc code=end

