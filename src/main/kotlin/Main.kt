fun main() {
    val myList = listOf("Susan", "Blaire", "Maina", "Julia", "Wanjiru", "Joan", "Risper", "Mercy", "Valen", "Vanessa")
    val evenIndexStrings = getStringsAtEvenIndices(myList)
    println(evenIndexStrings)


    val heights = listOf(1.8, 1.6, 1.7, 1.75, 1.82)
    val (averageHeight, totalHeight) = getAverageAndTotalHeight(heights)
    println(averageHeight)
    println(totalHeight)

    val people = mutableListOf(
        Person("John", 25, 122, 70.0),
        Person("Mary", 30, 133, 60.0),
        Person("Peter", 20, 180, 80.0),
        Person("Lucy", 40, 165, 55.0)
    )

    val sortedPeople = sortPeopleByDescendingAge(people)
    println(sortedPeople)

    val peopleB = mutableListOf(
        Person("John", 25, 122, 70.0),
        Person("Mary", 30, 133, 60.0),
        Person("Peter", 20, 180, 80.0),
        Person("Lucy", 40, 165, 55.0)
    )

    addPeopleToList(people)
    println(people)

    val cars = listOf(
        Car("ABC123", 10000.0),
        Car("DEF456", 20000.0),
        Car("GHI789", 15000.0)
    )

    val averageMileage = calculateAverageMileage(cars)
    println( averageMileage)

}

//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc (2 points)
fun getStringsAtEvenIndices(list: List<String>): List<String> {
    val result = mutableListOf<String>()
    for (i in 0 until list.size step 2) {
        result.add(list[i])
    }
    return result
}





//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height (2 points)
fun getAverageAndTotalHeight(heights: List<Double>): Pair<Double, Double> {
    val totalHeight = heights.sum()
    val averageHeight = totalHeight / heights.size
    return Pair(averageHeight, totalHeight)
}



//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class Person(val name: String, val age: Int, val height:Int, val weight: Double)

fun sortPeopleByDescendingAge(people: List<Person>): List<Person> {
    return people.sortedByDescending { it.age }
}


//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
data class PersonB(val name: String, val age: Int, val height:Int, val weight: Double)

fun addPeopleToList(people: MutableList<Person>) {
    val newPerson1 = Person("Ariah", 28, 152, 65.0)
    val newPerson2 = Person("Brian", 32, 185, 85.0)
    people.addAll(listOf(newPerson1, newPerson2))
}




//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list. (3 points)

data class Car(val registration: String, val mileage: Double)

fun calculateAverageMileage(cars: List<Car>): Double {
    val totalMileage = cars.fold(0.0) { acc, car -> acc + car.mileage }
    return totalMileage
}
