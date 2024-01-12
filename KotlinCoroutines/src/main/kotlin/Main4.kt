import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// NOTE 1 ----------------
// delay is an SUSPEND function, which is only can be accessed in coroutine.
// runBlocking  create coroutine that blocks the current main thread. (or block the thread runBlocking exists)
// runBlocking also run in main thread. (or in thread runBlocking exists)
// then we can place delay inside runBlocking.
// selama main thread punya delay, coroutine lainnya tetap bisa kerja kok.


// NOTE 2 --------------
// runBlocking => create coroutine that blocks the thread in which it operates.
// GlobalScope launch => create coroutine that not blocks anything.

// Benar, saat menggunakan runBlocking, thread utama akan diblokir hingga
// blok kode di dalam runBlocking selesai dieksekusi.
// Kode di dalam blok runBlocking dijalankan secara sinkron dan akan memblokir thread utama
// sampai blok tersebut selesai.


// NOTE 3 ---------------------
// Pada intinya, coroutine yang diciptakan oleh GlobalScope.launch tidak akan
// menunggu penundaan dalam runBlocking 5000 selesai. Mereka beroperasi secara independen.
// Meskipun pesan "Running in coroutine bcg thread starts" dalam coroutine yang dibuat oleh GlobalScope.launch
// tidak dicetak sebelum "run blocking slese" karena ada penundaan dalam coroutine tersebut,
// tetapi coroutine tidak menunggu runBlocking selesai sebelum memulai eksekusi.


fun main(){
    println("In main thread started")

    runBlocking {
        delay(5000)
        println("run blocking slese")
    }

    GlobalScope.launch {
        println("Running in coroutine bcg thread starts : ${Thread.currentThread().name}")
        delay(2000)
        println("Running in coroutine bcg thread ended : ${Thread.currentThread().name}")
    }

    runBlocking {
        delay(3000)
    }

    println("In main thread ended")
}


