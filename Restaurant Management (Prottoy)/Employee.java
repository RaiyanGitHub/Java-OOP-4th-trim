
package resturant.management;


public abstract class Employee {
    
    private String id;
    private String name;
    private float salary;
    private boolean onDuty;
    private boolean sick = false;           //so that it is initially set to false
    private boolean onLiiv = false;         //so that it is initially set to false
    public Employee(String id, String name, float salary, boolean active) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.onDuty = active;
        
    }

    public Employee(String id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    public boolean getOnDuty(){
        return onDuty;
    }
    
    public void setOnDuty(boolean a){                   // How best should we make use of this function and active status of an employee?
        if(this.onDuty != a)
            this.onDuty = a;
    }
    
    public void toggleOnDuty(){
        if(this.getOnDuty())
            this.setOnDuty(false);
        else
            this.setOnDuty(true);
    }
    
    public boolean getSick(){               // returns whether an employee is sick or not
        return sick;
    }
    
    public void setSick(boolean a){                   // How best should we make use of this function and active status of an employee?
        this.sick = a;
    }
    
    public void toggleSickF(){
        if(this.getSick())
            this.setSick(false);
        else
            this.setSick(true);
    }
    
    public boolean getLeave(){
        return onLiiv;
    }
    
    public void setLeave(boolean a){                   // How best should we make use of this function and active status of an employee?
        this.onLiiv = a;
    }
    
    public void toggleLeave(){
        if(this.getLeave())
            this.setLeave(false);
        else
            this.setLeave(true);
    }
    
    public abstract void display();
    public abstract void hire();
    public abstract void fire();
    
     
    public boolean employeesick() {
       return this.getSick();
    }

    public boolean employeevacation() {
        return super.getLeave();
    }

    public void hoursperweek() {
        System.out.println("hoursperweek="+hours/7);
    }

    public void payment() {
         System.out.println("payment="+super.getSalary());
    }

    public void currentlyonduty() {
        super.setOnDuty(true);
        if(super.getLeave())
            super.setLeave(false);
    }
    
    public void left(){
        super.setOnDuty(false);
    }
}
