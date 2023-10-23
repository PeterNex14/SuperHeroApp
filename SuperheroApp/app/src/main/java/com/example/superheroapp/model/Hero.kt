package com.example.superheroapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val title : Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)
