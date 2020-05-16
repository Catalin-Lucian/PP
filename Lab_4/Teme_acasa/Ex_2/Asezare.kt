package pp

open class Asezare(private var nume:String, private var nrloc:Int) {
    fun GetNume():String
    {
        return nume;
    }
    fun GetNrLoc():Int
    {
        return nrloc;
    }
    fun Afisare()
    {
        print("Nume: "+nume+" nr.loc: "+nrloc);
    }
    fun SetNume(x:String)
    {
        nume=x;
    }
    fun SetNrLoc( x:Int)
    {
        nrloc=x;
    }

}