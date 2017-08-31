import java.util.ArrayList;
import java.util.List;

public class ReplaceInstanceDemo {
	public static void main(String args[]) {
		ReplaceInstanceDemo r=new ReplaceInstanceDemo();
		List<Long> carlist=new ArrayList<>();
		carlist.add(100L);
		Car c=new Car();
		c.setCarlist(carlist);	
		r.fun(c);
		List<Long> bikelist=new ArrayList<>();
		bikelist.add(200L);
		Bike b=new Bike();
		b.setBikelist(bikelist);
		r.fun(b);
		
	}
	public void fun(Car c){
		System.out.println(c.carlist);
	}
	public void fun(Bike b){
		System.out.println(b.bikelist);
	}
}

class Car{
	List<Long> carlist;

	public List<Long> getCarlist() {
		return carlist;
	}

	public void setCarlist(List<Long> carlist) {
		this.carlist = carlist;
	}
	
}
class Bike{
	List<Long> bikelist;

	public List<Long> getBikelist() {
		return bikelist;
	}

	public void setBikelist(List<Long> bikelist) {
		this.bikelist = bikelist;
	}
}