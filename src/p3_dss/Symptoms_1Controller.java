/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_dss;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

/**
 *
 * @author alejandra
 */
public class Symptoms_1Controller implements Initializable {
    
    

    
    
    @FXML
    private void EndButton(ActionEvent event) throws Exception {
        
   
      try{
          
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("FXMLSurgeryDiagnosis.fxml"));

        Parent SymptomsController = loader.load();
        Scene Symptoms_1 = new Scene(SymptomsController);

        //SurgeryController controller = loader.getController();
        
       

        Stage window = new Stage();
        window.setScene(Symptoms_1);

        window.show();
        
        
        // Cierro la ventana donde estoy
        Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        myStage.close();
       
      }catch(IOException e){
           System.out.println("Error" +e);
       }
    }
    
    
    
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
}
