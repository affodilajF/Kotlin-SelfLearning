# KOTLIN GENERIC 

Generic adalah kemampuan menambahkan parameter type saat membuat class / function. 

class name <generic>
fun <generic> name

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/c6129351-c798-4c26-a42b-07fa407f1ab6)

Java -> Object

Kotlin -> Any 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/4ec09909-9b6e-4f98-a823-3511170c3e97)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/7c339844-e1a4-4660-b0f6-e20d5825ad3c)

## Generic Class
- Generic type adalah class atau interface yang memiliki parameter type
- Tidak ada ketentuan dalam pembuatan generic parameter type, namun kebanyakana menggunakan 1 karakter
- Contohnya :
  - E -> Element (biasanya digunakan di collection atau struktur data)
  - K -> Key
  - N -> Number
  - T -> Type
  - V -> Value
  - S, U, V, etc. -2nd, 3rd, 4th types
 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/74e3fb10-995f-4dc4-a3cf-2fa52b0970c4) 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/bdbfa348-2567-4a47-9bbb-3df8fab49079)


## Generic Function 
Generic type hanya bisa diakses di dalam function, tidak bisa digunakan diluar function 

Cocok membuat generic function tanpa harus mengubah deklarasi class 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6b4a75e1-b0dc-41aa-bcda-74bd3ff534a0)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/4b9b572c-4bb9-4312-a678-d788bee36e46)


~(Kalo di class udah ada T, di function ada T lagi, maka T di function akan meng-overide). 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/99ed3c6e-3b2e-4254-adec-cb40959e2c95)

## INVARIANT
Default

Artinya tidak boleh di subsitusi dengan subtype(child) atau supertype(parent) 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/e807a08a-0d48-4581-be47-725def8c0097)



## COVARIANT (OUT)

Artinya bisa subsitusi subtype(child) dengan supertype(parent) 

Tidak semua jenis class generic mendukung covariant, hanya class generic yang menggunakan parameter type sebagai return type function. 

Maksudnya, misal kamu bikin class yang ada generic covariantnya, nah function di dalamnya gaboleh menerima inputan bertipe generic tersebut, function hanya boleh me-return generic typenya. 

Contoh< String > dapat disubsitusi dengan Contoh< Any > 

Cara membuat : 

* parameter generic class harus val, kalo kasi var nanti terdeteksi error 
* generic hanya boleh digunakan sbg return type fungsi

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/bcab5c0f-5491-4b98-9fba-b8b75bb60d17)



HANYA BISA DIPAKE SEBAGAI RETURN TYPE 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/9b2ef30b-5447-47ed-a250-ea258acafabb) ![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/9c3b81d0-9d51-47a1-9960-512d46534201)






## CONTRAVARIANT (IN)

Artinya bisa subsitusi supertype(parent) dengan subtype(child)

Tidak semua jenis class generic mendukung contravariant, hanya class generic yang menggunakan generic parameter type sebagai parameter function. 

Maksudnya, misal km bikin class yg ada generic conariantnya, nah function di dalamnya hanya boleh menerima inputan bertipe generic tersebut, function gaboleh me-return generic function tsb. 

Contoh< Any > dapat disubsitusi dengan Contoh< String > 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/1d0a0f1d-daae-4ca5-9578-8978eefa6326)


#### Kenapa gabisa dipakai untuk return type? 

Konteks : Misal booleh digunakan untuk return type 

Misal kita punya fungsi getData() : T, saat variabel b dikenai fungsi tersebut, ekspetasinya akan mendapatkan String, namun kenyataanya akan didapatkan Any. Ga bener ini. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/41115a25-f976-40fb-836e-d2f922bc6908)

## GENERIC CONSTRAINT 

Membatasi data yang boleh digunakan di generic parameter type dengan menyebutkan tipe data yang diperbilehkan. 

Secara otomatis, tipe data yg bs digunakan adalah tipe data yang disebutkan atau class turunanya. 

DEFAULTNYA, constraint type adalah ANY, sehingga semua tipe data bisa digunakan. 


Cuma bisa masukkin Employee() dan class turunanya. Kalo masukkin String bakalan error. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/0c61e768-5d5c-4274-a25c-bfe9b64848ce)







### Keyword WORD 
Digunakan kalo mau batasan tipe datanya >= 2 kelas atau interface. 

Pada class VicePresidentm dia extends employee dan implements CanSayHello

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/7d0dfb98-43ad-44d9-8262-a57ede88009d)

Generic class company hanya bisa menerima apapun yang meng-extends employee dan implements CanSayHello
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/f4a00e1c-02ed-4d9b-a1c6-ce3e795f6692)


## TYPE PROJECTION

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/e02186af-5858-4159-ad8b-ae55ae132919)

Kita bikinnya tetap pakai invariant, tapi saat kita membuat function untuk me-manipulasi data generic nya, kita bs set di parameter kalo ini adalag covariant dan yang ini adalah contravariant. 

copyContainer(container1, container2) error. 

Karena container12 memiliki generic string, sedangkan di fungsi copyContainer, parameter bertipe data any. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/b3e37e1f-b160-4819-81aa-03dffc54b140)

Solusinya ada 2 : 
- Ubah agar sesuai dengan rule invariant (kalo string ya string, any ya any) (data2)
- Ubah parameter fungsi agar bisa hold inputan string. Parent any hold child string. OUT.(data1)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/0cb18262-1b85-46fd-a047-76ed71633093)


## STAR PROJECTION

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/d23d2b3f-9ed3-466d-8d7e-d2ba2380bd91)


## TYPE ERASURE

Aslinya, generic type hanya bisa dikenali saat compile time. Saat runtime(saat codenya sudah jadi binary file), gaada lagi ada istilah generic. Hal ini sudah terjadi sejak di java.

TYPE ERASURE ADALAH  proses pengecekan generic saat compile time dan menghiraukan pengecekan pada saat runtime. Type erasure menjadikan informasi generic parameter type akan hilang ketika kode program telah di compile menjadi binary file. Compiler akan mengubah generic parameter type menjadi Any (atau Object di Java). 

#### PROBLEM TYPE ERASURE
Karena informasi generic hilang ketika sudah menjadi binary file, konversi tipe data generic berbahaya apabila dilakukan secara tidak bijak.

Ini adalah classnya. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/917588b0-c84c-45d6-811f-a07b7daf1663)

Compilernya ga error.

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/16d052fb-7e09-4de1-bf46-ac7c4ad8e539)

Tapi waktu dijalanin akan error.

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/339efc3b-4c6c-4e7d-b6fb-f88d8963a1a8)


Saat data1 as TypeErasure<Int>, konversi bisa dilakukan tidak akan error ketika compile karena di binaryfile informasi bahwa generic data1 adalah sebuah string hilang dan akan dibaca sebagai sebuah object/any.

Akibatnya ketika runtime dari code baris ke-14, akan error karena tidak mungkin data2.getData() yang seharusnya "Eko" diubah menjadi integer. 

penjelasannya disini aj wkw https://www.youtube.com/watch?v=uqCfHGHs9TQ&list=PL-CtdCApEFH8MW630XLcNKsBDWCCdh2mR&index=10


# BEBERAPA INTERFACE YANG MENGGUNAKAN KOTLIN GENERIC 

## Comparable Interface
Kalo manggil -- dan != sebenernya metode yg dipanggil adalah .equals

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/facbb38e-bee0-4a33-9913-c43ac6da1e88)


![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/65adfa5d-f1f8-4048-b2da-238c0b19b0d7)

Nih contoh implements comparable interface 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/c4147798-aa71-49df-a0e3-bd95692febcb)

Jadi jika mmkai interface comparable, di main function bisa langsung print (fruit1 > fruit2) 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/aa0861e8-7b82-45cc-b99b-3d81cb1ab42d)


Sebenernya kita bisa fruit1.quantity.equaltTo(fruit2.quantity). Nanti di main cara pakenya print(fruit1.namaFungsi(fruit2))
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/32c9b14a-8614-4827-bc72-cea89a80466b)










## ReadOnlyProperty Interface

## readWriteProperty Interface 

## ObservableProperty Interface

## Generic Extension Function 






