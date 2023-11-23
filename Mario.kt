class Mario(var vidas: Int =3){ //Indicaremos el nimero de vidas al iniciar el objeto Mario
    val isAlive: Boolean
        get() {
            return lives>=1
        }
    fun getLives(){
        return
    }
    init {
        println("Is's a me! Mario!") //vamos a hacer que Mario se presente al construirlo!
    }

    private var state = "small" //Mario es pequeño al inicar el juego
        set(value){
            field = value
        }
        get() = field
    private var lives =3 //uno empieza el juego con 3 vidas

    //resta una vida al jugador
    private fun die (){
        lives--
        println("Has perdido una vida")
    }

    //el modificador es redundente
    //en funcion del objeto es colisionante, se ejecuta un evento
    public fun collision(collisionObj: String){
        when(collisionObj){
            "Goomba" -> die()
            "Super Mushroom" -> state = "Super Mario"
            "Fire flower" -> state = "Fire Mario"
            else -> println("Objeto desconocido ¡no pasa nada!")
        }
    }
}