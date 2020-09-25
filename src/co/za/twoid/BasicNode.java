package co.za.twoid;

import java.nio.file.Files;
import java.nio.file.Paths;

import co.za.twoid.controller.Type1Controller;
import co.za.twoid.controller.Type2Controller;
import co.za.twoid.services.Type1Interface;
import co.za.twoid.services.Type1ServiceImpl;
import co.za.twoid.services.Type2Interface;
import co.za.twoid.services.Type2ServiceImpl;

import org.jnbis.api.model.Nist;





/**
 * 
 * @author Molefe Skosana
 * @date 2019/05/23
 *
 */
import com.ibm.broker.plugin.*;

public class BasicNode{
	
	private static Nist nist;
	private static Type1Interface printService = new Type1ServiceImpl(nist);
	public static void main(String[] args)throws Exception {
		
		System.out.println("Hi I'm up and running");
		//twoIdNistModel.setStrDirOut("/opt/ABISDIR/JavaNistLocalDir/"+twoIdNistModel.getStrFBC()+"newfile"+".nist");
		Type2Controller controller = new Type2Controller();
		
		//Input file path
		byte[] content = Files.readAllBytes(Paths.get("C:/Users/molef/Documents/IBM material/Rcode/200228141423469_SREAUT_28022020153015828.nist"));
		controller.set2Nist(content);

		System.out.println("----------------------- Type1 fields -------------------------");
		//System.out.println(printService.allType2Values(content));
		System.out.println("new value printed: "+controller.fetchRC());
		System.out.println("----------------------- Type2 images -------------------------");

		System.out.println("Running completed! ");
		
	}

}
