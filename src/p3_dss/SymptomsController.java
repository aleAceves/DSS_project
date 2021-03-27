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
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;


/**
 *
 * @author alejandra
 */
public class SymptomsController implements Initializable{
    
    
    @FXML
    RadioButton abd_pain_no;
    @FXML
    RadioButton crash_no;
    @FXML
    RadioButton nauseas_no;
    @FXML
    RadioButton fever_no;
    @FXML
    RadioButton cysts_pancreas_no;
    @FXML
    RadioButton cysts_biliares_no;
    @FXML
    RadioButton satiety_no;
    @FXML
    RadioButton anemia_no;
    @FXML
    RadioButton cysts_spleen_no;
    @FXML
    RadioButton liver_disease_no;
    @FXML
    RadioButton reflux_no;
    @FXML
    RadioButton difficulty_swallow_no;
    @FXML
    RadioButton acidity_no;
    @FXML
    RadioButton loss_weigh_no;
    @FXML
    RadioButton cough_no;
    @FXML
    RadioButton loss_voice_no;
    @FXML
    RadioButton respiratory_problems_no;
    @FXML
    RadioButton vomit_no;
    @FXML
    RadioButton dark_stools_no;
    @FXML
    RadioButton torax_pain_no;
   
    
    boolean abd_pain, crash, nausea, fever;
    
    
    
    private void GetSymptoms() throws Exception{
        
        if(!abd_pain_no.isSelected()){
            //patient.setAbdPain(true);
            //clips.assertString("(symtom (name upper-abd-pain) (activated FALSE) (present YES)");
        }
        
    }
    

        
        
    
    //pass to the next window of symptoms
    @FXML
    private void NextSymptoms(ActionEvent event) throws Exception {
        
   
      try{
          
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("FXMLSymptoms_1.fxml"));

        Parent surgeryController = loader.load();
        Scene Symptoms = new Scene(surgeryController);

        //SurgeryController controller = loader.getController();
        
       

        Stage window = new Stage();
        window.setScene(Symptoms);

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
