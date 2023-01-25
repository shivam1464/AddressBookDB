package com.example.addressbook.entrypoints

import com.example.addressbook.command.AddContactCommand
import com.example.addressbook.command.AddPhoneCommand
import com.example.addressbook.handlers.Handler.addContactHandler
import com.example.addressbook.handlers.Handler.addPhoneHandler
import com.example.addressbook.requests.*
import com.example.addressbook.responses.*

fun addContactEntrypoint(contact: ContactCreateRequest): ContactResponse {
    val cmd = AddContactCommand(contact)
    return addContactHandler(cmd)
}

fun addPhoneEntrypoint(phone: PhoneCreateRequest): PhoneResponse {
    val cmd = AddPhoneCommand(phone)
    return addPhoneHandler(cmd)
}

fun updateContactEntryPoint(){}
fun updatePhoneEntryPoint(){}
fun deleteContactEntryPoint(){}
fun deletePhoneEntryPoint(){}
fun searchContactByContactIdEntryPoint(){}
fun searchContactByNameEntryPoint(){}
fun listAllContactsEntryPoint(){}


fun createGroupEntryPoint(){}
fun updateGroupEntryPoint(){}
fun deleteGroupEntryPoint(){}
fun addContactInGroupEntryPoint(){}
fun removeContactFromGroupEntryPoint(){}
fun viewAllGroups(){}
fun viewPersonsInGroup(){}
fun viewGroupsOfPersonEntryPoint(){}

