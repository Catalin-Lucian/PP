import chain.CEOHandler
import chain.ExecutiveHandler
import factory.FactoryProducer
import javax.lang.model.type.NullType

fun main(args: Array<String>) {

     var factory:FactoryProducer= FactoryProducer();

     var CeoTop=factory.getFactory("ElitleFactory").getHandler("CEOHandler");
     var CeoDawn=factory.getFactory("ElitleFactory").getHandler("CEOHandler");

    var ExecTop=factory.getFactory("ElitleFactory").getHandler("ExecutiveHandler");
    var ExecDown=factory.getFactory("ElitleFactory").getHandler("ExecutiveHandler");

    var ManTop=factory.getFactory("ElitleFactory").getHandler("ManagerHandler");
    var ManDown=factory.getFactory("ElitleFactory").getHandler("ManagerHandler");

    var HappyTop=factory.getFactory("HappyWorkerFactory").getHandler("HappyWorker")
    var HappyDown=factory.getFactory("HappyWorkerFactory").getHandler("HappyWorker")


    CeoTop.set(ExecTop,CeoDawn);
    CeoDawn.set(ExecDown,CeoTop)

    ExecTop.set(ManTop,ExecDown);
    ExecDown.set(ManDown,ExecTop)

    ManTop.set(HappyTop,ManDown)
    ManDown.set(HappyDown,ManTop)

    HappyTop.set(HappyDown,HappyDown);
    HappyDown.set(HappyTop,HappyTop);

    CeoTop.handleRequest("right","1:mesaj_1")
    CeoTop.handleRequest("right","2:mesaj_2")
    CeoTop.handleRequest("right","3:mesaj_3")
    CeoTop.handleRequest("right","4:mesaj_4")

    // sigur nu am facut ce trebuie ^_^  ,dar o sa mai intreb la ora

}