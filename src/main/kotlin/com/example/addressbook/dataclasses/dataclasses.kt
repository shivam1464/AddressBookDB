package com.example.addressbook.dataclasses

import org.jetbrains.exposed.sql.Database
import java.util.*

data class Context(
    val db : Database
)

//
//
//data class Contact(
////    val id: Int,
//    val fname: String,
//    val lname: String,
//)
//data class Phone(
//    val type: PhoneType,
//    val number: String
//)
//data class Group(
//    val id: Int,
//    val gpname: String,
//    val members: MutableList<UUID>
//)
//

//data class Email(
//    val type: String,
//    val emailid : String
//)
//
//data class Address(
//    val type: String,
//    val detail : String
//)

