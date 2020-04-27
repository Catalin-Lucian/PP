package ex_1

class AND4(var builder: Builder,var  bridger:Bridger) : AND(builder,bridger) {
    override fun calcul() {
        println("AND 4 gate created")
        bridger.execute(builder.oper)
    }
}