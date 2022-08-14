package reto_5.model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import reto_5.model.vo.InformeProyectosVo;
import reto_5.util.JDBCUtilities;

public class InformeProyectosDao {

    public List<InformeProyectosVo> listar() throws SQLException {
        ArrayList<InformeProyectosVo> respuesta = new ArrayList<InformeProyectosVo>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stm = null;
        ResultSet rs = null;
        String consulta = "SELECT ID_Proyecto as ID, Constructora, Numero_Habitaciones as Habitaciones, Ciudad "+
        "FROM Proyecto "+
        "WHERE Ciudad IN ('Santa Marta', 'Cartagena', 'Barranquilla') AND Clasificacion == 'Casa Campestre';";

        try{
            stm = conn.createStatement();
            rs = stm.executeQuery(consulta);
            while (rs.next()){
                InformeProyectosVo vo = new InformeProyectosVo();
                vo.setId(rs.getInt("ID"));
                vo.setConstructora(rs.getString("Constructora"));
                vo.setHabitaciones(rs.getInt("Habitaciones"));
                vo.setCiudad(rs.getString("ciudad"));
                respuesta.add(vo);
            }
        }
        finally{
            if (rs != null){
                rs.close();
            }
            if (stm != null){
                stm.close();
            }
            if(conn != null){
                conn.close();
            }
        }

        return respuesta;
    }
    
}
