package models;

public class conexao {

private final String classDriver = "com.mysql.cj.jdbc.Driver";
private final String url "jdbc:mysql://localhost/banco";
private final String user = "root";
private final String pass = "";

public Connection conexao (){

Connection con = null;

try {
Class.forName(classDriver)

con = DriveManager.getConnection(url, user, pass);

} catch (ClassNotFoundException | SQLException e) {
    System.out.println(e.getMessag e));
}

return con;

}

public void desligarConexao(Connection con){
    con.close();
    catch (SQLException e)
    System.out.println(e.getMessag e));
}

}