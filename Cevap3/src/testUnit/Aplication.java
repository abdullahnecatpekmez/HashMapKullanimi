package testUnit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cevap3.Children;

public class Aplication  {

	public static void main(String[] args) {
		
		Children ch=new Children();
	    ch.putChildren();
	    ch.listChildrenValueAndKey();
		ch.addKeysAndValue("D","Dide");
		ch.listChildrenValueAndKey();
		ch.addKeysAndValue("D","Dede");
		ch.listChildrenValueAndKey();
		ch.removeValueAtChildren("C", "Cocuk");
		ch.listChildrenValueAndKey();
		ch.addKeysAndValue("C","Cocuk");
		ch.listChildrenValueAndKey();
	
	}

}
