package tests

import com.example.addressbook.entrypoints.addContactEntrypoint
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import setup.AppTest
import setup.connectToTestDatabase
import setup.resetDatabase

class ContactTest : AppTest(){

    @Test
    fun `test add contact`(){
        val req = getDummyContact()
        val rs = addContactEntrypoint(req)

        Assertions.assertEquals("Shivam", rs.fname)
        Assertions.assertEquals("Chavda", rs.lname)
    }


}