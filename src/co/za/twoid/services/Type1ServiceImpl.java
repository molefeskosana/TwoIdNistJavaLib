package co.za.twoid.services;

import java.io.ByteArrayInputStream;

import org.jnbis.api.Jnbis;
import org.jnbis.api.model.Nist;

import co.za.twoid.model.Type1Model;
/**
 * 
 * @author Molefe Skosana
 * @date 2019/05/23
 *
 */
public class Type1ServiceImpl implements Type1Interface {
	
	private Nist nist;
	
	public Type1ServiceImpl(Nist nist){
		this.nist = nist;
	}
	
	public Type1Model allType1Valuse(byte[] nistFile){
		
		ByteArrayInputStream input = new ByteArrayInputStream(nistFile);
		
		Type1Model type1 = new Type1Model();
		nist = Jnbis.nist().decode(input);
		System.out.println("Type1 textFields number: ");
		type1.setLEN(nist.getTransactionInfo().getLogicalRecordLength());
		System.out.println("Type1 textFields LEN: "+type1.getLEN());
		type1.setVER(nist.getTransactionInfo().getVersion());
		System.out.println("Type1 textFields VER: "+type1.getVER());
		type1.setCNT(nist.getTransactionInfo().getFileContent());
		System.out.println("Type1 textFields CNT: "+type1.getCNT().getThreePointOne());
		type1.setTOT(nist.getTransactionInfo().getTypeOfTransaction());
		System.out.println("Type1 textFields TOT: "+type1.getTOT());
		type1.setDAT(nist.getTransactionInfo().getDate());
		System.out.println("Type1 textFields DAT: "+type1.getDAT());
		type1.setPRY(nist.getTransactionInfo().getPriority());
		System.out.println("Type1 textFields PRY: "+type1.getPRY());
		type1.setDAI(nist.getTransactionInfo().getDestinationAgencyId());
		System.out.println("Type1 textFields DAI: "+type1.getDAI());
		type1.setORI(nist.getTransactionInfo().getOriginatingAgencyId());
		System.out.println("Type1 textFields ORI: "+type1.getORI());
		type1.setTCN(nist.getTransactionInfo().getControlNumber());
		System.out.println("Type1 textFields TCN: "+nist.getTransactionInfo().getControlNumber());
		type1.setTCR(nist.getTransactionInfo().getControlReferenceNumber());
		System.out.println("Type1 textFields TCR: "+type1.getTCR());
		type1.setNSR(nist.getTransactionInfo().getNativeScanningResolution());
		System.out.println("Type1 textFields NSR: "+type1.getNSR());
		type1.setNTR(nist.getTransactionInfo().getNominalTransmittingResolution());
		System.out.println("Type1 textFields NTR: "+type1.getNTR());
			
        return type1;
	}

}
