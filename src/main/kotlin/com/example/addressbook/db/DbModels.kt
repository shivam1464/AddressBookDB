import GroupContactLinkTable.autoIncrement
import com.example.addressbook.requests.PhoneType
import org.jetbrains.exposed.sql.Table

object ContactsTable : Table("contact_table") {
    val cid = integer("cid").autoIncrement()
    val first_name = varchar("first_name", 50)
    val last_name = varchar("last_name", 50)

    override val primaryKey = PrimaryKey(cid, name = "PK_Contact_Id")
}

object PhoneTable : Table("phone_table") {
    val pid = integer("pid").autoIncrement()
    val cid = integer("cid").references(ContactsTable.cid)
    val type = enumerationByName<PhoneType>("type", 7)
    val number = varchar("number", 50)

    override val primaryKey = PrimaryKey(pid, name = "PK_Phone_Id")
}

object EmailTable : Table("email_table") {
    val eid = integer("eid").autoIncrement()
    val cid = integer("cid").references(ContactsTable.cid)
    val type = varchar("type",10)
    val emailId = varchar("email_id", 50)

    override val primaryKey = PrimaryKey(eid, name = "PK_Email_Id")
}

object AddressTable : Table("address_table") {
    val aid = integer("aid").autoIncrement()
    val cid = integer("cid").references(ContactsTable.cid)
    val type = varchar("type",10)
    val address = varchar("address", 50)

    override val primaryKey = PrimaryKey(aid, name = "PK_Address_Id")
}

object GroupsTable : Table("group_table") {
    val gid = integer("gid").autoIncrement()
    val g_name = varchar("g_name", 50)

    override val primaryKey = PrimaryKey(gid, name = "PK_Group_Id")
}

object GroupContactLinkTable : Table("linker_table") {
    val id = integer("id").autoIncrement()
    val cid = integer("cid").references(ContactsTable.cid)
    val gid = integer("gid").references(GroupsTable.gid)

    override val primaryKey = PrimaryKey(id, name = "PK_ContactGroupLink_Id")
}