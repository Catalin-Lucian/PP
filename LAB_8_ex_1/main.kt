package ex_1

fun main(){
    var gate1= AND2(Builder(),Bridger()).builder
            .op1(true)
            .op2(false)
            .build()
            .calcul()

    var gate2=AND3(Builder(),Bridger()).builder
            .op1(true)
            .op2(true)
            .op3(true)
            .build()
            .calcul()

    var gate3=AND4(Builder(),Bridger()).builder
            .op1(true)
            .op2(true)
            .op3(true )
            .op4(true)
            .build()
            .calcul()

    var gate4=AND8(Builder(),Bridger()).builder
            .op1(true)
            .op2(true)
            .op3(true )
            .op4(true)
            .op5(true)
            .op6(true)
            .op7(true)
            .op8(false)
            .build()
            .calcul()
}