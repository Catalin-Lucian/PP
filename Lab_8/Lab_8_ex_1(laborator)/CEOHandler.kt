package chain

class CEOHandler(var next1: Handler? = null, var next2: Handler? = null): Handler {
    override fun handleRequest(forwardDirection: String, messageToBeProcessed: String) {

            if (messageToBeProcessed[0] == '1') {
                if (forwardDirection == "down") println("Sunt CEO si prelucrez mesajul:" + messageToBeProcessed)
                else next2?.handleRequest("down",messageToBeProcessed);
            }
            else next1?.handleRequest("right",messageToBeProcessed);
    }
     override fun set(handler1: Handler, handler2: Handler){
        next1=handler1
        next2=handler2
    }
}