import java.util.ArrayList;

public class Cereal {
	private String cerealName;
	private int sugar;

	
	public Cereal(String cerealName) {
		this.cerealName = cerealName;
	}
	public Cereal(String cerealName, int sugar) {
		this.cerealName = cerealName;
		this.sugar = sugar;
	}
	
	public String mostSugaramount(ArrayList<Cereal> list) {
		int maxVal = list.get(0).getSugar();
		String cerealName = "";
		
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getSugar() > maxVal) {
					maxVal = list.get(i).getSugar();
					cerealName = list.get(i).getCerealName();
				}
			}
			return cerealName;
	}
	
	public String getCerealName() {
		return cerealName;
	}
	
	public int getSugar() {
		return sugar;
	}
	

	

}
