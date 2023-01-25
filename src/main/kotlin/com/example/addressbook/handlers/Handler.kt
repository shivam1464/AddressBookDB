package com.example.addressbook.handlers

import com.example.addressbook.command.AddContactCommand
import com.example.addressbook.command.AddPhoneCommand
import com.example.addressbook.requests.ContactCreateRequest
import com.example.addressbook.responses.ContactResponse
import com.example.addressbook.responses.PhoneResponse

object Handler {
    fun addContactHandler(cmd : AddContactCommand) : ContactResponse = cmd.execute()
    fun addPhoneHandler(cmd : AddPhoneCommand) : PhoneResponse = cmd.execute()
}