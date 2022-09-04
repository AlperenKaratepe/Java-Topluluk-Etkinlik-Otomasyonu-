package application;

import java.beans.Statement;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import application.muzik.getir2;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import veritabani.Veritabani;

public class resim {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<getir> tablo;

    @FXML
    private TableColumn<getir, String> etkinlik_adi;

    @FXML
    private TableColumn<getir, String> duzenleyen;

    @FXML
    private TableColumn<getir, String> tarih;
    
    @FXML
    private TableColumn<getir, String> top_ad;
    
    @FXML
    private TableView<getir2> tablo2;

    @FXML
    private TableColumn<getir2, String> uye_ad;

    @FXML
    private TableColumn<getir2, String> uye_soyad;

    @FXML
    private TableColumn<getir2, String> uye_telefon;

    @FXML
    private TableColumn<getir2, String> uye_top_ad;

    @FXML
    private TableColumn<getir2, String> uye_tarih;

    @FXML
    private Button geri;

    @FXML
    private Label baslik;

    @FXML
    private Button uyeler;

    @FXML
    private Button etkinlikekle;

    @FXML
    private TextField ekle_ad;

    @FXML
    private TextField ekle_duzenleyen;

    @FXML
    private TextField ekle_tarih;

    @FXML
    private TextField ekle_topluluk;
      
    @FXML
    private TextField topluluk;
    
    Connection baglan=null;
    PreparedStatement sorgular=null;
    ResultSet gosterilen=null;
    String sorgu;
	Statement stat = null;
	
	 @FXML
	 void tablo_Click(MouseEvent event) {

		
		 getir eklenen=new getir();
	    	eklenen= (getir) tablo.getItems().get(tablo.getSelectionModel().getSelectedIndex());
	    	ekle_ad.setText(eklenen.getAd());
	    	ekle_duzenleyen.setText(eklenen.getDuzenleyen() );
	    	ekle_tarih.setText(eklenen.getTarih() );
	    	ekle_topluluk.setText(eklenen.getTopluluk());
	    }
	 
	 @FXML
	 void tablo2_Click(MouseEvent event) {
		 getir2 eklenen2=new getir2();
	    	eklenen2= (getir2) tablo2.getItems().get(tablo2.getSelectionModel().getSelectedIndex());
	    	 uye_ad.setText(eklenen2.getAdi());
	    	 uye_soyad.setText(eklenen2.getSoyad() );
	    	 uye_telefon.setText(eklenen2.getTelefon() );
	    	 uye_top_ad.setText(eklenen2.getTop_adi());
	    	 uye_tarih.setText(eklenen2.getTarihi());
		
	    }
	 
	 @FXML
	    void geri_Click(ActionEvent event) {
		 
	    }
	 
	 ObservableList<getir> list=FXCollections.observableArrayList();
	 public void goster() {
		 
		 sorgu = "select * from etkinlikler where top_ad='resim'";
		 try {
				sorgular=baglan.prepareStatement(sorgu);
				gosterilen = sorgular.executeQuery();
				while (gosterilen.next()) {
					list.add(new getir(gosterilen.getString("etkinlik_adi"),gosterilen.getString("duzenleyen"),gosterilen.getString("et_tarihi"),gosterilen.getString("top_ad")));

					
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage().toString());
			}
			//id.setCellValueFactory(new PropertyValueFactory<>("id"));
			
			
			tablo.setItems(list);
		}
	 
	 ObservableList<getir2> list2=FXCollections.observableArrayList();
	 
	 public void goster2() {
		
		 sorgu = "select * from uye_kaydi where topluluk_adi='resim'";
		 
		 try {
				sorgular=baglan.prepareStatement(sorgu);
				//sorgular.setString(1, "muzik");
				
				ResultSet gosterilen2 = sorgular.executeQuery();
				while (gosterilen2.next()) {
					list2.add(new getir2(gosterilen2.getString("ad"),gosterilen2.getString("soyad"),gosterilen2.getString("telefon"),gosterilen2.getString("topluluk_adi"),gosterilen2.getString("kayit_tarihi")));
					
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage().toString());
			}
			
			
			tablo2.setItems(list2);
		}
    @FXML
    void ekle_ad_Click(ActionEvent event) {

    }
    @FXML
    void ekle_topluluk_Click(ActionEvent event) {

    }

    @FXML
    void ekle_duzenleyen_Click(ActionEvent event) {

    }

    @FXML
    void ekle_tarih_Click(ActionEvent event) {

    }

    @FXML
    void etkinlikekle_Click(ActionEvent event) {

    	if(ekle_ad.getText().length()!=0 || ekle_duzenleyen.getText().length()!=0 || ekle_tarih.getText().length()!=0 || ekle_topluluk.getText().length()!=0 ) {
    		sorgu="Insert into etkinlikler(id,etkinlik_adi, duzenleyen,et_tarihi,top_ad) Values(?,?,?,?,?)";
    		try {
    			sorgular=baglan.prepareStatement(sorgu);
    			sorgular.setString(1, null);
    			sorgular.setString(2, ekle_ad.getText());
    			sorgular.setString(3, ekle_duzenleyen.getText());
    			sorgular.setString(4, ekle_tarih.getText());
    			sorgular.setString(5, ekle_topluluk.getText());
    			sorgular.execute();
    			System.out.println("eklendi.");
    		}
    		catch(Exception e) {
    			System.out.println(e.toString());
    		}
    	}
    	
    }

    

    @FXML
    void initialize() {
    	baglan=Veritabani.Baglan();
        if(baglan!=null) {
        	System.out.println("BAGLANTI TAMAM");
        }
        else {
        	System.out.println("BAGLANTIDA SORUN VAR");
        }
        
        etkinlik_adi.setCellValueFactory(new PropertyValueFactory<>("ad"));
		duzenleyen.setCellValueFactory(new PropertyValueFactory<>("duzenleyen")); 
		tarih.setCellValueFactory(new PropertyValueFactory<>("tarih"));
		top_ad.setCellValueFactory(new PropertyValueFactory<>("topluluk"));
        goster();
        
        uye_ad.setCellValueFactory(new PropertyValueFactory<>("adi"));
        uye_soyad.setCellValueFactory(new PropertyValueFactory<>("soyad")); 
        uye_telefon.setCellValueFactory(new PropertyValueFactory<>("telefon"));
		uye_top_ad.setCellValueFactory(new PropertyValueFactory<>("top_adi"));
		uye_tarih.setCellValueFactory(new PropertyValueFactory<>("tarihi"));
		goster2();
    }

    
public class getir {
	
	String ad,duzenleyen,tarih,topluluk;
	public  getir(String ad,String duzenleyen, String tarih,String topluluk) {
		 this.ad=ad;
		 this.duzenleyen=duzenleyen;
		 this.tarih=tarih;
		 this.topluluk=topluluk;
	 }
	 public getir() {
		 
	 }
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getDuzenleyen() {
		return duzenleyen;
	}
	public void setDuzenleyen(String duzenleyen) {
		this.duzenleyen = duzenleyen;
	}
	public String getTarih() {
		return tarih;
	}
	public void setTarih(String tarih) {
		this.tarih = tarih;
	}
	
	public String getTopluluk() {
		return topluluk;
	}
	public void setTopluluk(String topluluk) {
		this.topluluk = topluluk;
	}

  }
public class getir2 {
	
	String adi,soyad,telefon,top_adi,tarihi;
	public  getir2(String adi,String soyad,String telefon,String top_adi, String tarihi) {
		 this.adi=adi;
		 this.soyad=soyad;
		 this.telefon=telefon;
		 this.top_adi=top_adi;
		 this.tarihi=tarihi;
		 
	 }
	public getir2() {
		// TODO Auto-generated constructor stub
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getTop_adi() {
		return top_adi;
	}
	public void setTop_adi(String top_adi) {
		this.top_adi = top_adi;
	}
	public String getTarihi() {
		return tarihi;
	}
	public void setTarihi(String tarihi) {
		this.tarihi = tarihi;
	}
}
}