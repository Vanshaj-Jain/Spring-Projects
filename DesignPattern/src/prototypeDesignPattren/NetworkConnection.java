package prototypeDesignPattren;

public class NetworkConnection implements Cloneable {
	private String ip;
	private String loadData;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getLoadData() {
		return loadData;
	}
	public void setLoadData(String loadData) {
		this.loadData = loadData;
	}
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", loadData=" + loadData + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
}
