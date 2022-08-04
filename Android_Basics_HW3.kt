fun main() {
    val candles = 12
    val layers = 4

    //print info
    println("Number Of Candles: $candles")
    println("Cake Top Length: ${candles+2}")
    println("Number Of Layers: $layers")

    //call functions
    printCakeCandles(candles)
    printCakeTop(candles)
    printCakeBottom(candles, layers)
}

fun printCakeCandles(candles: Int){
    print(" ")
    repeat(candles){
        print(",")
    }
    print("\n ")
    repeat(candles){
        print("|")
    }
    println()
}

fun printCakeTop(candles: Int){
    repeat(candles+2){
        print("=")
    }
    println()
}

fun printCakeBottom(candles: Int, layers: Int){
    repeat(layers){
        repeat(candles+2){
            print("@")
        }
        println()
    }
}