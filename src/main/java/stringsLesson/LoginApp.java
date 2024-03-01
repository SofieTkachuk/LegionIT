package stringsLesson;

public class LoginApp {

    public String ExpectedUserName = "admin";
    public String ExpectedPassword = "12345";

    public static void main(String[] args) {

        LoginApp loginApp = new LoginApp();
//        boolean success = loginApp.verifyUser("ADMIN", "12345");
//        System.out.println("Login success " + success);
        loginApp.stringsExamples();

    }

    public boolean verifyUser(String username, String password){
        username = username.toLowerCase();
        password = password.toLowerCase();
        boolean success=false;
        //if (username.isEmpty() || password.isEmpty()){
        if (username == null || password == null) {
            System.out.println("The username or password is null");
        }
        else if (username.length()==0 || password.length()==0){
            System.out.println("The username or password is empty");
        }
        else if (username.isBlank() || password.isBlank()) {
            System.out.println("The username or password is blank");
        }
        else if (!username.equalsIgnoreCase(ExpectedUserName) || !password.equalsIgnoreCase(ExpectedPassword)) {
            System.out.println("The username or password does not match expected values");
        }

        else {
            success=true;
        }
        return success;
    }

    public void stringsExamples(){
        String txt1 = "dog";
        String txt2 = "catalog";
        System.out.println(txt2.contains(txt1));
////        System.out.println(txt2.replace("cat", txt1));
//
//        System.out.println(txt1.charAt(0));
//        System.out.println(txt1.charAt(2));
    }
}
