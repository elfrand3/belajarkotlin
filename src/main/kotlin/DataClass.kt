// Pembelajaran
// class = produknya
// parameter contractor
// object =
//
//
// class Binatang(
//    namaB : String,
//    jenisB : String = "jantan",
//    warnaB : String? = null
//) {
//    val nama = namaB
//    val jenisKelamin = jenisB
//    val warnaBinatang = warnaB
//
//    fun tampilkan(){
//        println("===== Nama Hewan ======")
//        println("Nama : " + nama)
//        println("Jenis Kelamin : " + jenisKelamin)
//        println("Warna Hewan : " + warnaBinatang)
//    }
//}
//fun main(){
//    var harimau = Binatang(
//        namaB = "harimau ",
//        jenisB = "betina ",
//        warnaB = "Orange"
//
//    )
//    println(harimau.nama)
//    println(harimau.jenisKelamin)
//    println(harimau.warnaBinatang)
//    harimau.tampilkan()
//}

//======= Case 1 ======

class bootcamp(
    nama : String,
    role : String,
    ruang : String,
    mentor : String? = null
) {
    val nama = nama
    val role = role
    val ruangPelatihan = ruang
    val mentorRole = mentor

    fun tampilkan(){
        println("===== Bootcamp commiT ======")
        println("Masukkan Nama : ")
        var nama = readLine()
        println("Masukkan Role : ")
        var Prole = readLine()
        println("Masukkan Ruang Pelatihan : ")
        var RuangP = readLine()
        println("Masukkan Nama Mentor : ")
        var namaR = readLine()
        println("Nama : " + nama)
        println("Role : " + Prole)
        println("Ruang Pelatihan : " + RuangP)
        println("Nama Mentor : " + namaR)
    }
}
fun main(){
    var bootcamp = bootcamp(
        nama = "Tanpa nama",
        role = "Mobile Android ",
        ruang = "lantai Atas ",
        mentor = "Bang Akbar & Bang Karim"

    )
    bootcamp.tampilkan()
}