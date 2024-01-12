# KOTLIN COLLECTIONS 

# INTRODUCTION 
Sebuah collection biasanya berisikan sejumlah data, bahkan bisa kosong. 

Kotlin standard library menyediakan data collection yg bisa langsung digunakan tanpa tambahan library. 

#### Tipe collection : 
- immutable
- mutable

#### Kotin Collection Diagram 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/3821aaa2-f01f-47dc-9ad6-03b37eab8c93)



# 1. LIST -----
Defaultnyaimmutable.
Mirip array. 

Array => fixed length.

List => dynamic length. 
- mutable
- immutable

#### Cara membuat
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/fc2720d5-3dc1-4bf1-9df3-f4a6a0440587)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/0115e966-01bd-4c1f-a1a9-6fb3319dd21f)


#### Function
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/47704f22-2474-49fa-9a0b-77826b38717d)



# 2. SET -----
Datanya unik dan tidak pasti berurut (jd gabisa di index). Kalo ada data yang sama/duplicate msuk, nnti di reject. 

#### Cara membuat
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/fc76af78-be1e-4824-b4bc-65573a64c5b2)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6d80284e-92e7-47c3-b7ca-75773f7e6b6b)


#### Function
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/e8d71944-51e3-4797-9f53-fd91ee8c93a8)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/467066d1-8e63-495e-9084-3d113a55958f)




# 3. PAIR -----
Adalah representasi 2 data yg berpasangan.

Di Map, Pair digunakan sebagai data Map ketika pertama kali Map dibuat.

Sakjane pair tu data class wkw.

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/edcaab2e-fc03-46bb-9e76-ab7e992daad2)

#### Cara membuat
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/7052dbb9-5c7d-42d6-8757-7cf0d091b50b)

#### Function


# 4. MAP -----
Dictionary/array asosiatif. Key Value.

Tipe data key bebas.

Masukkinnya tipe data pair, namun nanti bakalan terubah menjadi entry. 

#### Cara membuat
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/9c628240-7dda-4a84-98f0-8981c3f801d2)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/ffeec804-b8cf-4d8c-a3f5-3ac352c7778e)

#### Destructuring object map
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/ba8dba3a-7b97-4d8b-8369-6b25c38d01f8)

#### Function
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/7131ea5f-b88e-480a-b3bb-2192b1b6be58) ![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/878426a5-2629-4454-a990-ab71bd8dcccc)


# 5. Collection -----
Semua data collection adalah turunan interface Collection. 

Collection digunakan sebagai general operation terhadap struktur data collection, seperti membaca dan menulis data di collection. Get remove dll prototype templatenya ada di struktur data collection. 

#### Function
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/b27c2aa7-bfb5-4b3d-93bf-d8b86472e031)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/708c3556-0544-4a98-b0ed-7523fa03a99c)


#### Contoh kode program 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/1445f62a-10cf-4036-aad6-6019ad029d9c)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6ac73561-8b95-4cd9-af04-2d132394e4a5)


# 6. Iterable -----
Superclass dari collection interface 

Iterable adalah general operation untuk melakukan iterasi seluruh data di collection atau menghapus data di collection. 

#### Function
next => ke record berikutnya

hasNext => check apakah ada record selanjutnya 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/f9387f5a-5a03-47d4-b360-5c42484b3b89)

#### Kode Program 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/1bdc5b87-d19d-43e2-9ba0-685b7674bc99)

# 7. Iterator -----
Ini interface











