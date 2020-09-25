package co.za.twoid.controller;

import co.za.twoid.model.Type10Model;
import org.jnbis.api.model.Nist;
import co.za.twoid.services.Type10Interface;
import co.za.twoid.services.Type10ServiceImpl;

import com.sun.org.apache.xml.internal.security.utils.Base64;
/**
 * 
 * @author Molefe Skosana
 * @date 2019/05/23
 *
 */
public class Type10Controller {
	
	private static Nist nist;
	private static Type10Interface nistService = new Type10ServiceImpl(nist);
	public static Type10Model type10service = new Type10Model();

	public static void set10Nist(byte[] nistInput){
			type10service = nistService.type10Images(nistInput);
	}
	public static String fetchDAT(){
		return Base64.encode(type10service.getDAT());
	}
	
}
