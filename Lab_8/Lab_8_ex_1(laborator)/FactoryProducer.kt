package factory

class FactoryProducer {
    fun getFactory(choice: String): AbstractFactory {
        if (choice == "ElitleFactory") return   EliteFactory()
        else {
           return HappyWorkerFactory()
        }
    }
}