package api.service.stepdef.ReqresinStepDef;

import com.fasterxml.jackson.databind.util.JSONPObject;
import net.serenitybdd.rest.SerenityRest;

public class ReqresinStepDef {
    private static final String REQRESIN_BASEURL= "https://regres.in";

    public  void  getListUser() {
        SerenityRest.get(REQRESIN_BASEURL + "/api/users?page=2");
    }

    public void  postlogin() {

        JSONPObject bodyJson = new JSONPObject();

        bodyJson.put("email", "eve.holt@reqres.in");
        bodyJson.put("password", "cityslicka");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/login");
    }
}
