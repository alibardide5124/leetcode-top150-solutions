class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size <= 1) return 0

        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice
            }
        }

        return maxProfit
    }
}
