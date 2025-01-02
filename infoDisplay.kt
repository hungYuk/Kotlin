fun handleDepartmentSelection() {
    val departments = arrayOf("IT", "Marketing", "Finance")
    // Hiển thị danh sách phòng ban
    println("\n--- Departments ---")
    for ((index, department) in departments.withIndex()) {
        println("${index + 1}. $department")
    }
    // Người dùng chọn phòng ban
    println("\nEnter the number of the department you choose:")
    val choice = readLine()?.toIntOrNull()
    // Hiển thị kết quả
    if (choice != null && choice in 1..departments.size) {
        println("You have chosen the department: ${departments[choice - 1]}")
    } else {
        println("Invalid choice.")
    }
}
fun handleUserInformation() {
    // Nhập tên
    println("Enter your name:")
    val name = readLine().orEmpty()

    // Nhập tuổi
    println("Enter your age:")
    val age = readLine()?.toIntOrNull() ?: 0 // Giá trị mặc định là 0 nếu nhập sai

    // Nhập GPA
    println("Enter your GPA:")
    val gpa = readLine()?.toDoubleOrNull() ?: 0.0 // Giá trị mặc định là 0.0 nếu nhập sai

    // Hiển thị thông tin
    println("\n--- User Information ---")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $gpa")
}
fun displayWelcome(){
    val mess="welcome"
    println(mess)
}
fun display(){
    displayWelcome()
    handleUserInformation()
    handleDepartmentSelection()
}
fun main() {
    display()
}