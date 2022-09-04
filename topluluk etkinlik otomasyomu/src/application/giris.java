package application;

import java.beans.Statement;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import veritabani.Veritabani;
import javafx.scene.control.Label;
import java.util.Random;

public class giris {
	
	Connection baglanti=null;
    PreparedStatement sorguIfadesi=null;
    ResultSet getirilen=null;
    String sql, veritabaniOlustur, tablolar;
	Statement stat = null;
	
	public giris() { baglanti = Veritabani.Baglan(); }


    @FXML
    private ResourceBundle resources;

    @FXML
    private AnchorPane giris;
    
    @FXML
    private URL location;

    @FXML
    private TextField kad;

    @FXML
    private TextField sifre;

    @FXML
    private Button giris_btn;
   
    @FXML
    private Label baslik;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Slider slider;

    @FXML
    private Label deger;

    @FXML
    private Label rand;

  

   
   @FXML
    void giris_btn_Click(ActionEvent event) {
    	
    	
    		sql="select * from uye_kaydi where ad=? and telefon=?";
    		
    	try {
			sorguIfadesi=baglanti.prepareStatement(sql);
			sorguIfadesi.setString(1,kad.getText().trim());
			sorguIfadesi.setString(2,sifre.getText().trim());
			ResultSet getirilen=sorguIfadesi.executeQuery();
			if(getirilen.next()) {
				System.out.println("giris tamam");
				try {
					AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("topluluklar.fxml"));
					giris.getChildren().setAll(pane1);
		    	
		    	} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.out.println("hata");
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage().toString());
		}
    	}
    	
    	
    
    		
    	
    

    @FXML
    void kad_Click(ActionEvent event) {

    }

    @FXML
    void sifre_Click(ActionEvent event) {

    }
    
    

    @FXML
    void initialize() {
    	
    	slider.setMax(20);
		slider.setMin(0);
		
    Random rnd = new Random();
    int sayi = rnd.nextInt(20);
    	
  
    	rand.setText(""+sayi);
    	
    	
		
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		
		slider.setMajorTickUnit(5);	
			
		slider.setBlockIncrement(10);
		
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observed, Number oldValue, Number newValue) {
			
				
				deger.setText("DEGER:"+newValue.intValue());
				
			}
		});
		
				
		
        kad.setText("alperen");
        sifre.setText("55555");
       
    }
}
