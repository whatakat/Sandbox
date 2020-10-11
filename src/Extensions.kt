val String.numVowels
get() = count{"aeiouy".contains(it)}
fun String.addEnthusiasm(amount: Int = 1) = this+"!".repeat(amount)
fun <T> T.easyPrint():T {
    println(this)
    return this
}
fun main(array: Array<String>){
    "Madrigal has left the building".easyPrint().addEnthusiasm().easyPrint()
    43.easyPrint()
}