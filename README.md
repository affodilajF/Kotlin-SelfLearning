![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/96e855a3-6f33-4bef-b991-37f9a3672cde)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/55e9404b-5e9e-48f6-8219-eebb8b61ea55)

Pas bikin app, jangan bikin thread scr manual yaaa!. Better pakai ExecService. 


# EXECUTOR SERVICE 

ExecServ? Is an object to manage thread. 

We make several threads then insert its threads into execserv.

We dont need to manually manage the threads. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6891b576-69ff-4826-ba73-1bf8176dd708)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/c42472c8-b48d-4576-b46d-5150e32e79e1)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/25388e5e-1d78-4a5c-8052-84b02a5143d6)

Misal, kita memasukkan 100 runnable object dan thread yang tersedia berjumlah 5, itu gkpp. 100 tsb masuk dlu ke execserv, nah 5 thread akan mengeksekusi antrean sampai habis. 5 thread ambil 5 runnable secara paralel, ambnil 5 lagi, dan ambil 5 lagi. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6dabd70a-212c-4d50-8785-9205976aac47)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/5971dfc2-ae96-4f69-bf5f-46605cca960f)

Itu kalau pakai 1 thread (newSingleThreadExecutor). Kalau pake fixed thread atau cahedThread, maka spt yang 5 ambil 5 tadi. 










