package com.example.pencarianbengkeldantambalban.data.model.nearby

import com.google.gson.annotations.SerializedName

class ModelResults {


    @SerializedName("geometry")
    lateinit var modelGeometry: ModelGeometri

    @SerializedName("name")
    lateinit var name: String

    @SerializedName("vicinity")
    lateinit var vicinity: String

    @SerializedName("place_id")
    lateinit var placeId: String

    @SerializedName("rating")
    var rating = 0.0
}