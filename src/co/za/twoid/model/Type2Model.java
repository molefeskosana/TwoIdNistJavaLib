package co.za.twoid.model;

import java.util.Arrays;

import co.za.twoid.model.typetwochild.*;
public class Type2Model {
	
	private String LEN;//field 1
	private String IDC;//field 2
	private String SYS;//field 3
	private DAR DAR;//field 4
	private DLU DLU;//field 5
	private String PIN;//field 10
	private String REN;//field 11
	private String PCN;//field 12
	private String PAN;
	private String VIN;
	private String OTN;
	private String SPN;
	private String TRN; //field 16
	private String MN1;//field 17
	private String MN2;
	private ZeroOneNine ZeroOneNine;
	private String DOB;//field 35
	private String SEX;//field 39
	private String BLS;//field 40
	private String DES;//field 41
	private String ACS;//field 42
	private String SIF;
	private String AUI;
	private IMR IMR;//field 45
	private String OPE;
	private String RLS; //field 64
	private String ERM; //field 11
	private FGP FGP;//field 83
	private String RE1;//field 118
	private String RE2;//field 119
	private String RE3;
	private String ANM;//field 120
	private String RC;
	
	public void setRC(String RC){
		this.RC = RC;
	}
	
	public String getRC(){
		return RC;
	}
	
	public void setRLS(String RLS){
		this.RLS = RLS;
	}
	public String getRLS(){
		return RLS;
	}
	public String getLEN(){
		return LEN;
	}
	public void setLEN(String LEN){
		this.LEN = LEN;
	}
	public String getIDC(){
		return IDC;
	}
	public void setIDC(String IDC){
		this.IDC = IDC;
	}
	public String getSYS(){
		return SYS;
	}
	public void setSYS(String SYS){
		this.SYS = SYS;
	}
	public DAR getDAR(){
		return DAR;
	}
	public String getTRN(){
		return TRN;
	}
	public void setTRN(String TRN){
		this.TRN = TRN;
	}
	public void setDAR(String DAR){
		String dar = DAR;
		DAR darObj = new DAR();
		darObj.setFieldFourPointOne(dar);
		this.DAR = darObj;
	}
	public DLU getDLU(){
		return DLU;
	}
	public void setDLU(String DLU){
		String dlu = DLU;
		DLU dluObj = new DLU();
		dluObj.setFieldFivePointOne(dlu);
		this.DLU = dluObj;
	}
	public String getPIN(){
		return PIN;
	}
	public void setPIN(String PIN){
		this.PIN = PIN;
	}
	public String getREN(){
		return REN;
	}
	public void setREN(String REN){
		this.REN = REN;
	}
	public String getPCN(){
		return PCN;
	}
	public void setPCN(String PCN){
		this.PCN = PCN;
	}
	public String getPAN(){
		return PAN;
	}
	public void setPAN(String PAN){
		this.PAN = PAN;
	}
	public String getVIN(){
		return VIN;
	}
	public void setVIN(String VIN){
		this.VIN = VIN;
	}
	public String getOTN(){
		return OTN;
	}
	public void setOTN(String OTN){
		this.OTN = OTN;
	}
	public String getSPN(){
		return SPN;
	}
	public void setSPN(String SPN){
		this.SPN = SPN;
	}
	public String getMN1(){
		return MN1;
	}
	public void setMN1(String MN1){
		this.MN1 = MN1;
	}
	public String getMN2(){
		return MN2;
	}
	public void setMN2(String MN2){
		this.MN2 = MN2;
	}
	public ZeroOneNine getZeroOneNine(){
		return ZeroOneNine;
	}
	public void setZeroOneNine(ZeroOneNine ZeroOneNine){
		this.ZeroOneNine = ZeroOneNine;
	}
	public String getDOB(){
		return DOB;
	}
	public void setDOB(String DOB){
		this.DOB = DOB;
	}
	public String getSEX(){
		return SEX;
	}
	public void setSEX(String SEX){
		this.SEX = SEX;
	}
	public String getBLS(){
		return BLS;
	}
	public void setBLS(String BLS){
		this.BLS = BLS;
	}
	public String getDES(){
		return DES;
	}
	public void setDES(String DES){
		this.DES = DES;
	}
	public String getACS(){
		return ACS;
	}
	public void setACS(String ACS){
		this.ACS = ACS;
	}
	public String getSIF(){
		return SIF;
	}
	public void setSIF(String SIF){
		this.SIF = SIF;
	}
	public String getAUI(){
		return AUI;
	}
	public void setAUI(String AUI){
		this.AUI = AUI;
	}
	public IMR getIMR(){
		return IMR;
	}
	public void setIMR(String IMR){
		String imr = IMR;
		IMR imrObj = new IMR();
		imrObj.setFP(imr);
		this.IMR = imrObj;
	}
	public String getOPE(){
		return OPE;
	}
	public void setOPE(String OPE){
		this.OPE = OPE;
	}
	public String getERM(){
		return ERM;
	}
	public void setERM(String ERM){
		this.ERM = ERM;
	}
	public FGP getFGP(){
		return FGP;
	}
	public void setFGP(String FGP){
		String fgp = FGP;
		FGP fgpObj = new FGP();
		fgpObj.setFieldEightyThreePointOne(fgp);
		this.FGP = fgpObj;
	}
	public String getRE1(){
		return RE1;
	}
	public void setRE1(String RE1){
		this.RE1 = RE1;
	}
	public String getRE2(){
		return RE2;
	}
	public void setRE2(String RE2){
		this.RE2 = RE2;
	}
	public String getRE3(){
		return RE3;
	}
	public void setRE3(String RE3){
		this.RE3 = RE3;
	}
	public String getANM(){
		return ANM;
	}
	public void setANM(String ANM){
		this.ANM = ANM;
	}
}
