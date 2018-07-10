import java.util.ArrayList;
import java.util.Iterator;

class Data{
	
	private int id;
	private String name;
	private String phone;
	private String address;
	public Data(){
		
		this.name=null;
		this.phone= null;
		this.address=null;
	}
	
	public Data(int id_value,String name, String phone,String address){
		this.id= id_value;
		this.name= name;
		this.phone= phone;
		this.address= address;
	}
	
	public String getdata(){
		return String.format("ID: %d  Name: %s  PhoneNumber: %s  Address: %s",this.id,this.name,this.phone,this.address);
	}
}
public class InformationClass{
	public static void main(String args[]){
		ArrayList<Data> data= new ArrayList();
		Data d1= new Data(1234,"karthik","331225325","4657 south avenue,Dallas,TX");
		data.add(d1);
		Data d2= new Data(1231,"koushik","122548217","123 north avenue,Seattle,WA");
		data.add(d2);
		Data d3= new Data(1345,"Ram","9874563215","123 ga street,secane,PA");
		data.add(d3);
		Data d4= new Data(1345,"Ramesh","4567891565","58 thadam street,newyorkcity,ny");
		data.add(d4);
		
		Iterator<Data> i = data.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next().getdata());
		}
	}
}