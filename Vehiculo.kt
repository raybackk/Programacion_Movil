class Vehiculo (val marca: String, val modelo: String, val color:String="Negro"){
    init {
        println("""Los datos del coche son:
            marca=$marca
            modelo=$modelo
            color=$color""")
    }
    constructor(marca: String, modelo: String, color: String, placas: String):this(marca,modelo,color){
        this.placas=placas
        println("Las placas son: $placas")
    }
    var placas=""
    var gasolina=0f
    var encendido=false

}
lateinit var marca: String
lateinit var modelo: String
lateinit var color: String