package br.com.Borges.controller;

import br.com.Borges.model.IMCs;
import br.com.Borges.view.TelaIMC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Erica
 */
public class ControllerIMC implements ActionListener{
   
    private TelaIMC minhaView;

    public ControllerIMC() {
        minhaView = new TelaIMC();
        IMCs model = new IMCs();
        minhaView.setImc(model); //metodo ja criado antes
        this.minhaView.addControllerActionListener(this);
        this.minhaView.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //se minha view for diferente de nulo ela existe
        if (minhaView!=null){
            //se for nulo calcula o imc
            this.calcularImc();
        }
    }

    private void calcularImc() {
       IMCs imc = minhaView.getImc();
       imc.getIMCs();
       minhaView.setImc(imc);
       
    }
    
    
    
}
