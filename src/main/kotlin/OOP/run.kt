package OOP

fun main() {

    // menjalankan kalkulator selama nilai perulangan benar

    var startCalculator = true

    while (startCalculator) {

        println("\n ===== Kalkulator ======")
        println("1.\tPenjumlahan")
        println("2.\tPengurangan")
        println("3.\tPerkalian")
        println("4.\tPembagian")

        print("\nMasukkan pilihan\t: ")
        val pilihan = readLine()

        // program berhenti jika user menginputkan bukan angka
        // atau angka yang kurang dari 0 atau lebih dari 4

        if (isInputCorrect(pilihan)) {
            if (pilihan!!.toInt() < 1 || pilihan.toInt() > 4) {
                startCalculator = false
                println("\nInput salah! program selesai.")
                continue
            }
        } else {
            startCalculator = false
            println("\nInput salah! program selesai.")
            continue
        }

        print("\nMasukkan bilangan 1\t: ")
        val bilangan1 = readLine()

        print("Masukkan bilangan 2\t: ")
        val bilangan2 = readLine()

        // program berhenti jika user menginputkan bukan angka

        if (isInputCorrect(bilangan1) && isInputCorrect(bilangan2)) {

            // membuat object dan menampilkan hasil perhitungan

            val calculator =  Calculator(pilihan.toInt(), bilangan1!!.toDouble(), bilangan2!!.toDouble())

            println("\nHasil ${calculator.operasiPilihan}\t: ${calculator.hasilPerhitungan}\n")

            print("Hitung lagi? y = Yes, n = No : ")
            val ulangLagi = readLine()

            // jika user menginputkan y atau Y maka program akan berjalan kembali
            // selain itu program berhenti

            if (ulangLagi == null) {
                startCalculator = false
                println("\nInput salah! program selesai.")
            } else {
                if (ulangLagi.toString() == "y" || ulangLagi == "Y") {
                    continue
                } else {
                    startCalculator = false
                    println("\nProgram selesai.")
                }
            }

        } else {
            startCalculator = false
            println("\nInput salah! program selesai.")
        }
    }
}