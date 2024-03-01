package pages;

public class PagesMain {
    public static void main(String[] args) {
       // Page loginScreen = new Page("Login", 1, "www.jhjfh.com/login");
//        loginScreen.pageID = 1;
//        loginScreen.pageName = "Login";
//        loginScreen.URL = "www.jhjfh.com/login";

//        loginScreen.openPage();
//        loginScreen.clickButton("Login");
//        loginScreen.closePage();
//
//        Page aboutScreen = new Page();
////        aboutScreen.setPageID(2);
//        System.out.println(aboutScreen.getPageID());
//        aboutScreen.setPageName("About");
//        aboutScreen.setURL("www.jhjfh.com/about");
//
//        aboutScreen.openPage();
//        aboutScreen.clickButton("exit");
//        aboutScreen.closePage();
//
//        LoginPage loginPage = new LoginPage();
//        loginPage.setPageName("LoginPage");
//        loginPage.setURL("http//...");
//
//        loginPage.openPage();
//        loginPage.setUserName("name");
//        loginPage.setPassword("12345");
//        loginPage.populateCredentials();
//
//        Page page = new Page();
//        page.getDeveloperName();

        LoginPage loginPage = new LoginPage();
        loginPage.getPageID();
        loginPage.setPageName("login");
        loginPage.getDeveloperName();

        AboutPage aboutPage = new AboutPage();
        aboutPage.getDeveloperName();
    }
}
