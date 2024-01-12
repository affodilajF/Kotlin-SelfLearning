import java.util.*
import java.util.concurrent.Executors


fun main() {
//    testExecutorService()
    val execService = Executors.newSingleThreadExecutor()

    repeat(10){
//        objek runnable dibuat sebanyak 10
        val runnable = Runnable {
            Thread.sleep(1000)
            println("Done, $it, ${Date()} in ${Thread.currentThread().name}")
        }

//        semua objek runnable 10, dimasukkan sbg antrian di ThreadPool
        execService.execute(runnable)
        println("Done memasukkan $it ke execService")

//        setelah semua selesai masuk ke execService yang kita buat sbelomnya,
//        baru setelah itu proses eksekusi setiap objek runnable terjadi satu2
    }

    //
    println("AHAI")
    Thread.sleep(11000)
    println("Done program, ${Date()} in ${Thread.currentThread().name}")
//    execService.shutdown()

}





