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

DEFAULTNYA NON-DAEMON. println("Thread is daemon: ${Thread.currentThread().isDaemon}")

###### MAIN THREAD vs COROUTINES
Ketika main thread udah selesai/mati, dan ada coroutines : 

Coroutines are terminated when the main thread finishes execution and the process/JVM instance dies, they are like daemon threads.


# (1) PARALEL PROGRAMMING -------------------------------

## MANUAL THREAD 

Kekgini bikinnya 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6c7e0ea1-0ec1-4a00-a47e-ca188dd75c3a)


## EXECUTOR SERVICE 

ExecServ? Is an object to manage thread. 

We make several threads then insert its threads into execserv.

We dont need to manually manage the threads. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6891b576-69ff-4826-ba73-1bf8176dd708)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/c42472c8-b48d-4576-b46d-5150e32e79e1)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/25388e5e-1d78-4a5c-8052-84b02a5143d6)

Misal, kita memasukkan 100 runnable object dan thread yang tersedia berjumlah 5, itu gkpp. 100 tsb masuk dlu ke execserv, nah 5 thread akan mengeksekusi antrean sampai habis. 5 thread ambil 5 runnable secara paralel, ambnil 5 lagi, dan ambil 5 lagi. 

### Contoh Penggunaan ExecService 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/21da30e4-00bf-4dd6-af53-c36ceb302391) ![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/bc1b7187-5000-4070-9df9-4b7953d6d7a2)

Itu kalau pakai 1 thread (newSingleThreadExecutor). Maka 1 runnable 1 thread. Kalo pake Fixed atau Cached, maka 1 runnable 1 thread, n thread dijalankan secara paralel. 


#### Kelebihan ExecServ dibanding Membuat Thread secara manual adalah => 
Problem in manual thread -> Ketika main thread selesai atau mati, ini tidak akan secara otomatis menghentikan atau menghancurkan thread-thread lain yang masih berjalan. Well, basically it depends either Daemon or Non-Daemon. 

ExecServ solve -> Executor thread keeps running after main class is finished. 
Yep, it's designed to do that. The whole point of an ExecutorService is that there is a pool of threads. Even though the Runnable that you submitted has finished, the threads in the pool are waiting for other jobs to come along. You need to shutdown the pool to get your application to terminate. (By write execService.shutDown()). Once you shutdown the pool and the jobs that have submitted finish, the threads in the pool will terminate and, if there are no more non-daemon threads, your application will stop.

Liat kode diatas, gapake execService.shutDown(), JVM akan on terus. Process finished with exit code 0 ga terjadi-jadi. 

#### We need to consider how much acceptable threads are based on : 
Berapa time yang mau di achieve pada sebuah proses dan berapa resource hardwarenya. 

Makin banyak thread == makin butuh banyak memory. 

### PZN not recommending to use cachedThreadPool.
Dia infinity, bahaya. Bikin 100 runnable maka thread bisa aja dibikin 100. Intinya bikin thread sampe memori kita habis. 


## MATERI FUTURE 

#### RUNNABLE INTERFACE -> void/unit 
#### CALLLABLE INTERFACE -> non-void, method call dan return valuenya adalah generic
Menggunakan ExecutorService(callable) untuk meneksekusi Callable, dan hasilnya adalah sebuah objek bernama Future<T> 

## FUTURE? 
Kita minta sesuatu ke execService, lalu sesuatu tsb bertipe data objek future. Objek future membawa data hasil eksekusi.

### Contoh peng-aplikasian future
Punya kelas bernama Future 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/34abc890-7fa1-45d6-9a14-48d5a2f1b4bb)

* Contoh apabila SATU THREAD
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/9ed59180-be4e-4edb-9566-71b28308caf6)


* Contoh apabila PARALEL THREAD (menggunakan future dg callable yaah) 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/ade56d90-aa35-4e80-b4b7-3d1d456fff5e)

### Method-method di future 
1. Cancel => Membatalkan eksekusi
2. isCanceled => Check apakah eksekusi di cancel ap egk
3. isDone => Check udah slelsai apa belom, pasti ada datanya
4. get() dipanggil ketika datanya ada, dia harus nunggu
5. get(long timeout) => timeout adalah waktu max untuk menunggu data, kalo tdk tercapai maka throw exception



# (2) MATERI KOTLIN COROUTINES -------------------------------

# INTRODUCTION CONCURRENCY PROGRAMMING
Paralel belum tentu concurrency, 
Concurency belum tentu paralel, tapi bisa juga paralel.

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/d2342348-5a34-4b0f-bff9-75f029b02ab5)

cpu bound => cocok pake paralel
io bound => cocok pakai concurrency
Kotlin Coroutines adalah concurrency programming. 
Meskipun bisa paralel juga dengan me-manfaatkan thread di java, tapi tetap tujuan utamanya adalah concurrency. 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/7c7ae368-989d-4e10-9717-dd434f600b52)   ![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/89037607-25ee-4719-a542-598c04404438)



# INTRODUCTION COROUTINES

Perpindahan coroutine diatur sama kotlinnya, programmer gausah mikir. Kalo thread kan programmernya mikir. 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/25131b9c-b897-4fff-9e83-0cae800bb6c3)

## Suspend Function 
Adalah komputasi yang ditangguhkan (ditunda waktu eksekusinya).

Misalnya load data ke db harus ngunggu, yauda waktu nunggu tsb ditunda dlu buat si thread ngerjain task lain. Kalo udah selesai load data dari db nya (load dilakukan diluar kotlin) bisa balik lagi ke function load data kotlin. 


* Thread.sleep() digunakan untuk menangguhkan komputasi di Java, namun akan mem-block thread yang sedang berjalan saat ini. Threadnya bakal diem ga bergerak samsek. 

* Delay(). Digunakan untuk menunda eksekusi selama periode waktu tertentu tanpa memblokir thread. Delay HANYA BISA DIPANGGIL DI COROUTINE. 
  
Suspend kode program di JAVA akan nge-block thread. Kalau di kotlin dia engga, threadnya akan coba cari pekerjaan lain.

Thread pada saat delay 2detik akan menjalankan suspend function/task yang lain. Kalo udah 2 detik, balik lagi ke suspend function helloWorld().
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/f9737e4b-0290-4741-86c6-fa5e791f96d7)

Thread dari suspend function helloworld() akan ngikut ke thread pemanggil (dalam konteks ini thread coroutine runBlocking dibawah ini) 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/2251a155-e390-49f7-be68-35abcf1fdac1)

---- y ---- 

Kalo delay dibawah ini, dia bakal menjalankan
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/3b8cfe6a-0da0-4b59-88b6-291b93186a88)


### RunBlocking
Ngeblock thread. Real app dev gaboleh pake ini, biasanya dipake saat testing. Soalnya kalo bikin unitest, functionnya bukan function. 
![Uploading image.png…]()

# MEMBUAT COROUTINES
* Coroutine tidak berjalan sendiri, dia harus berjalan didalam sebuah scope.
* Globalscope, dll.
* Menggunakan method launch() untuk menggunakan coroutine.
* Didalam coroutine bisa memanggil suspend function.


