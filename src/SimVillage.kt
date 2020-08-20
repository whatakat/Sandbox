fun main(array: Array<String>) {
    val greetingFunction:(String)->String = {playerName->
        val currentYear = 2020
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Guyar"))

}