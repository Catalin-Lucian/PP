import javafx.scene.control.skin.HyperlinkSkin
import java.io.File
import java.sql.Timestamp

class HistoryLogRecord(private var time:Timestamp,private var command:String):Comparable<HistoryLogRecord>{

    override fun compareTo(other: HistoryLogRecord): Int {
      return this.time.compareTo(other.time)
    }

    fun getTime():Timestamp=time
    fun getCommand():String=command
    fun afisare(){
        println("Stat time:$time\nCommand:$command")
    }
}



fun readFile(path:String):List<HistoryLogRecord>{
    val syslog: MutableList<HistoryLogRecord> = emptyList<HistoryLogRecord>().toMutableList()
    val times: MutableList<Timestamp> = emptyList<Timestamp>().toMutableList()
    val comds: MutableList<String> = emptyList<String>().toMutableList()
    File(path).forEachLine {
        if (it.startsWith("Start-Date: ")){
            val parts=it.split("  "," ","-",":")
            //print(parts)
            times += Timestamp(parts[3].toInt(),parts[4].toInt(),parts[5].toInt(),parts[6].toInt(),parts[7].toInt(),parts[8].toInt(),0)
        }
        if (it.startsWith("Commandline:"))
        {
            comds += it.split("Commandline:")
        }
    }
    var i=0;
    times.forEach(){
        syslog += HistoryLogRecord(it,comds[i++])
    }
    return syslog
}


fun max(syslogs:List<HistoryLogRecord>){
    var max:HistoryLogRecord=syslogs[0]
    syslogs.forEach(){
        if (max > it){
            max=it
        }
    }
    println(" ------------------ \n")
    max.afisare()
}



fun main(){
    var records= readFile("E:\\log.txt")
    records.forEach(){
        it.afisare()
    }

    max(records)
}