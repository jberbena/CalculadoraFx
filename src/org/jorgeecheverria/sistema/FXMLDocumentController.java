/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jorgeecheverria.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author ICT02
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private TextField txtResult;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnCero;
    
    @FXML private Button btnMas;
    @FXML private Button btnMenos;
    @FXML private Button btnMulti;
    @FXML private Button btnDivi;
    
    @FXML private Button btnCe;
    @FXML private Button btnC;
    
    @FXML private Button btnIgual;
    @FXML private Button btnMasMenos;
    @FXML private Button btnPunto;
    public float dato1,dato2;
    public int op;
    public double result;  
        
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno )
            txtResult.setText(txtResult.getText()+"1");
        else if (event.getSource() == btnDos)
            txtResult.setText(txtResult.getText()+"2");
        else if (event.getSource() == btnTres)
            txtResult.setText(txtResult.getText()+"3");
        else if (event.getSource() == btnCuatro)
            txtResult.setText(txtResult.getText()+"4");
        else if (event.getSource() == btnCinco)
            txtResult.setText(txtResult.getText()+"5");
        else if (event.getSource() == btnSeis)
            txtResult.setText(txtResult.getText()+"6");
        else if (event.getSource() == btnSiete)
            txtResult.setText(txtResult.getText()+"7");
        else if (event.getSource() == btnOcho)
            txtResult.setText(txtResult.getText()+"8");
        else if (event.getSource() == btnNueve)
            txtResult.setText(txtResult.getText()+"9");
        else if (event.getSource() == btnCero)
            txtResult.setText(txtResult.getText()+"0");
        else if (event.getSource() == btnPunto) {         
             if (! txtResult.getText().contains("."))
                txtResult.setText(txtResult.getText()+".");
             }
        else if (event.getSource() == btnMas){
            dato1 = Float.parseFloat(txtResult.getText());
            txtResult.setText("");
            op = 1;
            
        }
        else if (event.getSource() == btnMenos){
            dato1 = Float.parseFloat(txtResult.getText());
            txtResult.setText("");
            op = 2;
            
        }
        else if (event.getSource() == btnIgual){
            dato2 = Float.parseFloat(txtResult.getText());
            txtResult.setText("");
            switch (op){
                case 1:
                    result = dato1 + dato2;
                    txtResult.setText(String.valueOf(result));
                break;    
                case 2:
                    result = dato1 - dato2;
                    txtResult.setText(String.valueOf(result));
                break; 
            }
                
            
        } 
        
            
        
        
        
            
            
            
            
            
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
