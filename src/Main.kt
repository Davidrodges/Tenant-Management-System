
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


=======
fun main() {

    println("Hello World")

    println("--------------------------------------------------------------")
    println("--------------------------------------------------------------")
    println("-------Welcome to the Tenant Management System----------------")
    println("--------------------------------------------------------------")
    println("--------------------------------------------------------------")

    // PART 1 — Variables

    val tenantId: Int = 1001
    val tenantName: String = "Jane Wanjiku"
    val phoneNumber: String = "0712345678"
    val houseNumber: String = "A-204"
    val monthlyRent: Int = 25000
    var amountPaid: Int = 15000

    println("Amount paid before: $amountPaid")

    amountPaid += 5000

    println("Amount paid after: $amountPaid")


    // PART 2 — Data Types

    val block: Char = 'A'
    val isActive: Boolean = true

    val rentAsDouble: Double = monthlyRent.toDouble()

    println("Rent as double: $rentAsDouble")

    val registrationNumber: Long = 999_999_999

    println("Registration number: $registrationNumber")


    // PART 3 — Strings

    // Task 3.1 - String concatenation
    println(tenantName + " lives in house " + houseNumber)

    // Task 3.2 - String template
    println("$tenantName lives in house$houseNumber")

    // Task 3.3 - Template expression
    println("Total rent for 6 months: KES ${monthlyRent * 6}")

    // Task 3.4 - Triple-quoted string
    println(
        """ 
        ===== RENT RECEIPT ===== 
        Tenant: $tenantName 
        House: $houseNumber 
        Paid: KES $amountPaid 
        """.trimIndent()
    )

    // Task 3.5 - String functions
    val greeting = "Dear Tenant"
    println(greeting.uppercase())


    // CLASS WORK — Rent Payment

    var tenantSalary = 30000
    var rentpayable = 50000
    var rentpaid = 20000

    val hasPaid: Boolean = rentpaid >= rentpayable

    println("Has paid in full: $hasPaid")

    if (hasPaid) {
        println("Thank you for your payment")
    } else {
        val monthArrear = 2

        when (monthArrear) {
            0 -> println("You need to clear your balance of ${rentpayable - rentpaid}")
            1 -> println("1 month in arrears. Balance: KES ${rentpayable - rentpaid}")
            2 -> println("2 months in arrears. Balance: KES ${rentpayable - rentpaid}")
            3 -> println("3 months in arrears. Balance: KES ${rentpayable - rentpaid}")
            else -> println("Critical arrears! Balance: KES ${rentpayable - rentpaid}")
        }

        // Tenant List
        val tenantNames: MutableList<String> = mutableListOf("Salome", "Mark", "Maria")
        tenantNames.add("Jane")

        println("Second tenant: ${tenantNames[1]}")

        for (tenant: String in tenantNames) {
            println(tenant)
        }
    }

}
    // Task 4.1
    val balance = monthlyRent - amountPaid
    println("Balance: KES $balance")

// Task 4.2
    val percentPaid = (amountPaid / monthlyRent) * 100
    println("Paid: $percentPaid%")

    val percentPaidCorrect = (amountPaid.toDouble() / monthlyRent) * 100
    println("Paid: ${percentPaidCorrect.toInt()}%")

// Task 4.3
    val instalment = 6000
    val rent = 25000

    val fullInstalments = rent / instalment
    val remainingAmount = rent % instalment

    println("Full instalments: $fullInstalments")
    println("Remaining amount: KES $remainingAmount")

// Task 4.4
    val totalRent = monthlyRent.times(6)
    println("Total rent: KES $totalRent")

// Task 4.5
    val isRentPaid = amountPaid >= monthlyRent
    println("Is rent paid? $isRentPaid")

// Task 4.6
    val monthsInArrears = 2
    val needsReminder = balance > 0 && monthsInArrears > 1

    println("Needs reminder: $needsReminder")                                  output                                                                                   Balance: KES 5000
    Paid: 0%
    Paid: 80%
    Full instalments: 4
    Remaining amount: KES 1000
    Total rent: KES 150000
    Is rent paid? false
    Needs reminder: true