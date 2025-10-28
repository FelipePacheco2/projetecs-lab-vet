package FakeBD;

import java.util.ArrayList;

import Dominio.Colaborador;

public class ColaboradorFakeDB extends AbsFakeDB<Colaborador>{

    @Override
    protected void AutoPreencher(){
        if(this.instancia == null){
            this.instancia = new ArrayList<>();
        }
        this.instancia.add(new Colaborador("felipe", 2.000, "21101"));
    }

    public ColaboradorFakeDB(){
        super();
    }

}