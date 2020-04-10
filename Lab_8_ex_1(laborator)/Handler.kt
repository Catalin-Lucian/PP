package chain

interface Handler {
    fun handleRequest(forwardDirection: String, messageToBeProcessed: String)
    fun set(handler1: Handler,handler2: Handler)
}