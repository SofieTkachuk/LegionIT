package m6Assignment;

public abstract class Employees {
    private String name;
    private int id;
    private String title;
    private String dateOfBirth;
    private double salary;
    private String city;

    public Employees(String name, int id, String title, String dateOfBirth, double salary, String city) {
        this.name = name;
        this.id = id;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void receiveSalary() {
        System.out.println(String.format("Employee %s received salary.", name));
    }

    public String toString() {
        String txt = String.format("Employee name is %s, title is %s, address is %s, birth date is %s, salary is %f", name, title, city, dateOfBirth, salary);
        return txt;
    }
}
