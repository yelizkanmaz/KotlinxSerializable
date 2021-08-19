import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

// kaynaklar
// https://kotlinlang.org/docs/serialization.html
// https://medium.com/@gurpreetsk/getting-started-with-kotlin-serialization-3315c59bafb2


fun main(args: Array<String>) {
    println("My First Code For Console")
    println("")

    // nesneleri seri hale getirmek için
    println(Json.encodeToString(Data(22, " Yeliz")))
    println("")     // {"a":22,"b":" Yeliz"}

    // listeleri seri hale getirmek için
    val dataList = listOf(Data(22, "Yeliz"), Data(33, "Deniz"))
    val jsonList = Json.encodeToString(dataList)
    println(jsonList)
    println("")     // [{"a":22,"b":"Yeliz"},{"a":33,"b":"Deniz"}]

    // nesneyi Json formatından tekrar ayrıştırıyor
    val obj = Json.decodeFromString<Data>("""{"a":22, "b": "Yeliz"}""")
    println(obj)    // Data(a=22, b=Yeliz)
}

