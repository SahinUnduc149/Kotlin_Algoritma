package com.sahinunduc.algoritma_ornekleri

import java.util.Scanner

fun main(){
    // girdi değişkenine veri atabileceğimiz Scanner kütüphanesi atanır.
    // Scanner(System.`in`) veri almak için kullanılır.
    val girdi =Scanner(System.`in`)

    // ilk sayı istenir ve alınır.
    println("İlk sayıyı giriniz")
    var sayi1 = girdi.nextInt()
    // ikinci sayı istenir ve alınır.
    println("İkinci Sayıyı giriniz")
    var sayi2 = girdi.nextInt()

    // alınan iki sayı toplanır.Toplam değişkenine atılır.
    var toplam = sayi1 + sayi2

    // İki sayının toplamı ekranda gösterilir.
    println("İki Sayının Toplamı:$toplam")

}
