package com.example.pencarianbengkeldantambalban.data.model.details

import com.example.pencarianbengkeldantambalban.data.model.nearby.ModelGeometri as ModelGeometry1
import com.google.gson.annotations.SerializedName

class ModelDetails {
    @SerializedName("geometry")
    lateinit var modelGeometry: ModelGeometry1

    @SerializedName("opening_hours")
    lateinit var modelOpening: ModelOpening

    @SerializedName("name")
    lateinit var name: String

    @SerializedName("formatted_phone_number")
    lateinit var formatted_phone_number: String

    @SerializedName("rating")
    var rating = 0.0
}