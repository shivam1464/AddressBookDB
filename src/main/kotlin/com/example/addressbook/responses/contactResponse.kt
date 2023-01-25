package com.example.addressbook.responses

import com.example.addressbook.requests.PhoneType

data class ContactResponse(
    val id: Int,
    val fname: String,
    val lname: String,
)

data class PhoneResponse(
    val cid : Int,
    val pid: Int,
    val type: PhoneType,
    val number: String
)