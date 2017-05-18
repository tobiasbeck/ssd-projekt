package controllers;

import models.Product;
import models.StockItem;
import models.Warehouse;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

/**
 * Created by martinschipflinger on 09.05.17.
 */
public class StockItemController extends Controller {
    @Inject
    public FormFactory formFactory;

    public Result create(){
        Form<StockItem> stockItemForm = formFactory.form(StockItem.class);
        StockItem item = stockItemForm.bindFromRequest().get();
        System.out.println(item.getTmpproduct());
        item.setWarehouse(Warehouse.find.byId(Long.parseLong(item.getTmpwarehouse())));
        item.setProduct(Product.find.byId(Long.parseLong(item.getTmpproduct())));
        item.save();
        return redirect(routes.WarehouseController.show(item.getWarehouse().getId()));
    }
}
