fun main() {
    //Like other languages Kotlin possesses booleans and boolean or logical operators

    val consoles = 10
    val games = 5

    if (consoles < games) {
        println("Good ratio")
    }
    else {
        println("Bad ratio")
    }

    //In kotlin you can easily implement ranges by using .. between the start and end points
    //furthermore these can be implemented by conditionals by using the keyword in

    if (consoles in 1..5) {
        println("Good amount")
    }

    //By using else if we can add various conditionals

    val boardGames = 15

    if (games in 10..25)
    {
        println("Healthy")
    }
    else if (boardGames > games) {
        println("Healthy")
    }
    else if (games < 25 && consoles <= 3) {
        println("healthy")
    }
    else {
        println("Unhealthy")
    }

    //In Kotlin a when statement is comparable to a switch statement of other languages
    //therefor the argument passed to the when statement is simply used to determine what variable to
    //take into consideration

    when (games) {
        0 -> println("Very healthy")
        in 5..25 -> println("Healthy")
        else -> println("Unhealthy")
    }
}