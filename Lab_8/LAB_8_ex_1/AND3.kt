package ex_1

class AND3(var builder: Builder,var  bridger: Bridger) : AND(builder,bridger) {
    override fun calcul() {
        println("AND 3 gate created")
        bridger.execute(builder.oper)
    }
}