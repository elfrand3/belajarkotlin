fun main() {
    println("_______________________________");
    println("PILIHAN OPERASI : ");
    println("===============================");
    println("1. Penjumlahan");
    println("2. Perkalian");
    println("3. Pengurangan");
    println("4. Pembagian");
    println("_______________________________");
    print("Pilih Operasi = ");
    var opsi = readLine()

    if (opsi.equals("1")) {
        println("OPERASI PENJUMLAHAN: ");
        print("Masukkan Angka 1 : ");
        var NA = readLine()!!.toInt()
        print("Masukkan Angka 2 : ");
        var NB = readLine()!!.toInt()

        val hasil = NA + NB
        println("Hasil penjumlahan adalah: $hasil")
    } else if (opsi.equals("2")) {
        println("OPERASI PERKALIAN: ");
        print("Masukkan Angka 1 : ");
        var NA = readLine()!!.toInt()
        print("Masukkan Angka 2 : ");
        var NB = readLine()!!.toInt()

        val hasil = NA * NB
        println("Hasil Perkalian adalah: $hasil")
    }else if (opsi.equals("3")) {
        println("OPERASI PENGURANGAN: ");
        print("Masukkan Angka 1 : ");
        var NA = readLine()!!.toInt()
        print("Masukkan Angka 2 : ");
        var NB = readLine()!!.toInt()

        val hasil = NA - NB
        println("Hasil Pengurangan adalah: $hasil")
    }else if (opsi.equals("4")) {
        println("OPERASI PEMBAGIAN: ");
        print("Masukkan Angka 1 : ");
        var NA = readLine()!!.toDouble()
        print("Masukkan Angka 2 : ");
        var NB = readLine()!!.toDouble()
        val hasil = NA / NB
        println("Hasil Pembagian adalah: $hasil")
    }else {
        println("Pilihan tidak ada!");
    }
}