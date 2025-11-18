package test

// 타입 추론 테스트
val number = 42

// 함수 테스트
fun greet(name: String): String {
    return "Hello, $name!"
}

// 클래스 테스트
class Person(val name: String, val age: Int) {
    fun introduce() {
        println("My name is $name and I'm $age years old")
    }
}

fun main() {
    val message = greet("Kotlin")
    println(message)

    val person = Person("Alice", 25)
    person.introduce()

    // 자동완성 테스트: person. 입력 후 자동완성 확인
    // Hover 테스트: greet 위에 마우스 올려서 타입 정보 확인
}

