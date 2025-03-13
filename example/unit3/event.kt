package example.unit3

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}
// Thuộc tính mở rộng để xác định thời lượng sự kiện
val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

fun main() {
    val events = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    )

    // In danh sách sự kiện
    events.forEach { println(it) }

    // Lọc các sự kiện ngắn (dưới 60 phút)
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("Bạn có ${shortEvents.size} sự kiện ngắn.")




    // Nhóm và đếm số lượng sự kiện theo thời gian trong ngày
    val groupedEvents = events.groupBy { it.daypart }
    // In kết quả tổng hợp

    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }
    // In sự kiện cuối cùng trong ngày
    println("Last event of the day: ${events.last().title}")
// In thời lượng của sự kiện đầu tiên
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
    
}

