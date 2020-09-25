package co.za.twoid.controller;

import com.sun.org.apache.xml.internal.security.utils.Base64;
import org.jnbis.api.model.Nist;
import co.za.twoid.model.Type8Model;
import co.za.twoid.services.Type8Interface;
import co.za.twoid.services.Type8ServiceImpl;
/**
 * 
 * @author Molefe Skosana
 * @date 2019/05/23
 *
 */
public class Type8Controller {
	
	private static Nist nist;
	private static Type8Interface nistService = new Type8ServiceImpl(nist);
	public static Type8Model type8service = new Type8Model();

	public static void set8Nist(byte[] nistInput){
		type8service = nistService.type8Images(nistInput);	
	}
	public static String fetchDAT(){
		return Base64.encode(type8service.getDAT());
	}
	
}
