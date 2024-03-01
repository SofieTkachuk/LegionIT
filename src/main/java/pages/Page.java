package pages;

public class Page {
    private int pageID = 54;
    private String pageName;
    private String URL;

//    public Page (String pageName, int pageID, String URL) {
//        this.pageName = pageName;
//        this.pageID = pageID;
//        this.URL = URL;
//    }
    public Page () {
    }
    public int getPageID(){
        return pageID;
    }
//    public void setPageID (int pageID){
//        this.pageID =pageID;
//    }
    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
    public void openPage (){
        System.out.println(String.format("Page %s was opened", pageName ));
    }
    public void closePage (){
        System.out.println(String.format("Page %s was closed", pageName ));
    }
    public void clickButton (String buttonName){
        System.out.println(String.format("Button %s was clicked", buttonName ));
    }
    //public abstract void getDeveloperName ();
}
