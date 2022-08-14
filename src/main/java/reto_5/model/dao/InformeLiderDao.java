package reto_5.model.dao;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import reto_5.model.vo.InformeLiderVo;
import reto_5.util.JDBCUtilities;

public class InformeLiderDao {

    public List<InformeLiderVo> listar() throws SQLException {
        ArrayList<InformeLiderVo> respuesta = new ArrayList<InformeLiderVo>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stm = null;
        ResultSet rs = null;
        String consulta = "SELECT ID_Lider as ID, Nombre, Primer_Apellido as Apellido, Ciudad_Residencia as Ciudad "+
        "FROM Lider "+
        "Order BY Ciudad";

        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(consulta);
            while (rs.next()) {
                InformeLiderVo vo = new InformeLiderVo();
                vo.setIdLider(rs.getInt("ID"));
                vo.setNombre(rs.getString("Nombre"));
                vo.setApellido(rs.getString("Apellido"));
                vo.setCiudad(rs.getString("Ciudad"));
                respuesta.add(vo);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

        return respuesta;
    }
}
