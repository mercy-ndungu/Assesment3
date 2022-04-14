fun main() {
    var m = CurrentAccount("3456qw23", "Mercy Kirigo", 2000.00)
   println(m.deposit(200.00))
println(m.withdrawal(400.00))
    println(myIndexes("banana"))
    var save = SavingsAccount("", "", 5000.00,3 )
    println(save.withdrawal())
    var c=Product("handkerchief", 5, 30, "hygiene")
    var d=Product("cabbage",15,50,"groceries")
    var e=Product("nails",200,1000,"other")
println(listOf(c, d, e))
}
/*Create a class CurrentAccount with the following attributes: account
number, account name, balance. It has the following functions:
a. deposit(amount: Double) - Increments the balance by the
amount deposited
b. withdraw(amount: Double) - Decrements the balance by the
amount withdrawn
c. details() - Prints out the account number and balance and
name in this format: “Account number x with balance y is
operated by z”*/
open class CurrentAccount( var accountNumber: String, var accountName: String, var balance: Double){
open fun deposit(amount:Double){

    balance+=amount
    println(balance)


}
    fun withdrawal(amount:Double){
var t = balance-amount
        println(t)

    }
    fun details(){
println("Account number $accountNumber  with $balance is operated by $accountName")
    }
}
/*Create another class SavingsAccount. It has the same functions and
attributes as the current account except for one attribute,
withdrawals: Int. Withdrawals is a counter variable that is used to
keep track of how many withdrawals have been made from the account
in a year. The only other difference is that the savings account
withdraw() method first checks if the number of withdrawals is less
than 4 for it to allow one to withdraw money from the account. It also
increments the withdrawals attribute after a successful withdrawal
(5points)*/
class SavingsAccount(var accountNumber: String, var accountName: String, var balance: Double, var withdrawals:Int){
    fun withdrawal(){
        if(withdrawals<4 ){
            withdrawals++
            println("Withdrawal is now $withdrawals")
        }
        else{
            println("withdrawal not successful.")
        }

    }

}
/*A product is represented by a data class with these attributes: name,
weight, price, category. Category can either be groceries, hygiene or
other. Write a function that takes in a product and uses a when
statement to assign each product to a list based on its category*/
fun myProducts(product: Product){
var hygienelst= mutableListOf<Product>()
    var grocerieslst = mutableListOf<Product>()
    var otherlst = mutableListOf<Product>()
    when(product.category){
        "groceries"-> hygienelst.add(product)
        "hygiene"->grocerieslst.add(product)
        "other"->otherlst.add(product)
                }
                println( listOf(product))

            }


data class Product(var name: String,var weight: Int, var price:Int, var category:String){

}


/*Write a function that given a string returns a string composed of only
the characters in even indices. For example given “banana” it will return
“bnn”*/
fun myIndexes(fruit:String):String{
    var tunda = ""
    fruit.forEachIndexed { index, c ->
        if (index%2==0)
            tunda+=c
    }
    return tunda
}