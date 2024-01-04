import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors.newFixedThreadPool
import kotlin.time.measureTime

class Future {

    private fun foo() : Int{
        Thread.sleep(1000)
        return 10
    }

    private fun bar() : Int{
        Thread.sleep(1000)
        return 10
    }



//  Prosesnya berada di satu thread, berarti sequential,, setelah foo selesai baru bar
    fun foobar(){
        val time = measureTime {
            val f = foo()
            val b = bar()

            val all = f+b
            println("Foobar. Total is $all")
        }

        println("Time obtained : $time")
    }





//  Prosesnya di beberapa thread, paralel antar foo dan bar
//  Menggunakan future
//  Karena need something yg bisa bilang "this processes has been ended and this is the data result"
    private val execService: ExecutorService = newFixedThreadPool(10)

    fun foobarParalel(){
        val time = measureTime {

//            f dan b bertipe data objek future
            val f = execService.submit(Callable { foo() })
            val b = execService.submit(Callable{bar()})

//            untuk mendapatkan datanya, gunakan futureObject.get()
            val result = f.get() + b.get()
            println("FooobarParalel. Result is $result")
        }

        println("Time obtained : $time")
    }
    
    
    

}


fun main(){

    val y = Future()
    y.foobar()

    val x = Future()
    x.foobarParalel()

}