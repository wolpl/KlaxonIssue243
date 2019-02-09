import com.beust.klaxon.Klaxon
import com.beust.klaxon.TypeAdapter
import com.beust.klaxon.TypeFor
import kotlin.reflect.KClass

class SensorTypeAdapter : TypeAdapter<Sensor> {
    override fun classFor(type: Any): KClass<out Sensor> =
        when (Sensor.Type.valueOf(type as String)) {
            Sensor.Type.Test -> Test::class
            else -> throw IllegalArgumentException("Unknown sensor type $type")
        }
}

class Test(val prop: String) : Sensor(Type.Test)

@TypeFor(field = "type", adapter = SensorTypeAdapter::class)
abstract class Sensor(val type: Type) {
    enum class Type { T1, T2, Test }
}


fun main() {
    val json = """
            {
                "type": "Test",
                "prop": "String"
            }"""
    val result = Klaxon().parse<Sensor>(json)
    println(result)
}