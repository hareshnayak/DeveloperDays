import java.util.*;
/*
 Developer Days 

Kotlin 
Features
	- statically typed
	- interconvertable with java
	- safe and consice to use
    
Variables 
	- var : used for non constants(can alter)
    - val : used for constant(cannot alter)
    
    - Infered typing(Used in Kotlin)
    	- datatype not mandatory to mention
        - e.g. var a = 0
        - e.g. var b : Int = 1
        - e.g. var name : String = "Haresh"
    - Manifest typing(Not used in Kotlin)
    	- means explicitly defining the datatype
        - e.g. int a = 0 
        
Printing variable
	- print() : without line break
    - println() : with line break
    - println("<variable>")
    - println("$<variable>" + "$<variable1>") : concatination
    - pintln("$<variable> $<variable1>") : no need of concatination
    
Taking input
	- Kotlin
  		- var name = readLine()!! 
        	- readLine() : takes input and stores in name
            - !! : ensures non-null 
            - if "!!" is missed "name" will be initially null
    
     - import java.util.*
    	- var read = Scanner(System.`in`)
        	- creates instance of Scanner method
        - var age = read.nextInt()
        	- nextInt() : takes input as Int
            - nextFloat() : takes input as Float
            - nextDouble() : takes input as Float
            - nextLine() : takes input as String
If else
	- Kotlin returns value in if else
    	- if(condition){
        		expression is returned
        	}
            else{
            	expression is returned
            }
        - hence it can be used as ternery operator
        	- var olderAge = if(age1>age2) age1 else age2
            
when() (Switch case)
	- when(num){
    	1 -> println("one")
        in 2..10 -> println("between 2 and 10")
        in 11..20 -> println("between 11 and 20")
        else ->{
        	println("not in range")
        }
        
    	- "in 2..10" is inclusive range 
        - use exactly 2 dots
        
Loops (for)
	- for (<variable> in <List>){
    	println(<variable>)
    	}
    - for((<variable1, variable2> in <List>)){
    		println($<variable1> $<variable2>)
    	}
Array
	- var friends = arrayOf<String>("Himesh", "Parv")
    - pick element
    	- friends[0], friends[1]
    - traverse
    	- for (name in friends){
        	println("${name}")
        	}
        - for((index, name) in friends.withIndex()){
        	println("$index $name")
        	}

Functions 
	- fun <nameOfFunction>(args: ){
    		<expression>
    	}
    - e.g. 
    	fun sum(a: Int, b:Int){
        	var s : Int = a+b
            println(s)
        }
   	- e.g. 
    	fun returnSum(a: Int, b:Int) : Int{
        	return a+b
        }
        
    - This type of agruement writing is called Pascals Method
    - <name of arguement> : <data type>
 */

// Entery point of Kotlin program
fun main() {
    print("Hello, ")
    println("world!!!") // gives line break
    println("Hi Haresh")
        
    var fname = "Haresh"
    var lname : String = "Nayak"
    var age = 2
 	  println("Name : ${fname} ${lname} \nAge : ${age}")
    
	  var read = Scanner(System.`in`)
    var fullname = read.nextLine()
    println("Full name entered : ${fullname}")
    
 	  when(age){
    	1 -> println("age is one")
        in 2..10 -> println("age between 2 and 10")
        in 11..20 -> println("age between 11 and 20")
        else ->{
        	println("age not in range")
        }
    }
    
    var friends = arrayOf<String>("Himesh", "Parv", "Himanshu", "Kashish")   
    var nums = arrayOf<Int>(1,3,4,4)
    
    for (name in friends){
        println("${name}")
    }
    
    println()
    
    for((index, name) in friends.withIndex()){
        println("${index+1} $name")
    }
}
