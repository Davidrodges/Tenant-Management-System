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