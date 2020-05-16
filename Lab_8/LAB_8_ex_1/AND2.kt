package ex_1

class AND2(var builder: Builder,var bridger: Bridger) : AND(builder,bridger) {
    override fun calcul() {
        println("AND 2 gate created")
        bridger.execute(builder.oper)
    }

}