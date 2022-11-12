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
     *    * * * * *
     *
     */

    val angka = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for(i in angka){
        print("$i ")
    }
    println(" sebuah array nilai 1 - 10, Menggunakan perulangan for")
    val a = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var d = 0
    for(i in a){
        d = d + i
        print("$d ")
    }
    println(" jumlah satu persatu arraynya menggunakan perulangan for")

    var o = 1
    while (o <= 10) {
        print("$o ")
        o++
    }
    println(" sebuah array nilai 1 - 10, Menggunakan perulangan While")

    var i = 1
    var k = 0
    while (i <= 10) {
        k = k + i
        print("$k ")
        i++
    }
    println(" jumlah satu persatu arraynya menggunakan perulangan while")

    println()

    for(i in 5 downTo 1){
        for (j in 1 ..  i){
            print("$j ")
        }
        println()
    }

    println()

    for(i in 1..5){
        for (j in 1..4 ){
            print("$i ")
        }
        println()
    }

    println()

    var awal = 1
    var akhir = 5
    for (i in 1 .. 5) {
        for(j in 1..5){
            if (j == awal || j == akhir){
                print("* ")
            } else {
                print("$j ")
            }
        }
        println()
        awal = awal + 1
        akhir = akhir - 1
    }

    println()
    for (i in 1 .. 5) {
        for(j in 1..5){
            if ( i == j || i + j == 6){
                print("* ")
            } else {
                print("$j ")
            }
        }
        println()
    }

    println()

    for (i in 1 .. 5) {
        for(j in 1..5){
            if ( i == 1 || j == 1 || j == 5 || i == 4){
                print("* ")
            } else {
                print("$j ")
            }
        }
        println()
    }

    println()
    for (i in 1 .. 5) {
        for(j in 1..5){
            if ( i == 1 || j == 1 || i == 5 || j == 5){
                print("* ")
            } else {
                print("$j ")
            }
        }
        println()
    }

//    val k = arrayOf(1,2,3,4,5)
//    val b = "*"
//    for(i in k ){
//        for (j in 1..4 ){
//            print("$i ")
//        }
//        println()
//    }
//
//    val l = "^"
//    for(i in l ){
//        for (j in 1..5 ){
//            print("$i ")
//        }
//        println()
//    }
//
//    val g = "*"
//    for(i in g ){
//        for (h in 1..5 ){
//            for (h in 1..5 ){
//                print("$i ")
//            }
//            println()
//        }
//        println()
//    }

//    for( b in 1..5){
//        if(b == 1){
//            print("*")
//        }else if(b == 2){
//            print(2)
//        }else if(b == 3){
//            print(3)
//        }else if(b == 4){
//            print(4)
//        }else{
//            print("*")
//        }
//        for (b in 1..4 ){
//            print("$b ")
//        }
//        println(b)
//    }


}
