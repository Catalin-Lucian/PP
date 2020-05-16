package chain

class ManagerHandler(var next1: Handler? = null, var next2: Handler? = null): Handler {
    override fun handleRequest(forwardDirection: String, messageToBeProcessed: String) {
        if (messageToBeProcessed[0] == '3') {
            if (forwardDirection == "down") println("Sunt Manager si prelucrez mesajul:" + messageToBeProcessed)
            else next2?.handleRequest("down",messageToBeProcessed);
        }
        else next1?.handleRequest("right",messageToBeProcessed);
    }
    override fun set(handler1: Handler, handler2: Handler){
        next1=handler1
        next2=handler2
    }
}