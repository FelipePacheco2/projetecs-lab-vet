package FakeBD;

import java.util.ArrayList;

import Dominio.Cliente;

public class ClienteFakeDB extends AbsFakeDB<Cliente>{

    @Override
    protected void AutoPreencher(){
        if(this.instancia == null){
            this.instancia = new ArrayList<>();
        }
        this.instancia.add(new Cliente(1, "Felipe", "123", "felipe@gmail", "123"));
    }

    public ClienteFakeDB(){
        super();
    }
}
