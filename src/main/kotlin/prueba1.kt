fun main(){
    println("prueba 1:"+SumVal())
    println("prueba 2:"+validDigit())



}





fun product (coef: Int, digit: Int): Int {
    return coef * digit
}

fun SumVal():Boolean{
    val res=product(2,6)
    val esp= 8
    return (res == esp)
}

fun validDigit():Boolean{
    val res=product(11,-9)
    val esp= 2
    return (res == esp)
}
