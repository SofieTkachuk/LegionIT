package m6Assignment;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Michelle Sendes", 1, "18.08.1986", "Toronto");

        Clerk clerk1 = new Clerk("Ksenia Alekseev", 2, "16.01.1989", "Aurora");
        Clerk clerk2 = new Clerk("Sofie Tkachuk", 3, "11.01.1995", "North York");
        Clerk clerk3 = new Clerk("Marina Mary", 4, "16.02.1989", "Brampton");

        Accountant accountant1 = new Accountant("Kai Oppo", 5, "20.09.1993", "North York");
        Accountant accountant2 = new Accountant("Victoria Mell", 6, "20.09.1983", "North York");
        Accountant accountant3 = new Accountant("Gayle Rozo", 7, "29.09.1997", "Vaughan");
        Accountant accountant4 = new Accountant("Cheenie May", 8, "20.03.1997", "Concord");
        Accountant accountant5 = new Accountant("Melony Durt", 9, "2.09.1999", "North York");

        System.out.println("**********");
        System.out.println(manager.toString());
        manager.receiveSalary();
        manager.hireEmployee();
        manager.fireEmployee();

        System.out.println("**********");
        System.out.println(clerk1.toString());
        clerk1.receiveSalary();
        clerk1.makeCall();
        clerk1.answerCall();

        System.out.println("**********");
        System.out.println(clerk2.toString());
        clerk2.receiveSalary();
        clerk2.makeCall();
        clerk2.answerCall();

        System.out.println("**********");
        System.out.println(clerk3.toString());
        clerk3.receiveSalary();
        clerk3.makeCall();
        clerk3.answerCall();

        System.out.println("**********");
        System.out.println(accountant1.toString());
        accountant1.receiveSalary();
        accountant1.openAccount();
        accountant1.closeAccount();
        accountant1.createReport();

        System.out.println("**********");
        System.out.println(accountant2.toString());
        accountant2.receiveSalary();
        accountant2.openAccount();
        accountant2.closeAccount();
        accountant2.createReport();

        System.out.println("**********");
        System.out.println(accountant3.toString());
        accountant3.receiveSalary();
        accountant3.openAccount();
        accountant3.closeAccount();
        accountant3.createReport();

        System.out.println("**********");
        System.out.println(accountant4.toString());
        accountant4.receiveSalary();
        accountant4.openAccount();
        accountant4.closeAccount();
        accountant4.createReport();

        System.out.println("**********");
        System.out.println(accountant5.toString());
        accountant5.receiveSalary();
        accountant5.openAccount();
        accountant5.closeAccount();
        accountant5.createReport();

    }
}
