package pp

open class Comuna(private var nume:String) {
    lateinit var sate:MutableList<Sat>

    fun AddSat(sat:Sat){
        sate.add(sat);
    }
    fun GetNume():String{
        return nume;
    }
}