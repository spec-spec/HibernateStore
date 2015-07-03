package org.ua.taras.hs.dao;

public class Factory {

    
    private static ElementDAO ElementDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
          if (instance == null){
            instance = new Factory();
          }
          return instance;
    }

    public ElementDAO getElementDAO(){
          if (ElementDAO == null){
            ElementDAO = new ElementDAO();
          }
          return ElementDAO;
          }
}
