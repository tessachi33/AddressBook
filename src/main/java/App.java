
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

 //    get("/", (request, response) -> {
 //     HashMap<String, Object> model = new HashMap<String, Object>();
 //     model.put("addressbooks", AddressBook.all());
 //     model.put("template", "templates/index.vtl");
 //     return new ModelAndView(model, layout);
 //   }, new VelocityTemplateEngine());
 //
 //   get("/addressbooks/new", (request, response) -> {
 //     HashMap<String, Object> model = new HashMap<String, Object>();
 //     model.put("template", "templates/addressbook-form.vtl");
 //     return new ModelAndView(model, layout);
 //   }, new VelocityTemplateEngine());
 //
 //   post("/addressbooks", (request, response) -> {
 //     HashMap<String, Object> model = new HashMap<String, Object>();
 //     String userName = request.queryParams("userName");
 //     AddressBook newAddressBook = new AddressBook(userName);
 //     model.put("addressbook", newAddressBook);
 //     model.put("template", "templates/success.vtl");
 //     return new ModelAndView(model, layout);
 //   }, new VelocityTemplateEngine());
 //
 //
 //    get("/addressbooks/:id", (request, response) -> {
 //    HashMap<String, Object> model = new HashMap<String, Object>();
 //    model.put("addressbook", AddressBook.find(Integer.parseInt(request.params(":id"))));
 //    //model.put("contacts", Category.all());
 //    model.put("template", "templates/addressbook.vtl");
 //    return new ModelAndView(model, layout);
 //  }, new VelocityTemplateEngine());
 //
 //  get("/addressbooks/:id/contacts/new", (request, response) -> {
 //     HashMap<String, Object> model = new HashMap<String, Object>();
 //     model.put("addressbook", AddressBook.find(Integer.parseInt(request.params(":id"))));
 //     model.put("template", "templates/addressbook-contact-form.vtl");
 //     return new ModelAndView(model, layout);
 //   }, new VelocityTemplateEngine());
 //
 //
 //   post("/contacts", (request, response) -> {
 //     HashMap<String, Object> model = new HashMap<String, Object>();
 //     AddressBook addressbook = AddressBook.find(Integer.parseInt(request.queryParams("addressbookId")));
 //     String name = request.queryParams("name");
 //     String home = request.queryParams("home");
 //     String cell = request.queryParams("cell");
 //     String email = request.queryParams("email");
 //     Contact newContact = new Contact(name, home, cell, email);
 //     addressbook.addContact(newContact);
 //     model.put("addressbook", addressbook);
 //     model.put("template", "templates/addressbook.vtl");
 //     return new ModelAndView(model, layout);
 //   }, new VelocityTemplateEngine());
 //
 //   get("/contact/:id", (request, response) -> {
 //   HashMap<String, Object> model = new HashMap<String, Object>();
 //   Contact contact = Contact.find(Integer.parseInt(request.params(":id")));
 //   model.put("contact", contact);
 //   model.put("template", "templates/contact.vtl");
 //   return new ModelAndView(model, layout);
 // }, new VelocityTemplateEngine());
}
}
