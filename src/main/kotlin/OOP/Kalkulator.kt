package OOP

class Calculator(val operasi: Int, val value1: Double, val value2: Double) {

    // menampilkan pilihan opsi

    val operasiPilihan: String
        get() {
            return when (operasi) {
                1 -> "Penjumlahan"
                2 -> "Pengurangan"
                3 -> "Perkalian"
                else -> "Pembagian"
            }
        }

    // ubah hasil menjadi dua angka di belakang koma

    fun formatDouble(value: Double) = String.format("%.2f", value).toDouble()

    // return hasil perhitungan

    val hasilPerhitungan: Double
        get() {
            return when (operasi) {
                1 -> formatDouble(value1 + value2)
                2 -> formatDouble(value1 - value2)
                3 -> formatDouble(value1 * value2)
                else -> formatDouble(value1 / value2)
            }
        }
}

// return true jika value berupa angka
// contoh: -13.5 -> true

fun isMatches(value: String): Boolean = value.matches("-?\\d+(\\.\\d+)?".toRegex())

// return true jika input dari user berupa angka dan tidak null

fun isInputCorrect(value: String?): Boolean {
    return if (value == null) {
        false
    } else {
        isMatches(value)
    }
}