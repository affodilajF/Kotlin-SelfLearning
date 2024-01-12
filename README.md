# KOTLIN GRADLE

# Project Structure 
* build.gradle.kts => build scriptnya gradle
* gradlew.bat => kalo gaada gradle d laptop, bisa execute pake cara ini. Caranya di terminal ./gradlew.bat (nama task)
* settings.grad;e.lts => setting project gradle


# Gradle Task 
Perintah-perintah di gradle itu berbasis tasks.

gradle tasks--all

Cara ngejalaninya ./gradlew.bat (nama task)


### Task bawaan gradle 


### Task custom 
Pengen membuat task yg customize/manual? kita harus mengikuti kotlin DSL (dlm konteks ini gradle menggunakan kotlin) 

Caranya menambahkan sendiri tasknya di build.gradle.kts 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/b10f5c4e-1de6-411e-9c83-4a45c79ce49e)


Dan ini cara manggil d terminalnya.

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/9163c63d-7e40-478d-970b-d4d64e762ebb)


Contoh custom task pada proyek besar : 
* generate file
* compile something
* kodenya kotlin, didalamnya ada js css, kita bisa mengkompilasi/meminify css js menggunakan build script seperti ini.


# Gradle Properties 
Pake file gradle.properties

Kita bisa ambil data didalam file gradle.properties pada file build script (build.gradle.kts) 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/4ab42561-789d-4c1c-8a99-e953e3e0d60e) ![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/db4d634d-a431-4fd9-a1be-e4067d5ae247)

# Build Project 
Ada 2 jenis kode yang dibuat -> kode programnya dan testingnya. Gradle mendukung kedua hal ini. 

### command gradle classes
-> melakukan kompilasi seluruh kode program,tdk peduli either kotlin or java

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/85521eb1-400a-4ce2-9813-88532a3241b7)


### command gradle test 
->untuk mlakukan unit test


# Dependency Management 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/c536d67a-fa0b-4a3d-9ac0-fa0c4edf4be5)

Ketika nge-build project, akan di cek
1. gradle cached
2. local file repos
3. Kalo gaada akan otomatis download artifacts di maven/ivy dll
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/b00ccc48-f355-4d9f-b571-8dcc8d272466)

### Include repos ke project
maven {url = private repos yg lu buat sendiri)}

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/e31f4228-892e-49e7-b754-aa0400d0d869)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/0ca01855-d310-4bfa-bb05-fb077a2522f7)

### Menambahkan dependency 
implementation => bs dipake fi function main dan test 
testimp => cuma bisa dipake di test

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/3cdf8716-5251-459d-b635-cf0cc926c5a3)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/a169fbaa-9751-4a2f-8762-b6f61e14b7d3)

Librarynya otomatis ke-download 
![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/859623af-4432-4030-b4ba-19f784c41f7d)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/126b255f-eeb6-4c73-b314-b8e3e4f05953)

# Membuat Distribution File 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/932ffbe1-307e-4ce1-a134-dfc9dfa1d344)

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/01f24326-9a3d-4d11-b826-cf21859e5eaf)

yang di bundle didalam disti file 
- Kode yg dibuat
- File/library/tool yang ada di project

Disti nya bisa di extract di client/server untuk di distribusikan : 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/d557d0cf-fec1-4418-b6ac-deea4d0a1636)

kalo di unzip : 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/60d5afde-d33e-4cff-a8f6-81f16802e702)

Cara menjalankannya : 
Jalankan yang ./bin/namarootproject

Saat running perlu di device yg terinstal java. 

![image](https://github.com/affodilajF/Kotlin-SelfLearning/assets/130672181/d8b54397-83dc-414f-b688-07ea97d1c1cd)


# Multi Module Project 
skip dulu
