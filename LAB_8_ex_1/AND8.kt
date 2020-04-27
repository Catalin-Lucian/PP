package ex_1

class AND8(var builder: Builder,var  bridger:Bridger) : AND(builder,bridger) {
    override fun calcul() {
        println("AND 8 gate created")
        bridger.execute(builder.oper)
    }
}