package co.za.twoid.services;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.jnbis.api.Jnbis;
import org.jnbis.api.model.Nist;
import org.jnbis.api.model.record.UserDefinedDescriptiveText;

import co.za.twoid.model.Type2Model;
import co.za.twoid.model.typetwochild.RLS;
/**
 * 
 * @author Molefe Skosana
 * @date 2019/05/23
 *
 */
public class Type2ServiceImpl implements Type2Interface{
	
	private Nist nist;
	
	public Type2ServiceImpl(Nist nist){
		this.nist = nist;
	}
	
	private static RLS object = new RLS();
	public static final String RECORD_SEPARATOR = Character.toString((char)30);
	public static final String UNIT_SEPARATOR = Character.toString((char)31);
	private static List<String> sres = new ArrayList<String>();
	private static List<String> sreHitTypes = new ArrayList<String>();
	private static List<String> sreHitScores = new ArrayList<String>();
	private static List<String> rls = new ArrayList<String>();
	private static List<String> sreHitIds = new ArrayList<String>();
	private static List<String> sreHitCounts = new ArrayList<String>();
	
	
	public Type2Model allType2Values(byte[] nistFile){
		
		ByteArrayInputStream input = new ByteArrayInputStream(nistFile);
		nist = Jnbis.nist().decode(input);
        UserDefinedDescriptiveText userDefinedText = nist.getUserDefinedTexts().get(0);
        Map<Integer, String> userDefinedFields = userDefinedText.getUserDefinedFields();
        Type2Model type2 = new Type2Model();
        int textFields = userDefinedFields.size();
        System.out.println("Type2 textFields number: "+textFields);
        
        for (Map.Entry<Integer, String> entry : userDefinedFields.entrySet()) {
           
            if(entry.getKey()== 1){
              type2.setLEN(entry.getValue());
              System.out.println("Type2 textFields LEN: "+type2.getLEN());
            }else if(entry.getKey()== 2){
              type2.setIDC(entry.getValue());
              System.out.println("Type2 textFields IDC: "+type2.getIDC());
            }else if(entry.getKey() == 3){
              type2.setSYS(entry.getValue());
              System.out.println("Type2 textFields SYS: "+type2.getSYS());
            }else if(entry.getKey() == 4){
              type2.setDAR(entry.getValue());
              System.out.println("Type2 textFields DAR: "+entry.getValue());
            }else if(entry.getKey() == 5){
              type2.setDLU(entry.getValue());
              System.out.println("Type2 textFields DLU: "+entry.getValue());
            }else if(entry.getKey() == 10){
              type2.setPIN(entry.getValue());
              System.out.println("Type2 textFields PIN: "+type2.getPIN());
            }else if(entry.getKey() == 11){
              type2.setREN(entry.getValue());
              System.out.println("Type2 textFields REN: "+type2.getREN());
            }else if(entry.getKey() == 74){
              type2.setERM(entry.getValue());
              System.out.println("Type2 textFields ERM: "+type2.getERM());
            }else if(entry.getKey() == 12){
              type2.setPCN(entry.getValue());
              System.out.println("Type2 textFields PCN: "+type2.getPCN());
            }else if(entry.getKey() == 16){
              type2.setTRN(entry.getValue());
              System.out.println("Type2 textFields TRN: "+entry.getValue());
            }else if(entry.getKey() == 17){
              type2.setMN1(entry.getValue());
              System.out.println("Type2 textFields MN1: "+type2.getMN1());
            }else if(entry.getKey() == 35){
              type2.setDOB(entry.getValue());
              System.out.println("Type2 textFields DOB: "+type2.getDOB());
            }else if(entry.getKey() == 39){
              type2.setSEX(entry.getValue());
              System.out.println("Type2 textFields SEX: "+type2.getSEX());
            }else if(entry.getKey() == 40){
              type2.setBLS(entry.getValue());
              System.out.println("Type2 textFields BLS: "+type2.getBLS());
            }else if(entry.getKey() == 41){
              type2.setDES(entry.getValue());
              System.out.println("Type2 textFields DES: "+type2.getDES());
            }else if(entry.getKey() == 42){
              type2.setACS(entry.getValue());
              System.out.println("Type2 textFields ACS: "+type2.getACS());
            }else if(entry.getKey() == 45){
              type2.setIMR(entry.getValue());
              System.out.println("Type2 textFields IMR: "+type2.getIMR());
            }else if(entry.getKey() == 64){
              type2.setRLS(entry.getValue());
              System.out.println("Type2 textFields RLS: "+entry.getValue());
              String.format("%h", entry.getValue());
            }else if(entry.getKey() == 83){
              type2.setFGP(entry.getValue());
              System.out.println("Type2 textFields FGP: "+type2.getFGP().getFieldEightyThreePointOne());
            }else if(entry.getKey() == 118){
              type2.setRE1(entry.getValue());
              System.out.println("Type2 textFields RE1: "+type2.getRE1());
            }else if(entry.getKey() == 119){
              type2.setRE2(entry.getValue());
              System.out.println("Type2 textFields RE2: "+type2.getRE2());
            }else if(entry.getKey() == 120){
              type2.setANM(entry.getValue());
              System.out.println("Type2 textFields ANM: "+type2.getANM());
            }else if(entry.getKey() == 121){
                type2.setRC(entry.getValue());
                System.out.println("Type2 textFields RC: "+type2.getRC());
            }else{
            	System.out.println("Value not registered in the model! ");
            }   
        }
        if(type2.getRLS() != null){
        	returnRLS(type2.getRLS());
        	rlsList(type2.getRLS());
        }
		return type2;
	}
	
	public RLS returnRLS(String rls){
		
		String[] newRlsValues = rls.split(RECORD_SEPARATOR);
		
		if("SRE".equalsIgnoreCase(newRlsValues[0])){
			if(newRlsValues.length >= 1){
				if(newRlsValues[0] != null){
					object.setSRE(newRlsValues[0]);;
				}
					if(newRlsValues.length >= 2){
						if(newRlsValues[1] != null){
							object.setHITTYPE(newRlsValues[1]);
						}
					}
						if(newRlsValues.length >= 3){
							if(newRlsValues[2] != null){
								object.setHITIDC(newRlsValues[2]);
							}
						}
							if(newRlsValues.length >= 4){
								if(newRlsValues[3] != null){
									object.setHITCOUNT(newRlsValues[3]);
								}
							}
								if(newRlsValues.length == 5){
									if(newRlsValues[4] != null){
										object.setSCORE(newRlsValues[4]);
									}
								}
			}
		}
		return object;
	}
	//Temporary workaround for RLS list
	//Reason: the csv format does not look like other csv files
	public List<String> rlsList(String value){
		
		String[] rsv = value.split(RECORD_SEPARATOR);
	
		if(!"SRE".equalsIgnoreCase(rsv[0])){
			rls = Arrays.asList(rsv);
		
			for(String rls : rls){
				String[] rlsValues = rls.split(UNIT_SEPARATOR);
				System.out.println("RLS object values = "+ Arrays.toString(rlsValues));
				System.out.println("RLS object values length = "+rlsValues.length);
				if(rlsValues.length >= 1){
					if(rlsValues[0] != null){
						sres.add(rlsValues[0]);
					}
						if(rlsValues.length >= 2){
							if(rlsValues[1] != null){
								sreHitTypes.add(rlsValues[1]);
							}
						}
							if(rlsValues.length >= 3){
								if(rlsValues[2] != null){
									sreHitIds.add(rlsValues[2]);
								}
							}
								if(rlsValues.length >= 4){
									if(rlsValues[3] != null){
										String add = rlsValues[3].substring(6);
										sreHitCounts.add(add);
									}
								}
									if(rlsValues.length >= 5){
										if(rlsValues[4] != null){
											sreHitScores.add(rlsValues[4]);
										}
									}
				}
			}
		}
		System.out.println("RLS list = "+ rls);
		
		return rls;
	}
	
	public List<String> sreList(){
		return sres;
	}
	public String returnSRE(){
		return object.getSRE();
	}
	public List<String> sreHitTypesList(){
		return sreHitTypes;
	}
	public String sreHitType(){
		return object.getHITTYPE();
	}
	public List<String> sreHitIDList(){
		return sreHitIds;
	}
	public String sreHitID(){
		return object.getHITIDC();
	}
	public List<String> sreHitCountList(){
		return sreHitCounts;
	}
	public String sreHitCount(){
		return object.getHITCOUNT();
	}
	public List<String> sreHitScoreList(){
		return sreHitScores;
	}
	public String sreHitScore(){
		return object.getSCORE();
	}
	
}
