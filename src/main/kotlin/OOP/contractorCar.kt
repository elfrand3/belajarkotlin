package OOP

fun main(){

    val ferarri = Car()
    val lamborgini = Car("lamborgini", "biru", 2021)

    println("Jenis Mobil ${ferarri.merek}, mempunyai warna ${ferarri.warna}, Di beli pada tahun ${ferarri.tahun})")
    println("Jenis Mobil ${lamborgini.merek}, mempunyai warna ${lamborgini.warna}, Di beli pada tahun ${lamborgini.tahun})")

    ferarri.test()
}