package veritabani;

import java.sql.*;

public class Veritabani {
	
	static Connection conn=null;
	public static Connection Baglan() {
		try {
			//conn=DriverManager.getConnection("jdbc:mysql://ServerIP/db_ismi", "kullanici", "sifre");
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost/topluluk?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
			return conn;
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			return null;
			// TODO: handle exception
		}
	}
	

}