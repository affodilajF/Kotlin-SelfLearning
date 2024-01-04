
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*

// NOTE 1 ---------------
// Even kamu pakai GlobalSocpe.launch 2x, buka berarti bcg thread untuk corutine dibuat berjumlah 2
// Bukan berarti jg bcg berjumlah 1
// Semua diatur oleh kotlin, or manually configured (which IDK how)
// (*prior knowledge to know the diff of delay and sleep).

// NOTE 2 --------------------------
// Sleep => nge block thread.
// Delay => Coroutine is suspended but Thread : T1 is free (not blocked)

fun main(){
    println("Running in main thread starts : ${Thread.currentThread().name}, ${Date()}")

    GlobalScope.launch {
        println("Running in coroutine bcg thread starts : ${Thread.currentThread().name}")

//        Thread.sleep(2000)
        delay(2000)

        println("Running in coroutine bcg thread ended : ${Thread.currentThread().name}")
    }

    Thread.sleep(9000)
    println("Running in main thread ended : ${Thread.currentThread().name}, ${Date()}")
}


// RESULT 1 ------------
// Coroutine bcg thread will not be printed in console. The application/processes finished without waiting coroutine bcg.

//RESULT 2 ---------------
// not a right way to use
// using : Thread.sleep(3000) which are higher than 2000, means main thread is sleeping for 3s
// Coroutine bcg thread will be printed in console.
// Yow intinya kalo masi ada waktu main thread berjalan, apapun yg ada di coroutine ke print ke console. Dan sebaliknya.