package com.example.ooppractice.gradecalculator;

import java.util.List;
// 일급 콜렉션
public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {

        // 1. 반복문
//        double multipliedCreditAndCourseGrade =0;
//        for(Course course : courses){
//            // 해당 코드에 대한 변화가 생긴다면 사용되는 모든 곳에서 수정해야하는 불편함이 생김(응집도 낮음)
//            //multipliedCreditAndCourseGrade +=   course.getCredit() * course.getGradeToNumber();
//
//            // Course에 작업을 위임하여 수정할 일이 생긴다면 Course에 multiplyCreditAndCourseGrade()만 수정해주면 됨
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }
//        return multipliedCreditAndCourseGrade;

        // 2. stream을 이용한 처리
        return courses.stream()
                .mapToDouble(course -> course.multiplyCreditAndCourseGrade())
                .sum();
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(course -> course.getCredit())
                .sum();
    }
}
