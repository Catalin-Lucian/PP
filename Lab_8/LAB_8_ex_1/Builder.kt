package ex_1

class Builder {
    var oper:MutableList<Boolean> = mutableListOf<Boolean>()

    public fun op1(op1:Boolean):Builder{
        oper.add(0,op1)
        return this;
    }
    public fun op2(op2:Boolean):Builder{
        oper.add(1,op2)
        return this;
    }
    public fun op3(op3:Boolean):Builder{
        oper.add(2,op3)
        return this;
    }public fun op4(op4:Boolean):Builder{
        oper.add(3,op4 )
        return this;
    }public fun op5(op5:Boolean):Builder{
        oper.add(4,op5)
        return this;
    }
    public fun op6(op6:Boolean):Builder{
        oper.add(5,op6)
        return this;
    }
    public fun op7(op7:Boolean):Builder{
        oper.add(6,op7)
        return this;
    }
    public fun op8(op8:Boolean):Builder{
        oper.add(7,op8)
        return this;
    }

    fun build():AND{
        var aux:AND
        when(oper.size){
            2 -> aux=AND2(this,Bridger())
            3 -> aux=AND3(this,Bridger())
            4 -> aux=AND4(this,Bridger())
            8 -> aux=AND8(this,Bridger())
            else ->aux=AND2(this,Bridger())
        }
        return aux
    }





}