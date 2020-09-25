package co.za.twoid.services;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.jnbis.api.Jnbis;
import org.jnbis.api.model.Nist;
import org.jnbis.api.model.record.SignatureImage;

import co.za.twoid.model.Type8Model;
/**
 * 
 * @author Molefe Skosana
 * @date 2019/05/23
 *
 */
public class Type8ServiceImpl implements Type8Interface{
	
	private Nist nist;
	
	public Type8ServiceImpl(Nist nist){
		this.nist = nist;
	}
	
	public Type8Model type8Images(byte[] nistFile){
		
		ByteArrayInputStream input = new ByteArrayInputStream(nistFile);
		Type8Model type8ImagesModel = new Type8Model();
		nist = Jnbis.nist().decode(input);
		
		List<SignatureImage> T8Images = nist.getSignatures();
	    System.out.println("[Type 8] SignatureImage count = " + Integer.toString(T8Images.size()));
        for (SignatureImage sigImage : T8Images) {
        	type8ImagesModel.setDAT(sigImage.getImageData());
            if(type8ImagesModel.getDAT().length > 0){
            	System.out.println("Image present for type 8");
            }
        }
		return type8ImagesModel;
	}
}
