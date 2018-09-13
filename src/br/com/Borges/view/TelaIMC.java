package br.com.Borges.view;

import br.com.Borges.IMC;
import br.com.Borges.model.IMCs;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Erica
 */
public class TelaIMC extends JFrame implements ActionListener {
    
    //busca o model
    private IMCs imc;
    
    private JTextField txtPeso, txtAltura, txtResultado;
    private JButton btnCalcular;

    @Override
    public void actionPerformed(ActionEvent e) {
           
    }

    public TelaIMC() throws HeadlessException {
        setLayout(new GridLayout(0,2));
        
        txtPeso = new JTextField();
        txtAltura = new JTextField();
        txtResultado = new JTextField();
        txtResultado.setEditable(false); //para nao conseguir editar o conteudo 
        
        btnCalcular = new JButton("Calcular");
        
        this.add(new JLabel("Peso"));
        this.add(txtPeso);
        
        this.add(new JLabel("Altura"));
        this.add(txtAltura);
        
        this.add(new JLabel("Resultado"));
        this.add(txtResultado);
        
        this.add(btnCalcular);
        btnCalcular.addActionListener(this); 
        
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public IMCs getImc() {
        //vai receber os valores que o usuario digitou
        imc.setAltura(Double.parseDouble(txtAltura.getText()));
        imc.setPeso(Double.parseDouble(txtPeso.getText()));
        return imc;
    }

    public void setImc(IMCs imc) {
        if (imc.getAltura()>0){
            //converte o double para string para aparecer na tela
            txtResultado.setText(Double.toString( imc.getIMCs())); 
        }
        this.imc = imc;
    }
    
    //metodo para pegar o controller e colocar no botao
    public void addControllerActionListener(ActionListener al){
        btnCalcular.addActionListener(al);
    }
        
}
