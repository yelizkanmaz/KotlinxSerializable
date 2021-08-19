import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main(args: Array<String>) {
// nesneleri seri hale getirmek için
    val jsonData = Json.encodeToString(Data(22, "Yeliz"))
    println("Serializing Objects: $jsonData") // {"a":22, "b":"Yeliz"}

    // listeleri seri hale getirmek için

}

