
package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class topluluklar {

    @FXML
    private ResourceBundle resources;

    @FXML
    private AnchorPane topluluk;

    @FXML
    private URL location;

    @FXML
    private Button muzik;

    @FXML
    private Button resim;

    @FXML
    private Button dans;

    @FXML
    private Button doga;

    @FXML
    private Button bisiklet;

    @FXML
    private Button bilgisayar;

    @FXML
    private Button cikis;

    @FXML
    void bilgisayar_Click(ActionEvent event) {
    	try {
    		Stage stage1=new Stage();
			AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("bilgisayar.fxml"));
			Scene scene1=new Scene(pane1);
			stage1.setScene(scene1);
			stage1.show();
			
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void bisiklet_Click(ActionEvent event) {
    	try {
    		Stage stage1=new Stage();
			AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("bisiklet.fxml"));
			Scene scene1=new Scene(pane1);
			stage1.setScene(scene1);
			stage1.show();
			
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void cikis_Click(ActionEvent event) {
    	try {
			AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("giris.fxml"));
			topluluk.getChildren().setAll(pane1);
    	
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void dans_Click(ActionEvent event) {
    	try {
    		Stage stage1=new Stage();
			AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("dans.fxml"));
			Scene scene1=new Scene(pane1);
			stage1.setScene(scene1);
			stage1.show();
			
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void doga_Click(ActionEvent event) {
    	try {
    		Stage stage1=new Stage();
			AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("doga.fxml"));
			Scene scene1=new Scene(pane1);
			stage1.setScene(scene1);
			stage1.show();
			
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void muzik_Click(ActionEvent event) {
    	try {
    		Stage stage1=new Stage();
			AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("muzik.fxml"));
			Scene scene1=new Scene(pane1);
			stage1.setScene(scene1);
			stage1.show();
			
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void resim_Click(ActionEvent event) {
    	try {
    		Stage stage1=new Stage();
			AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("resim.fxml"));
			Scene scene1=new Scene(pane1);
			stage1.setScene(scene1);
			stage1.show();
			
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void initialize() {
       
    }
}
