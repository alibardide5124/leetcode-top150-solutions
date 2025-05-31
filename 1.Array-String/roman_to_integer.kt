class Solution {
    fun romanToInt(s: String): Int {
        val conversion = mapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000,
            "IV" to 4,
            "IX" to 9,
            "XL" to 40,
            "XC" to 90,
            "CD" to 400,
            "CM" to 900
        )
        var num = 0
        var i = 0
        while (i<s.length) {
            if (i < s.length - 1) {
                val isTwoLetter = conversion.getOrDefault("${s[i]}${s[i+1]}", 0)
            if (isTwoLetter != 0) {
                num+=isTwoLetter
                i+=2
                continue
            }
            } 
                num+=conversion.getOrDefault("${s[i]}", 0)
                i++
        }
        return num
    }
}
