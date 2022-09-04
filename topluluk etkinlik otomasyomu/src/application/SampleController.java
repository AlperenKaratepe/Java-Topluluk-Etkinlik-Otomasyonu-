package application;

import java.beans.Statement;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import veritabani.Veritabani;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button guncelle;
    
    @FXML
    private Button btn1;

    @FXML
    private Button btn2;
    
    @FXML
    private AnchorPane anasayfa;

    @FXML
    void btn1_Click(ActionEvent event) {

    	try {
    		Stage stage1=new Stage();
			AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("uyekayit.fxml"));
			Scene scene1=new Scene(pane1);
			stage1.setScene(scene1);
			stage1.show();
			
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void btn2_Click(ActionEvent event) {

    	try {
    		Stage stage1=new Stage();
			AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("giris.fxml"));
			Scene scene1=new Scene(pane1);
			stage1.setScene(scene1);
			stage1.show();
			
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    Connection baglanti=null;
    PreparedStatement sorguIfadesi=null;
    ResultSet getirilen=null;
    String sql, veritabaniOlustur, tablolar;
	Statement stat = null;
	
	@FXML
    void guncelle_Click(ActionEvent event) {

		String url = "https://www.journaldev.com/sitemap.xml";
        try {
            dosyaindir.downloadUsingNIO(url, "C://dosya/sitemap.xml");
            
            dosyaindir.downloadUsingStream(url, "C://dosya/sitemapStream.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	

    @FXML
    void initialize() {
    	baglanti=Veritabani.Baglan();
        if(baglanti!=null) {
        	System.out.println("oluþtu");
        }
        else {
        	System.out.println("oluþmadýýý.");
        }
    }
}











