package com.example.lesson9

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "colors")
data class Color(
    @PrimaryKey(autoGenerate = true) val _id: Int,
    val hex:String,
    val name:String
)

