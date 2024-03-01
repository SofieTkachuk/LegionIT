package m6Assignment;

public class Clerk extends Employees {
    public Clerk (String name, int id, String dateOfBirth, String city) {
        super(name, id, Consts.CLERK_TYPE, dateOfBirth, Consts.CLERK_SALARY, city);
    }
    // Clerk's role is to call to the customer and answer incoming calls
    public void makeCall () {
        System.out.println (String.format("Clerk %s is making calls", getName()));
    }
    public void answerCall () {
        System.out.println (String.format("Clerk %s is answering calls", getName()));
    }
}
