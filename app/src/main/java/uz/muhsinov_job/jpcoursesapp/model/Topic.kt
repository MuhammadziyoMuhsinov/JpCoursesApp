package uz.muhsinov_job.jpcoursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic (
    @StringRes val titleResourceId:Int,
    val numberOfCourses:Int,
    @DrawableRes  val imageResourceId:Int
)