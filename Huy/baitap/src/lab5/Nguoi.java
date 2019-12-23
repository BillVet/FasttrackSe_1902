package lab5;

public class Nguoi {
	public String hoten;
	public int tuoi;
	public long cmnd;
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public long getCmnd() {
		return cmnd;
	}
	public void setCmnd(long cmnd) {
		this.cmnd = cmnd;
	}
	public Nguoi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nguoi(String hoten, int tuoi, long cmnd) {
		super();
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.cmnd = cmnd;
	}
}
