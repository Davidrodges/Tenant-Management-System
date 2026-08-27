//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//   println("Hello World!")


    println("-------------------------------------------------------------------")
    println("--------------Welcome to the Tenant Management System--------------")
    println("-------------------------------------------------------------------/n")

    println("---------Tenant One--------")


    val tenantName = "Jane Wanjiku"
    val phoneNumber = "+57586979"
    var tenantSalary = 25000
    var rentPayable =  30000
    var rentPaid = 10000
    var hasPaid: Boolean = true
    var balance = rentPayable - rentPaid
    var tenantStatus = "Active"

    println("Tenant Name: $tenantName")
    println("Tenant Number:" + "" + phoneNumber)
    println("Tenant Salary:" + tenantSalary)

    if (balance == 0){
        println("Your rent is fully paid")
    }else{
        println("You have an outstanding balance $balance")
    }

//    if(tenantStatus == "Active"){
//        println("Your tenant status is active")
//    }else if (tenantStatus == "Inactive"){
//        println("Your tenant status is inactive")
//
//    }else if (tenantStatus == "Pending"){
//        println("Your tenant status is pending")
//    }else{
//        println("Your tenant status is unknown")
//    }


    when (tenantStatus) {
        "Active" -> println("You are in active")
        "Inactive" -> println("You are in inactive")
        "Pending" -> println("You are in pending")
    }


}