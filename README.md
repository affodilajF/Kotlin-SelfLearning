
# INLINE FUNCTION
https://stackoverflow.com/questions/44471284/when-to-use-an-inline-function-in-kotlin
NOTE THAT **Lambdas are converted to classes**

- In Kotlin/JVM, function types (lambdas) are converted to anonymous/regular classes that extend the intefrace ``Function``
- The function type ``() -> Unit`` is converted to the interface ``Function0``
- 
