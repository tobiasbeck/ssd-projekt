
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addStockItem_Scope0 {
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

class addStockItem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[StockItem],List[Warehouse],List[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(stockitemForm: play.data.Form[StockItem], warehouseList: List[Warehouse], productList: List[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.104*/("""

"""),_display_(/*3.2*/main("New Warehouse")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neuer Benutzer</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.StockItemController.create())/*12.67*/{_display_(Seq[Any](format.raw/*12.68*/("""
            """),_display_(/*13.14*/helper/*13.20*/.select(
                field = stockitemForm("tmpwarehouse"),
                options = (warehouseList.map(warehouse => warehouse.getId().toString() -> warehouse.getName())),
                'id -> "warehouse",
                '_label -> "Lager",
                'class -> "form-control")),format.raw/*18.42*/("""
            """),_display_(/*19.14*/helper/*19.20*/.select(
                field = stockitemForm("tmpproduct"),
                options = (productList.map(product => product.getId().toString() -> product.getName())),
                'id -> "product",
                '_label -> "Lager",
                'class -> "form-control")),format.raw/*24.42*/("""
            """),_display_(/*25.14*/helper/*25.20*/.inputText(stockitemForm("quantity"), '_label -> "Menge", 'class -> "form-control")),format.raw/*25.103*/("""
            """),format.raw/*26.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Einlagern </button>
        """)))}),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(stockitemForm:play.data.Form[StockItem],warehouseList:List[Warehouse],productList:List[Product]): play.twirl.api.HtmlFormat.Appendable = apply(stockitemForm,warehouseList,productList)

  def f:((play.data.Form[StockItem],List[Warehouse],List[Product]) => play.twirl.api.HtmlFormat.Appendable) = (stockitemForm,warehouseList,productList) => apply(stockitemForm,warehouseList,productList)

  def ref: this.type = this

}


}

/**/
object addStockItem extends addStockItem_Scope0.addStockItem
              /*
                  -- GENERATED --
                  DATE: Thu May 18 14:51:45 CEST 2017
                  SOURCE: /Users/tobibeck/Downloads/warehouse/app/views/addStockItem.scala.html
                  HASH: d19779601242f188e4a464d7021633cff2d3d752
                  MATRIX: 808->1|1006->103|1034->106|1063->127|1101->128|1132->133|1335->309|1350->315|1410->366|1449->367|1490->381|1505->387|1816->677|1857->691|1872->697|2171->975|2212->989|2227->995|2332->1078|2373->1091|2569->1256|2605->1265
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|49->18|50->19|50->19|55->24|56->25|56->25|56->25|57->26|58->27|59->28
                  -- GENERATED --
              */
          