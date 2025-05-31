class Solution {
    fun majorityElement(nums: IntArray): Int {
        val numSet = nums.toSet()
        numSet.forEach { num ->
            if (nums.count { it == num } > (nums.size / 2))
                return num
        }
        return 0
    }
}
