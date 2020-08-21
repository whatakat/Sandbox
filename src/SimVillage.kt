fun main(array: Array<String>) {
    val greetingFunction:(String, Int)->String = {playerName, numBuildings->
        val currentYear = 2020
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Guyar",2))

}