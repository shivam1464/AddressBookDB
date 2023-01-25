package setup

import AddressTable
import ContactsTable
import EmailTable
import GroupContactLinkTable
import GroupsTable
import PhoneTable
import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.transactions.transaction


    internal fun connectToTestDatabase(): Database =
        Database.connect(
            HikariDataSource().apply {
                jdbcUrl = "jdbc:mysql://localhost:3306/addressbook"
                username = "shivam"
                password = "password"
                isAutoCommit = false
                maximumPoolSize = 5
            }
        )

    val schema = listOf<Table>(
        ContactsTable,
        EmailTable,
        PhoneTable,
        AddressTable,
        GroupsTable,
        GroupContactLinkTable
    )

    internal fun resetDatabase() {
        transaction {
            schema.reversed().forEach{
                SchemaUtils.drop(it)
            }

            schema.forEach{
                SchemaUtils.create(it)
            }
        }
    }



