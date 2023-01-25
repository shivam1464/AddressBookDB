package tests

import com.example.addressbook.entrypoints.addContactEntrypoint
import com.example.addressbook.entrypoints.addPhoneEntrypoint
import com.example.addressbook.requests.PhoneCreateRequest
import com.example.addressbook.requests.PhoneType
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import setup.AppTest
import setup.connectToTestDatabase
import setup.resetDatabase

class PhoneTest : AppTest(){

    @Test
    fun `test add phone`(){

        val c1 = addContactEntrypoint(getDummyContact())
        val req = PhoneCreateRequest(
            c1.id,
            PhoneType.Home,
            "69"
        )
        val rs = addPhoneEntrypoint(req)
        println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
        println(rs)
    }
}