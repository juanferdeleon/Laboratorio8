package rectangles

import behaviors.Behaviors

class Rectangle: Behaviors {

    private var height: Int
    private var width: Int

    constructor(_height: Int = 0, _width: Int = 0){
        height = _height
        width = _width
    }

    override fun getDescription(){//Permite al usuario pedir medidas
        println("Dibujando un cuadrado: ")
        print("Ingrese lado 1: ")
        val _width: String = readLine()!!
        width = _width.toInt()
        print("Ingrese lado 2: ")
        val _height: String = readLine()!!
        height = _height.toInt()
    }

    override fun drawFigure(): String{//Dibuja la figura
        var rectangle: String = ""
        for (i in 1..height){
            for (j in 1..width){
                rectangle += "* "
            }
            rectangle += "\n"
        }
        return rectangle
    }

}