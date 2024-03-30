package com.example.cursoplatzidiseosoftwareappmoviles

class RemoteDependencyMock : RemoteDependency {
    override fun getCoursesList(): List<Course> {
        return arrayListOf()
    }
}