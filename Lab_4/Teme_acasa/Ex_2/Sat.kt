package pp

class Sat(private var nume:String, private var nrloc:Int,private var nrCase:Int): Asezare(nume,nrloc) {
    fun setnrCase(nrCase:Int){
        this.nrCase=nrCase;
    }

    fun getnrCase():Int{
        return nrCase;
    }
}