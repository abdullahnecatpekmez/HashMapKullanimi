package cevap3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



public class Children extends HashMap {
	//Degerler Araliste dizisinde tutuluyor.
	private ArrayList<String>[] valueList =(ArrayList<String>[]) new ArrayList[4];
	
	 private Map<String, List<String>> map = new HashMap<String, List<String>>();
	public void putChildren( ) {
	//Ýlk olara 4 dizi olarak tanimladim..
		for(int i=0;i<4;i++)
		{
			valueList[i]=new ArrayList();
		}
       //Ekleme yapiyorum...
		valueList[0].add("Anne");
		valueList[0].add("Anne");       
		valueList[1].add("Baba");
		valueList[1].add("Baba");
		valueList[2].add("Cocuk1");
		valueList[2].add("Cocuk");       
        map.put("A", valueList[0]);
        map.put("B", valueList[1]);
        map.put("C", valueList[2]);		
	}
	
	//HashMapi deger ve keylerini yazdiriyor.
	public void listChildrenValueAndKey()
	{
		//Key ve Degerler yazdiriliyor...
        System.out.println("Fetching Keys and corresponding [Multiple] Values n");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "n");
        }

		
	}
	//Girilen Keye gore Hashmape ekleme yapýyor.
	public void addKeysAndValue(String key2,String value){
		int i=0,j=0;
		 for (Map.Entry<String, List<String>> entry : map.entrySet()) {
	            String key = entry.getKey();
	            
	            if(key.equals(key2))
	            {
	            	valueList[i].add(value);
	            	j=1;
	            	break;
	            }
	            if(i==2 && j==0)//Ýlk 3 arrayliste yoksa 4. arraylist ekleme yapiyorum Keyi en son giriilen oluyor.
	            {
	            	
	            	
	            	 valueList[3].add(value);
           	         map.put(key2, valueList[3]);
           	       
	            	
	            	break;
           	}  
	            i++;
	        }
	}
	//Girilen degere gore silme yapiyorum.
	 public void removeValueAtChildren(String key2,String value){
		 int i=0,j=0;
		 for (Map.Entry<String, List<String>> entry : map.entrySet()) {
	            String key = entry.getKey();
	            if(key.equals(key2))
	            {
	            	valueList[i].remove(value);
	            	 map.put(key2, valueList[i]);
	            	 System.out.println("key " + key+" value "+value+" Silindi");
	            	j=1;
	            	break;
	            }
	            if(i==3 && j==0)
	            {
	            	System.out.println("Aranan deger bulunamadi!!!");
           	}	           
	            i++;
	        } 		
	 }

	
}

