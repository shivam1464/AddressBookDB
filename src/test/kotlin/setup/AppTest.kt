package setup

import com.example.addressbook.dataclasses.Context
import org.junit.jupiter.api.BeforeAll

open class AppTest{
    companion object{
        lateinit var ctx: Context

        @JvmStatic
        @BeforeAll
        fun setUp(){
            val db = connectToTestDatabase()
            ctx = Context(db)
            resetDatabase()
        }
    }
}