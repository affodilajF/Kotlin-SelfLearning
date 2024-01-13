

# Introduction Mocking --------------------------------------------
- Makin besar app, kemungkinan ketergantungan antar class makin gede pula.
- Interaksi antar kelas better integration test daripada unit test.
- Cara test class depend on another class? mocking

Mocking sederhananya adalah membuat objek tiruan. 

Misal kita butuh testing class A dimana class A butuh class B. Nah class B nya akan di-mocking atau dibuat objek tiruannya. Sehingga kita tidak perlu membuat class B.

Hal ini dilakukan agar behavior dari objek class B bisa kita custom dan tentukan sendiri. 

Dengan mocking, kita bisa membuat request response seolah-olah object tersebut benar dibuat. 

## MOCKITO (mocking framework) 
Mockito bisa diintegrasikan baik dengan JUnit.

site.mockito.org

janlup atur testImplementation

# Mocking di Test --------------------------------------------

# Verifikasi Mocking --------------------------------------------
