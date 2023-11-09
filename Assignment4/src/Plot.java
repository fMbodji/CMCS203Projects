/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Plot class 
 * Due: MM/DD/YYYY 
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Fatima Mbodji
*/

public class Plot {
	
	protected int x;
	protected int y;
	protected int width;
	protected int depth;
	
	public Plot() {
		this.width=1;
		this.depth=1;
	} 
	
	public Plot(int x, int y, int width, int depth) { 
		this.x= x; 
		this.y=y;
		this.width=width;
		this.depth=depth; 
	}
	
	public Plot (Plot otherPlot){
		this.x= otherPlot.x;
		this.y= otherPlot.y;
		this.width= otherPlot.width;
		this.depth= otherPlot.depth;
	}
	
	public int getX() {
		return x;
	}	
	public void setX(int x) {
		this.x=x; 
	}
	
	public int getY() {
		return y;
	}	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getWidth() {
		return width;
	}	
	public void setWidth(int width) {
		this.width=width;
	}
	
	public int getDepth() {
		return depth;
	}	
	public void setDepth(int depth) { 
		this.depth=depth;
	}
	
	public boolean encompasses(Plot plot) {
		if ( (this.x >= plot.x) && (this.y >= plot.y) && ((this.x+this.width) >= (plot.x + plot.width)) && ((this.y+this.depth) >= (plot.y + plot.depth)) )
		{
			return true; 
		}
			return false;		
	}
	
	public boolean overlaps(Plot plot) {
	    boolean xOverlap = false, yOverlap = false;  
	    if( (this.x > plot.x) && (this.x < (plot.x + plot.width)) || ( (plot.x > this.x) && (plot.x < (this.x + this.width)) ) )
	    {
	    	xOverlap= true;
	    }
	    if( (this.y > plot.y) && (this.y < (plot.y + plot.depth)) || ( (plot.y > this.y) && (plot.y < (this.y + this.depth)) ) )
	    {
	    	yOverlap= true;
	    }
	    return xOverlap && yOverlap;
	}

	
	public String toString() {
		return x + "," + y + "," + width + "," + depth;
		//return "X= " + x + ", " + "Y= " + y + ", " + "Width= " + width + ", and " + "Depth= " + depth + "." ;
	}
	
	
	

}
