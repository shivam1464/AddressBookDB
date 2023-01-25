package com.example.addressbook.repo

import ContactsTable
import PhoneTable
import com.example.addressbook.requests.ContactCreateRequest
import com.example.addressbook.requests.PhoneCreateRequest
import com.example.addressbook.responses.ContactResponse
import com.example.addressbook.responses.PhoneResponse
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction
import java.util.UUID


fun ResultRow.toContactResponse() =
    ContactResponse(
        id = this@toContactResponse[ContactsTable.cid],
        fname = this@toContactResponse[ContactsTable.first_name],
        lname = this@toContactResponse[ContactsTable.last_name]
    )

fun ResultRow.toPhoneResponse() =
    PhoneResponse(
        cid = this@toPhoneResponse[PhoneTable.cid],
        pid = this@toPhoneResponse[PhoneTable.cid],
        type = this@toPhoneResponse[PhoneTable.type],
        number = this@toPhoneResponse[PhoneTable.number]
    )

object Contacts{
    fun addContact(contact: ContactCreateRequest): ContactResponse{
        val result = transaction {
            ContactsTable.insert {
                it[this.first_name] = contact.fname
                it[this.last_name] = contact.lname
            }.resultedValues!!.first().toContactResponse()
        }
//        println("-8-8-8-8-8-8-8-8-8-8-8-8-8-8-8-8-8-8-")
//        println(result)
        return result
    }

    fun addPhone(phone: PhoneCreateRequest) : PhoneResponse{
        val result = transaction {
            PhoneTable.insert {
                it[this.cid] = phone.contactId
                it[this.type] = phone.type
                it[this.number] = phone.number
            }.resultedValues!!.first().toPhoneResponse()
        }
        return result
    }
}