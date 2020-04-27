package ex_1

class Bridger: Bridge {

    override fun execute(list:MutableList<Boolean>){
        var rez=true
        for (x in list)
            rez=rez and x
        println("Rezultat porta = $rez")
    }
}