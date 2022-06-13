package com.dicoding.tanyahukum.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dicoding.tanyahukum.data.api.ApiConfig
import com.dicoding.tanyahukum.data.model.AllData
import com.dicoding.tanyahukum.data.model.ListData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {
    val listUsers = MutableLiveData<ArrayList<ListData>>()

    fun setSearchUser(query: String){
        ApiConfig.getApiService()
            .getDataSearch(query)
            .enqueue(object : Callback<AllData> {
                override fun onResponse(call: Call<AllData>, response: Response<AllData>) {
                    if (response.isSuccessful){
                        listUsers.postValue(response.body()?.items)
                    }
                }

                override fun onFailure(call: Call<AllData>, t: Throwable) {
                    Log.d("Failure", t.message.toString())
                }

            })
    }

    fun getSearchUsers(): LiveData<ArrayList<ListData>> {
        return listUsers
    }
}