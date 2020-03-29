/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    private boolean free = true;
    
    public boolean getFree(){
        return free;
    }
    
    public void setFree(boolean a){
        free = a;
    }
    
    public void toggle(){
        boolean b = this.getFree();
        this.setFree(!b);
        //this.setFree(!this.getFree());
    }
	public static void main (String[] args) {
		GFG haba = new GFG();
		System.out.println(haba.getFree());
		haba.setFree(false);
		System.out.println(haba.getFree());
		haba.toggle();
		System.out.println(haba.getFree());
	}
}
