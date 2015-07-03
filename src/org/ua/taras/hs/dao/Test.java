package org.ua.taras.hs.dao;
import java.sql.SQLException;
import java.util.List;

import org.ua.taras.hs.data.Element;

public class Test {

	public static void main(String[] args) throws SQLException {
      
		Element e1 = new Element(3, "radio", "2121", 3, "like new");
		Factory.getInstance().getElementDAO().addElement(e1);
		
        List<Element> elem = Factory.getInstance().getElementDAO().getAllElements();
        System.out.println("========Все елементы=========");
        for(int i = 0; i < elem.size(); ++i) {
                System.out.println("Название : " + elem.get(i).getName() + ", год : " + elem.get(i).getYear() +",  id : " + elem.get(i).getId());
                System.out.println("=============================");              
        }       
    
	}

}
