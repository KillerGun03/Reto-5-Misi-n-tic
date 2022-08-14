package reto_5.controller;

import reto_5.model.dao.*;
import reto_5.model.vo.*;

import java.sql.SQLException;
import java.util.List;

public class ReportesController {

    private InformeLiderDao informesLiderDao;
    private InformeConprasDao informeCompraDao;
    private InformeProyectosDao informeproyectoDao;

    public ReportesController(){
        informeproyectoDao = new InformeProyectosDao();
        informeCompraDao = new InformeConprasDao();
        informesLiderDao = new InformeLiderDao();
    }

    public List<InformeProyectosVo> listarProyectos() throws SQLException{
        return informeproyectoDao.listar();
    }
    public List<InformeComprasVo> listarCompras() throws SQLException{
        return informeCompraDao.listar();
    }
    public List<InformeLiderVo> listarLideres() throws SQLException{
        return informesLiderDao.listar();
    }
    
}
