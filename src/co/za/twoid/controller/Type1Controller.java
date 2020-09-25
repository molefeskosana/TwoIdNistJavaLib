package co.za.twoid.controller;

import org.jnbis.api.model.Nist;
import co.za.twoid.model.Type1Model;
import co.za.twoid.services.Type1Interface;
import co.za.twoid.services.Type1ServiceImpl;
/**
 * 
 * @author Molefe Skosana
 * @date 2019/05/23
 *
 */
public class Type1Controller {
	
	private static Nist nist;
	private static Type1Interface nistService = new Type1ServiceImpl(nist);
	public static Type1Model nistFile = new Type1Model();

	public static void set1Nist(byte[] nistInput){
		nistFile = nistService.allType1Valuse(nistInput);	 
	}
	public static String fetchLEN(){
		return nistFile.getLEN();
	}
	public static String fetchVER(){
		return nistFile.getVER();
	}
	public static String fetchCNT1(){
		return nistFile.getCNT().getThreePointOne();
	}
	public static String fetchCNT2(){
		return nistFile.getCNT().getThreePointTwo();
	}
	public static String fetchTOT(){
		return nistFile.getTOT();
	}
	public static String fetchDAT(){
		return nistFile.getDAT();
	}
	public static String fetchPRY(){
		return nistFile.getPRY();
	}
	public static String fecthDAI(){
		return nistFile.getDAI();
	}
	public static String fetchORI(){
		return nistFile.getORI();
	}
	public static String fetchTCN(){
		return nistFile.getTCN();
	}
	public static String fetchTCR(){
		return nistFile.getTCR();
	}
	public static String fetchNSR(){
		return nistFile.getNSR();
	}
	public static String fetchNTR(){
		return nistFile.getNTR();
	}
	
	
}
