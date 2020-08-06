fun main() {
    val wordOne = " Modern"
    val wordTwo = " Concise"
    val wordThree = " Pragmatic"
    val wordFour = " Safe"
    val line = """
        Kotlin is $wordOne
        Kotlin is $wordTwo
        Kotlin is $wordThree
        kotlin is $wordFour
     """.trimIndent()
    print(line)
}