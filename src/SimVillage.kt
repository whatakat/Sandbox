fun main(array: Array<String>) {
    runSimulation("Guyal"){playerName,numBuildings ->
        val currentYear = 2020
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }


}
fun runSimulation(playerName:String,greetingFunction:(String,Int)->String){
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction(playerName,numBuildings))
}