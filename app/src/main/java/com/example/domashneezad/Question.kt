package com.example.domashneezad

import androidx.annotation.StringRes

/*
class Question {

}*/
data class Question(@StringRes val textResId: Int, val answer:Boolean)
