![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/4e919cd5-d337-4705-b96a-6fd7f9cc72db)# KOTLIN JUnit 

https://search.maven.org/?eh=

# Assertions
Class assertions, memuat banyak static function (di kotlin adalah object function) 


![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/c4f0a33d-8d4b-40c0-ae8e-1c13aa1be4af)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/462383be-47de-41f0-b077-26f50f8909ad)


# Error Report
Ada di html

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/ea45a59e-0a69-49d0-b2b0-5e5b6699575b)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/2100fd8d-10aa-4321-807c-83170bea4959)


# Mengubah Nama Test
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

# Menoaktifkan Test (@Disabled)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/d3571d72-2404-4192-a95f-e9a4d033ba75)

Reportnya :
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/66221800-c03c-4805-8e14-b8d75be47eb3)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/d3eaedc7-afd5-44bd-ba30-b193de0e3ea7)

# Sebelum dan Setelah Unit Test
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


# Membatalkan Test (TestAbortedException)

Misalnya u bikin unit test di sistem OS tertentu, kalo sesuai next sebaliknya di cancel. 

How? Menggunakan exception TestAbortedException.Jika JUnit mendapatkan exception ini, secara ootomatis test tsb akan dibatalkan. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/6ffa6b90-53b5-481c-b0c3-30608f578707)


# Menggunakan Assumptions
Buat ngebatalin juga. Simplier way to use compared TestAbortedException. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/543a1c05-fb06-43b4-9076-16b30bd8f17b)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/4ca99021-8d19-4fb7-91c7-7f59967a70fe)



# Test berdasarkan kondisi
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/ef6f4274-d4ce-4ecc-9df6-965d6be722bb)

### Kondisi Sistem Operasi 
- @EnableOnOs adl penanda bahwa unit test boleh dijalankan pada sistem operasi yang ditentuka
- @DisabledOnOs
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


# Menggunakan Tag
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/1cdad4d0-0e32-4061-a573-8287bdac9d25)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/df8a0361-76be-43f1-b418-214f5e0d3850)

By default ketika ./gradlew.bet test semua test akan di run. Caranya agar hanya test tertentu saja yang di run dilakukan dengan membuat task test di gradle. Bagus buat gruping jenis test. 

excludeTags("") agar tasknya ga ke run otomatis. 

tasks.register untuk mendaftarkan task di gradle. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/7939e139-9bf6-4c46-bb11-d6b49844c017)

# Urutan Eksekusi Test
- By default urutan test tidak ditentukan, tiap unit test itu independent.

### Mengubah urutan eksekusi test? bisa! 
Anotasi @TestMethodOrder

- Alphanumeric => urut based alphanumeric

- Random => ut dieksekusi scr random
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/8b80b256-9032-4903-9213-109a1ed3695c)

- OrderAnnotation (@Order) => Urutanya mengikuti anotas order di setiap function ut nya
  By default alphanumeric, kalo custom tambahkan @Order(n)
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/e8ba16a3-8d55-49de-a93f-d9d59524805f)


# Siklus Hidup Test

































