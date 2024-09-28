# SEALED CLASS

```kotlin
// Mendefinisikan sealed class
sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val exception: Exception) : Result()
    object Loading : Result()
}

// Fungsi untuk menangani hasil
fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("Success: ${result.data}")
        is Result.Error -> println("Error: ${result.exception.message}")
        Result.Loading -> println("Loading...")
    }
}

// Penggunaan
fun main() {
    val successResult = Result.Success("Data loaded successfully")
    val errorResult = Result.Error(Exception("Data loading failed"))
    val loadingResult = Result.Loading

    handleResult(successResult)
    handleResult(errorResult)
    handleResult(loadingResult)
}

```


