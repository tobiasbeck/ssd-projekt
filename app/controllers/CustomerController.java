package controllers;

import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

/**
 * Created by User on 13.06.2017.
 */
public class CustomerController extends Controller {

    @Inject
     private FormFactory formFactory;

    public Result list(){
        return ok();

    }

    public Result create(){
        return ok();

    }

    public Result delete(Long id){
        return ok();

    }

    public Result update(Long id){
        return ok();

    }
}
