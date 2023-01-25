package com.example.addressbook.requests


enum class PhoneType {
    Home,
    Work,
    Others
}

data class PhoneCreateRequest(
    val contactId: Int,
    val type: PhoneType,
    val number: String
)