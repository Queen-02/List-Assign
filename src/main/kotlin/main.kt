fun main(){
    //Qsn One
    println(evenIndices(listOf("James", "Purity", "mall", "market", "Add", "Andy", "Bus", "Nissan", "Asap", "Rocky")))

    //Qn two
   heightOfPeople(listOf(1.55, 1.05, 1.20, 1.63, 1.70))

    //Qn three
    var a = Person("Mary", 56, 16.5,65.0)
    var b = Person("Alan", 26, 16.2,54.5, )
    var c = Person ("Odero", 28, 15.0,64.3)
    var d = Person("Oluoch", 24, 17.2,65.0)
    var person = mutableListOf<Person>(a,b,c,d)
    var sortedAge = person.sortedByDescending { onePerson -> onePerson.age }
    println(sortedAge)

    //Qn Four
    var e = Person("James", 15, 12.0, 50.0)
    var f = Person("Sam", 61, 15.0, 85.0)
    var person_two = mutableListOf<Person>(e,f)
    println(person_two.plus(person))

    //Qn Five
    var n = Car("Toyota", "Vitz", "KBA 937B", 68)
    var m = Car("Mercedece", "Benz", "KDZ 134B", 80)
    var carList = mutableListOf<Car>(n,m)
    println(vehicleList(carList))
}
//A function that prints out the even indices in a list of stings
fun evenIndices(names: List<String>): List<String> {
//   var evenNames = names.filter { name-> name.toInt()%2 ==0 }
//    return evenNames
    names.forEachIndexed { index, name ->
        if (index%2==0){
            println(name)
        }
    }
    return names
}

//A function that returns the average
// height and total height of people

fun heightOfPeople(people: List<Double>){
    var averageHeight = people.average()
    println(averageHeight)

    var totalHeight = people.sum()
   println(totalHeight)

}

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

data class Person(var name: String, var age: Int, var  height: Double, var weight: Double)

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

fun addPeople(persons: List<Person>): List<Person>{
    return persons
}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car (var make: String, var model: String, var registration: String, var millage: Int)
fun vehicleList(vehicle: List<Car>): Int{
    var car = 0
    vehicle.forEach { cars ->cars.millage
        car+=cars.millage
    }
    var avg = car/vehicle.count()
    return avg
}









































































