
fun main() {
    print(solution(30, 2))
}

fun solution(a: Int, b: Int): Int {
    val aHalfBisect = (a / Math.sqrt(2.0)) / 2
    val bHalfBisect = (b / Math.sqrt(2.0)) / 2
    val rect1 = mutableListOf(Math.floor(aHalfBisect) * 2 + 1, Math.floor(bHalfBisect) * 2 + 1)
    val rect2 = mutableListOf(0.0, 0.0)

    if (aHalfBisect - Math.floor(aHalfBisect) < 0.5)
        rect2[0] = rect1[0] - 1
    else
        rect2[0] = rect1[0] + 1

    if (bHalfBisect - Math.floor(bHalfBisect) < 0.5)
        rect2[1] = rect1[1] - 1
    else
        rect2[1] = rect1[1] + 1

    return ((rect1[0] * rect1[1]) + (rect2[0] * rect2[1])).toInt()
}