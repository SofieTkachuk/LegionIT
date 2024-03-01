package m6Assignment;

public class Manager extends Employees {
    public Manager (String name, int id, String dateOfBirth, String city) {
        super(name, id, Consts.MANAGER_TYPE, dateOfBirth, Consts.MANAGER_SALARY, city);
    }
    // The manager should be able to hire and fire employees
    public void hireEmployee () {
        System.out.println(String.format("Manger %s can hire employees.", getName()));
    }

    public void fireEmployee () {
        System.out.println(String.format("Manger %s can fire employees.", getName()));
    }
}
