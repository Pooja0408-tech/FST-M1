package activities;

	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;

	class Plane {
	    private List<String> passengers;
	    private int maxPassengers;
	    private Date lastTimeTookOf;
	    private Date lastTimeLanded;

	    public Plane(int maxPassengers) {
	        this.maxPassengers = maxPassengers;
	        this.passengers = new ArrayList<String>();
	    }

	    public void onboard(String passengerName) {
	    	if(passengers.size()<= maxPassengers) {
	    		this.passengers.add(passengerName);
	    	} else {
	        System.out.println("Plane is full");
	    }
	    }
	    public Date takeOff() {
	        this.lastTimeTookOf = new Date();
	        return lastTimeTookOf;
	    }

	    public void land() {
	        this.lastTimeLanded = new Date();
	        this.passengers.clear();
	    }

	    public Date getLastTimeLanded() {
	        return lastTimeLanded;
	    }

	    public List<String> getPassengers() {
	        return passengers;
	    }
	}

	public class Activity6 {

	    public static void main(String[] args) throws InterruptedException {
	        //There is a plane with max 10 passengers
	        Plane plane = new Plane(10);
	        //Add passengers on the list
	        plane.onboard("A");
	        plane.onboard("B");
	        plane.onboard("C");
	        plane.onboard("D");
	        plane.onboard("E");
	        plane.onboard("F");
	        plane.onboard("G");
	        plane.onboard("H");
	        plane.onboard("I");
	        plane.onboard("J"); 
	        plane.onboard("H");
	        
	        //Plane take off time
	        System.out.println("Plane took off at: " + plane.takeOff());
	        //Print list of people on board
	        System.out.println("People on the plane: " + plane.getPassengers());
	        //Flying.....
	        Thread.sleep(9000);
	        //Plane has landed
	        plane.land();
	        //Plane lands
	        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
	        System.out.println("People on the plane after landing: " + plane.getPassengers());
	    }

	}

