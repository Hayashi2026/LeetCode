/*
 * @lc app=leetcode id=125 lang=kotlin
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        val str = s.toLowerCase()
        while (left < right) {
            if (!isAlphaumeric(str[left])) {
                left++
                continue
            }
            if (!isAlphaumeric(str[right])) {
                right--
                continue
            }
            if (str[left] != str[right]) {
                return false
            }
            left++
            right--
        }
        return true
    }

    fun isAlphaumeric(char: Char): Boolean {
        if (char >= 'a' && char <= 'z') {
            return true
        }
        if (char >= '0' && char <= '9') {
            return true
        }
        return false
    }
}
// @lc code=end

