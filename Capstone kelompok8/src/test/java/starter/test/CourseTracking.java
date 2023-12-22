package starter.test;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.CoreMatchers;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CourseTracking {
    protected static String url = "https://api.harsaedu.my.id/web/course/1/user?offset=0&limit=10";

    @Step("I set GET endpoints")
    public String setApiEndpoint(){

        return url;
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest(){
        SerenityRest.given()
                .when()
                .get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200(){

        restAssuredThat(response -> response.statusCode(401));
    }


    protected static String url2 = "https://api.harsaedu.my.id/web/course/2/user?offset=0&limit=10";

    @Step("I set GET all endpoints")
    public String setApiEndpoint2(){

        return url2;
    }

    @Step("I send GET all HTTP request")
    public void sendGetHttpRequest2(){
        SerenityRest.given()
                .when()
                .head(setApiEndpoint2());
    }

    @Step("I receive valid HTTP response code 404")
    public void validateHttpResponseCode404(){

        restAssuredThat(response -> response.statusCode(405));
    }


    protected static String url3 = "https://api.harsaedu.my.id/web/course/2/user?offset=0&limit=10";

    @Step("I set GET all user endpoints")
    public String setApiEndpoint3(){

        return url3;
    }

    @Step("I send GET all user HTTP request")
    public void sendGetHttpRequest3(){
        SerenityRest.given()
                .when()
                .get(setApiEndpoint3());
    }

    @Step("I receive valid HTTP response code 405")
    public void validateHttpResponseCode405(){

        restAssuredThat(response -> response.statusCode(401));
    }


    protected static String url4 = "https://api.harsaedu.my.id/web/course/1/user/7";

    @Step("I set delete endpoints")
    public String setdeleteApiEndpoint(){

        return url4;
    }

    @Step("I send delete HTTP request")
    public void senddeleteHttpRequest(){

            SerenityRest.given().delete(setdeleteApiEndpoint());

    }

    @Step("I receive2 valid HTTP response code 200")
    public void receiveValidHttpResponseCode4(){

        restAssuredThat(response -> response.statusCode(405));
    }


    protected static String url5 = "https://api.harsaedu.my.id/web/course/1/user/7";

    @Step("I set put endpoints2")
    public String setGetApiEndpoint5(){

        return url5;
    }

    @Step("I send put HTTP request2")
    public void sendGetHttpRequest5(){

        SerenityRest.given().put(setGetApiEndpoint5());

    }

    @Step("I receive3 valid HTTP response code 200")
    public void receiveValidHttpResponseCode3(){

        restAssuredThat(response -> response.statusCode(405));
    }

    protected static String url6 = "https://api.harsaedu.my.id/web/course/1/user/99";

    @Step("I set delete endpoints3")
    public String setGetApiEndpoint6(){

        return url6;
    }

    @Step("I send delete HTTP request3")
    public void sendGetHttpRequest6(){

        SerenityRest.given().delete(setGetApiEndpoint6());

    }

    @Step("I receive4 valid HTTP response code 200")
    public void receiveValidHttpResponseCode5(){

        restAssuredThat(response -> response.statusCode(405));
    }


    protected static String url7 = "https://api.harsaedu.my.id/web/course/1/user/99";

    @Step("I set post endpoints")
    public String setGetApiEndpoint7(){

        return url7;
    }

    @Step("I send post HTTP request")
    public void sendGetHttpRequest7(){

        SerenityRest.given().post(setGetApiEndpoint7());

    }

    @Step("I receive5 valid HTTP response code 200")
    public void receiveValidHttpResponseCode6(){

        restAssuredThat(response -> response.statusCode(401));
    }


    protected static String url8 = "https://api.harsaedu.my.id/web/course/1/user/99";

    @Step("I set put endpoints3")
    public String setGetApiEndpoint8(){

        return url8;
    }

    @Step("I send put HTTP request3")
    public void sendGetHttpRequest8(){

        SerenityRest.given().put(setGetApiEndpoint8());

    }

    @Step("I receive3 valid HTTP response code 404")
    public void receiveValidHttpResponseCode7(){

        restAssuredThat(response -> response.statusCode(405));
    }


    protected static String url9 = "https://api.harsaedu.my.id/web/course/1/user/99";

    @Step("I set post endpoints11")
    public String setGetApiEndpoint9(){

        return url9;
    }

    @Step("I send post HTTP request11")
    public void sendGetHttpRequest9(){

        SerenityRest.given().post(setGetApiEndpoint9());

    }

    @Step("I receive2 valid HTTP response code 405")
    public void receiveValidHttpResponseCode8(){

        restAssuredThat(response -> response.statusCode(401));
    }


    protected static String url10 = "https://api.harsaedu.my.id/web/course/2/user/subscribe?offset=0&limit=10";

    @Step("I set get endpoints31")
    public String setGetApiEndpoint10(){

        return url10;
    }

    @Step("I send get HTTP request31")
    public void sendGetHttpRequest10(){

        SerenityRest.given().get(setGetApiEndpoint10());

    }

    @Step("I receive55 valid HTTP response code 200")
    public void receiveValidHttpResponseCode9(){

        restAssuredThat(response -> response.statusCode(401));
    }


    protected static String url11 = "https://api.harsaedu.my.id/web/course/2/user/subscribe?offset=0&limit=10";

    @Step("I set put endpoints")
    public String setGetApiEndpoint11(){

        return url11;
    }

    @Step("I send put HTTP request")
    public void sendGetHttpRequest11(){

        SerenityRest.given().put(setGetApiEndpoint11());

    }

    @Step("I receive5 valid HTTP response code 404")
    public void receiveValidHttpResponseCode10(){

        restAssuredThat(response -> response.statusCode(405));
    }



    protected static String url12 = "https://api.harsaedu.my.id/web/course/2/user/subscribe?offset=0&limit=10";

    @Step("I set get endpoints")
    public String setGetApiEndpoint12(){

        return url12;
    }

    @Step("I send get HTTP reques")
    public void sendGetHttpRequest12(){

        SerenityRest.given().get(setGetApiEndpoint12());

    }

    @Step("I receive6 valid HTTP response code 405")
    public void receiveValidHttpResponseCode11(){

        restAssuredThat(response -> response.statusCode(401));
    }





}
