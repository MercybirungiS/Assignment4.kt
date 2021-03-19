
import java.util.*

fun main() {
fruits("Oranges","Apples","Watermelon","Grapes")
    capitalCities()
    digits()
    println(Arrays.toString(nameOfarray("Mercy","Hope","Anita") ) )

}
fun fruits(a:String,b:String,c:String,d:String ){
    var fruitNames = arrayOf (a,b,c,d)
    println(Arrays .toString(fruitNames ) )
}
fun capitalCities(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    cities .forEach { city->
        println(city.capitalize() ) // capitalizing the first letter in each string
    }
}
fun digits(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var number= numbers.get (1) + numbers .get(4)
    println( number )
     println(numbers.indexOf(158) )

    println(Arrays .toString(numbers .sortedArray () )) // arranging string in alphabetical order
}
fun nameOfarray( name1:String ,name2:String,name3:String ):Array<String>{
    return arrayOf(name1 ,name2 ,name3 )
}





