package controllers;

import models.StockItem;
import models.Warehouse;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by martinschipflinger on 09.05.17.
 */
public class WarehouseController extends Controller {

    @Inject
    public FormFactory formFactory;

    public Result show(Long id){
        Warehouse warehouse = Warehouse.find.byId(id);
        return ok(views.html.warehouse.render(warehouse));
    }

    public Result create(){
        Form<Warehouse> warehouseForm = formFactory.form(Warehouse.class);
        Warehouse warehouse = warehouseForm.bindFromRequest().get();
        warehouse.save();
        return  redirect(routes.HomeController.index());
    }

    public Result delete(Long id){
        Warehouse warehouse = Warehouse.find.byId(id);
        List<StockItem> stock = warehouse.getStock();
        for(StockItem item : stock){
            item.delete();
        }
        stock.clear();
        warehouse.save();
        warehouse.delete();
        return redirect(routes.HomeController.index());
    }

}
