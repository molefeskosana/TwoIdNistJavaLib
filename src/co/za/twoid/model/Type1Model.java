package co.za.twoid.model;

import co.za.twoid.model.typeonechild.CNT;
import co.za.twoid.model.typetwochild.RLS;

public class Type1Model {
	
	private String LEN;
	private String VER;
	private CNT CNT;
	private String TOT;
	private String DAT;
	private String PRY;
	private String DAI;
	private String ORI;
	private String TCN;
	private String TCR;
	private String NSR;
	private String NTR;
	private String value;
	
	public void setValue(String value){
		this.value = value;
	}
	public String getValue(){
		return value;
	}
	
	public String getLEN(){
		return LEN;
	}
	public void setLEN(String LEN){
		this.LEN = LEN;
	}
	public String getVER(){
		return VER;
	}
	public void setVER(String VER){
		this.VER = VER;
	}
	public CNT getCNT(){
		return CNT;
	}
	public void setCNT(String CNT){
		
		setValue(CNT);
		String cnt = getValue();
		
		CNT rlsObj = new CNT();
		if(cnt.contains("1.1")){
			rlsObj.setThreePointOne("1.1");
		}
		if(cnt.contains("2.00")){
			rlsObj.setThreePointTwo("2.00");
		}
		this.CNT = rlsObj;
	}
	public String getTOT(){
		return TOT;
	}
	public void setTOT(String TOT){
		this.TOT = TOT;
	}
	public String getDAT(){
		return DAT;
	}
	public void setDAT(String DAT){
		this.DAT = DAT;
	}
	public String getPRY(){
		return PRY;
	}
	public void setPRY(String PRY){
		this.PRY = PRY;
	}
	public String getDAI(){
		return DAI;
	}
	public void setDAI(String DAI){
		this.DAI = DAI;
	}
	public String getORI(){
		return ORI;
	}
	public void setORI(String ORI){
		this.ORI = ORI;
	}
	public String getTCN(){
		return TCN;
	}
	public void setTCN(String TCN){
		this.TCN = TCN;
	}
	public String getTCR(){
		return TCR;
	}
	public void setTCR(String TCR){
		this.TCR = TCR;
	}
	public String getNSR(){
		return NSR;
	}
	public void setNSR(String NSR){
		this.NSR = NSR;
	}
	public String getNTR(){
		return NTR;
	}
	public void setNTR(String NTR){
		this.NTR = NTR;
	}
	
}
