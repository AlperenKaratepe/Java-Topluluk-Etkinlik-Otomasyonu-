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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import veritabani.Veritabani;

public class uyekayit {
	Connection baglanti=null;
    PreparedStatement sorguIfadesi=null;
    ResultSet getirilen=null;
    String sql, veritabaniOlustur, tablolar;
	Statement stat = null;
	
	public uyekayit() { baglanti = Veritabani.Baglan(); }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField ad;

    @FXML
    private TextField soyad;

    @FXML
    private TextField telefon;

    @FXML
    private TextField top_ad;

    @FXML
    private TextField tarih;

    @FXML
    private Button kayitol;

    @FXML
    private Button grs;
    @FXML
    private AnchorPane uyekayit;


    @FXML
    void ad_Click(ActionEvent event) {

    }

    @FXML
    void grs_Click(ActionEvent event) {
    	try {
			AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("giris.fxml"));
			uyekayit.getChildren().setAll(pane1);
    	
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void kayitol_Click(ActionEvent event) {
    	
    	sql="insert into uye_kaydi(ad,soyad,telefon,topluluk_adi,kayit_tarihi) values(?,?,?,?,?)";
    	try {
			sorguIfadesi=baglanti.prepareStatement(sql);
			sorguIfadesi.setString(1,ad.getText().trim());
			sorguIfadesi.setString(2,soyad.getText().trim());
			sorguIfadesi.setString(3,telefon.getText().trim());
			sorguIfadesi.setString(4,top_ad.getText().trim());
			sorguIfadesi.setString(5,tarih.getText().trim());

			sorguIfadesi.executeUpdate();
			System.out.println("ekleme tamam");
		} catch (Exception e) {
			
			System.out.println(e.getMessage().toString());
		}
		
    }

    @FXML
    void soyad_Click(ActionEvent event) {

    }

    @FXML
    void tarih_Click(ActionEvent event) {

    }

    @FXML
    void telefon_Click(ActionEvent event) {

    }

    @FXML
    void top_ad_Click(ActionEvent event) {

    }

    @FXML
    void initialize() {
       
    }
}
