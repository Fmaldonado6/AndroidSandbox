package com.fmaldonado.sandbox

import android.app.Activity
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import kotlinx.parcelize.Parcelize
import kotlin.reflect.KClass

@Parcelize
data class Projects(
    val projectName: String,
    val projectActivity: Class<*>
) : Parcelable

enum class ParcelableKeys {
    ProjectName
}
