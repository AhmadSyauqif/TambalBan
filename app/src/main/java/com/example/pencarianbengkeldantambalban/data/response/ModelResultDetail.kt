package com.example.pencarianbengkeldantambalban.data.response

import com.example.pencarianbengkeldantambalban.data.model.details.ModelDetails
import com.google.gson.annotations.SerializedName

class ModelResultDetail {
    @SerializedName("result")
    lateinit var modelDetail: ModelDetails
}