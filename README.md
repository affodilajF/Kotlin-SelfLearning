# KOTLIN JUnit 

https://search.maven.org/?eh=

# Assertions --------------------------------------------
Class assertions, memuat banyak static function (di kotlin adalah object function) 


![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/c4f0a33d-8d4b-40c0-ae8e-1c13aa1be4af)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/462383be-47de-41f0-b077-26f50f8909ad)


# Error Report --------------------------------------------
Ada di html

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/ea45a59e-0a69-49d0-b2b0-5e5b6699575b)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/2100fd8d-10aa-4321-807c-83170bea4959)


# Mengubah Nama Test --------------------------------------------
Kadang agak sulit membuat nama function yang merepresentasikan kasus testnya. 

Anotasi @DisplayName untuk menambahkan deskripsi setiap test.

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/28a397c6-209e-4c15-ba1f-d94051c10679)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6dfb7832-3472-4cc2-90c6-7a52d5f5593d)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/01747319-2ee1-4655-bb2a-518e415101f9)

### DisplayName Generator 
JUnit mendukung pembuatan DisplayName secara otomatis menggunakan genrator. 

#### How to use?
Create class turunan dari interface DisplayNameGenerator lalu tambahkan anotasi @DisplauNameGeneration di test class nya. 


![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/1715e2e5-ab2c-49ba-b930-3b8a555c020c)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/3f0d73a4-07ae-45a0-b095-a1c010d1a6c3)


![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/f2ac55ea-54ca-45f3-a232-a6da85d66af8)

# Menoaktifkan Test (@Disabled) --------------------------------------------
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/d3571d72-2404-4192-a95f-e9a4d033ba75)

Reportnya :

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/66221800-c03c-4805-8e14-b8d75be47eb3)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/d3eaedc7-afd5-44bd-ba30-b193de0e3ea7)

# Sebelum dan Setelah Unit Test --------------------------------------------
Sebelum / setelah unit test, fungsi yang dianotasi akan dijalankan.

### Dieksekusi sebanyak function unit test yang dibuat

@BeforeEach @AfterEach

Misal bikin 5 unit test function, before each akan dieksekusi sebelum ke-5 fungsi unit test tsb. @BeforeEach akan dieksekusi sbnyk 5x. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/e65fe93b-3821-4a9a-94b9-11f2b600500f)

Not as simple as this biasanya, bisa nyimpen data ke db dulu dll.
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/7939d545-3421-42aa-b8b0-625424c8bb6f)

#### Maunya 1x aja? BISA 

@BeforeAll @AfterAll 

Hanya static function (object function di kotlin) yang bisa menggunakan anotasi ini. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/571e6bd5-5f71-4fef-9a71-d5c327af165b)


# Membatalkan Test (TestAbortedException) --------------------------------------------

Misalnya u bikin unit test di sistem OS tertentu, kalo sesuai next sebaliknya di cancel. 

How? Menggunakan exception TestAbortedException.Jika JUnit mendapatkan exception ini, secara ootomatis test tsb akan dibatalkan. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6ffa6b90-53b5-481c-b0c3-30608f578707)


# Menggunakan Assumptions --------------------------------------------
Buat ngebatalin juga. Simplier way to use compared TestAbortedException. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/543a1c05-fb06-43b4-9076-16b30bd8f17b)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/4ca99021-8d19-4fb7-91c7-7f59967a70fe)



# Test berdasarkan kondisi --------------------------------------------
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/ef6f4274-d4ce-4ecc-9df6-965d6be722bb)

### Kondisi Sistem Operasi 
- @EnableOnOs adl penanda bahwa unit test boleh dijalankan pada sistem operasi yang ditentuka
- @DisabledOnOs
- 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6da218e4-c310-4cc6-810b-88a90c39d022)

### Kondisi Versi Java
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/82cb1eb4-c1b3-449f-9cc7-44a5278aea59)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/2bfe52c7-690b-4d77-8d59-02e754a300a5)

### Kondisi System Property 
System Properties? 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/76d5e062-f687-4d9a-b297-a10bcc041bb0)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/999569f6-2ea1-4c83-9903-245787d37847)

### Kondisi Environment Variable 
- @EnabledEnvironmentVariable(s)
- @DisabledEnvironmentVariable(s)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/7ba9c259-9336-4e77-b00e-9e1661f399f2)


# Menggunakan Tag --------------------------------------------
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/1cdad4d0-0e32-4061-a573-8287bdac9d25)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/df8a0361-76be-43f1-b418-214f5e0d3850)

By default ketika ./gradlew.bet test semua test akan di run. Caranya agar hanya test tertentu saja yang di run dilakukan dengan membuat task test di gradle. Bagus buat gruping jenis test. 

excludeTags("") agar tasknya ga ke run otomatis. 

tasks.register untuk mendaftarkan task di gradle. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/7939e139-9bf6-4c46-bb11-d6b49844c017)

# Urutan Eksekusi Test --------------------------------------------
- By default urutan test tidak ditentukan, tiap unit test itu independent.

### Mengubah urutan eksekusi test? bisa! 
Anotasi @TestMethodOrder

- Alphanumeric => urut based alphanumeric
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/20f2291c-93d9-4198-ac58-06bbdf7b9d0e)

- Random => ut dieksekusi scr random

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/8b80b256-9032-4903-9213-109a1ed3695c)

- OrderAnnotation (@Order) => Urutanya mengikuti anotas order di setiap function ut nya
  By default alphanumeric, kalo custom tambahkan @Order(n)
  
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/e8ba16a3-8d55-49de-a93f-d9d59524805f)


# Siklus Hidup Test --------------------------------------------
Secara default, objek unit test akan dibuat per satu function didalamnya secara independen. 

@TestInstance dengan default Lifecycle.PER_METHOD. Biar bisa satu objek untuk semua method didalamnya gunakan Lifecycle.PER_CLASS. Hal ini bisa dimanfaatkan untuk membuat test yang bergantung dengan test lain.

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/ea77def3-123a-49fc-986b-e094597b7e35)

### Keuntungan instance per class
- Kita bisa menggunakan @BeforeAll dan @AfterAll di funcion biasa (tanpa harus menggunakan function object/static)


# Test di dalam Test --------------------------------------------
(nested class)

@Nested => inner class bisa digunakan sebagai unit test 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/e9cb177e-f661-4c28-ace3-c9343ec14668)

# Informasi test --------------------------------------------
Jarang digunakan

Untuk mendapatkan informasi test yang sedang berjalan menggunakan interface TestInfo. 
How? kita bisa menambahkan TestInfo sebagai parameter di function unit test.

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/a640cc7a-759b-47af-bfb9-f692449aacbe)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/c0710d7a-4a36-41c9-888d-44bb69270a33)


Hasil : 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/f8a442a0-3961-4ef6-88cf-c3f16367903e)



# Dependency Injection di Test  --------------------------------------------
Sebenernya fitur TestInfo sebelumnya adalah bagian dr dependency injection di JUnit. 

Dependency Injetion adalah bagaimana kita bisa memasukkan dependency (object/instance) ke dalam unit test secara otomatis tanpa proses manual. 

Saat kita menambahkan parameter di function unit test, sebenernya kita bisa secara otomatis memasukkan parameter tsb dengan bantuan interface ParameterResolver.
Contohnya TestInfo, objectnya dibuat oleh TestInfoParameterResolver. 

### Membuat random parameter resolver
Random() adalah class bawaan java util.

Agar suatu fungsi ut bisa memiliki parameter. Implements ParameterResolver. 
1. Bikin class. Tujuannya agar objek Random() bisa di-inject di ut function. 
   ![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/40ebdc55-d3d7-4498-9d6d-c78791ad0586)

2. Cara menggunakan parameter resolver
   
   Gunakan @ExtendWith (1 parameter) atau @Extentions (>= 1 parameter) di test class.

   random.nextInt adalah max angka random.

   ![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/c160bc01-e32d-4eef-9b19-e7b6c8822f8e)

3. Logicnya => objek parameter random : Random akan diambil dari kelas RandomParameterresolver, di dalam kelastersebut ada proses inisasi objek Random(), nah pake ini. Kalo gapake resolver harus bikin objek Random() disetiap testcase kaya gini.
   
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/4c8965cc-d7ed-4f87-84a0-823ad4d08be6)


# Pewarisan di Test--------------------------------------------
Artinya, kita bikin class / interface, dan bisa di extends. 

Kondisi yg membutuhkan => Code before after test yang berulang-ulang ditarhuh di satu parent class, kalo muk pake unit testnya tinggal extends aja. 

#### Parent class
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/a873c0f4-2011-4417-961e-c05d9e8b53bd)


#### Child class
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/0b420ca0-49dc-4a0a-830e-65bd947e32f4)


# Test berulang @RepeatedTest --------------------------------------------
JUnit mendukung eksekusi unit test berulang kali sesuai dengan jumlah yang kita tentukan.

Anotasi ditulis di function unit testnya. Kalo sekali @Test kalo berulang @RepeatedTest. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6e14ebfa-9dfd-4c85-91fc-3076e8dfefe7)

value = 10, artinya unit test akan dijalankan sebanyak10x. 

name => mengoveride DisplayName. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/cdf8475c-2066-4243-ada1-41da354519fd)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/afcefd71-ad1a-4e06-a593-eb84834c194a)

## Informasi perulangan
@RepeatedTest memiliki object RepetitionInfor yang di inject oleh class RepetitionInforParameterResolver, sehingga kita bs mendapatkan informasi repetitionInfo melalui parameter function unit test. I

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/512bb325-3fad-4750-9aef-254da94b8555)


# Test dengan parameter @ParameterizedTest --------------------------------------------
Sebelumnya kita pakai parameter resolver yang agak ribet (apalagi untuk parameter kecil kayak int string dll). 

How? ganti @Test menjadi @ParameterizedTest.

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/c73a588f-ffac-4ba6-9078-e2adddd006f7)

Contoh : 

fungsi testWithParameter akan dijalankan sebanuak jumlah @ValueSource (dalam hal ini 5). 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/779c8593-7046-49a9-badd-c30c3c3e7335)


# Timeout di test @Timeout --------------------------------------------
Untuk memberi time maksimal suatu unit test berjalan. 

By default gaada timeoutnya. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/87c8b4e5-8ec0-41cf-9ec9-30a268f2b7b9)

# Eksekusi Test Secara Paralel --------------------------------------------
By default di JUnit, unit test akan dijalankan secara sequential satu per satu.

Kita bisa melakukan paralel unit testing dengan beberapa langkah. 

But sure pastikan semuanya aman. Misalnya satu function mengubah value dari function lain dengan shared prioperties saat menggunakan siklus hidup test per_class.

1. Menambah konfigurasi paralel
   - Membuat file junit-platform.properties di src.test.resource. Apapun yang bukan kode kotlin masukkan di resource. 
   - Menambah value => junit.jupiter.execution.parallel.enabled = true 
2. Menggunakan @Execution
   Unit test tidak secara otomatis akan berjalan paralel. Gunakan anotasi @Execution dan pilih jenis executionnya, misal ExecutionMode.CONCURRENT.
   
   ![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/8660f857-adf6-42f4-a40c-0ce2485c26a8)









































