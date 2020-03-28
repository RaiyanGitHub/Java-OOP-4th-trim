
package resturant.management;


public class waiter extends Employee {
    private int hours;
    private int days;

    public waiter(int hours, int days, String id, String name, float salary) {
        super(id, name, salary);
        this.hours = hours;
        this.days = days;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    
    

    @Override
    public void display() {
             System.out.println("diplay");
    }

    @Override
    public void hire() {
         System.out.println("hire");
    }

    @Override
    public void fire() {
        System.out.println("fire");
    }

    @Override
    public boolean employeesick() {
       boolean b=true;
       return b;
    }

    @Override
    public boolean employeevacation() {
        boolean b=true;
        return b;
    }

    @Override
    public void hoursperweek() {
        System.out.println("hoursperweek="+hours/7);
    }

    @Override
    public void payment() {
         System.out.println("payment="+super.getSalary());
    }

    @Override
    public void currentlyonduty() {
        System.out.println("onduty");
    }
    
    
    
    
}
