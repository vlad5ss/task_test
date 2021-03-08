
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class Test1 extends BaseTest{


    @Test(description = "Verify left menu bar containing Interactions section")
    public void checkIntersection() {

        getHomePage()
                .checkInteractionsInLeftMenu("Interactions");
//        getHomePage()
//                .checkInteractionsInLeftMenu("Widgets");
//        getHomePage()
//                .checkInteractionsInLeftMenu("Effects");
//        getHomePage()
//                .checkInteractionsInLeftMenu("Utilities");

    }

    @Test(description = "Verify left menu bar containing Widgets section")
    public void checkWidjets() {

        getHomePage()
                .checkInteractionsInLeftMenu("Widgets");

    }

    @Test(description = "Verify left menu bar containing Effects section")
    public void checkEffect() {

        getHomePage()
                .checkInteractionsInLeftMenu("Effects");

    }

    @Test(description = "Verify left menu bar containing Utilities section")
    public void checkUtilitise() {

        getHomePage()
                .checkInteractionsInLeftMenu("Utilities");

    }
    }



