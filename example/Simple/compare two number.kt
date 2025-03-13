package example.Simple

fun isUsageIncreased(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

// Kiểm tra hàm với một số giá trị mẫu
fun main() {
    println(isUsageIncreased(300, 250)) // true
    println(isUsageIncreased(300, 300)) // false
    println(isUsageIncreased(200, 220)) // false
}
