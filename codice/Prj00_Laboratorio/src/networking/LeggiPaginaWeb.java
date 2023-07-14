package networking;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class Connessione {
	
	private static final String URL = "jdbc:mysql://localhost:3306/goal2023";
	private static final String USER = "app_goal";
	private static final String PASS = "java_2023!";
	
	private static Connection conn;
	
	public static Connection getConn() {
		if (conn == null)
			try {
				connetti();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return conn;
	}

	private static void connetti() throws SQLException {
		conn = DriverManager.getConnection(URL, USER, PASS);
		
	}
	
}



public class LeggiPaginaWeb {

	public static void main(String[] args) throws IOException, SQLException {

		URL elencoFilm = new URL("https://raw.githubusercontent.com/maboglia/ProgrammingResources/master/tabelle/csv/top250_film.csv");
		
		URLConnection uc = elencoFilm.openConnection();
		
		Scanner sc = new Scanner(uc.getInputStream(), StandardCharsets.UTF_8);
		
		StringBuilder sb = new StringBuilder();
		
		PreparedStatement ps;
		
		Connection conn = Connessione.getConn();
		
		ps = conn.prepareStatement("INSERT INTO film (titolo, rating) VALUES (?,?)");
		int i = 0;
		while (sc.hasNextLine()) {
			String string = sc.nextLine();
			sb.append(string + "\n");
			String[] parti = string.split(",");
			if (i++ > 0) {
				ps.setString(1, parti[0]);
				ps.setDouble(2, Double.parseDouble(parti[1]));
				ps.execute();
			}
			
			
		}
		
		System.out.println(sb.toString());

	}

}
