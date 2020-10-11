val String.numVowels
get() = count{"aeiouy".contains(it)}
fun String.addEnthusiasm(amount: Int = 1) = this+"!".repeat(amount)
fun <T> T.easyPrint():T {
    println(this)
    return this
}
infix fun String?.printWithDefault(default: String) = print(this ?: default)
fun main(array: Array<String>){
    "Madrigal has left the building".easyPrint().addEnthusiasm().easyPrint()
    43.easyPrint()
    "How many vowels?".numVowels.easyPrint()
    val nullableString: String? = null
    nullableString printWithDefault  "Default string"
}