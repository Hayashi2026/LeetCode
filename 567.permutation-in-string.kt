/*
 * @lc app=leetcode id=567 lang=kotlin
 *
 * [567] Permutation in String
 */

// @lc code=start
class Solution {
    fun checkInclusion2(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false
        val s1map = IntArray(26)
        val s2map = IntArray(26)
        for (i in 0 until s1.length) {
            s1map[s1[i] - 'a']++
            s2map[s2[i] - 'a']++
        }
        for (i in 0 until s2.length - s1.length) {
            if (s1map.contentEquals(s2map)) {
                return true
            }
            s2map[s2[i] - 'a']--
            s2map[s2[s1.length + i] - 'a']++
        }
        return s1map.contentEquals(s2map)
    }

    // fun checkInclusion(s1: String, s2: String): Boolean {
    //     if (s1.length > s2.length) return false
    //     val map1 = mutableMapOf<Char, Int>()
    //     for (i in 0 until s1.length) {
    //         val v = map1[s1[i]]
    //         if (v == null) {
    //             map1[s1[i]] = 1
    //         } else {
    //             map1[s1[i]] = v + 1
    //         }
    //     }
    //     val map2 = mutableMapOf<Char, Int>()
    //     for (i in 0 until s1.length) {
    //         val v = map2[s2[i]]
    //         if (v == null) {
    //             map2[s2[i]] = 1
    //         } else {
    //             map2[s2[i]] = v + 1
    //         }
    //     }
    //     var left = 0
    //     var right = s1.length - 1
    //     while (right < s2.length) {
    //         if (isEquals(map1, map2)) {
    //             return true
    //         }
    //         if (right == s2.length - 1) {
    //             return false
    //         }
    //         val leftValue = map2[s2[left]] as Int
    //         map2[s2[left]] = leftValue - 1
    //         left++
    //         right++
    //         val v = map2[s2[right]]
    //         if (v == null) {
    //             map2[s2[right]] = 1
    //         } else {
    //             map2[s2[right]] = v + 1
    //         }
    //     }
    //     return false
    // }

    // fun isEquals(map1: Map<Char,Int>, map2: Map<Char,Int>): Boolean {
    //     map1.forEach {
    //         if (map2[it.key] != it.value) {
    //             return false
    //         }
    //     }
    //     return true
    // }
}
// @lc code=end

