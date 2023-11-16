package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    val userInput = "123abc"

    try {
        val number = userInput.toInt()
        println("Angka yang berhasil diambil: $number")
    } catch (e: NumberFormatException) {
        println("Error: Tidak dapat mengonversi input ke dalam angka.")
    }
}