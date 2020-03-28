
package resturant.management;



public class Table {
    private int capacity;
    private boolean free;

    public Table(int capacity, boolean free) {
        this.capacity = capacity;
        this.free = free;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void setFree(boolean free){
	this.free = free;
    }
	
    public boolean getFree(){
    return this.free;
    }


    public void display()
    {
        System.out.println("Capacity="+capacity);
        if(this.getFree())
	    System.out.println("Table is available");
	else
	    System.out.println("Table is occupied");
    }
    
    
    
}
