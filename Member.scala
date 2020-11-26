class  Member {
  var name:String = "Divyansh"
  var age:Int=20
  var phone:Int=999999999
  var address:String="Indore"
  var salary:Int=5000000
  def printSalary(): Unit ={
    println(s"Salary: "+salary)
  }
}
 class Employee extends Member{
  var specialization:String="DS"
  def printDetails(): Unit ={
    println(s"Name: "+name)
    println(s"Age: "+age)
    println(s"Phone number: "+phone)
    println(s"Address: "+address)
    println(s"Salary: "+salary)
    println(s"Specialization: "+specialization)

  }
}
class Manager extends Member{
  var department:String ="TECH"
  def printDetails(): Unit ={
    println(s"Name: "+name)
    println(s"Age: "+age)
    println(s"Phone number: "+phone)
    println(s"Address: "+address)
    println(s"Salary: "+salary)
    println(s"Department: "+department)

  }
}
object company{
  def main(args:Array[String]): Unit ={
    println("EMPLOYEE")
    val ob2 = new Employee()
    ob2.printDetails()
    println("MANAGER")
    val ob1 = new Manager()
    ob1.name = "Riya"
    ob1.age = 19
    ob1.phone = 999999999
    ob1.address = "Indore NX"
    ob1.salary = 7000000
    ob1.department = "Technical"
    ob1.printDetails()

  }
}
