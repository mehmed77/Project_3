package controllers


import play.api.mvc._
import models.Students._
/**
 * Created by Tuliyev on 17.02.2015.
 */
object Group extends Controller{

  def list = Action (
  Ok(views.html.list(findAll))
  )

  def lesson = Action(
  Ok(views.html.lessons(days,weekdays,lessons))
  )

}
