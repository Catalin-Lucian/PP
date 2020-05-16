package pp

open class Judet (private  var nume:String){

    lateinit var comune:MutableList<Comuna>
    lateinit var orase:MutableList<Oras>

    fun GetNume():String{
       return nume;
   }
    fun AddComuna(comuna_: Comuna){
        this.comune.add(comuna_);
    }
    fun AddOras(oras:Oras){
        orase.add(oras);
    }
}