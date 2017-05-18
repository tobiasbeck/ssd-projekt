
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Warehouse],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(warehouseList: List[Warehouse]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("lager")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
  """),format.raw/*4.3*/("""<h1>Lagerhaus</h1>
  """),_display_(/*5.4*/if(warehouseList.size() > 0)/*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""

    """),format.raw/*7.5*/("""<div class="row">
      <div class="col-xs-12">
        <table class="table table-hover">
          <thead>
            <tr>
              <td>Bezeichnung</td>
              <td>Adresse</td>
              <td></td>
            </tr>
          </thead>
          <tbody>
          """),_display_(/*18.12*/for(warehouse <- warehouseList) yield /*18.43*/{_display_(Seq[Any](format.raw/*18.44*/("""
            """),format.raw/*19.13*/("""<tr>
              <td>"""),_display_(/*20.20*/warehouse/*20.29*/.getName()),format.raw/*20.39*/("""</td>
              <td>"""),_display_(/*21.20*/warehouse/*21.29*/.getStreet),format.raw/*21.39*/(""", """),_display_(/*21.42*/warehouse/*21.51*/.getPostalCode),format.raw/*21.65*/(""" """),_display_(/*21.67*/warehouse/*21.76*/.getCity()),format.raw/*21.86*/("""</td>
              <td>
                <a href=""""),_display_(/*23.27*/routes/*23.33*/.WarehouseController.show(warehouse.getId())),format.raw/*23.77*/("""" class="btn btn-default"><i class="fa fa-pencil" aria-hidden="true"></i></a>
                <a href=""""),_display_(/*24.27*/routes/*24.33*/.WarehouseController.delete(warehouse.getId())),format.raw/*24.79*/("""" class="btn btn-danger"><i class="fa fa-minus" aria-hidden="true"></i></a>
              </td>


            </tr>

          """)))}),format.raw/*30.12*/("""
          """),format.raw/*31.11*/("""</tbody>
        </table>
      </div>

    </div>
  """)))}/*36.5*/else/*36.9*/{_display_(Seq[Any](format.raw/*36.10*/("""
    """),format.raw/*37.5*/("""<div class="warehouse-item">
      Kein Warehouse vorhanden
    </div>
  """)))}),format.raw/*40.4*/("""

  """),format.raw/*42.3*/("""<div class="new-holder">
    <a href=""""),_display_(/*43.15*/routes/*43.21*/.FormController.addWarehouse),format.raw/*43.49*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neues Lagerhaus anlegen</a>
  </div>


""")))}),format.raw/*47.2*/("""
"""))
      }
    }
  }

  def render(warehouseList:List[Warehouse]): play.twirl.api.HtmlFormat.Appendable = apply(warehouseList)

  def f:((List[Warehouse]) => play.twirl.api.HtmlFormat.Appendable) = (warehouseList) => apply(warehouseList)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu May 18 14:51:45 CEST 2017
                  SOURCE: /Users/tobibeck/Downloads/warehouse/app/views/index.scala.html
                  HASH: 4624690bd8b4ff6bb4cc2c617794cee4f8bb5a42
                  MATRIX: 754->1|881->33|909->36|930->49|969->51|998->54|1045->76|1081->104|1120->106|1152->112|1460->393|1507->424|1546->425|1587->438|1638->462|1656->471|1687->481|1739->506|1757->515|1788->525|1818->528|1836->537|1871->551|1900->553|1918->562|1949->572|2027->623|2042->629|2107->673|2238->777|2253->783|2320->829|2479->957|2518->968|2590->1023|2602->1027|2641->1028|2673->1033|2777->1107|2808->1111|2874->1150|2889->1156|2938->1184|3089->1305
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|38->7|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|54->23|54->23|54->23|55->24|55->24|55->24|61->30|62->31|67->36|67->36|67->36|68->37|71->40|73->42|74->43|74->43|74->43|78->47
                  -- GENERATED --
              */
          