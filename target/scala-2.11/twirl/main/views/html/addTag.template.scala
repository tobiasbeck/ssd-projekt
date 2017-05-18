
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addTag_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class addTag extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Tag],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tagForm: play.data.Form[Tag]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/main("New Warehouse")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neuer Benutzer</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.TagController.create())/*12.61*/{_display_(Seq[Any](format.raw/*12.62*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(tagForm("name"), 'id -> "name", '_label -> "Bezeichnung", 'class -> "form-control")),format.raw/*13.114*/("""
            """),format.raw/*14.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
        """)))}),format.raw/*15.10*/("""
        """),format.raw/*16.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(tagForm:play.data.Form[Tag]): play.twirl.api.HtmlFormat.Appendable = apply(tagForm)

  def f:((play.data.Form[Tag]) => play.twirl.api.HtmlFormat.Appendable) = (tagForm) => apply(tagForm)

  def ref: this.type = this

}


}

/**/
object addTag extends addTag_Scope0.addTag
              /*
                  -- GENERATED --
                  DATE: Thu May 18 14:51:45 CEST 2017
                  SOURCE: /Users/tobibeck/Downloads/warehouse/app/views/addTag.scala.html
                  HASH: b264c3d2b5f0f9f235d291157ebea9763cb5e278
                  MATRIX: 760->1|885->31|913->34|942->55|980->56|1011->61|1214->237|1229->243|1283->288|1322->289|1363->303|1378->309|1494->403|1535->416|1729->579|1765->588
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|46->15|47->16
                  -- GENERATED --
              */
          