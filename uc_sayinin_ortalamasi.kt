package com.sahinunduc.algoritma_ornekleri
// package ismi projeye özeldir lütfen kendi projenizdeki paketle deneyiniz.

import java.util.Scanner

fun main(){
    // girdi değişkenine veri atabileceğimiz Scanner kütüphanesi atanır.
    // Scanner(System.`in`) veri almak için kullanılır.
    val girdi =Scanner(System.`in`)
    // toplam değişkenine toplama yapmak için 0 değeri verildi.
    var toplam = 0

    // döngü 3 defa sayı girilmesini istedi ve aldı.
    for(i in 0 until 3){
        println("Bir Sayı giriniz")
        var sayi = girdi.nextInt()
        toplam = toplam + sayi;
    }
    // ortalama değişkeninde toplanan sayılar 3'e bölündü .
    var ortalama = toplam / 3
    // 3 Sayının ortalaması yazıldı
    println("Girilen 3 Sayının Ortalaması : $ortalama")
}
