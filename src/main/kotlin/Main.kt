fun main() {
    var userChoice:Int = 0
    println("Welcome to the Apple Store, Please select which color iphone case you would like to purchase!")
    var yellow:String = "Canary Yellow"
    var sky:String = "Sky"
    var olive:String = "Olive"
    var iris:String = "Iris"
    var rose:String = "Rose Azalee"
    var orange:String = "Orange"
    do{
        println("1: $yellow")
        println("2: $sky")
        println("3: $olive")
        println("4: $iris")
        println("5: $rose")
        println("6: $orange")
        println("7: Exit Store")

        println("Enter A Choice: ")
        userChoice = readln()!!.toInt()

        if (userChoice in 1..6){
            when (userChoice){
                1-> println("You Chose: $yellow \n")
                2-> println("You Chose: $sky \n")
                3-> println("You Chose: $olive \n")
                4-> println("You Chose: $iris \n")
                5-> println("You Chose: $rose \n")
                6-> println("You Chose: $orange \n")

            }
        }

    }while (userChoice != 7)
}