package com.helinavci.kotlinandroidprogramminguygulamaders3

fun main() {
    val arr = arrayOf(5 ,10 , 30,40 , 12 , 16)
    arraySum(arr)
}
fun arraySum(  arr : Array<Int>){
    val Size = arr.size
    var sum = 0
    for(i in 0..Size - 1){
        sum += arr[i]
    }
    println("the sum of the this array's elements is $sum")
}