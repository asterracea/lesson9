package com.example.lesson9

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ColorDao {
    @Query("SELECT * FROM colors")
    fun getAll(): Array<Color>
    @Query("SELECT * FROM colors WHERE name = :name")
    fun getColorByName(name: String): LiveData<Color>
    @Query("SELECT * FROM colors WHERE hex_color = :hex")
    fun getColorByHex(hex: String): LiveData<Color>

    @Insert
    fun insert(vararg color: Color)
    @Update
    fun update(color: Color)
    @Delete
    fun delete(color: Color)
}