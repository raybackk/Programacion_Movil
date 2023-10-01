import kotlin.math.log

fun main() {
    val base=20f
    val altura=4f
    val area=areaRect(base, altura)
    val ancho=2f
    val volumen=volumenPrisma(base, altura, ancho)
    val promedio=promedio(tercera = 6f)
    val lado1=3f; val lado2=3f; val lado3=3f

    val user= login("Max", "upiicsa")
    println("Usuario logeado: $user")
    println("Ejercicios vistos en clase")
    println("Area con valores por defecto ${rectangleArea()}")
    println("Area con altura por defecto y base con valor de 10.0: ${rectangleArea(base = 10.0)}")
    println("Area con base por defecto y altura con valor de 10.0: ${rectangleArea(height =10.0)}")
    println("El area del rectangulo es de: $area")
    println("El volumen del prisma es de: $volumen")
    println("El promedio de las califiaciones es de: $promedio")
    triangulo(lado1, lado2, lado3)
}
fun rectangleArea(base: Double = 20.0, height: Double = 30.0): Double {
    return base*height
}
fun areaRect(base: Float, altura: Float): Float {
    return base*altura
}
fun volumenPrisma(base: Float, altura: Float, ancho:Float): Float {
    return areaRect(base,altura)*ancho
}
fun promedio(primera: Float = 8f, segunda: Float = 8f, tercera:Float): Float {
    return (primera+segunda+tercera)/3
}
fun tipoDato(dato: Any) {
    when (dato){
        is String -> println("Es un dato de tipo String")
        is Int -> println("Es un dato de tipo Entero")
        is Double -> println("Es un dato de tipo Double")
    }
}
fun login(user: String, password: String): Boolean {
    fun validate(input: String): Boolean {
        if (input.isEmpty()){
            return false
        }
        return true
    }
    val userValidated=validate(user)
    val passValidated=validate(password)
    return userValidated && passValidated
}
fun triangulo(lado1: Float, lado2: Float, lado3: Float){
    if (lado1==lado2 && lado3==lado1){
        println("Es un triangulo equilatero")
    }else if (
        (lado1==lado2 && lado3!=lado1)||
        (lado2==lado3 && lado1!=lado2)||
        (lado3==lado1 && lado2!=lado3)){
        println("Es un triangulo isoceles")
    }else{
        println("Es un triangulo escaleno")
    }
}