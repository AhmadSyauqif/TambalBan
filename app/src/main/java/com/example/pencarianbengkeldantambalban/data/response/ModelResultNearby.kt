package com.example.pencarianbengkeldantambalban.data.response

import com.example.pencarianbengkeldantambalban.data.model.nearby.ModelResults
import com.google.gson.annotations.SerializedName

class ModelResultNearby {
    @SerializedName("results")
    lateinit var modelResults: List<ModelResults>
}