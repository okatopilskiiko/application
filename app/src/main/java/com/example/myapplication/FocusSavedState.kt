package com.example.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class FocusSavedState(
        var isFocused: Boolean = false,
        var superState: Parcelable?
) : Parcelable