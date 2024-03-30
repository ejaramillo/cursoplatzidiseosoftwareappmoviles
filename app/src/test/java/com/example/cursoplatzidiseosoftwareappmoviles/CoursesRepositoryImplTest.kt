package com.example.cursoplatzidiseosoftwareappmoviles

import org.junit.Before
import org.junit.Test

class CoursesRepositoryImplTest {
    lateinit var coursesRepositoryImpl: CoursesRepositoryImpl
    lateinit var databaseDependency: DatabaseDependencyMock
    lateinit var remoteDependency: RemoteDependencyMock

    @Before
    fun setup() {
        databaseDependency = DatabaseDependencyMock()
        remoteDependency = RemoteDependencyMock()
        coursesRepositoryImpl = CoursesRepositoryImpl(
            databaseDependency = databaseDependency,
            remoteDependency = remoteDependency
        )
    }

    @Test
    fun `Test Get Courses List Without Connection`() {
        val coursesList = coursesRepositoryImpl.getCourses()
        assert(coursesList.isNotEmpty())
    }
}
