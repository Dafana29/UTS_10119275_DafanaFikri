package com.abba.uts_10119275_akb.Presenters;

import com.abba.uts_10119275_akb.Interfaces.InterfaceMainView;
import com.abba.uts_10119275_akb.Interfaces.InterfaceModelCliente;
import com.abba.uts_10119275_akb.Interfaces.InterfacePresenterMain;
import com.abba.uts_10119275_akb.Models.Cliente;

import java.util.ArrayList;

public class PresenterMain implements InterfacePresenterMain {

    InterfaceMainView view;
    InterfaceModelCliente modelCliente;


    public PresenterMain(InterfaceMainView view) {
        this.view = view;

        modelCliente=new Cliente(this,view);

    }

    @Override
    public ArrayList<Cliente> getAllClient() {

        if(view!=null)
        {
            ArrayList<Cliente> clientes;
            clientes=modelCliente.getAllClient();


            return clientes;
        }
        else
        {
            return null;
        }


    }

    @Override
    public void updateLista() {


        view.updateLista();


    }

    @Override
    public ArrayList<Cliente> filterClient(String text, ArrayList<Cliente> oldList) {


        ArrayList<Cliente> newClientes=new ArrayList<>();
        text=text.toLowerCase();

        for(Cliente cliente:oldList)
        {
            String name=cliente.getName().toLowerCase();
            if(name.contains(text))
            {
                newClientes.add(cliente);

            }

        }


        return newClientes;
    }
}
