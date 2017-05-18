
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: play.data.Form[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""

"""),_display_(/*3.2*/main("New Warehouse")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neuer Benutzer</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.ProductController.create(), 'enctype -> "multipart/form-data")/*12.100*/{_display_(Seq[Any](format.raw/*12.101*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(productForm("ean"), 'id -> "name", '_label -> "EAN", 'class -> "form-control")),format.raw/*13.109*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(productForm("name"), '_label -> "Bezeichnung", 'class -> "form-control")),format.raw/*14.103*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(productForm("description"), '_label -> "Beschreibung", 'class -> "form-control", 'type -> "textarea")),format.raw/*15.132*/("""
            """),_display_(/*16.14*/helper/*16.20*/.inputFile(
                productForm("image"), '_label -> "Bild", 'class -> "form-control"
            )),format.raw/*18.14*/("""
            """),format.raw/*19.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
        """)))}),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(productForm:play.data.Form[Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((play.data.Form[Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


}

/**/
object addProduct extends addProduct_Scope0.addProduct
              /*
                  -- GENERATED --
                  DATE: Thu May 18 14:51:45 CEST 2017
                  SOURCE: /Users/tobibeck/Downloads/warehouse/app/views/addProduct.scala.html
                  HASH: 1fd0ed1ca0d26a31421b64514dbc93329ae2dd18
                  MATRIX: 772->1|905->39|933->42|962->63|1000->64|1031->69|1234->245|1249->251|1343->335|1383->336|1424->350|1439->356|1550->445|1591->459|1606->465|1711->548|1752->562|1767->568|1901->680|1942->694|1957->700|2085->807|2126->820|2320->983|2356->992
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|49->18|50->19|51->20|52->21
                  -- GENERATED --
              */
          