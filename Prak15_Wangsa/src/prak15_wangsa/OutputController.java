package prak15_wangsa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Praktikan
 */
public class OutputController  {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
 
    
    

    @FXML
    private Label lblDataMahasiswa;

    @FXML
    private Label lblNPM;

    @FXML
    private Label lblNama;

    @FXML
    private Label lblAlamat;

    @FXML
    private Button btnDataBaru;

    @FXML
    void openForm(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FormInput.fxml"));
        
        Stage stage = (Stage) btnDataBaru.getScene().getWindow();
        stage.setScene(new Scene(root));


    }
    public void showValue(Mahasiswa mhs){
        lblNPM.setText(mhs.getNPM());
        lblNama.setText(mhs.getNama());
        lblAlamat.setText(mhs.getAlamat());
        
    }
  }

