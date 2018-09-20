import behaviors.Behaviors
import squares.Square
import rectangles.Rectangle
import triangles.Triangle

fun main(args: Array<String>) {

    fun menuPrincipal():String{
        return """
            Menu Principal
            1. Dibujar Figura
            2. Salir
        """.trimIndent()
    }
    fun menuSecundario():String{
        return """
            Menu
            1. Dibujar un cuadrado
            2. Dibujar un rectangulo
            3. Dibujar un triangulo
            4. Regresar
        """.trimIndent()
    }
    fun createObject(figure: Behaviors){
        figure.getDescription()
        print(figure.drawFigure())
    }

    var op1:String? = ""

    while (op1 != "2"){

        println(menuPrincipal())
        op1 = readLine()!!

        when (op1){
            "1" -> {
                var op2:String? = ""
                while (op2 != "4"){

                    println(menuSecundario())
                    op2 = readLine()!!

                    when (op2){
                        "1" -> {
                            val square = Square()
                            createObject(square)
                        }
                        "2" -> {
                            val rectangle = Rectangle()
                            createObject(rectangle)
                        }
                        "3" -> {
                            val triangle = Triangle()
                            createObject(triangle)
                        }
                    }
                }

            }
        }

    }

}