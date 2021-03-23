package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco = new Parole ();
	ArrayList <Parole> E = new ArrayList <Parole> ();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    private TextArea txtTempo;
    
    @FXML
    private Button btnCancella;

    @FXML
    void doCancella(ActionEvent event) 
    {
    	this.elenco.Cancella(this.txtParola.getText());
    	this.txtResult.clear();
    	this.txtTempo.clear();
    	this.elenco.getElenco(); 
    	for(int i=0; i< this.elenco.getElenco().size();i++)
    	{
    		this.txtResult.setText(this.txtResult.getText()+"\n"+this.elenco.getElenco().get(i));
    	}
    	this.txtTempo.setText(this.elenco.Tempo());
    }
    
    @FXML
    void doInsert(ActionEvent event) 
    {
    	this.txtResult.clear();
    	if(this.txtParola.getText() != null)
    	{
    		this.elenco.addParola(this.txtParola.getText());
    		this.elenco.getElenco(); 
        	for(int i=0; i< this.elenco.getElenco().size();i++)
        	{
        		this.txtResult.setText(this.txtResult.getText()+"\n"+this.elenco.getElenco().get(i));
        	}
    	}
    }

    @FXML
    void doReset(ActionEvent event) 
    {
    	this.elenco.reset();
    	this.txtResult.clear();
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
