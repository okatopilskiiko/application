package com.example.myapplication

import android.content.Context
import android.os.Parcelable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

open class BaseButton : AppCompatButton {

    @JvmOverloads
    constructor(context: Context, attrs: AttributeSet? = null) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onSaveInstanceState(): Parcelable? {
        val superState = super.onSaveInstanceState()
        return FocusSavedState(isFocused, superState)
    }

    override fun onRestoreInstanceState(state: Parcelable) {
        super.onRestoreInstanceState((state as FocusSavedState).superState)
        if (state.isFocused) {
            requestFocus()
        }
    }

}