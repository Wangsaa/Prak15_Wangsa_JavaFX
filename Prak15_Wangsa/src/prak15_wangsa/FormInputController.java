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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Praktikan
 */
public class FormInputController  {

    /**
     * Initializes the controller class.
     */
    
    

    @FXML
    private Label lblTambahDataMahasiswa;

    @FXML
    private TextField fieldNama;

    @FXML
    private TextField fieldAlamat;

    @FXML
    private Button btnTambah;

    @FXML
    private TextField fieldNPM;

    @FXML
    void sendData(ActionEvent event) throws IOException{
        Mahasiswa mhs = new Mahasiswa(fieldNPM.getText(), fieldNama.getText(),fieldAlamat.getText());
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Output.fxml"));
        Parent root = loader.load();
        
        OutputController outputController = loader.getController();
        
        outputController.showValue(mhs);
        
        Stage stage = (Stage) btnTambah.getScene().getWindow();
        stage.setScene(new Scene(root));

        }

    }
    
    

