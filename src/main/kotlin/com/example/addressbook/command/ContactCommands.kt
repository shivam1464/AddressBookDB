package com.example.addressbook.command
import com.example.addressbook.entrypoints.addContactEntrypoint
import com.example.addressbook.repo.Contacts.addContact
import com.example.addressbook.repo.Contacts.addPhone
import com.example.addressbook.requests.ContactCreateRequest
import com.example.addressbook.requests.PhoneCreateRequest
import com.example.addressbook.responses.ContactResponse
import com.example.addressbook.responses.PhoneResponse
import java.util.*

class AddContactCommand(
    private val contact: ContactCreateRequest
): ICommand{
    override fun execute() : ContactResponse{
        val rs = addContact(contact)
        return rs
    }
}

class AddPhoneCommand(
    private val phone: PhoneCreateRequest
): ICommand{
    override fun execute() : PhoneResponse {
        val rs = addPhone(phone)
        return rs
    }
}
