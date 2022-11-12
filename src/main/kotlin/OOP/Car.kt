package OOP

class Car(
    merekMobil : String = "Ferrari",
    warnaMobil : String = "Hitam",
    tahunMobil : Int = 2022
) {
    var merek = merekMobil
    var warna = warnaMobil
    var tahun = tahunMobil

    init {
        print("init : $merek ")
    }

    fun test(){
        print("$warna ")
    }
}