![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/96e855a3-6f33-4bef-b991-37f9a3672cde)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/55e9404b-5e9e-48f6-8219-eebb8b61ea55)

Pas bikin app, jangan bikin thread scr manual yaaa!. Better pakai ExecService. 

# NOTE 
###### MAIN THREAD vs OTHER THREAD
Ketika main thread udah selesai/mati, dan ada background thread lain : 

(Kemungkinan Pertama) -> Daemon Thread:
Jika semua thread yang tersisa adalah daemon thread, ketika main thread selesai, JVM akan menghentikan semua thread yang bersifat daemon dan aplikasi akan berakhir.
Daemon thread adalah jenis thread yang tidak mencegah JVM untuk berakhir ketika tidak ada thread non-daemon yang tersisa. Mereka akan dihentikan secara otomatis saat main thread selesai.

(Kemungkinan Kedua) -> Non-Daemon Thread:
Jika ada thread non-daemon yang masih berjalan ketika main thread selesai, JVM akan tetap berjalan.
JVM akan terus berjalan meskipun main thread sudah selesai. Ini bisa menyebabkan program berjalan di latar belakang tanpa kendali, dan thread-thread non-daemon akan terus berjalan sampai mereka selesai atau dihentikan dengan paksa.

###### MAIN THREAD vs COROUTINES
Ketika main thread udah selesai/mati, dan ada coroutines : 

Coroutines are terminated when the main thread finishes execution and the process/JVM instance dies, they are like daemon threads.



# MATERI THREAD -----------------------------------------
## EXECUTOR SERVICE 

ExecServ? Is an object to manage thread. 

We make several threads then insert its threads into execserv.

We dont need to manually manage the threads. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6891b576-69ff-4826-ba73-1bf8176dd708)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/c42472c8-b48d-4576-b46d-5150e32e79e1)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/25388e5e-1d78-4a5c-8052-84b02a5143d6)

Misal, kita memasukkan 100 runnable object dan thread yang tersedia berjumlah 5, itu gkpp. 100 tsb masuk dlu ke execserv, nah 5 thread akan mengeksekusi antrean sampai habis. 5 thread ambil 5 runnable secara paralel, ambnil 5 lagi, dan ambil 5 lagi. 

#### Contoh Penggunaan ExecService 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/21da30e4-00bf-4dd6-af53-c36ceb302391)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/bc1b7187-5000-4070-9df9-4b7953d6d7a2)

Itu kalau pakai 1 thread (newSingleThreadExecutor). Maka 1 runnable 1 thread. Kalo pake Fixed atau Cached, maka 1 task 1 thread, n thread dijalankan secara paralel. 


###### Kelebihan ExecServ dibanding Membuat Thread secara manual adalah => 
Problem in manual thread -> , ketika main thread selesai atau mati, ini tidak akan secara otomatis menghentikan atau menghancurkan thread-thread lain yang masih berjalan. 
ExecServ solve -> Main thread tidak akan terhenti apabila semua proses ExecService belum selesai. 










