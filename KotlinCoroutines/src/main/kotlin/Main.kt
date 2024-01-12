
import kotlinx.coroutines.delay
import java.util.*
import kotlin.concurrent.thread



// NOTE 1 --------------------
// How particular thread be blocked?
// When the heavy task is running in main thread, it will be blocking the thread until the task has been completed.
// If the task is completed in > 5 seconds, the app will be stop running. Causing hang.
// Solution : Create new background thread to deal with heavy task. Bcg thread will not block the main thread.

// In Android dev, there is 2 thread : UI thread (for lightweight opt such as ui interaction) and Background thread (heavy opt).

// NOTE 2 -------------------------
// PARALLELISM (a) VS CONCURRENCY (b)

// NOTE 3 -----------------------------
// kalo main thread nya udah selesai, ya proses nya selesai, aplikasi selesai. Other thread baik itu coroutine jg akan terhenti/mati.
// aplikasi mati. (kemungkinan pertama)
// jadi sebelum app selesai/keluar, PASTIKAN ALL THREAD UDAH SELESAI.
// cara tdk sopan => main thread nya kasi delay atau sleep. Tapi kan kita g tau waktu detik pastinya.
// cara sopan => blom tau.



fun main(){

//    executes in main thread
    println("In main thread started : ${Thread.currentThread().name}")

//    creating background thread / worker thread
    thread {
        println("Fake work starts in background thread: ${Thread.currentThread().name}")
//        pretending some works, may be uploading image
//        .sleep is just dummy works, replace with real works (file upload download dll)
        Thread.sleep(10000)
        println("Fake work finish in background thread: ${Thread.currentThread().name}  => ${Date()}")
    }


//    another way to creating thread (using runnable)
    val runnable = Runnable {
        println("(2) Fake work starts in background thread: ${Thread.currentThread().name}")
        Thread.sleep(10000)
        println("(2) Fake work finish in background thread: ${Thread.currentThread().name}  => ${Date()}")
    }
    val thread = Thread(runnable)
    thread.start()

//    exec in main thread
    println("In main thread ended : ${Thread.currentThread().name}")

}



//val runnable = object : Runnable {
//    override fun run() {
//        println("(2) Fake work starts in background thread: ${Thread.currentThread().name}")
//        Thread.sleep(10000)
//        println("(2) Fake work finish in background thread: ${Thread.currentThread().name}  => ${Date()}")
//    }
//}
