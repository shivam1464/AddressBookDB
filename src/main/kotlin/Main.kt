//import com.example.addressbook.connectToTestDatabase
//import com.example.addressbook.dataclasses.Address
//import com.example.addressbook.dataclasses.Email
//import com.example.addressbook.dataclasses.Phone
//import com.example.addressbook.entrypoints.addContactEntrypoint
//import com.example.addressbook.requests.ContactCreateRequest
//import com.example.addressbook.resetDatabase
//
//fun main(args: Array<String>) {
//
//    connectToTestDatabase()
//    resetDatabase()
//
//    val req = addContactEntrypoint(ContactCreateRequest(
//        fname = "Shivam",
//        lname = "Chavda",
//        emails = listOf(
//            Email("Home", "shivam@gmail.com"),
//            Email("Office", "vayana@gmail.com")
//        ),
//        phones = listOf(
//            Phone("personal","7405222732"),
//            Phone("work", "7878787878")
//        ),
//        addresses = listOf(
//            Address("home", "undera"),
//            Address("work", "alkapuri")
//        )))
//
//}
