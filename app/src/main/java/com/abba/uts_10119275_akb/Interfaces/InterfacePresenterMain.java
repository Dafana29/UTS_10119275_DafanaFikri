package com.abba.uts_10119275_akb.Interfaces;

import com.abba.uts_10119275_akb.Models.Cliente;

import java.util.ArrayList;

public interface InterfacePresenterMain {

    ArrayList<Cliente> getAllClient();

    void updateLista();

    ArrayList<Cliente> filterClient(String text, ArrayList<Cliente> oldList);


}
