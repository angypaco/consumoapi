package com.example.shoposapi.domain

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shoposapi.data.InfoApi
import kotlinx.coroutines.launch
import java.io.IOException

class LoginViewModel: ViewModel() {

    var LoginState: String by mutableStateOf("")
        private set

    init {
        getDataLogin("danielet16@hotmail.com", "PIpP0553v060")
    }

    fun getDataLogin(id: String, clave: String) {
        viewModelScope.launch {
            try {
                val loadData = InfoApi.retrofitApi.getDataUser(id, clave)
                LoginState = loadData
            } catch (e: IOException) {
                LoginState = e.toString()
            }
        }
    }
}