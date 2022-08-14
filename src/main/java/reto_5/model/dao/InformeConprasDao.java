package reto_5.model.dao;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import reto_5.model.vo.InformeComprasVo;
import reto_5.util.JDBCUtilities;

public class InformeConprasDao {

    public List<InformeComprasVo> listar() throws SQLException {
        ArrayList<InformeComprasVo> respuesta = new ArrayList<InformeComprasVo>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stm = null;
        ResultSet rs = null;
        String consulta = "SELECT c.ID_Compra as ID, p.Constructora, p.Banco_Vinculado as Banco "+
        "FROM Proyecto p "+
        "JOIN Compra c on (p.ID_Proyecto = c.ID_Proyecto) "+
        "WHERE c.Proveedor == 'Homecenter' AND p.Ciudad == 'Salento';";

        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(consulta);
            while (rs.next()) {
                InformeComprasVo vo = new InformeComprasVo();
                vo.setId(rs.getInt("ID"));
                vo.setConstructora(rs.getString("Constructora"));
                vo.setBanco(rs.getString("Banco"));
                respuesta.add(vo);
            }
        }

        finally {
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
