/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    
    val sample1: Byte = 0x3A
    var sample2: Byte = 58
    var heartRate: Int = 85
    var deposits: Double = 135002796.0
	val acceleration: Float = 9.800F
    var mass: Float = 14.6F
	var distance: Double = 129.763001
	var lost: Boolean = true
	var expensive: Boolean = true
	var choice: Int = 2
	val integral: Char = '∫'
    val greeting: String = "Hello"
    var name: String = "Karen"
    
    //Compare sample1 to sample2 and if they are equal display â??The samples are equal.â?? 
    //otherwise display â??The samples are not equal.â??
    if(sample1 == sample2) {
        println("The samples are equal.")
    } else {
        println("The samples are not equal.")
    }
    
    //If heartRate is greater than equal to 40 and less than equal to 80 display 
    //â??Heart rate is normal.â?? otherwise display â??Heart rate is not normal.â??
    if (heartRate >= 40 && heartRate <= 80) {
        println("Heart rate is normal.")
    } else {
        println("Heart rate is not normal.")
    }
    
    //If deposits is greater than or equal to 100000000 display â??You are exceedingly wealthy.â?? 
    //otherwise display â??Sorry you are so poor.â??
    if (deposits >= 100000000) {
        println("You are exceedingly wealthy.")
    } else {
        println("Sorry you are so poor.")
    }
    
    //Declare a variable called force that is assigned to the mass times the acceleration. 
    //The force variable must be of the same type as the type that results 
    //from the multiplication of mass and acceleration.
    var force: Float = (mass * acceleration)
    
    //Display the calculated force preceded by the string â??force = â??. 
    //The output should look like the following (actual value will be different)
    //: force = 2.345
    println("force = $force")
    
    //Display the value of distance followed by â?? is the distance.â??
	println("$distance is the distance.")
    
    //Using lost and expensive display â??I am really sorry! I will get the manager.â?? 
    //if lost and expensive are both true and â??Here is coupon for 10% off.â?? 
    //if lost is true and expensive is false.
	if (lost == true && expensive == true) {
        println("I am really sorry! I will get the manager.")
    } else if (lost == true && expensive == false) {
		println("Here is a coupon for 10% off.")        
    }
    
    //Use the Kotlin â??whenâ?? expression and the variable choice to display â??You chose 1.â?? 
    //if choice is 1, â??You chose 2.â?? if choice is 2, â??You chose 3.â?? if choice is 3, and 
    //â??You made an unknown choice.â?? if choice is something other than 1, 2, or 3.
    when(choice) {
        1,2,3	->	println("You chose $choice.")
        else	->	println("You made an unknown choice.")
    }
    
    //Using the character constant integral, display the character in integral 
    //followed by the string â?? is an integral.â??
    println("$integral is an integral.")
    
    //Using a â??forâ?? loop count from 5 to 10 (inclusive of start and end) 
    //using an integer variable i. Inside the loop display each value of i 
    //with a line that is â??i = â?? followed by the value of i as in: i=5 i=6 i=7 i=8 i=9 i=10
    for(i in 5..10) {
        println("i = $i")
    }
    
    //Declare an integer variable age with an initial value of 0. 
    //Using a â??whileâ?? loop that continues while age is less than 6 
    //display the value of age in a line that begins with â??age = â?? 
    //and is followed by the value of age. (Example: age = 3) 
    //After the age line is displayed increment the value of age by 1.
    var age: Int = 0
    while(age < 6) {
        println("age = $age")
        age++
    }
    
    //Display a line that contains the greeting string followed by a space 
    //followed by the name string.
    println("$greeting $name")
    
}
