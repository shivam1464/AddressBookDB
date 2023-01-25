package com.example.addressbook.requests
import com.example.addressbook.dataclasses.*
import java.util.*
import kotlin.random.Random

data class ContactCreateRequest(
    val fname: String,
    val lname: String
)


//data class AddressCreateRequest(
//    val fname: String,
//    val lname: String
//)
//
//data class EmailCreateRequest(
//    val fname: String,
//    val lname: String
//)
