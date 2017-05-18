
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object warehouse_Scope0 {
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

class warehouse extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Warehouse,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(warehouse: Warehouse):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("Warehouse")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Lagerhaus: """),_display_(/*6.29*/warehouse/*6.38*/.getName()),format.raw/*6.48*/("""</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
            <b>Anschrift:</b>
            <div>"""),_display_(/*13.19*/warehouse/*13.28*/.getStreet),format.raw/*13.38*/("""</div>
            <div>"""),_display_(/*14.19*/warehouse/*14.28*/.getPostalCode),format.raw/*14.42*/(""" """),_display_(/*14.44*/warehouse/*14.53*/.getCity()),format.raw/*14.63*/("""</div>
        </div>
    </div>

    <div class="row add-item">
        <div class="col-xs-2">
            <a href=""""),_display_(/*20.23*/routes/*20.29*/.FormController.addStockItem()),format.raw/*20.59*/("""" class="btn btn-success"><i class="fa fa-plus-square fa-2x" aria-hidden="true"></i></a>
        </div>

    </div>
    <div class="row">
        <div class="col-xs-12">
        <table class="table table-striped">
            <thead>
                <tr>
                    <td>EAN</td>
                    <td>Bezeichnung</td>
                    <td>Beschreibung</td>
                    <td>Menge</td>
                </tr>
            </thead>
            <tbody>
            """),_display_(/*36.14*/for(products <- warehouse.getStock()) yield /*36.51*/{_display_(Seq[Any](format.raw/*36.52*/("""
                """),format.raw/*37.17*/("""<tr>
                    <td>"""),_display_(/*38.26*/products/*38.34*/.getProduct.getEan()),format.raw/*38.54*/("""</td>
                    <td>"""),_display_(/*39.26*/products/*39.34*/.getProduct.getName()),format.raw/*39.55*/("""</td>
                    <td>"""),_display_(/*40.26*/products/*40.34*/.getProduct.getDescription()),format.raw/*40.62*/("""</td>
                    <td>"""),_display_(/*41.26*/products/*41.34*/.getQuantity()),format.raw/*41.48*/("""</td>

                </tr>

            """)))}),format.raw/*45.14*/("""
            """),format.raw/*46.13*/("""</tbody>
        </table>
        </div>

    </div>

""")))}))
      }
    }
  }

  def render(warehouse:Warehouse): play.twirl.api.HtmlFormat.Appendable = apply(warehouse)

  def f:((Warehouse) => play.twirl.api.HtmlFormat.Appendable) = (warehouse) => apply(warehouse)

  def ref: this.type = this

}


}

/**/
object warehouse extends warehouse_Scope0.warehouse
              /*
                  -- GENERATED --
                  DATE: Thu May 18 14:51:45 CEST 2017
                  SOURCE: /Users/tobibeck/Downloads/warehouse/app/views/warehouse.scala.html
                  HASH: 6a915cfeb4b5198df9c1a99ded0637933d7e8781
                  MATRIX: 756->1|873->23|901->26|926->43|964->44|995->49|1099->127|1116->136|1146->146|1308->281|1326->290|1357->300|1409->325|1427->334|1462->348|1491->350|1509->359|1540->369|1685->487|1700->493|1751->523|2260->1005|2313->1042|2352->1043|2397->1060|2454->1090|2471->1098|2512->1118|2570->1149|2587->1157|2629->1178|2687->1209|2704->1217|2753->1245|2811->1276|2828->1284|2863->1298|2937->1341|2978->1354
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|51->20|51->20|51->20|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|76->45|77->46
                  -- GENERATED --
              */
          