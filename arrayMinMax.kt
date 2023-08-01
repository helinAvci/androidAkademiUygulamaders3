package com.helinavci.kotlinandroidprogramminguygulamaders3

fun main() {
    val arr = arrayOf(13 , 10,22, 38, 43, 67, 48)
    println("the max value in this array is ${arr.max()}")
    println("the min value in this array is ${arr.min()}")
    println("the max value in this array is ${findMax(arr)}")
    println("the min value in this array is ${findMin(arr)}")


}
fun findMin(arr : Array<Int>) : Int{
    var min = arr[0]
    val size = arr.size
    for(i in 1..size-1){
        if(arr[i] < min){
            min = arr[i]
        }
        else{
            continue
        }
    }
    return min
}
fun findMax(arr : Array<Int>) : Int{
    var max = arr[0]
    val size = arr.size
    for(i in 1..size-1){
        if(arr[i] > max){
            max = arr[i]
        }
        else{
            continue
        }
    }
    return max

}