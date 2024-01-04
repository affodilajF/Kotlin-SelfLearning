import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.*
import kotlin.concurrent.thread



// Using thread
fun testThread(){

        repeat(10){
            thread {
                Thread.sleep(1000)
                println("Done $it: ${Date()} in ${Thread.currentThread().name}")
//                println("Thread is daemon: ${Thread.currentThread().isDaemon}")
            }
        }

    println("WAIT, ${Date()} in ${Thread.currentThread().name}")
    Thread.sleep(0)
    println("DONEE, ${Date()} in ${Thread.currentThread().name}")
}

// Using coroutine
fun testCoroutine(){

        repeat(10){
            GlobalScope.launch {
                delay(1000)
                println("Done $it: ${Date()} in ${Thread.currentThread().name}")
            }
        }

    println("WAIT YA, ${Date()} in ${Thread.currentThread().name}")
    runBlocking {
        delay(1000)
    }
    println("DONEE, ${Date()} in ${Thread.currentThread().name}")

}




fun main(){
    testThread()
//    testCoroutine()



}