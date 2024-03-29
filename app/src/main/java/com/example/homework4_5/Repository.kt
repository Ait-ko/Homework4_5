package com.example.homework4_5

import android.util.Log
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {
    private val api = RetrofitVeiw().api
    fun getData(firstName: String, secondName: String): MutableLiveData<LoveModel> {
        val mutableLiveData = MutableLiveData<LoveModel>()

        api.getLovePerc(firstName, secondName).enqueue(object : Callback<LoveModel> {
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                if (response.isSuccessful) {
                    response.body()?.let { loveModel ->
                        mutableLiveData.postValue(loveModel)
                    }
                }
            }
            override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                Log.e("ololo", "onFailure: ${t.message}")
            }
        })
        return mutableLiveData
    }
}