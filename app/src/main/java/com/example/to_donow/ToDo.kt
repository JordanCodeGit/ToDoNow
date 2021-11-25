package com.example.to_donow

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class todo (
    val chores: String
): Parcelable