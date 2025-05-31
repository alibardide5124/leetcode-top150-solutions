class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        ransomNote.toSet().forEach { c ->
            if (ransomNote.count { it == c } > magazine.count { it == c })
                return false
        }
        return true
    }
}
