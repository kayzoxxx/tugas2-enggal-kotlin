// Tugas 2 Perbedaan

//soal 1
fun main() {
    val string1 = "Enggal Nur Muktafi"
    val string2 = "enggal nur muktafi"
    
    println("jumlah karakter pertam ${string1.length}")
    println("jumlah karakter kedua ${string2.length}")
    
    if (string1 == string2) {
        println("sama")
    }else {
        println("tidak sama")
    }
    println("pengecekan selesai")
}

// soal 2
fun main() {
    val angka = 25
    
    if (angka > 50){
        println("lebih dari 50")
    }else if(angka < 50){
        println("kurang dari 50")
    }else {
        println("sama dengan 50")
    }
    
    //kelipatan 5
    if (angka %5==0){
        println("kelipatan 5")
    }else {
        println("bukan kelipatan 5")
    }
}

// soal 3
fun main() {
    val angka = arrayOf(21,32,43,24,27,28)
    
    for (i in angka) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

//soal 4
fun main() {
    val umur = 20
    
    val hasil = when (umur) {
        in 6..12 -> "Anak-anak"
        in 13..16 -> "Remaja"
        in 17..100 -> "Dewasa"
        else -> "diluar rentang"
    }
    
    println (hasil)
}

// soal 5
fun main() {
    val angka = 76
    if (angka % 3 == 0 && angka % 5 == 0){
    	println ("Kelipatan 3 dan 5")   
    } else if (angka % 3 == 0) {
        println ("kelipatan 3")
    } else if (angka % 5 == 0) {
        println ("kelipatan 5")
    } else {
        println("bukan kelipatan 3 maupun 5")
    }
    
    
}
