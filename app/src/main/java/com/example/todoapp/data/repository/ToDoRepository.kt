package com.example.todoapp.data.repository

import androidx.lifecycle.LiveData
import com.example.todoapp.data.ToDoDao
import com.example.todoapp.data.model.ToDoData

class ToDoRepository(private val toDoDao: ToDoDao) {

    val getAllData: LiveData<List<ToDoData>> = toDoDao.getAllData()

    suspend fun insertData(toDoData: ToDoData) {
        toDoDao.insertData(toDoData)
    }

    suspend fun updateData(toDoData: ToDoData) {
        toDoDao.updateData(toDoData)
    }

    suspend fun deleteItem(toDoData: ToDoData) {
        toDoDao.deleteItem(toDoData)
    }

    suspend fun deleteAll() {
        toDoDao.deleteAll()
    }

//    fun searchDatabase(searchQuery: String): List<ToDoData> {
//        return toDoDao.searchDatabase(searchQuery)
//    }
//
//    fun sortByHighPriority(): List<ToDoData> {
//        return toDoDao.sortByHighPriority()
//    }
//
//    fun sortByLowPriority(): List<ToDoData> {
//        return toDoDao.sortByLowPriority()
//    }
}