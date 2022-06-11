package com.dicoding.tanyahukum.ui.listview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dicoding.tanyahukum.data.model.AllData

class JenisPeraturanViewModel : ViewModel() {
    val listAllData = MutableLiveData<ArrayList<AllData>>()

    fun getAllData(): LiveData<ArrayList<AllData>> {
        return listAllData
    }
}