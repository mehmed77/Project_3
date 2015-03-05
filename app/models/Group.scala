package models

/**
 * Created by Tuliyev on 17.02.2015.
 */

case class Students (id: Int, name: String, tel: String, mail: String)
case class Lessons(id: Int, name: String)
case class Days(days: Int, var lesson: Lessons)
case class WeekDays(id: Int, day: String)

object Students {

  var students = List (
    Students(1, " Habibullayev Muhammad", "998937501225","mehmed7777@mail.ru"),
    Students(2, "Tuliyev Ulug'bek","998937549544","u.tuliyev@mail.ru"),
    Students(3, "Sapoyev Sapoboy","998932832727","sopoyev1991@mail.ru"),
    Students(4, "Sultanov Izzat","998907258395","sultanov.izzat@mail.ru")
  )

  var weekdays = List(
      WeekDays(1,"Monday"),
      WeekDays(2,"Tuesday"),
      WeekDays(3,"Thursday"),
      WeekDays(4,"Wednesday"),
      WeekDays(5,"Friday"),
      WeekDays(6,"Saturday")
  )

  var lessons = List(
    Lessons(1,"Jarayonlar tadqiqoti"),
    Lessons(2,"Integeral tenglamalar"),
    Lessons(3,"Axborotlarni himoyalash"),
    Lessons(4,"KOFN"),
    Lessons(5,"A.M.M"),
    Lessons(6,"INternet Asoslari"),
    Lessons(7,"Jarayonlar tadqiqoti"),
    Lessons(8,"Jarayonlar tadqiqoti"),
    Lessons(9,"Jarayonlar tadqiqoti"),
    Lessons(10,"Jarayonlar tadqiqoti")
  )

  var days = List(
    Days(1,lessons(0)),
    Days(1,lessons(1)),
    Days(1,lessons(2)),
    Days(2,lessons(5)),
    Days(2,lessons(6)),
    Days(2,lessons(8)),
    Days(3,lessons(9)),
    Days(3,lessons(1)),
    Days(4,lessons(2)),
    Days(4,lessons(0)),
    Days(4,lessons(1)),
    Days(5,lessons(2)),
    Days(5,lessons(2)),
    Days(5,lessons(2)),
    Days(6,lessons(2)),
    Days(6,lessons(2))
  )


  def findAll = students.sortBy(_.id)

  def addlesson(name: String) ={
    val maxId = lessons.map(_.id).max + 1
    lessons = Lessons(maxId,name) :: lessons
  }


}
