fun main() {

//    perulangan

//    var rokok = arrayOf("surya ", " 76 ", "sampoerna")
//    for(i in 2 downTo 0){
//        print(rokok [i])
//    }

//    case 1
//    for (i in 1 .. 10){
//        if(i % 2 == 0){
//            println(i)
//        }
//    }
//
//    for (i in 1 until 10){  kurang
//        if(i % 2 == 0){
//            println(i)
//        }
//    }
//    for (i in 1 downTo 10){ terbesar ke terkecil
//        if(i % 2 == 0){
//            println(i)
//        }
//    }

//    case 2 perulangan while
//    incremen & dicremen
//    var i = 0
//    while (i <= 5) {
//        i++
//        println(i)
//    }
//    var i = 5
//    while (i >= 1) {
//        println(i)
//        i--
//    }

//    for(i in 5 downTo 1){
//        for (j in 1 ..  i){
//            print("$j ")
//        }
//        println()
//    }
//
//    for(i in 1..5){
//        for (j in 1..4 ){
//            print("$i ")
//        }
//        println()
//    }


    /**
     * buatlah sebuah array nilai 1 - 10
     *
     * buatlah for untuk menampilkan nilai array tersebut
     *
     * selanjutnya jumlah satu2 arraynya contoh : 1+2+3+ = ... pakai perulangan for dan while
     *
     * ======== Tugas Rumah ==============
     * A. 1 2 3 4 5
     *    1 2 3 4
     *    1 2 3
     *    1 2
     *    1
     * B. 1 1 1 1 1
     *    2 2 2 2 2
     *    3 3 3 3 3
     *    4 4 4 4 4
     * C. * 2 3 4 *
     *    1 * 3 * 5
     *    1 2 * 4 5
     *    1 * 3 * 5
     *    * 2 3 4 *
     * D. * * * * *
     *    * 2 3 4 *
     *    * 2 3 4 *
     *    * 2 3 4 *
     *    * * * * *
     *
     */

    var angka = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for(i in angka){
        println(i)
    }
    print("")
    print("")
    var i = 1
    while (i <= 10) {
        println(i )
        i++
    }

    for(i in 5 downTo 1){
        for (j in 1 ..  i){
            print("$j ")
        }
        println()
    }

    for(i in 1..5){
        for (j in 1..4 ){
            print("$i ")
        }
        println()
    }


}
