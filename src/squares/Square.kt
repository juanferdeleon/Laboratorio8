package squares

import behaviors.Behaviors

class Square: Behaviors {

    private var edges:Int

    constructor(_edges: Int = 0){
        edges = _edges
    }

    override fun getDescription(){
        println("Dibujando un cuadrado: ")
        print("Ingrese la arista: ")
        val _edges: String = readLine()!!
        edges = _edges.toInt()
    }

    override fun drawFigure(): String{
        var square: String = ""
        for (i in 1..edges){
            for (j in 1..edges){
                square += "* "
            }
            square += "\n"
        }
        return square
    }

}
