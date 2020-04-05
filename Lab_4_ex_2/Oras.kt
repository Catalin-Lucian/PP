package pp

public class Oras(private var nume:String, private var nrloc:Int,private var nrBloc:Int,private var nrSpitale:Int):Asezare(nume,nrloc){
    fun setbloc(nrbloc:Int){
        this.nrBloc=nrbloc;
    }
    fun getbloc():Int{
        return nrBloc;
    }

    fun setSpital(nrSpitale:Int){
        this.nrSpitale=nrSpitale;
    }
    fun getSpitale():Int{
        return nrSpitale;
    }
}