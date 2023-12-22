package starter.stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.test.CourseTracking;

public class CourseTrackingStep {
    @Steps
    CourseTracking courseTracking;

    @Given("I set GET endpoints")
    public void setGetApiEndpoint(){
        courseTracking.setApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){
        courseTracking.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode200(){
        courseTracking.validateHttpResponseCode200();
    }


    @Given("I set GET all endpoints")
    public void setGetApiEndpoint2(){
        courseTracking.setApiEndpoint2();
    }
    @When("I send GET all HTTP request")
    public void sendGetHttpRequest2(){
        courseTracking.sendGetHttpRequest2();
    }

    @Then("I receive valid HTTP response code 404")
    public void receiveValidHttpResponseCode2(){
        courseTracking.validateHttpResponseCode404();
    }


    @Given("I set GET all user endpoints")
    public void setGetApiEndpoint3(){
        courseTracking.setApiEndpoint3();
    }
    @When("I send GET all user HTTP request")
    public void sendGetHttpRequest3(){
        courseTracking.sendGetHttpRequest3();
    }

    @Then("I receive valid HTTP response code 405")
    public void receiveValidHttpResponseCode(){
        courseTracking.validateHttpResponseCode405();
    }










    @Given("I set delete endpoints")
    public void setdeleteApiEndpoint(){
        courseTracking.setdeleteApiEndpoint();
    }
    @When("I send delete HTTP request")
    public void senddeleteHttpRequest(){
        courseTracking.senddeleteHttpRequest();
    }

    @Then("I receive2 valid HTTP response code 200")
    public void receiveValidHttpResponseCode4(){
        courseTracking.receiveValidHttpResponseCode4();
    }


    @Given("I set put endpoints2")
    public void setGetApiEndpoint5(){
        courseTracking.setGetApiEndpoint5();
    }
    @When("I send put HTTP request2")
    public void sendGetHttpRequest5(){
        courseTracking.sendGetHttpRequest5();
    }

    @Then("I receive3 valid HTTP response code 200")
    public void receiveValidHttpResponseCode3(){
        courseTracking.receiveValidHttpResponseCode3();
    }

    @Given("I set delete endpoints3")
    public void setGetApiEndpoint6(){
        courseTracking.setGetApiEndpoint6();
    }
    @When("I send delete HTTP request3")
    public void sendGetHttpRequest6(){
        courseTracking.sendGetHttpRequest6();
    }

    @Then("I receive4 valid HTTP response code 200")
    public void receiveValidHttpResponseCode5(){
        courseTracking.receiveValidHttpResponseCode5();
    }


    @Given("I set post endpoints")
    public void setGetApiEndpoint7(){
        courseTracking.setGetApiEndpoint7();
    }
    @When("I send post HTTP request")
    public void sendGetHttpRequest7(){
        courseTracking.sendGetHttpRequest7();
    }

    @Then("I receive5 valid HTTP response code 200")
    public void receiveValidHttpResponseCode6(){
        courseTracking.receiveValidHttpResponseCode6();
    }


    @Given("I set put endpoints3")
    public void setGetApiEndpoint8(){
        courseTracking.setGetApiEndpoint8();
    }
    @When("I send put HTTP request3")
    public void sendGetHttpRequest8(){
        courseTracking.sendGetHttpRequest8();
    }

    @Then("I receive3 valid HTTP response code 404")
    public void receiveValidHttpResponseCode7(){
        courseTracking.receiveValidHttpResponseCode7();
    }


    @Given("I set post endpoints11")
    public void setGetApiEndpoint9(){
        courseTracking.setGetApiEndpoint9();
    }
    @When("I send post HTTP request11")
    public void sendGetHttpRequest9(){
        courseTracking.sendGetHttpRequest9();
    }

    @Then("I receive2 valid HTTP response code 405")
    public void receiveValidHttpResponseCode8(){
        courseTracking.receiveValidHttpResponseCode8();
    }



    @Given("I set get endpoints31")
    public void setGetApiEndpoint10(){
        courseTracking.setGetApiEndpoint10();
    }
    @When("I send get HTTP request31")
    public void sendGetHttpRequest10(){
        courseTracking.sendGetHttpRequest10();
    }

    @Then("I receive55 valid HTTP response code 200")
    public void receiveValidHttpResponseCode9(){
        courseTracking.receiveValidHttpResponseCode9();
    }


    @Given("I set put endpoints")
    public void setGetApiEndpoint11(){
        courseTracking.setGetApiEndpoint11();
    }
    @When("I send put HTTP request")
    public void sendGetHttpRequest11(){
        courseTracking.sendGetHttpRequest11();
    }

    @Then("I receive5 valid HTTP response code 404")
    public void receiveValidHttpResponseCode10(){
        courseTracking.receiveValidHttpResponseCode10();
    }



    @Given("I set get endpoints")
    public void setGetApiEndpoint12(){
        courseTracking.setGetApiEndpoint12();
    }
    @When("I send get HTTP request")
    public void sendGetHttpRequest12(){
        courseTracking.sendGetHttpRequest12();
    }

    @Then("I receive6 valid HTTP response code 405")
    public void receiveValidHttpResponseCode11(){
        courseTracking.receiveValidHttpResponseCode11();
    }
}
