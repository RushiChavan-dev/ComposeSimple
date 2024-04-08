package com.example.exampledemo.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.exampledemo.Agents
import com.example.exampledemo.DataItem
import com.example.exampledemo.network.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityViewModel : ViewModel() {

    private val _agentsData :MutableStateFlow<List<DataItem>> = MutableStateFlow(listOf())
    val agentData :StateFlow<List<DataItem>> = _agentsData

    init{
        retrieveData()

    }

    private fun retrieveData(){

        val call :Call<Agents>  =RetrofitInstance.apiService.getAll()

        call.enqueue(object :Callback<Agents> {
            override fun onResponse(p0: Call<Agents>, p1: Response<Agents>) {
                if(p1.isSuccessful){
                    val responseData : List<DataItem?>? = p1.body()?.data
                    if(responseData != null){
                        _agentsData.value = responseData.filter { dataItem -> dataItem?.role?.displayName != null } as List<DataItem>
                    }

                }

            }

            override fun onFailure(p0: Call<Agents>, p1: Throwable) {

                Log.d("Fail","Network Error")

            }

        })
    }


}