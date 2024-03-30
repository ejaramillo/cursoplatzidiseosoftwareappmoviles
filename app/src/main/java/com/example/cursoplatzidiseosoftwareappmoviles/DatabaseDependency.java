package com.example.cursoplatzidiseosoftwareappmoviles;

import java.util.List;

public interface DatabaseDependency {
    void saveCoursesList(List<Course> coursesList);
    List<Course> getCoursesList();
}
