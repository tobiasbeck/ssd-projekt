
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addWarehouse_Scope0 {
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

class addWarehouse extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Warehouse],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(warehouseForm: play.data.Form[Warehouse]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/main("New Warehouse")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neuer Benutzer</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.WarehouseController.create())/*12.67*/{_display_(Seq[Any](format.raw/*12.68*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(warehouseForm("name"), 'id -> "name", '_label -> "Bezeichnung", 'class -> "form-control")),format.raw/*13.120*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(warehouseForm("street"), '_label -> "Strasse", 'class -> "form-control")),format.raw/*14.103*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(warehouseForm("postalCode"), '_label -> "PLZ", 'class -> "form-control")),format.raw/*15.103*/("""
            """),_display_(/*16.14*/helper/*16.20*/.inputText(warehouseForm("city"), '_label -> "Ort", 'class -> "form-control")),format.raw/*16.97*/("""
            """),format.raw/*17.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
        """)))}),format.raw/*18.10*/("""
        """),format.raw/*19.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(warehouseForm:play.data.Form[Warehouse]): play.twirl.api.HtmlFormat.Appendable = apply(warehouseForm)

  def f:((play.data.Form[Warehouse]) => play.twirl.api.HtmlFormat.Appendable) = (warehouseForm) => apply(warehouseForm)

  def ref: this.type = this

}


}

/**/
object addWarehouse extends addWarehouse_Scope0.addWarehouse
              /*
                  -- GENERATED --
                  DATE: Thu May 18 14:51:45 CEST 2017
                  SOURCE: /Users/tobibeck/Downloads/warehouse/app/views/addWarehouse.scala.html
                  HASH: 5fb5f7409302b2e82c7a4638ee318a10ea07a3e5
                  MATRIX: 778->1|915->43|943->46|972->67|1010->68|1041->73|1244->249|1259->255|1319->306|1358->307|1399->321|1414->327|1536->427|1577->441|1592->447|1697->530|1738->544|1753->550|1858->633|1899->647|1914->653|2012->730|2053->743|2247->906|2283->915
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|49->18|50->19
                  -- GENERATED --
              */
          