package triangles

import behaviors.Behaviors

class Triangle: Behaviors{

    private var height:Int

    constructor(_height: Int = 0){
        height = _height
    }

    override fun getDescription(){
        println("Dibujando un cuadrado: ")
        print("Ingrese la arista: ")
        val _height: String = readLine()!!
        height = _height.toInt()
    }

    override fun drawFigure(): String{
        var triangle: String = ""
        var ctr: Int = height
        var ctr3: Int = 0
        while (ctr >= 0){
            for (i in 1..ctr){
                triangle += " "
            }
            if (ctr3 <= height){
                for (i in 0..ctr3){
                    triangle += "* "
                }
                triangle += "\n"
            }
            ctr -= 1
            ctr3 += 1
        }
        return triangle
    }

}