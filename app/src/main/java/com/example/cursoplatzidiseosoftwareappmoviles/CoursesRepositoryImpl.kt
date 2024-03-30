package com.example.cursoplatzidiseosoftwareappmoviles

class CoursesRepositoryImpl(
    val databaseDependency: DatabaseDependency,
    val remoteDependency: RemoteDependency
) : CoursesRepository{
    override fun getCourses(): List<Course> {
        if(remoteDependency.getCoursesList().isEmpty()){
            if(databaseDependency.coursesList.isNotEmpty()){
                return databaseDependency.coursesList
            }
        } else{
            return remoteDependency.getCoursesList()
        }
        throw Exception("We don't have data yet")
    }

}