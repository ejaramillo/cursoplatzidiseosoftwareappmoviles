package com.example.cursoplatzidiseosoftwareappmoviles

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ClassViewModel(val coursesRepository: CoursesRepository) : ViewModel() {

    private var _course = MutableStateFlow<Course>(Course("", ""))
    val course: StateFlow<Course> = _course

    fun getCourses() {
        try {
            coursesRepository.getCourses().map {
                _course.value = it
            }
        } catch (exception: Exception) {
            _course.value = Course("", "")
        }
    }
}