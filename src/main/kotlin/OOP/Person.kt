package OOP

class Person(
    var name: String = "",
    var jenisKelamin: String = "Laki",
    var umur: Int = 15,
    var tinggi: Int = 168,
    var berat: Int? = null
){
    fun identitas(){
        println("Nama saya $name, saya $jenisKelamin, umur saya $umur, tinggi saya $tinggi cm, berat badan saya $berat kg")
    }

    fun lari(){
        println("Saya sedang berlari ")
    }
}
