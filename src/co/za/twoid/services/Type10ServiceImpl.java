package co.za.twoid.services;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.jnbis.api.Jnbis;
import org.jnbis.api.model.Nist;
import org.jnbis.api.model.record.FacialAndSmtImage;

import co.za.twoid.model.Type10Model;
/**
 * 
 * @author Molefe Skosana
 * @date 2019/05/23
 *
 */
public class Type10ServiceImpl implements Type10Interface{
	
	private Nist nist;
	
	public Type10ServiceImpl(Nist nist){
		this.nist = nist;
	}
	
	public Type10Model type10Images(byte[] nistFile){
		
		ByteArrayInputStream input = new ByteArrayInputStream(nistFile);
		
		Type10Model type10ImagesModel = new Type10Model();
		nist = Jnbis.nist().decode(input);
		
		List<FacialAndSmtImage> T10Images = nist.getFacialAndSmtImages();
	    System.out.println("[Type 10] FacialAndSmtImage count = " + Integer.toString(T10Images.size()));
        for (FacialAndSmtImage faceImage : T10Images) {
        	type10ImagesModel.setDAT(faceImage.getImageData());
        }
		return  type10ImagesModel;
	}
	
}
