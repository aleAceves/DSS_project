/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_dss;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author alejandra
 */
public class StartViewController implements Initializable {
    
    @FXML
    private Label label;
    
    
    @FXML
    private TextField PatientField;
    
    
    //when the user click on save, go to the surgery window
    @FXML
    private void SaveButton(ActionEvent event) throws Exception {
        
       if (PatientField.getText().isEmpty()) {
           label.setText("Please enter the name of your patient");
           
       }else{
       
       try{
       
       //load the new window
       
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("FXMLSurgeryName.fxml"));

        Parent startView = loader.load();
        Scene SurgeryName = new Scene(startView);

        SurgeryController controller = loader.getController();
        controller.initOption();
       

        Stage window = new Stage();
        window.setScene(SurgeryName);

        window.show();
        
        
        // Cierro la ventana donde estoy
        Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        myStage.close();
        
       
       
       }catch(IOException e){
           System.out.println("Error" +e);
       }
       }     
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
