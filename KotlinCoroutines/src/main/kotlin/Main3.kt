
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// selama main thread punya Thread.sleep, coroutine lainnya tetap bisa kerja kok.


fun main(){

    println("Running in main thread starts y : ${Thread.currentThread().name}")

    GlobalScope.launch { // Thread : T1
//        Exec in T1
        println("Running in coroutine bcg thread starts : ${Thread.currentThread().name}")
//         Coroutine is suspended but Thread : T1 is free (not blocked)
        delay(2000)
//         Exec in T1 or other T2 T3 dll
        println("Running in coroutine bcg thread ended : ${Thread.currentThread().name}")
    }

    Thread.sleep(9000)
    println("Running in main thread ended : ${Thread.currentThread().name}")
}




