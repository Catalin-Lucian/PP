import java.io.File

fun main(){
   var txt="""
       Harrigan          said he’d like to hire me to read to him two or perhaps three hours a 
       week.          For this he would pay five dollars an hour. He could offer another three 
       hours’ worth of              work, he said, if I would tend his garden a bit and do some other 
       
       
       chores,            such as snow-shoveling the steps in winter and dusting what needed dust- 
       ing year-round. 
       Twenty-five,            maybe even thirty dollars a week, half of it just for reading, which 
       was something I would have done for free! I couldn’t believe it. Thoughts of saving 
       
       
       up for a motor            scooter immediately rose to mind, even though I would not be able 
       to ride             one legally for another seven years. 
       It was too good to          be true, and I was afraid my father would say no, but he 
       didn’t. “Just don’t give him anything controversial,” Dad said. “No crazy political 
       stuff, and no overboard violence. He reads like a grownup, but he’s just nine, and 
       barely that.” 
       Mr. Harrigan              gave him this promise, drank some of his Sprite, and smacked his 
       leathery lips. “He reads well, yes, but that’s not the main reason I want to hire him. 
       
                                                  12                                               
   """.trimIndent()

    txt=elimNRpage(txt)
    txt=elimMultipleSpace(txt)
    txt=elimMultipleEnters(txt)


    println(txt)
}


fun elimMultipleSpace(s:String): String {
    var txt=""
    s.forEach {
        txt += if(it == ' ' && txt.last() == ' ') "" else it
     }
    return txt
}

fun elimMultipleEnters(s:String):String{
    var txt=""
    s.forEach {
        txt += if(it == '\n' && txt.last() == '\n') "" else it
    }
    return txt
}

fun elimNRpage(s:String):String{
    var lines=s.split("\n");
    var txt=""
    lines.forEach(){
       txt += if(it.contains("                  ")) "" else it
        txt +="\n"
    }
    return txt
}