import java.util.*

class Robot(val name: String) {

    fun ringAlarm(time: String) = println("Good morning! Its $time, please wake up!")

    fun makeCoffee(Coffee: Coffee) {
        if (coffee.black) {
            println("Your black coffee with ${coffee.spoonsOfSugar} spoons of sugar is ready!!")
        } else {
            println("Your coffee with ${coffee.spoonsOfSugar} spoons of sugar is ready!!")
        }
    }

    fun heatWater(temperature: Int) = println("Bath water is ready with $temperature")

    fun packBag(day: Int) {
        val messageTemplate = "Books kept for today are: "
        val subjects = arrayOf("Maths", "Chemistry", "Physics", "Biology", "Computers")

        when (day) {
            Calendar.MONDAY -> println("$messageTemplate ${subjects[0], subjects[1]}")
            Calendar.TUESDAY -> println("$messageTemplate ${subjects[0], subjects[2]}")
            Calendar.WEDNESDAY -> println("$messageTemplate ${subjects[1], subjects[3]}")
            Calendar.THURSDAY -> println("$messageTemplate ${subjects[0], subjects[4]}")
            Calendar.firstDayOfWeek -> println("$messageTemplate ${subjects[2], subjects[4]}")
            else -> println("Today is holiday!!")
        }
    }
    
    fun cook() {
        val breakfast = mutableListOf("Cereals", "Oats", "Sandwiches", "Eggs")
        val lunch = mutableListOf("Corn Spinach", "Salad", "Chicken", "Mashed Potatoes")
        println("Today's breakfast is ${breakfast.random()} and lunch is ${lunch.random()}")
    }

    fun ironClothes(shirtColor: String, trouserColor: String) {
        val shirtColors = mutableListOf("Blue", "Green", "Red", "Orange")
        val trouserColors = mutableListOf("Black", "Blue", "Gray")

        if (shirtColors.contains(shirtColor)) {
            if (trouserColors.contains(trouserColor)) {
                println("Your Clothes are ready!!")
            } else {
                println("You do not have trouser of this color.")
            }
        } else {
            println("You do not have shirt of this color.")
        }
    }


}