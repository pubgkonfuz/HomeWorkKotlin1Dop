import cars.Car
import cars.Cars
import java.util.*

fun main(args: Array<String>) {
    val carPrint = Car()
    val carsBmw = Cars(carMake = "BMW", model = "M5F90", engine = "V12", color = "Black")
    val carsMers = Cars(carMake = "Mers", model = "Kaban", engine = "V8", color = "white")
    val carsMazda = Cars(carMake = "Mazda", model = "Hetchpek", engine = "V6", color = "grey")
    val carsGelik = Cars(carMake = "Gelik", model = "GL", engine = "V10", color = "red")

    val scanner = Scanner(System.`in`)

    val list = listOf(
        carsBmw, carsMers, carsMazda, carsGelik
    )

    for (i in list.indices) {
        val number = i + 1
        println("$number) ${list[i].carMake}")
    }
    print("Напишите номер, о котором хотите узнать:")
    val number = scanner.nextInt() - 1

    for (i in list.indices) {
        if (i == number) {
            carPrint.cars(list[i])
        }
    }
}