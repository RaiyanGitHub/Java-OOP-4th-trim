
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

   
    
    
    
    
}
