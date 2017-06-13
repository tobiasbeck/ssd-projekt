package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Result;

import javax.inject.Inject;

import static play.mvc.Results.*;

/**
 * Created by tobibeck on 13.06.17.
 */
public class FormController {

    @Inject
    public FormFactory formFactory;

    public Result addUser(){
        Form<User> userForm = formFactory.form(User.class);
        return ok(views.html.addUser.render(userForm));
    }

    public Result addCustomer(){
        Form<Customer> customerForm = formFactory.form(Customer.class);
        return ok();
    }
}
