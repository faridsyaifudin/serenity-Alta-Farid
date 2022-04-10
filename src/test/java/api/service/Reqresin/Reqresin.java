package api.service.Reqresin;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class Reqresin {

    private static final String REQRESIN_BASEURL = "https://regres.in";

    public  void  getListUser() {
       Response response = SerenityRest.given()
                .queryParam("page", "2")
                .get(REQRESIN_BASEURL + "/api/users");

       System.out.println(response.body().prettyPrint());
    }

    public void postLogin() {

        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "eve.holt@regres.in");
        bodyJson.put("password","cityslicka");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/login");

    }

    public void putUpdate() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("name","morpheus");
        bodyJson.put("job", "zion");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .put(REQRESIN_BASEURL + "/api/users/2");
    }
}
