package com.example.lesson9

import androidx.room.Entity

@Entity(tableName = "colors")
data class Color(
    val hex:String,
    val name:String
)

