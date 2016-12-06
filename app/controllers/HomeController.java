package controllers;

import play.mvc.*;

import views.html.*;

//The methods for the website 

public class HomeController extends Controller {


//The method call for the homepage 
    public Result index(String name) {
        return ok(index.render("Welcome to the Home page", name));
    }

	//The method call for the about us page
    public Result about() {
        return ok(about.render("About Us Page"));
    }
//The method call for the products
    public Result products() {
        return ok(products.render("Our Products Page"));
    }

}


