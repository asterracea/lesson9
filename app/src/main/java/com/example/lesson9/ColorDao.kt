package com.example.lesson9

import androidx.room.*

@Dao
interface ColorDao {
    @Query("SELECT * FROM colors")
    fun getAll(): Array<Color>
    @Insert
    fun insert(vararg color: Color)
    @Update
    fun update(color: Color)
    @Delete
    fun delete(color: Color)
}