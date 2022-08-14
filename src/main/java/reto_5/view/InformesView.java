package reto_5.view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import reto_5.controller.ReportesController;
import reto_5.model.vo.*;

public class InformesView extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private static ReportesController controller = new ReportesController();

    
    public InformesView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Informe1 = new javax.swing.JButton();
        Informe2 = new javax.swing.JButton();
        Informe3 = new javax.swing.JButton();
        tipoInforme = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable(modelo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Elija el informe que desea ver");

        Informe1.setText("Informe 1");
        Informe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Informe1ActionPerformed(evt);
            }
        });

        Informe2.setText("Informe 2");
        Informe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Informe2ActionPerformed(evt);
            }
        });

        Informe3.setText("Informe 3");
        Informe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Informe3ActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                " - ", " - ", " - ", " - "
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Informe1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Informe2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Informe3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(tipoInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Informe1)
                    .addComponent(Informe2)
                    .addComponent(Informe3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Informe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Informe1ActionPerformed
        tipoInforme.setText("<html>Informe 1: Generar un informe basándose en la tabla con la información respectiva al “Líder”. "+
                "El listado debe contener: el ID_Lider, el Nombre, el Primer_Apellido y la Ciudad_Residencia. "+ 
                "Este informe debe estar ordenado por la “Ciudad_Residencia” de forma alfabética.<html>");
        
      
        try{
                List<InformeLiderVo> lideres = controller.listarLideres();
                //Creeación del modelo:
                modelo = new DefaultTableModel();
                modelo.addColumn("Id Lider");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellido");
                modelo.addColumn("Ciudad");
                for(InformeLiderVo lider: lideres){
                    Object[] fila = new Object[4];
                    fila[0]= lider.getIdLider();
                    fila[1]= lider.getNombre();
                    fila[2]= lider.getApellido();
                    fila[3]= lider.getCiudad();   
                    modelo.addRow(fila);                 
                }
                Tabla.setModel(modelo);
                modelo.fireTableDataChanged(); //actualizo el modelo de la tabla
            }
            catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        
    }//GEN-LAST:event_Informe1ActionPerformed

    private void Informe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Informe2ActionPerformed
        
        tipoInforme.setText("<html>Realizar un informe basándose en la información de los proyectos cuya clasificación sea "+
                "“Casa Campestre” y que estén ubicados en las ciudades de “Santa Marta”, “Cartagena” y “Barranquilla”. "+
                "Este informe debe contener: el ID_Proyecto, la Constructora, el Nùmero_Habitaciones y la respectiva Ciudad.<html>");
        
        try{
                    List<InformeProyectosVo> proyectos = controller.listarProyectos();
                    modelo = new DefaultTableModel();
                    modelo.addColumn("Id proyecto");
                    modelo.addColumn("Constructora");
                    modelo.addColumn("Habitaciones");
                    modelo.addColumn("Ciudad");
                    for(InformeProyectosVo proyecto: proyectos){
                        Object[] fila = new Object[4];
                        fila[0]= proyecto.getId();
                        fila[1]= proyecto.getConstructora();
                        fila[2]= proyecto.getHabitaciones();
                        fila[3]= proyecto.getCiudad();   
                        modelo.addRow(fila);                 
                    }
                    Tabla.setModel(modelo);
                    modelo.fireTableDataChanged();
                    
                }
                catch (Exception e){
                    System.out.println("Error: " + e.getMessage());
                }
    }//GEN-LAST:event_Informe2ActionPerformed

    private void Informe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Informe3ActionPerformed
        
        tipoInforme.setText("<html>Realizar un informe basándose en las compras realizadas por los proyectos con el proveedor "+
                "“Homecenter” y para la ciudad “Salento”. Este informe debe incluir: ID_Compra, Constructora y Banco_Vinculado.<html>");
        
        try{
                    List<InformeComprasVo> compras = controller.listarCompras();
                    modelo = new DefaultTableModel();
                    modelo.addColumn("Id compra");
                    modelo.addColumn("Constructora");
                    modelo.addColumn("Banco Vinculado");
                    
                    for(InformeComprasVo compra: compras){
                        Object[] fila = new Object[4];
                        fila[0]= compra.getId();
                        fila[1]= compra.getConstructora();
                        fila[2]= compra.getBanco();
                        modelo.addRow(fila);                 
                    }
                    Tabla.setModel(modelo);
                    modelo.fireTableDataChanged();
                }
                catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                }
    }//GEN-LAST:event_Informe3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Informe1;
    private javax.swing.JButton Informe2;
    private javax.swing.JButton Informe3;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel tipoInforme;
    // End of variables declaration//GEN-END:variables


    
}
