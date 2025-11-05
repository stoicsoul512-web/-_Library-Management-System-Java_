import java.sql.*;
import java.util.*;

public class LibraryManager {

    public void addBook(Book b) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO books VALUES (?, ?, ?)");
            ps.setInt(1, b.id);
            ps.setString(2, b.title);
            ps.setString(3, b.author);
            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println(" Book added successfully!");
            ps.close();
        } catch (Exception e) {
            System.out.println(" Error adding book: " + e);
        }
    }

    public void viewBooks() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM books");
            System.out.println("\n Books in Library:");
            System.out.println("--------------------------");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1) + ", Title: " + rs.getString(2) + ", Author: " + rs.getString(3));
            }
            st.close();
        } catch (Exception e) {
            System.out.println(" Error displaying books: " + e);
        }
    }
}
