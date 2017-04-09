/**
 * Sample Skeleton for 'CercaParole.fxml' Controller Class
 */

package CercaParoleChiave;

import java.net.URL;
import java.util.ResourceBundle;

import CercaParoleChiave.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CercaParoleController {
	
	Model model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnCerca"
    private Button btnCerca; // Value injected by FXMLLoader

    @FXML // fx:id="txtInsert"
    private TextArea txtInsert; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader
    
    public void setModel(Model model){
    	this.model=model;
    }

    @FXML
    void doCerca(ActionEvent event) {
    	
    	String testoInserito = txtInsert.getText();
    	
    	testoInserito = testoInserito.toLowerCase().replaceAll("[ \\p{Punct}]", " ");
    	/*
    	if(testoInserito.contains("innabile"))
    		txtResult.appendText("Trovata!!");
    	else
    		txtResult.appendText("Non trovata :/");
    		*/
    	
    	txtResult.setText(model.cercaParoleChiave(testoInserito));

    }

    @FXML
    void doReset(ActionEvent event) {
    	
    	txtInsert.clear();
    	txtResult.clear();

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'CercaParole.fxml'.";
        assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'CercaParole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'CercaParole.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'CercaParole.fxml'.";

    }
}
