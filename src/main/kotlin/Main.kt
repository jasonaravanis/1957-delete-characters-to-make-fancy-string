fun makeFancyString(s: String): String {
    val strBuilder = StringBuilder()

    for ((index, character) in s.withIndex()) {
        if (index == 0 || index == s.length - 1) {
            strBuilder.append(character)
            continue
        }

        if (s[index - 1] == character && s[index + 1] == character) {
            continue
        } else {
            strBuilder.append(character)
        }
    }

    return strBuilder.toString()
}

fun main() {
    val input = "aaaaaa"

    println(makeFancyString(input))
}
