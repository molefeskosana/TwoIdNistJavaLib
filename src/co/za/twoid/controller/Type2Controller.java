package co.za.twoid.controller;

import java.util.List;

import org.jnbis.api.model.Nist;
import co.za.twoid.model.Type2Model;
import co.za.twoid.services.Type2ServiceImpl;
/**
 * 
 * @author Molefe Skosana
 * @date 2019/05/23
 *
 */
public class Type2Controller {
	
	private static Nist nist;
	private static Type2ServiceImpl nistService = new Type2ServiceImpl(nist);
	public static Type2Model type2service = new Type2Model();

	public static void set2Nist(byte[] nistInput){
		type2service = nistService.allType2Values(nistInput);
	}
	
	public static String fetchLEN(){
		return type2service.getLEN();
	}
	public static String fetchIDC(){
		return type2service.getIDC();
	}
	public static String fetchSYS(){
		return type2service.getSYS();
	}
	public static String fetchRE1(){
		return type2service.getRE1();
	}
	public static String fetchRE2(){
		return type2service.getRE2();
	}
	public static String fetchTRN(){
		return type2service.getTRN();
	}
	public static String fetchBLS(){
		return type2service.getBLS();
	}
	public static String fetchANM(){
		return type2service.getANM();
	}
	public static String fetchDES(){
		return type2service.getDES();
	}
	public static String fetchPIN(){
		return type2service.getPIN();
	}
	public static String fetchACS(){
		return type2service.getACS();
	}
	public static String fetchREN(){
		return type2service.getREN();
	}
	public static String fetchERM(){
		return type2service.getERM();
	}
	public static String fetchPCN(){
		return type2service.getPCN();
	}
	public static String fetchDOB(){
		return type2service.getDOB();
	}
	public static String fetchSEX(){
		return type2service.getSEX();
	}
	public static String fetchIMR(){
		return type2service.getIMR().getFP();
	}
	public static String fetchRLSHIT(){
		return nistService.sreHitType();
	}
	public static String fetchRLSHITIDC(){
		return nistService.sreHitID();
	}
	public static String fetchRLSHITCOUNT(){
		return nistService.sreHitCount();
	}
	public static String fetchRLSSCORE(){
		return nistService.sreHitScore();
	}
	public static String fetchRLSSRE(){
		return nistService.returnSRE();
	}
	public static String fetchDAR(){
		return type2service.getDAR().getFieldFourPointOne();
	}
	public static String fetchDLU(){
		return type2service.getDLU().getFieldFivePointOne();
	}
	public static String fetchRLS(){
		return type2service.getRLS();
	}
	public static String fetchRC(){
		return type2service.getRC();
	}
	//Multiple RLS SRE responses
	public static List<String> fetchRLSHITList(){
		return nistService.sreHitTypesList();
	}
	public static List<String> fetchRLSHITIDCList(){
		return nistService.sreHitIDList();
	}
	public static List<String> fetchRLSHITCOUNTList(){
		return nistService.sreHitCountList();
	}
	public static String fetchRLSHITCOUNTTemp(){
		String value = null;
		for(String count: nistService.sreHitCountList()){
			value = count;
		}
		return value;
	}
	public static List<String> fetchRLSSCOREList(){
		return nistService.sreHitScoreList();
	}
	public static List<String> fetchRLSSREList(){
		return nistService.sreList();
	}
}
