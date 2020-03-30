
package resturant.management;



public class Table {
	private int tableId;
    private int capacity;
    private boolean free;

    public Table(int ID,int capacity, boolean free) {
		this.tableId = ID;
        this.capacity = capacity;
        this.free = free;
    }


	 public int getId() {
        return TableId;
    }
	public void setId(int a){
		tableId = a;
	}

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
	
	public void toggle(){					// Sets a table free if it is occupied and occupies it if it is free.
	/*	boolean a = this.getFree(); 		// makes it too damn hard
		this.setFree(!a);
	*/	if(this.getFree() == true)			// actually you can just write: "  if(this.getFree())   " instead
			this.setFree(false);
		else
			this.setFree(true);
		
		System.out.print("Table no."+this.getId()+" is now ");
		if(this.getFree())
			System.out.println("available.");
		else
			System.out.println("booked.");
	}

    public void display()
    {
		System.out.println("Table No."+this.getId());
        System.out.println("Capacity="+this.getCapacity());
        if(this.getFree())
	    	System.out.println("Table is available");
		else
	    	System.out.println("Table is occupied"); 
    }
}
