fun main(){
    //Qsn One
    println(evenIndices(listOf("James", "Purity", "mall", "market", "Add", "Andy", "Bus", "Nissan", "Asap", "Rocky")))

    //Qn two
   heightOfPeople(listOf(1.55, 1.05, 1.20, 1.63, 1.70))

    //Qn three
    var a = Person("Mary", 56, 16.5,65.0)
    var b = Person("Alan", 26, 16.2,54.5, )
    var c = Person ("Odero", 28, 15.0,64.3)
    var d = Person("OLuoch", 24, 17.2,65.0)
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











































































