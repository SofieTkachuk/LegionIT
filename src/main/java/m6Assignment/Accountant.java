package m6Assignment;

public class Accountant extends Employees {
    public Accountant (String name, int id, String dateOfBirth, String city) {
        super(name, id, Consts.ACCOUNTANT_TYPE, dateOfBirth, Consts.ACCOUNTANT_SALARY, city);
    }
    // The accountant can open a new account, close account and create reports
    public void openAccount() {
        System.out.println(String.format("Accountant %s can open a new account.", getName()));
    }
    public void closeAccount() {
        System.out.println(String.format("Accountant %s can close accounts.", getName()));
    }
    public void createReport() {
        System.out.println(String.format("Accountant %s is making reports.", getName()));
    }
}
