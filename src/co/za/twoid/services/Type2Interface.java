package co.za.twoid.services;

import java.util.List;

import co.za.twoid.model.Type2Model;
import co.za.twoid.model.typetwochild.RLS;
/**
 * 
 * @author Molefe Skosana
 * @date 2019/05/23
 *
 */
public interface Type2Interface {
	
	Type2Model allType2Values(byte[] nistFile);
	RLS returnRLS(String rls);
	List<String> rlsList(String value);
	
}
