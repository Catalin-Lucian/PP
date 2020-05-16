package factory

import chain.CEOHandler
import chain.ExecutiveHandler
import chain.Handler
import chain.ManagerHandler

class EliteFactory: AbstractFactory() {
    override fun getHandler(handler: String): Handler {
        if (handler=="CEOHandler") return CEOHandler()
        else if (handler=="ExecutiveHandler") return ExecutiveHandler()
        else return ManagerHandler();
     }
}