package tests
import com.example.addressbook.requests.ContactCreateRequest
import com.example.addressbook.requests.PhoneCreateRequest
import com.example.addressbook.requests.PhoneType

fun getDummyContact(): ContactCreateRequest {
        val dummy = ContactCreateRequest(
                fname = "Shivam",
                lname = "Chavda",
                )
        return dummy
}

