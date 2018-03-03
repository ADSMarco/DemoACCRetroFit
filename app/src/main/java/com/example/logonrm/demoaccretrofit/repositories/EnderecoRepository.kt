package com.example.logonrm.demoaccretrofit.repositories

import android.arch.lifecycle.LiveData
import com.example.logonrm.demoaccretrofit.entities.EnderecoResponse

interface EnderecoRepository {

    fun buscarEndereco(cep: String):
            LiveData<EnderecoResponse>


}
