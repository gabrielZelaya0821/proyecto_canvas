package proyecto.canvas;

import Thread.ImgHilo;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import manejo.excepciones.FileDoesNotExist;
import modelos.Alumno;
import modelos.Clase;
import modelos.Examen;
import modelos.Maestro;
import modelos.Registro;
import modelos.Tarea;
import modelos.Usuario;
import persistencia.datos.ManejoBinarios;

/**
 *
 * @author gabri
 */
public class Canvas extends javax.swing.JFrame {

    /**
     * Creates new form Canvas
     */
    public Canvas() {
        initComponents();
        setState();
        if(!binTerminado){
            setBin();
            binTerminado = true;
        }
        
        Registro registro = new Registro("admin", "admin", "admin");
        usuarios.add(registro);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGmaestro_frame = new javax.swing.JFrame();
        BGmaestro_blanco = new javax.swing.JPanel();
        txt_tablero = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        bg_clase1 = new javax.swing.JPanel();
        bg_color1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bg_clase2 = new javax.swing.JPanel();
        bg_color2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bg_clase3 = new javax.swing.JPanel();
        bg_color3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bg_clase4 = new javax.swing.JPanel();
        bg_color4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bg_clase5 = new javax.swing.JPanel();
        bg_color5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        bg_clase6 = new javax.swing.JPanel();
        bg_color6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bg_porHacer = new javax.swing.JPanel();
        txt_porHacer = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BGmaestro_azul = new javax.swing.JPanel();
        BGmaestro_rojo = new javax.swing.JPanel();
        img_unitec = new javax.swing.JLabel();
        btn_cerrarSesionCanvas = new javax.swing.JPanel();
        txt_cerrarSessionCanvas = new javax.swing.JLabel();
        btn_salirCanvas = new javax.swing.JPanel();
        txt_salirCanvas = new javax.swing.JLabel();
        BGclase_frame = new javax.swing.JFrame();
        BGmaestro_blanco1 = new javax.swing.JPanel();
        txt_ccNombre = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        img_thread = new javax.swing.JLabel();
        txt_tareas = new javax.swing.JLabel();
        txt_examenes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_tareas = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_examenes = new javax.swing.JTextArea();
        img_back_clasesFrame = new javax.swing.JLabel();
        BGtareas_frame = new javax.swing.JFrame();
        BGcrearTareas_blanco = new javax.swing.JPanel();
        txt_crearTareas = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tf_nombreTarea = new javax.swing.JTextField();
        txt_nombreTarea = new javax.swing.JLabel();
        btn_crearTarea = new javax.swing.JButton();
        txt_fechaEntrega = new javax.swing.JLabel();
        escogerFecha_tarea = new com.toedter.calendar.JDateChooser();
        txt_descripcion = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textA_descripcion = new javax.swing.JTextArea();
        img_back_crearTareas = new javax.swing.JLabel();
        txt_Hora = new javax.swing.JLabel();
        tf_horaTarea = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_tamañoMax = new javax.swing.JTextField();
        pp_evaluarTareas = new javax.swing.JPopupMenu();
        descargar = new javax.swing.JMenuItem();
        evaluar = new javax.swing.JMenuItem();
        BGcontestarTareas_frame = new javax.swing.JFrame();
        BGcrearTareas_blanco1 = new javax.swing.JPanel();
        txt_contestarTareas = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        img_back_crearTareas1 = new javax.swing.JLabel();
        txt_tareaEntrega = new javax.swing.JLabel();
        txt_fechaTareaEntrega = new javax.swing.JLabel();
        txt_descripcionContestar = new javax.swing.JLabel();
        img_drop = new javax.swing.JLabel();
        txt_nota = new javax.swing.JLabel();
        txt_valorNota = new javax.swing.JLabel();
        BGevaluarTareas_frame = new javax.swing.JFrame();
        BGcrearTareas_blanco2 = new javax.swing.JPanel();
        txt_contestarTareas1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        img_back_evaluarTareas = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_notasTareas = new javax.swing.JTable();
        BGregistro_frame = new javax.swing.JFrame();
        BGregistro_bienvenida = new javax.swing.JPanel();
        txt_presentacion = new javax.swing.JLabel();
        txt_bienvenida = new javax.swing.JLabel();
        txt_irrelevante = new javax.swing.JLabel();
        BGregistro_azul = new javax.swing.JPanel();
        registro_blanco = new javax.swing.JPanel();
        img_user = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        btn_cerrarSesion = new javax.swing.JPanel();
        txt_cerrarSession = new javax.swing.JLabel();
        btn_salir = new javax.swing.JPanel();
        txt_salir = new javax.swing.JLabel();
        btn_alumnos = new javax.swing.JPanel();
        img_alumnos = new javax.swing.JLabel();
        txt_alumnos = new javax.swing.JLabel();
        btn_maestros = new javax.swing.JPanel();
        img_maestros = new javax.swing.JLabel();
        txt_maestros = new javax.swing.JLabel();
        btn_usuarios = new javax.swing.JPanel();
        img_usuarios = new javax.swing.JLabel();
        txt_usuarios = new javax.swing.JLabel();
        btn_registro = new javax.swing.JPanel();
        img_registro = new javax.swing.JLabel();
        txt_registro = new javax.swing.JLabel();
        btn_matricular = new javax.swing.JPanel();
        img_matricular = new javax.swing.JLabel();
        txt_matricular = new javax.swing.JLabel();
        btn_adminClases = new javax.swing.JPanel();
        img_adminClases = new javax.swing.JLabel();
        txt_adminClases = new javax.swing.JLabel();
        clases_frame = new javax.swing.JFrame();
        jScroll_clases = new javax.swing.JScrollPane();
        tabla_clases = new javax.swing.JTable();
        clases_azul = new javax.swing.JPanel();
        img_backClases = new javax.swing.JLabel();
        img_addClases = new javax.swing.JLabel();
        crearClase_frame = new javax.swing.JFrame();
        crearClase_blanco = new javax.swing.JPanel();
        txt_claseID = new javax.swing.JLabel();
        txt_claseNombre = new javax.swing.JLabel();
        txt_claseHora = new javax.swing.JLabel();
        txt_claseUV = new javax.swing.JLabel();
        txt_clasePeriodo = new javax.swing.JLabel();
        txt_claseAño = new javax.swing.JLabel();
        txt_claseMaestro = new javax.swing.JLabel();
        tf_claseID = new javax.swing.JTextField();
        tf_claseNombre = new javax.swing.JTextField();
        cb_horasClase = new javax.swing.JComboBox<>();
        cb_uvClase = new javax.swing.JComboBox<>();
        cb_periodoClase = new javax.swing.JComboBox<>();
        añoClase = new com.toedter.calendar.JYearChooser();
        cb_maestros = new javax.swing.JComboBox<>();
        btn_crearClase = new javax.swing.JPanel();
        txt_crearClase = new javax.swing.JLabel();
        img_checkClase = new javax.swing.JLabel();
        crearClase_azul = new javax.swing.JPanel();
        img_back_crearClase = new javax.swing.JLabel();
        txt_nuevaClase = new javax.swing.JLabel();
        pp_clase = new javax.swing.JPopupMenu();
        modificar_clase = new javax.swing.JMenuItem();
        eliminar_clase = new javax.swing.JMenuItem();
        usuarios_frame = new javax.swing.JFrame();
        jScroll_usuarios = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        usuarios_azul = new javax.swing.JPanel();
        img_backUsuarios = new javax.swing.JLabel();
        modificarUsuario_frame = new javax.swing.JFrame();
        modificarUsuario_blanco = new javax.swing.JPanel();
        txt_usuario = new javax.swing.JLabel();
        txt_password = new javax.swing.JLabel();
        txt_rol = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        tf_password = new javax.swing.JTextField();
        cb_rol = new javax.swing.JComboBox<>();
        img_checkUsuario = new javax.swing.JLabel();
        modificarUsuario_azul = new javax.swing.JPanel();
        img_back_modificarUsuario = new javax.swing.JLabel();
        txt_modificarUsuario = new javax.swing.JLabel();
        pp_usuarios = new javax.swing.JPopupMenu();
        modificar_usuario = new javax.swing.JMenuItem();
        eliminar_usuario = new javax.swing.JMenuItem();
        alumnos_frame = new javax.swing.JFrame();
        jScroll_alumnos = new javax.swing.JScrollPane();
        tabla_alumnos = new javax.swing.JTable();
        alumnos_azul = new javax.swing.JPanel();
        img_backAlumnos = new javax.swing.JLabel();
        img_addAlumnos = new javax.swing.JLabel();
        img_checkAsignar = new javax.swing.JLabel();
        img_checkQuitar = new javax.swing.JLabel();
        crearAlumno_frame = new javax.swing.JFrame();
        crearAlumno_blanco = new javax.swing.JPanel();
        txt_numCuenta = new javax.swing.JLabel();
        txt_nombreAlumno = new javax.swing.JLabel();
        txt_carrera = new javax.swing.JLabel();
        ff_numCuenta = new javax.swing.JFormattedTextField();
        tf_alumnoNombre = new javax.swing.JTextField();
        cb_carreras = new javax.swing.JComboBox<>();
        txt_usuarioAlumno = new javax.swing.JLabel();
        tf_usuarioAlumno = new javax.swing.JTextField();
        txt_contraseñaAlumno = new javax.swing.JLabel();
        tf_contraseñaAlumno = new javax.swing.JTextField();
        btn_crearAlumno = new javax.swing.JPanel();
        txt_crearAlumno = new javax.swing.JLabel();
        img_checkAlumno = new javax.swing.JLabel();
        crearAlumno_azul = new javax.swing.JPanel();
        img_back_crearAlumno = new javax.swing.JLabel();
        txt_nuevoAlumno = new javax.swing.JLabel();
        pp_alumnos = new javax.swing.JPopupMenu();
        modificar_alumno = new javax.swing.JMenuItem();
        eliminar_alumno = new javax.swing.JMenuItem();
        maestros_frame = new javax.swing.JFrame();
        jScroll_maestros = new javax.swing.JScrollPane();
        tabla_maestros = new javax.swing.JTable();
        maestros_azul = new javax.swing.JPanel();
        img_backMaestros = new javax.swing.JLabel();
        img_addMaestros = new javax.swing.JLabel();
        crearMaestro_frame = new javax.swing.JFrame();
        crearMaestro_blanco = new javax.swing.JPanel();
        txt_maestroID = new javax.swing.JLabel();
        txt_nombreMaestro = new javax.swing.JLabel();
        txt_profesion = new javax.swing.JLabel();
        tf_profesion = new javax.swing.JTextField();
        ff_maestroID = new javax.swing.JFormattedTextField();
        tf_maestroNombre = new javax.swing.JTextField();
        txt_usuarioMaestro = new javax.swing.JLabel();
        tf_usuarioMaestro = new javax.swing.JTextField();
        txt_contraseñaMaestro = new javax.swing.JLabel();
        tf_contraseñaMaestro = new javax.swing.JTextField();
        btn_crearMaestro = new javax.swing.JPanel();
        txt_crearMaestro = new javax.swing.JLabel();
        img_checkMaestro = new javax.swing.JLabel();
        txt_sueldo = new javax.swing.JLabel();
        tf_sueldo = new javax.swing.JTextField();
        txt_lps = new javax.swing.JLabel();
        crearMaestro_azul = new javax.swing.JPanel();
        img_back_crearMaestro = new javax.swing.JLabel();
        txt_nuevoMaestro = new javax.swing.JLabel();
        pp_maestros = new javax.swing.JPopupMenu();
        modificar_maestro = new javax.swing.JMenuItem();
        eliminar_maestro = new javax.swing.JMenuItem();
        registro_frame = new javax.swing.JFrame();
        jScroll_registro = new javax.swing.JScrollPane();
        tabla_registro = new javax.swing.JTable();
        registro_azul = new javax.swing.JPanel();
        img_backRegistro = new javax.swing.JLabel();
        img_addRegistro = new javax.swing.JLabel();
        crearRegistro_frame = new javax.swing.JFrame();
        crearRegistro_blanco = new javax.swing.JPanel();
        txt_usuarioRegistro = new javax.swing.JLabel();
        tf_usuarioRegistro = new javax.swing.JTextField();
        txt_contraseñaRegistro = new javax.swing.JLabel();
        tf_contraseñaRegistro = new javax.swing.JTextField();
        btn_crearRegistro = new javax.swing.JPanel();
        txt_crearRegistro = new javax.swing.JLabel();
        img_checkRegistro = new javax.swing.JLabel();
        crearRegistro_azul = new javax.swing.JPanel();
        img_back_crearRegistro = new javax.swing.JLabel();
        txt_nuevoRegistro = new javax.swing.JLabel();
        pp_registro = new javax.swing.JPopupMenu();
        modificar_registro = new javax.swing.JMenuItem();
        eliminar_registro = new javax.swing.JMenuItem();
        matricular_frame = new javax.swing.JFrame();
        jScroll_matricular = new javax.swing.JScrollPane();
        tabla_matricular = new javax.swing.JTable();
        matricular_azul = new javax.swing.JPanel();
        img_backMatricular = new javax.swing.JLabel();
        pp_matricular = new javax.swing.JPopupMenu();
        asignar_matricular = new javax.swing.JMenuItem();
        quitar_matricular = new javax.swing.JMenuItem();
        login_blanco = new javax.swing.JPanel();
        inicioSesionTxt = new javax.swing.JLabel();
        accedeCuentaTxt = new javax.swing.JLabel();
        ingresarUsuario = new javax.swing.JTextField();
        ingresarContraseña = new javax.swing.JPasswordField();
        btn_ingresar = new javax.swing.JPanel();
        btn_ingresarTxt = new javax.swing.JLabel();
        login_azul = new javax.swing.JPanel();

        BGmaestro_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        BGmaestro_frame.setBackground(new java.awt.Color(236, 240, 245));
        BGmaestro_frame.setName("BGregistro_frame"); // NOI18N
        BGmaestro_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGmaestro_blanco.setBackground(new java.awt.Color(255, 255, 255));

        txt_tablero.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txt_tablero.setText("Tablero");

        bg_clase1.setBackground(new java.awt.Color(255, 255, 255));
        bg_clase1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg_clase1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bg_clase1MouseClicked(evt);
            }
        });

        bg_color1.setBackground(new java.awt.Color(23, 123, 99));

        javax.swing.GroupLayout bg_color1Layout = new javax.swing.GroupLayout(bg_color1);
        bg_color1.setLayout(bg_color1Layout);
        bg_color1Layout.setHorizontalGroup(
            bg_color1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bg_color1Layout.setVerticalGroup(
            bg_color1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bg_clase1Layout = new javax.swing.GroupLayout(bg_clase1);
        bg_clase1.setLayout(bg_clase1Layout);
        bg_clase1Layout.setHorizontalGroup(
            bg_clase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_color1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bg_clase1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        bg_clase1Layout.setVerticalGroup(
            bg_clase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_clase1Layout.createSequentialGroup()
                .addComponent(bg_color1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg_clase2.setBackground(new java.awt.Color(255, 255, 255));
        bg_clase2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg_clase2.setMinimumSize(new java.awt.Dimension(100, 100));
        bg_clase2.setPreferredSize(new java.awt.Dimension(260, 249));

        bg_color2.setBackground(new java.awt.Color(6, 163, 183));

        javax.swing.GroupLayout bg_color2Layout = new javax.swing.GroupLayout(bg_color2);
        bg_color2.setLayout(bg_color2Layout);
        bg_color2Layout.setHorizontalGroup(
            bg_color2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bg_color2Layout.setVerticalGroup(
            bg_color2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        javax.swing.GroupLayout bg_clase2Layout = new javax.swing.GroupLayout(bg_clase2);
        bg_clase2.setLayout(bg_clase2Layout);
        bg_clase2Layout.setHorizontalGroup(
            bg_clase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_color2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_clase2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        bg_clase2Layout.setVerticalGroup(
            bg_clase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_clase2Layout.createSequentialGroup()
                .addComponent(bg_color2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        bg_clase3.setBackground(new java.awt.Color(255, 255, 255));
        bg_clase3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg_clase3.setMinimumSize(new java.awt.Dimension(100, 100));
        bg_clase3.setPreferredSize(new java.awt.Dimension(260, 249));

        bg_color3.setBackground(new java.awt.Color(253, 93, 16));
        bg_color3.setPreferredSize(new java.awt.Dimension(260, 158));

        javax.swing.GroupLayout bg_color3Layout = new javax.swing.GroupLayout(bg_color3);
        bg_color3.setLayout(bg_color3Layout);
        bg_color3Layout.setHorizontalGroup(
            bg_color3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        bg_color3Layout.setVerticalGroup(
            bg_color3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        javax.swing.GroupLayout bg_clase3Layout = new javax.swing.GroupLayout(bg_clase3);
        bg_clase3.setLayout(bg_clase3Layout);
        bg_clase3Layout.setHorizontalGroup(
            bg_clase3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_clase3Layout.createSequentialGroup()
                .addComponent(bg_color3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_clase3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        bg_clase3Layout.setVerticalGroup(
            bg_clase3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_clase3Layout.createSequentialGroup()
                .addComponent(bg_color3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        bg_clase4.setBackground(new java.awt.Color(255, 255, 255));
        bg_clase4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg_clase4.setMinimumSize(new java.awt.Dimension(100, 100));
        bg_clase4.setPreferredSize(new java.awt.Dimension(260, 249));

        bg_color4.setBackground(new java.awt.Color(161, 232, 135));
        bg_color4.setPreferredSize(new java.awt.Dimension(260, 158));

        javax.swing.GroupLayout bg_color4Layout = new javax.swing.GroupLayout(bg_color4);
        bg_color4.setLayout(bg_color4Layout);
        bg_color4Layout.setHorizontalGroup(
            bg_color4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bg_color4Layout.setVerticalGroup(
            bg_color4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        javax.swing.GroupLayout bg_clase4Layout = new javax.swing.GroupLayout(bg_clase4);
        bg_clase4.setLayout(bg_clase4Layout);
        bg_clase4Layout.setHorizontalGroup(
            bg_clase4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_color4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addGroup(bg_clase4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        bg_clase4Layout.setVerticalGroup(
            bg_clase4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_clase4Layout.createSequentialGroup()
                .addComponent(bg_color4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg_clase5.setBackground(new java.awt.Color(255, 255, 255));
        bg_clase5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg_clase5.setMinimumSize(new java.awt.Dimension(100, 100));
        bg_clase5.setPreferredSize(new java.awt.Dimension(260, 249));

        bg_color5.setBackground(new java.awt.Color(116, 179, 206));
        bg_color5.setPreferredSize(new java.awt.Dimension(260, 158));

        javax.swing.GroupLayout bg_color5Layout = new javax.swing.GroupLayout(bg_color5);
        bg_color5.setLayout(bg_color5Layout);
        bg_color5Layout.setHorizontalGroup(
            bg_color5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        bg_color5Layout.setVerticalGroup(
            bg_color5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        javax.swing.GroupLayout bg_clase5Layout = new javax.swing.GroupLayout(bg_clase5);
        bg_clase5.setLayout(bg_clase5Layout);
        bg_clase5Layout.setHorizontalGroup(
            bg_clase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_color5, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addGroup(bg_clase5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bg_clase5Layout.setVerticalGroup(
            bg_clase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_clase5Layout.createSequentialGroup()
                .addComponent(bg_color5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg_clase6.setBackground(new java.awt.Color(255, 255, 255));
        bg_clase6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg_clase6.setMinimumSize(new java.awt.Dimension(100, 100));
        bg_clase6.setPreferredSize(new java.awt.Dimension(260, 249));

        bg_color6.setBackground(new java.awt.Color(255, 119, 0));
        bg_color6.setPreferredSize(new java.awt.Dimension(260, 158));

        javax.swing.GroupLayout bg_color6Layout = new javax.swing.GroupLayout(bg_color6);
        bg_color6.setLayout(bg_color6Layout);
        bg_color6Layout.setHorizontalGroup(
            bg_color6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        bg_color6Layout.setVerticalGroup(
            bg_color6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        javax.swing.GroupLayout bg_clase6Layout = new javax.swing.GroupLayout(bg_clase6);
        bg_clase6.setLayout(bg_clase6Layout);
        bg_clase6Layout.setHorizontalGroup(
            bg_clase6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_color6, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addGroup(bg_clase6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bg_clase6Layout.setVerticalGroup(
            bg_clase6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_clase6Layout.createSequentialGroup()
                .addComponent(bg_color6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg_porHacer.setBackground(new java.awt.Color(255, 255, 255));

        txt_porHacer.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_porHacer.setText("Por hacer");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout bg_porHacerLayout = new javax.swing.GroupLayout(bg_porHacer);
        bg_porHacer.setLayout(bg_porHacerLayout);
        bg_porHacerLayout.setHorizontalGroup(
            bg_porHacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_porHacerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_porHacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_porHacer, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addGroup(bg_porHacerLayout.createSequentialGroup()
                        .addGroup(bg_porHacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bg_porHacerLayout.setVerticalGroup(
            bg_porHacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_porHacerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txt_porHacer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        BGmaestro_azul.setBackground(new java.awt.Color(37, 71, 106));

        BGmaestro_rojo.setBackground(new java.awt.Color(195, 21, 28));

        img_unitec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unitec_logo.png"))); // NOI18N

        javax.swing.GroupLayout BGmaestro_rojoLayout = new javax.swing.GroupLayout(BGmaestro_rojo);
        BGmaestro_rojo.setLayout(BGmaestro_rojoLayout);
        BGmaestro_rojoLayout.setHorizontalGroup(
            BGmaestro_rojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGmaestro_rojoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(img_unitec, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BGmaestro_rojoLayout.setVerticalGroup(
            BGmaestro_rojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGmaestro_rojoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(img_unitec)
                .addContainerGap())
        );

        btn_cerrarSesionCanvas.setBackground(new java.awt.Color(195, 21, 28));

        txt_cerrarSessionCanvas.setBackground(new java.awt.Color(255, 255, 255));
        txt_cerrarSessionCanvas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_cerrarSessionCanvas.setForeground(new java.awt.Color(255, 255, 255));
        txt_cerrarSessionCanvas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_cerrarSessionCanvas.setText("Cerrar sesión");
        txt_cerrarSessionCanvas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_cerrarSessionCanvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_cerrarSessionCanvasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_cerrarSesionCanvasLayout = new javax.swing.GroupLayout(btn_cerrarSesionCanvas);
        btn_cerrarSesionCanvas.setLayout(btn_cerrarSesionCanvasLayout);
        btn_cerrarSesionCanvasLayout.setHorizontalGroup(
            btn_cerrarSesionCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_cerrarSessionCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btn_cerrarSesionCanvasLayout.setVerticalGroup(
            btn_cerrarSesionCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_cerrarSessionCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        btn_salirCanvas.setBackground(new java.awt.Color(195, 21, 28));
        btn_salirCanvas.setPreferredSize(new java.awt.Dimension(120, 34));

        txt_salirCanvas.setBackground(new java.awt.Color(37, 71, 106));
        txt_salirCanvas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_salirCanvas.setForeground(new java.awt.Color(255, 255, 255));
        txt_salirCanvas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_salirCanvas.setText("Salir");
        txt_salirCanvas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_salirCanvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_salirCanvasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_salirCanvasLayout = new javax.swing.GroupLayout(btn_salirCanvas);
        btn_salirCanvas.setLayout(btn_salirCanvasLayout);
        btn_salirCanvasLayout.setHorizontalGroup(
            btn_salirCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_salirCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btn_salirCanvasLayout.setVerticalGroup(
            btn_salirCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_salirCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BGmaestro_azulLayout = new javax.swing.GroupLayout(BGmaestro_azul);
        BGmaestro_azul.setLayout(BGmaestro_azulLayout);
        BGmaestro_azulLayout.setHorizontalGroup(
            BGmaestro_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGmaestro_azulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cerrarSesionCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(BGmaestro_rojo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BGmaestro_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_salirCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BGmaestro_azulLayout.setVerticalGroup(
            BGmaestro_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGmaestro_azulLayout.createSequentialGroup()
                .addComponent(BGmaestro_rojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_cerrarSesionCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salirCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BGmaestro_blancoLayout = new javax.swing.GroupLayout(BGmaestro_blanco);
        BGmaestro_blanco.setLayout(BGmaestro_blancoLayout);
        BGmaestro_blancoLayout.setHorizontalGroup(
            BGmaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGmaestro_blancoLayout.createSequentialGroup()
                .addComponent(BGmaestro_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(BGmaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGmaestro_blancoLayout.createSequentialGroup()
                        .addGroup(BGmaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bg_clase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bg_clase4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(BGmaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BGmaestro_blancoLayout.createSequentialGroup()
                                .addComponent(bg_clase2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(bg_clase3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BGmaestro_blancoLayout.createSequentialGroup()
                                .addComponent(bg_clase6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bg_clase5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tablero))
                .addGap(32, 32, 32)
                .addComponent(bg_porHacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BGmaestro_blancoLayout.setVerticalGroup(
            BGmaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGmaestro_blancoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(BGmaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bg_porHacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BGmaestro_blancoLayout.createSequentialGroup()
                        .addComponent(txt_tablero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BGmaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BGmaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bg_clase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bg_clase3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bg_clase2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(BGmaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bg_clase4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bg_clase6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bg_clase5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(715, Short.MAX_VALUE))
            .addComponent(BGmaestro_azul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BGmaestro_frame.getContentPane().add(BGmaestro_blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 1370));

        BGclase_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        BGclase_frame.setBackground(new java.awt.Color(236, 240, 245));
        BGclase_frame.setName("BGregistro_frame"); // NOI18N
        BGclase_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGmaestro_blanco1.setBackground(new java.awt.Color(255, 255, 255));

        txt_ccNombre.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txt_ccNombre.setText("CC|NAME");

        img_thread.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_bienvenidos.jpg"))); // NOI18N

        txt_tareas.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txt_tareas.setText("Tareas");
        txt_tareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_tareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_tareasMouseClicked(evt);
            }
        });

        txt_examenes.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txt_examenes.setText("Examenes");
        txt_examenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTextArea_tareas.setColumns(20);
        jTextArea_tareas.setRows(5);
        jTextArea_tareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea_tareasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea_tareas);

        jTextArea_examenes.setColumns(20);
        jTextArea_examenes.setRows(5);
        jScrollPane3.setViewportView(jTextArea_examenes);

        img_back_clasesFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_back_clasesFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_back_clasesFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_back_clasesFrameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BGmaestro_blanco1Layout = new javax.swing.GroupLayout(BGmaestro_blanco1);
        BGmaestro_blanco1.setLayout(BGmaestro_blanco1Layout);
        BGmaestro_blanco1Layout.setHorizontalGroup(
            BGmaestro_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGmaestro_blanco1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BGmaestro_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGmaestro_blanco1Layout.createSequentialGroup()
                        .addComponent(img_thread)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGmaestro_blanco1Layout.createSequentialGroup()
                        .addComponent(txt_tareas)
                        .addGap(353, 353, 353)
                        .addComponent(txt_examenes)
                        .addGap(423, 423, 423))))
            .addGroup(BGmaestro_blanco1Layout.createSequentialGroup()
                .addGroup(BGmaestro_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGmaestro_blanco1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(BGmaestro_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BGmaestro_blanco1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(img_back_clasesFrame)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_ccNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BGmaestro_blanco1Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        BGmaestro_blanco1Layout.setVerticalGroup(
            BGmaestro_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGmaestro_blanco1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(BGmaestro_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img_back_clasesFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_ccNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(img_thread)
                .addGap(40, 40, 40)
                .addGroup(BGmaestro_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tareas)
                    .addComponent(txt_examenes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BGmaestro_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(649, Short.MAX_VALUE))
        );

        BGclase_frame.getContentPane().add(BGmaestro_blanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 1370));

        BGtareas_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        BGtareas_frame.setBackground(new java.awt.Color(236, 240, 245));
        BGtareas_frame.setName("BGregistro_frame"); // NOI18N
        BGtareas_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGcrearTareas_blanco.setBackground(new java.awt.Color(255, 255, 255));

        txt_crearTareas.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txt_crearTareas.setText("Tareas > Crear nuevo");

        txt_nombreTarea.setText("Nombre:");

        btn_crearTarea.setText("Publicar");
        btn_crearTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearTareaMouseClicked(evt);
            }
        });

        txt_fechaEntrega.setText("Fecha de entrega:");

        txt_descripcion.setText("Descripción:");

        textA_descripcion.setColumns(20);
        textA_descripcion.setRows(5);
        jScrollPane4.setViewportView(textA_descripcion);

        img_back_crearTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_back_crearTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_back_crearTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_back_crearTareasMouseClicked(evt);
            }
        });

        txt_Hora.setText("Hora en formato 24hrs:");

        jLabel7.setText("Tamaño máximo de archivo:");

        javax.swing.GroupLayout BGcrearTareas_blancoLayout = new javax.swing.GroupLayout(BGcrearTareas_blanco);
        BGcrearTareas_blanco.setLayout(BGcrearTareas_blancoLayout);
        BGcrearTareas_blancoLayout.setHorizontalGroup(
            BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGcrearTareas_blancoLayout.createSequentialGroup()
                .addGroup(BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGcrearTareas_blancoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGcrearTareas_blancoLayout.createSequentialGroup()
                                .addComponent(btn_crearTarea)
                                .addGap(9, 9, 9))))
                    .addGroup(BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(BGcrearTareas_blancoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BGcrearTareas_blancoLayout.createSequentialGroup()
                            .addGap(367, 367, 367)
                            .addGroup(BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BGcrearTareas_blancoLayout.createSequentialGroup()
                                    .addComponent(txt_nombreTarea)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_nombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_descripcion)
                                .addGroup(BGcrearTareas_blancoLayout.createSequentialGroup()
                                    .addGroup(BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_fechaEntrega)
                                        .addComponent(txt_Hora))
                                    .addGap(18, 18, 18)
                                    .addGroup(BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_horaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(BGcrearTareas_blancoLayout.createSequentialGroup()
                                            .addComponent(escogerFecha_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(75, 75, 75)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_tamañoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(BGcrearTareas_blancoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(img_back_crearTareas)
                        .addGap(18, 18, 18)
                        .addComponent(txt_crearTareas)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        BGcrearTareas_blancoLayout.setVerticalGroup(
            BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGcrearTareas_blancoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_crearTareas)
                    .addComponent(img_back_crearTareas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreTarea)
                    .addComponent(tf_nombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt_descripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fechaEntrega)
                    .addComponent(escogerFecha_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(tf_tamañoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BGcrearTareas_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_horaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Hora))
                .addGap(18, 18, 18)
                .addComponent(btn_crearTarea)
                .addContainerGap(639, Short.MAX_VALUE))
        );

        BGtareas_frame.getContentPane().add(BGcrearTareas_blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 1370));

        descargar.setText("Descargar");
        descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarActionPerformed(evt);
            }
        });
        pp_evaluarTareas.add(descargar);

        evaluar.setText("Evaluar");
        evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluarActionPerformed(evt);
            }
        });
        pp_evaluarTareas.add(evaluar);

        BGcontestarTareas_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        BGcontestarTareas_frame.setBackground(new java.awt.Color(236, 240, 245));
        BGcontestarTareas_frame.setName("BGregistro_frame"); // NOI18N
        BGcontestarTareas_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGcrearTareas_blanco1.setBackground(new java.awt.Color(255, 255, 255));

        txt_contestarTareas.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txt_contestarTareas.setText("Tareas > Crear nuevo");

        img_back_crearTareas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_back_crearTareas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_back_crearTareas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_back_crearTareas1MouseClicked(evt);
            }
        });

        txt_tareaEntrega.setText("Fecha de entrega:");

        txt_descripcionContestar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        img_drop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/drag&drop.png"))); // NOI18N
        img_drop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_drop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_dropMouseClicked(evt);
            }
        });

        txt_nota.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txt_nota.setText("NOTA:");

        txt_valorNota.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        javax.swing.GroupLayout BGcrearTareas_blanco1Layout = new javax.swing.GroupLayout(BGcrearTareas_blanco1);
        BGcrearTareas_blanco1.setLayout(BGcrearTareas_blanco1Layout);
        BGcrearTareas_blanco1Layout.setHorizontalGroup(
            BGcrearTareas_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGcrearTareas_blanco1Layout.createSequentialGroup()
                .addGroup(BGcrearTareas_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGcrearTareas_blanco1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(BGcrearTareas_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BGcrearTareas_blanco1Layout.createSequentialGroup()
                                .addComponent(img_back_crearTareas1)
                                .addGap(18, 18, 18)
                                .addGroup(BGcrearTareas_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_contestarTareas)
                                    .addGroup(BGcrearTareas_blanco1Layout.createSequentialGroup()
                                        .addComponent(txt_tareaEntrega)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_fechaTareaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nota)
                                .addGap(18, 18, 18)
                                .addComponent(txt_valorNota, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BGcrearTareas_blanco1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(txt_descripcionContestar, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGcrearTareas_blanco1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(img_drop)
                .addGap(249, 249, 249))
        );
        BGcrearTareas_blanco1Layout.setVerticalGroup(
            BGcrearTareas_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGcrearTareas_blanco1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(BGcrearTareas_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BGcrearTareas_blanco1Layout.createSequentialGroup()
                        .addGroup(BGcrearTareas_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_contestarTareas)
                            .addComponent(img_back_crearTareas1))
                        .addGap(4, 4, 4)
                        .addGroup(BGcrearTareas_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_tareaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(txt_fechaTareaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(BGcrearTareas_blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_valorNota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_nota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_descripcionContestar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(img_drop)
                .addContainerGap(646, Short.MAX_VALUE))
        );

        BGcontestarTareas_frame.getContentPane().add(BGcrearTareas_blanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 1370));

        BGevaluarTareas_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        BGevaluarTareas_frame.setBackground(new java.awt.Color(236, 240, 245));
        BGevaluarTareas_frame.setName("BGregistro_frame"); // NOI18N
        BGevaluarTareas_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGcrearTareas_blanco2.setBackground(new java.awt.Color(255, 255, 255));

        txt_contestarTareas1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txt_contestarTareas1.setText("Evaluar Tarea");

        img_back_evaluarTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_back_evaluarTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_back_evaluarTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_back_evaluarTareasMouseClicked(evt);
            }
        });

        table_notasTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Cuenta", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_notasTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_notasTareasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table_notasTareas);
        if (table_notasTareas.getColumnModel().getColumnCount() > 0) {
            table_notasTareas.getColumnModel().getColumn(0).setResizable(false);
            table_notasTareas.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout BGcrearTareas_blanco2Layout = new javax.swing.GroupLayout(BGcrearTareas_blanco2);
        BGcrearTareas_blanco2.setLayout(BGcrearTareas_blanco2Layout);
        BGcrearTareas_blanco2Layout.setHorizontalGroup(
            BGcrearTareas_blanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGcrearTareas_blanco2Layout.createSequentialGroup()
                .addGroup(BGcrearTareas_blanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGcrearTareas_blanco2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(BGcrearTareas_blanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGcrearTareas_blanco2Layout.createSequentialGroup()
                                .addComponent(img_back_evaluarTareas)
                                .addGap(18, 18, 18)
                                .addComponent(txt_contestarTareas1))
                            .addGroup(BGcrearTareas_blanco2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BGcrearTareas_blanco2Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        BGcrearTareas_blanco2Layout.setVerticalGroup(
            BGcrearTareas_blanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGcrearTareas_blanco2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(BGcrearTareas_blanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_contestarTareas1)
                    .addComponent(img_back_evaluarTareas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(661, Short.MAX_VALUE))
        );

        BGevaluarTareas_frame.getContentPane().add(BGcrearTareas_blanco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 1370));

        BGregistro_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        BGregistro_frame.setBackground(new java.awt.Color(236, 240, 245));
        BGregistro_frame.setName("BGregistro_frame"); // NOI18N
        BGregistro_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGregistro_bienvenida.setBackground(new java.awt.Color(255, 255, 255));

        txt_presentacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_presentacion.setText("Aquí encontrarás todas tus aplicaciones y herramientas de trabajo de siempre y también algunas nuevas que te serán muy útiles.");

        txt_bienvenida.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N

        txt_irrelevante.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_irrelevante.setText("Este es tu nuevo CANVAS");

        javax.swing.GroupLayout BGregistro_bienvenidaLayout = new javax.swing.GroupLayout(BGregistro_bienvenida);
        BGregistro_bienvenida.setLayout(BGregistro_bienvenidaLayout);
        BGregistro_bienvenidaLayout.setHorizontalGroup(
            BGregistro_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGregistro_bienvenidaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(BGregistro_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_presentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_irrelevante)
                    .addComponent(txt_bienvenida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        BGregistro_bienvenidaLayout.setVerticalGroup(
            BGregistro_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGregistro_bienvenidaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txt_bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txt_irrelevante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_presentacion)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        BGregistro_frame.getContentPane().add(BGregistro_bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 860, 160));

        BGregistro_azul.setBackground(new java.awt.Color(37, 71, 106));

        javax.swing.GroupLayout BGregistro_azulLayout = new javax.swing.GroupLayout(BGregistro_azul);
        BGregistro_azul.setLayout(BGregistro_azulLayout);
        BGregistro_azulLayout.setHorizontalGroup(
            BGregistro_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        BGregistro_azulLayout.setVerticalGroup(
            BGregistro_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        BGregistro_frame.getContentPane().add(BGregistro_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1080, 270));

        registro_blanco.setBackground(new java.awt.Color(255, 255, 255));

        img_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/admin_user.png"))); // NOI18N

        txt_nombre.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_cerrarSesion.setBackground(new java.awt.Color(37, 71, 106));

        txt_cerrarSession.setBackground(new java.awt.Color(37, 71, 106));
        txt_cerrarSession.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_cerrarSession.setForeground(new java.awt.Color(255, 255, 255));
        txt_cerrarSession.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_cerrarSession.setText("Cerrar sesión");
        txt_cerrarSession.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_cerrarSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_cerrarSessionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_cerrarSessionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_cerrarSessionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_cerrarSesionLayout = new javax.swing.GroupLayout(btn_cerrarSesion);
        btn_cerrarSesion.setLayout(btn_cerrarSesionLayout);
        btn_cerrarSesionLayout.setHorizontalGroup(
            btn_cerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_cerrarSession, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btn_cerrarSesionLayout.setVerticalGroup(
            btn_cerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_cerrarSession, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        btn_salir.setBackground(new java.awt.Color(37, 71, 106));
        btn_salir.setPreferredSize(new java.awt.Dimension(120, 34));

        txt_salir.setBackground(new java.awt.Color(37, 71, 106));
        txt_salir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_salir.setForeground(new java.awt.Color(255, 255, 255));
        txt_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_salir.setText("Salir");
        txt_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_salirLayout = new javax.swing.GroupLayout(btn_salir);
        btn_salir.setLayout(btn_salirLayout);
        btn_salirLayout.setHorizontalGroup(
            btn_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btn_salirLayout.setVerticalGroup(
            btn_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout registro_blancoLayout = new javax.swing.GroupLayout(registro_blanco);
        registro_blanco.setLayout(registro_blancoLayout);
        registro_blancoLayout.setHorizontalGroup(
            registro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registro_blancoLayout.createSequentialGroup()
                .addGroup(registro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registro_blancoLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(img_user))
                    .addGroup(registro_blancoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registro_blancoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(registro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        registro_blancoLayout.setVerticalGroup(
            registro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registro_blancoLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(img_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1034, Short.MAX_VALUE))
        );

        BGregistro_frame.getContentPane().add(registro_blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 1370));

        btn_alumnos.setBackground(new java.awt.Color(255, 255, 255));
        btn_alumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_alumnos.setPreferredSize(new java.awt.Dimension(130, 120));
        btn_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_alumnosMouseClicked(evt);
            }
        });

        img_alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/student.png"))); // NOI18N

        txt_alumnos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_alumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_alumnos.setText("Alumnos");

        javax.swing.GroupLayout btn_alumnosLayout = new javax.swing.GroupLayout(btn_alumnos);
        btn_alumnos.setLayout(btn_alumnosLayout);
        btn_alumnosLayout.setHorizontalGroup(
            btn_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_alumnosLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(img_alumnos)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(btn_alumnosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_alumnosLayout.setVerticalGroup(
            btn_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_alumnosLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(img_alumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_alumnos)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        BGregistro_frame.getContentPane().add(btn_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 130, 130));

        btn_maestros.setBackground(new java.awt.Color(255, 255, 255));
        btn_maestros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_maestros.setPreferredSize(new java.awt.Dimension(130, 130));
        btn_maestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_maestrosMouseClicked(evt);
            }
        });

        img_maestros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/teacher.png"))); // NOI18N

        txt_maestros.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_maestros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_maestros.setText("Maestros");
        txt_maestros.setMaximumSize(new java.awt.Dimension(58, 15));
        txt_maestros.setMinimumSize(new java.awt.Dimension(58, 15));
        txt_maestros.setPreferredSize(new java.awt.Dimension(58, 15));

        javax.swing.GroupLayout btn_maestrosLayout = new javax.swing.GroupLayout(btn_maestros);
        btn_maestros.setLayout(btn_maestrosLayout);
        btn_maestrosLayout.setHorizontalGroup(
            btn_maestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_maestrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_maestros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_maestrosLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(img_maestros)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        btn_maestrosLayout.setVerticalGroup(
            btn_maestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_maestrosLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(img_maestros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_maestros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        BGregistro_frame.getContentPane().add(btn_maestros, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 370, -1, -1));

        btn_usuarios.setBackground(new java.awt.Color(255, 255, 255));
        btn_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_usuarios.setMinimumSize(new java.awt.Dimension(100, 99));
        btn_usuarios.setPreferredSize(new java.awt.Dimension(130, 130));
        btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseClicked(evt);
            }
        });

        img_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user2.png"))); // NOI18N

        txt_usuarios.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_usuarios.setText("Usuarios");

        javax.swing.GroupLayout btn_usuariosLayout = new javax.swing.GroupLayout(btn_usuarios);
        btn_usuarios.setLayout(btn_usuariosLayout);
        btn_usuariosLayout.setHorizontalGroup(
            btn_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_usuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btn_usuariosLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(img_usuarios)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        btn_usuariosLayout.setVerticalGroup(
            btn_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_usuariosLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(img_usuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_usuarios)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        BGregistro_frame.getContentPane().add(btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        btn_registro.setBackground(new java.awt.Color(255, 255, 255));
        btn_registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registro.setMinimumSize(new java.awt.Dimension(100, 99));
        btn_registro.setPreferredSize(new java.awt.Dimension(130, 130));
        btn_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registroMouseClicked(evt);
            }
        });

        img_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro.png"))); // NOI18N

        txt_registro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_registro.setText("Registro");

        javax.swing.GroupLayout btn_registroLayout = new javax.swing.GroupLayout(btn_registro);
        btn_registro.setLayout(btn_registroLayout);
        btn_registroLayout.setHorizontalGroup(
            btn_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_registroLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(img_registro)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(btn_registroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_registroLayout.setVerticalGroup(
            btn_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_registroLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(img_registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_registro)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        BGregistro_frame.getContentPane().add(btn_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 370, -1, -1));

        btn_matricular.setBackground(new java.awt.Color(255, 255, 255));
        btn_matricular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_matricular.setPreferredSize(new java.awt.Dimension(130, 130));
        btn_matricular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_matricularMouseClicked(evt);
            }
        });

        img_matricular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asignarAlumnos.png"))); // NOI18N

        txt_matricular.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_matricular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_matricular.setText("Matricular");

        javax.swing.GroupLayout btn_matricularLayout = new javax.swing.GroupLayout(btn_matricular);
        btn_matricular.setLayout(btn_matricularLayout);
        btn_matricularLayout.setHorizontalGroup(
            btn_matricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_matricularLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_matricular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btn_matricularLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(img_matricular)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        btn_matricularLayout.setVerticalGroup(
            btn_matricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_matricularLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(img_matricular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_matricular)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        BGregistro_frame.getContentPane().add(btn_matricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, -1, -1));

        btn_adminClases.setBackground(new java.awt.Color(255, 255, 255));
        btn_adminClases.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_adminClases.setPreferredSize(new java.awt.Dimension(130, 130));
        btn_adminClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_adminClasesMouseClicked(evt);
            }
        });

        img_adminClases.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        img_adminClases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_adminClases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asignarMaestros.png"))); // NOI18N

        txt_adminClases.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_adminClases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_adminClases.setText("Administrar clases");

        javax.swing.GroupLayout btn_adminClasesLayout = new javax.swing.GroupLayout(btn_adminClases);
        btn_adminClases.setLayout(btn_adminClasesLayout);
        btn_adminClasesLayout.setHorizontalGroup(
            btn_adminClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_adminClases, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_adminClasesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_adminClases, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_adminClasesLayout.setVerticalGroup(
            btn_adminClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_adminClasesLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(img_adminClases)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_adminClases)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        BGregistro_frame.getContentPane().add(btn_adminClases, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        clases_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        clases_frame.setBackground(new java.awt.Color(236, 240, 245));
        clases_frame.setMinimumSize(new java.awt.Dimension(1370, 1370));
        clases_frame.setName("clases_frame"); // NOI18N
        clases_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_clases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Hora", "UV", "Periodo", "Año", "Maestro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_clases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_clasesMouseClicked(evt);
            }
        });
        jScroll_clases.setViewportView(tabla_clases);
        if (tabla_clases.getColumnModel().getColumnCount() > 0) {
            tabla_clases.getColumnModel().getColumn(0).setResizable(false);
            tabla_clases.getColumnModel().getColumn(1).setResizable(false);
            tabla_clases.getColumnModel().getColumn(2).setResizable(false);
            tabla_clases.getColumnModel().getColumn(3).setResizable(false);
            tabla_clases.getColumnModel().getColumn(4).setResizable(false);
            tabla_clases.getColumnModel().getColumn(5).setResizable(false);
            tabla_clases.getColumnModel().getColumn(6).setResizable(false);
        }

        clases_frame.getContentPane().add(jScroll_clases, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 1050, 550));

        clases_azul.setBackground(new java.awt.Color(37, 71, 106));
        clases_azul.setPreferredSize(new java.awt.Dimension(100, 270));

        img_backClases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_backClases.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_backClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_backClasesMouseClicked(evt);
            }
        });

        img_addClases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addicon.png"))); // NOI18N
        img_addClases.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_addClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_addClasesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout clases_azulLayout = new javax.swing.GroupLayout(clases_azul);
        clases_azul.setLayout(clases_azulLayout);
        clases_azulLayout.setHorizontalGroup(
            clases_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clases_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_backClases)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clases_azulLayout.createSequentialGroup()
                .addContainerGap(1190, Short.MAX_VALUE)
                .addComponent(img_addClases)
                .addGap(150, 150, 150))
        );
        clases_azulLayout.setVerticalGroup(
            clases_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clases_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_backClases)
                .addGap(26, 26, 26)
                .addComponent(img_addClases)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        clases_frame.getContentPane().add(clases_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        crearClase_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        crearClase_frame.setBackground(new java.awt.Color(236, 240, 245));
        crearClase_frame.setMinimumSize(new java.awt.Dimension(1370, 1370));
        crearClase_frame.setName("crear_clase_frame"); // NOI18N
        crearClase_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearClase_blanco.setBackground(new java.awt.Color(255, 255, 255));

        txt_claseID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_claseID.setText("Clase ID:");

        txt_claseNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_claseNombre.setText("Nombre:");

        txt_claseHora.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_claseHora.setText("Hora:");

        txt_claseUV.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_claseUV.setText("UV:");

        txt_clasePeriodo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_clasePeriodo.setText("Periodo:");

        txt_claseAño.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_claseAño.setText("Año:");

        txt_claseMaestro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_claseMaestro.setText("Maestro:");

        tf_claseID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        tf_claseNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        cb_horasClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00 a.m", "8:30 a.m", "10:10 a.m", "11:30 a.m", "1:00 p.m", "2:30 p.m", "4:00 p.m" }));
        cb_horasClase.setPreferredSize(new java.awt.Dimension(84, 32));

        cb_uvClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cb_uvClase.setMinimumSize(new java.awt.Dimension(72, 30));

        cb_periodoClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV" }));
        cb_periodoClase.setMinimumSize(new java.awt.Dimension(72, 30));

        btn_crearClase.setBackground(new java.awt.Color(37, 71, 106));
        btn_crearClase.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearClase.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_crearClase.setPreferredSize(new java.awt.Dimension(72, 22));

        txt_crearClase.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_crearClase.setForeground(new java.awt.Color(255, 255, 255));
        txt_crearClase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_crearClase.setText("Crear");
        txt_crearClase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_crearClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_crearClaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_crearClaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_crearClaseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_crearClaseLayout = new javax.swing.GroupLayout(btn_crearClase);
        btn_crearClase.setLayout(btn_crearClaseLayout);
        btn_crearClaseLayout.setHorizontalGroup(
            btn_crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_crearClase, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        btn_crearClaseLayout.setVerticalGroup(
            btn_crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_crearClase, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        img_checkClase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        img_checkClase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_checkClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_checkClaseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crearClase_blancoLayout = new javax.swing.GroupLayout(crearClase_blanco);
        crearClase_blanco.setLayout(crearClase_blancoLayout);
        crearClase_blancoLayout.setHorizontalGroup(
            crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearClase_blancoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(crearClase_blancoLayout.createSequentialGroup()
                        .addComponent(txt_claseMaestro)
                        .addGap(18, 18, 18)
                        .addComponent(cb_maestros, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(crearClase_blancoLayout.createSequentialGroup()
                        .addComponent(txt_claseID)
                        .addGap(18, 18, 18)
                        .addComponent(tf_claseID, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(crearClase_blancoLayout.createSequentialGroup()
                        .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_claseNombre)
                            .addComponent(txt_claseHora)
                            .addComponent(txt_claseUV)
                            .addComponent(txt_clasePeriodo)
                            .addComponent(txt_claseAño))
                        .addGap(18, 18, 18)
                        .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(añoClase, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_periodoClase, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_claseNombre)
                                    .addGroup(crearClase_blancoLayout.createSequentialGroup()
                                        .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_horasClase, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cb_uvClase, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(563, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearClase_blancoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_crearClase, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_checkClase)
                .addContainerGap())
        );
        crearClase_blancoLayout.setVerticalGroup(
            crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearClase_blancoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(crearClase_blancoLayout.createSequentialGroup()
                        .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_claseID)
                            .addComponent(tf_claseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_claseNombre)
                            .addComponent(tf_claseNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_claseHora)
                            .addComponent(cb_horasClase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_claseUV)
                            .addComponent(cb_uvClase, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_clasePeriodo)
                            .addComponent(cb_periodoClase, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_claseAño))
                    .addComponent(añoClase, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearClase_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_claseMaestro)
                    .addComponent(cb_maestros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(btn_crearClase, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearClase_blancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_checkClase)
                .addContainerGap())
        );

        crearClase_frame.getContentPane().add(crearClase_blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 1080, 540));

        crearClase_azul.setBackground(new java.awt.Color(37, 71, 106));
        crearClase_azul.setPreferredSize(new java.awt.Dimension(100, 270));

        img_back_crearClase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_back_crearClase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_back_crearClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_back_crearClaseMouseClicked(evt);
            }
        });

        txt_nuevaClase.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        txt_nuevaClase.setForeground(new java.awt.Color(255, 255, 255));
        txt_nuevaClase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nuevaClase.setText("Crear Clase");

        javax.swing.GroupLayout crearClase_azulLayout = new javax.swing.GroupLayout(crearClase_azul);
        crearClase_azul.setLayout(crearClase_azulLayout);
        crearClase_azulLayout.setHorizontalGroup(
            crearClase_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearClase_azulLayout.createSequentialGroup()
                .addGroup(crearClase_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearClase_azulLayout.createSequentialGroup()
                        .addGap(581, 581, 581)
                        .addComponent(txt_nuevaClase))
                    .addGroup(crearClase_azulLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(img_back_crearClase)))
                .addContainerGap(604, Short.MAX_VALUE))
        );
        crearClase_azulLayout.setVerticalGroup(
            crearClase_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearClase_azulLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(img_back_crearClase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nuevaClase)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        crearClase_frame.getContentPane().add(crearClase_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        modificar_clase.setText("Modificar");
        modificar_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_claseActionPerformed(evt);
            }
        });
        pp_clase.add(modificar_clase);

        eliminar_clase.setText("Eliminar");
        eliminar_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_claseActionPerformed(evt);
            }
        });
        pp_clase.add(eliminar_clase);

        usuarios_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        usuarios_frame.setBackground(new java.awt.Color(236, 240, 245));
        usuarios_frame.setMinimumSize(new java.awt.Dimension(1370, 1370));
        usuarios_frame.setName("usuarios_frame"); // NOI18N
        usuarios_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Rol"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_usuariosMouseClicked(evt);
            }
        });
        jScroll_usuarios.setViewportView(tabla_usuarios);
        if (tabla_usuarios.getColumnModel().getColumnCount() > 0) {
            tabla_usuarios.getColumnModel().getColumn(0).setResizable(false);
            tabla_usuarios.getColumnModel().getColumn(1).setResizable(false);
        }

        usuarios_frame.getContentPane().add(jScroll_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 1050, 550));

        usuarios_azul.setBackground(new java.awt.Color(37, 71, 106));
        usuarios_azul.setPreferredSize(new java.awt.Dimension(100, 270));

        img_backUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_backUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_backUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_backUsuariosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout usuarios_azulLayout = new javax.swing.GroupLayout(usuarios_azul);
        usuarios_azul.setLayout(usuarios_azulLayout);
        usuarios_azulLayout.setHorizontalGroup(
            usuarios_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarios_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_backUsuarios)
                .addContainerGap(1334, Short.MAX_VALUE))
        );
        usuarios_azulLayout.setVerticalGroup(
            usuarios_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarios_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_backUsuarios)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        usuarios_frame.getContentPane().add(usuarios_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        modificarUsuario_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        modificarUsuario_frame.setBackground(new java.awt.Color(236, 240, 245));
        modificarUsuario_frame.setMinimumSize(new java.awt.Dimension(1370, 1370));
        modificarUsuario_frame.setName("crear_clase_frame"); // NOI18N
        modificarUsuario_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modificarUsuario_blanco.setBackground(new java.awt.Color(255, 255, 255));

        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_usuario.setText("Usuario:");

        txt_password.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_password.setText("Contraseña:");

        txt_rol.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_rol.setText("Rol:");

        tf_usuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        tf_password.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        cb_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registro", "Maestro", "Alumno" }));
        cb_rol.setPreferredSize(new java.awt.Dimension(84, 32));

        img_checkUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        img_checkUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_checkUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_checkUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout modificarUsuario_blancoLayout = new javax.swing.GroupLayout(modificarUsuario_blanco);
        modificarUsuario_blanco.setLayout(modificarUsuario_blancoLayout);
        modificarUsuario_blancoLayout.setHorizontalGroup(
            modificarUsuario_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarUsuario_blancoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(modificarUsuario_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_password)
                    .addComponent(txt_rol)
                    .addComponent(txt_usuario))
                .addGap(18, 18, 18)
                .addGroup(modificarUsuario_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(modificarUsuario_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tf_password, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)))
                .addContainerGap(540, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarUsuario_blancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_checkUsuario)
                .addContainerGap())
        );
        modificarUsuario_blancoLayout.setVerticalGroup(
            modificarUsuario_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarUsuario_blancoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(modificarUsuario_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuario)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(modificarUsuario_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_password)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(modificarUsuario_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rol)
                    .addComponent(cb_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                .addComponent(img_checkUsuario)
                .addContainerGap())
        );

        modificarUsuario_frame.getContentPane().add(modificarUsuario_blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 1080, 540));

        modificarUsuario_azul.setBackground(new java.awt.Color(37, 71, 106));
        modificarUsuario_azul.setPreferredSize(new java.awt.Dimension(100, 270));

        img_back_modificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_back_modificarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_back_modificarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_back_modificarUsuarioMouseClicked(evt);
            }
        });

        txt_modificarUsuario.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        txt_modificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_modificarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_modificarUsuario.setText("Modificar Usuario");

        javax.swing.GroupLayout modificarUsuario_azulLayout = new javax.swing.GroupLayout(modificarUsuario_azul);
        modificarUsuario_azul.setLayout(modificarUsuario_azulLayout);
        modificarUsuario_azulLayout.setHorizontalGroup(
            modificarUsuario_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarUsuario_azulLayout.createSequentialGroup()
                .addGroup(modificarUsuario_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modificarUsuario_azulLayout.createSequentialGroup()
                        .addGap(581, 581, 581)
                        .addComponent(txt_modificarUsuario))
                    .addGroup(modificarUsuario_azulLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(img_back_modificarUsuario)))
                .addContainerGap(502, Short.MAX_VALUE))
        );
        modificarUsuario_azulLayout.setVerticalGroup(
            modificarUsuario_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarUsuario_azulLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(img_back_modificarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_modificarUsuario)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        modificarUsuario_frame.getContentPane().add(modificarUsuario_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        modificar_usuario.setText("Modificar");
        modificar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_usuarioActionPerformed(evt);
            }
        });
        pp_usuarios.add(modificar_usuario);

        eliminar_usuario.setText("Eliminar");
        eliminar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_usuarioActionPerformed(evt);
            }
        });
        pp_usuarios.add(eliminar_usuario);

        alumnos_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        alumnos_frame.setBackground(new java.awt.Color(236, 240, 245));
        alumnos_frame.setMinimumSize(new java.awt.Dimension(1370, 1370));
        alumnos_frame.setName("alumnos_frame"); // NOI18N
        alumnos_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. cuenta", "Nombre", "Carrera", "Clases"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_alumnosMouseClicked(evt);
            }
        });
        jScroll_alumnos.setViewportView(tabla_alumnos);
        if (tabla_alumnos.getColumnModel().getColumnCount() > 0) {
            tabla_alumnos.getColumnModel().getColumn(0).setResizable(false);
            tabla_alumnos.getColumnModel().getColumn(1).setResizable(false);
            tabla_alumnos.getColumnModel().getColumn(2).setResizable(false);
            tabla_alumnos.getColumnModel().getColumn(2).setHeaderValue("Carrera");
            tabla_alumnos.getColumnModel().getColumn(3).setResizable(false);
            tabla_alumnos.getColumnModel().getColumn(3).setHeaderValue("Clases");
        }

        alumnos_frame.getContentPane().add(jScroll_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 1050, 550));

        alumnos_azul.setBackground(new java.awt.Color(37, 71, 106));
        alumnos_azul.setPreferredSize(new java.awt.Dimension(100, 270));

        img_backAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_backAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_backAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_backAlumnosMouseClicked(evt);
            }
        });

        img_addAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addicon.png"))); // NOI18N
        img_addAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_addAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_addAlumnosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout alumnos_azulLayout = new javax.swing.GroupLayout(alumnos_azul);
        alumnos_azul.setLayout(alumnos_azulLayout);
        alumnos_azulLayout.setHorizontalGroup(
            alumnos_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnos_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_backAlumnos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumnos_azulLayout.createSequentialGroup()
                .addContainerGap(1189, Short.MAX_VALUE)
                .addComponent(img_addAlumnos)
                .addGap(151, 151, 151))
        );
        alumnos_azulLayout.setVerticalGroup(
            alumnos_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnos_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_backAlumnos)
                .addGap(26, 26, 26)
                .addComponent(img_addAlumnos)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        alumnos_frame.getContentPane().add(alumnos_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        img_checkAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        img_checkAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_checkAsignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_checkAsignarMouseClicked(evt);
            }
        });
        alumnos_frame.getContentPane().add(img_checkAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 690, -1, -1));

        img_checkQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        img_checkQuitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_checkQuitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_checkQuitarMouseClicked(evt);
            }
        });
        alumnos_frame.getContentPane().add(img_checkQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 690, -1, -1));

        crearAlumno_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        crearAlumno_frame.setBackground(new java.awt.Color(236, 240, 245));
        crearAlumno_frame.setMinimumSize(new java.awt.Dimension(1370, 1370));
        crearAlumno_frame.setName("crear_clase_frame"); // NOI18N
        crearAlumno_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearAlumno_blanco.setBackground(new java.awt.Color(255, 255, 255));

        txt_numCuenta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_numCuenta.setText("Num. cuenta:");

        txt_nombreAlumno.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_nombreAlumno.setText("Nombre:");

        txt_carrera.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_carrera.setText("Carrera:");

        tf_alumnoNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        cb_carreras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicina", "Derecho", "Economía", "Finanzas", "Mercadotecnia", "Civil", "Mecatrónica", "Sistemas", "Arquitectura", "Gastronomía", "Emprendimiento" }));

        txt_usuarioAlumno.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_usuarioAlumno.setText("Usuario:");

        txt_contraseñaAlumno.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_contraseñaAlumno.setText("Contraseña:");

        btn_crearAlumno.setBackground(new java.awt.Color(37, 71, 106));
        btn_crearAlumno.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearAlumno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_crearAlumno.setPreferredSize(new java.awt.Dimension(72, 22));

        txt_crearAlumno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_crearAlumno.setForeground(new java.awt.Color(255, 255, 255));
        txt_crearAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_crearAlumno.setText("Crear");
        txt_crearAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_crearAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_crearAlumnoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_crearAlumnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_crearAlumnoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_crearAlumnoLayout = new javax.swing.GroupLayout(btn_crearAlumno);
        btn_crearAlumno.setLayout(btn_crearAlumnoLayout);
        btn_crearAlumnoLayout.setHorizontalGroup(
            btn_crearAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_crearAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        btn_crearAlumnoLayout.setVerticalGroup(
            btn_crearAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_crearAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        img_checkAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        img_checkAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_checkAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_checkAlumnoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crearAlumno_blancoLayout = new javax.swing.GroupLayout(crearAlumno_blanco);
        crearAlumno_blanco.setLayout(crearAlumno_blancoLayout);
        crearAlumno_blancoLayout.setHorizontalGroup(
            crearAlumno_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearAlumno_blancoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_crearAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_checkAlumno)
                .addContainerGap())
            .addGroup(crearAlumno_blancoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(crearAlumno_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(crearAlumno_blancoLayout.createSequentialGroup()
                        .addComponent(txt_contraseñaAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_contraseñaAlumno))
                    .addComponent(txt_usuarioAlumno)
                    .addGroup(crearAlumno_blancoLayout.createSequentialGroup()
                        .addComponent(txt_numCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ff_numCuenta))
                    .addGroup(crearAlumno_blancoLayout.createSequentialGroup()
                        .addGroup(crearAlumno_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombreAlumno)
                            .addComponent(txt_carrera))
                        .addGap(37, 37, 37)
                        .addGroup(crearAlumno_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_alumnoNombre)
                            .addComponent(cb_carreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_usuarioAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))))
                .addContainerGap(533, Short.MAX_VALUE))
        );
        crearAlumno_blancoLayout.setVerticalGroup(
            crearAlumno_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearAlumno_blancoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(crearAlumno_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_numCuenta)
                    .addComponent(ff_numCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearAlumno_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreAlumno)
                    .addComponent(tf_alumnoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearAlumno_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_carrera)
                    .addComponent(cb_carreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearAlumno_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuarioAlumno)
                    .addComponent(tf_usuarioAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearAlumno_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_contraseñaAlumno)
                    .addComponent(tf_contraseñaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(btn_crearAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearAlumno_blancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_checkAlumno)
                .addContainerGap())
        );

        crearAlumno_frame.getContentPane().add(crearAlumno_blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 1080, 540));

        crearAlumno_azul.setBackground(new java.awt.Color(37, 71, 106));
        crearAlumno_azul.setPreferredSize(new java.awt.Dimension(100, 270));

        img_back_crearAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_back_crearAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_back_crearAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_back_crearAlumnoMouseClicked(evt);
            }
        });

        txt_nuevoAlumno.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        txt_nuevoAlumno.setForeground(new java.awt.Color(255, 255, 255));
        txt_nuevoAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nuevoAlumno.setText("Crear Alumno");

        javax.swing.GroupLayout crearAlumno_azulLayout = new javax.swing.GroupLayout(crearAlumno_azul);
        crearAlumno_azul.setLayout(crearAlumno_azulLayout);
        crearAlumno_azulLayout.setHorizontalGroup(
            crearAlumno_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearAlumno_azulLayout.createSequentialGroup()
                .addGroup(crearAlumno_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearAlumno_azulLayout.createSequentialGroup()
                        .addGap(581, 581, 581)
                        .addComponent(txt_nuevoAlumno))
                    .addGroup(crearAlumno_azulLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(img_back_crearAlumno)))
                .addContainerGap(569, Short.MAX_VALUE))
        );
        crearAlumno_azulLayout.setVerticalGroup(
            crearAlumno_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearAlumno_azulLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(img_back_crearAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nuevoAlumno)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        crearAlumno_frame.getContentPane().add(crearAlumno_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        modificar_alumno.setText("Modificar");
        modificar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_alumnoActionPerformed(evt);
            }
        });
        pp_alumnos.add(modificar_alumno);

        eliminar_alumno.setText("Eliminar");
        eliminar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_alumnoActionPerformed(evt);
            }
        });
        pp_alumnos.add(eliminar_alumno);

        maestros_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        maestros_frame.setBackground(new java.awt.Color(236, 240, 245));
        maestros_frame.setMinimumSize(new java.awt.Dimension(1370, 1370));
        maestros_frame.setName("maestros_frame"); // NOI18N
        maestros_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_maestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Profesión", "Sueldo", "Clases"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_maestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_maestrosMouseClicked(evt);
            }
        });
        jScroll_maestros.setViewportView(tabla_maestros);
        if (tabla_maestros.getColumnModel().getColumnCount() > 0) {
            tabla_maestros.getColumnModel().getColumn(0).setResizable(false);
            tabla_maestros.getColumnModel().getColumn(1).setResizable(false);
            tabla_maestros.getColumnModel().getColumn(2).setResizable(false);
            tabla_maestros.getColumnModel().getColumn(3).setResizable(false);
            tabla_maestros.getColumnModel().getColumn(4).setResizable(false);
        }

        maestros_frame.getContentPane().add(jScroll_maestros, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 1050, 550));

        maestros_azul.setBackground(new java.awt.Color(37, 71, 106));
        maestros_azul.setPreferredSize(new java.awt.Dimension(100, 270));

        img_backMaestros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_backMaestros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_backMaestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_backMaestrosMouseClicked(evt);
            }
        });

        img_addMaestros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addicon.png"))); // NOI18N
        img_addMaestros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_addMaestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_addMaestrosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout maestros_azulLayout = new javax.swing.GroupLayout(maestros_azul);
        maestros_azul.setLayout(maestros_azulLayout);
        maestros_azulLayout.setHorizontalGroup(
            maestros_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maestros_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_backMaestros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maestros_azulLayout.createSequentialGroup()
                .addContainerGap(1189, Short.MAX_VALUE)
                .addComponent(img_addMaestros)
                .addGap(151, 151, 151))
        );
        maestros_azulLayout.setVerticalGroup(
            maestros_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maestros_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_backMaestros)
                .addGap(27, 27, 27)
                .addComponent(img_addMaestros)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        maestros_frame.getContentPane().add(maestros_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        crearMaestro_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        crearMaestro_frame.setBackground(new java.awt.Color(236, 240, 245));
        crearMaestro_frame.setMinimumSize(new java.awt.Dimension(1370, 1370));
        crearMaestro_frame.setName("crear_clase_frame"); // NOI18N
        crearMaestro_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearMaestro_blanco.setBackground(new java.awt.Color(255, 255, 255));

        txt_maestroID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_maestroID.setText("Maestro ID:");

        txt_nombreMaestro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_nombreMaestro.setText("Nombre:");

        txt_profesion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_profesion.setText("Profesión:");

        tf_maestroNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        txt_usuarioMaestro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_usuarioMaestro.setText("Usuario:");

        txt_contraseñaMaestro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_contraseñaMaestro.setText("Contraseña:");

        btn_crearMaestro.setBackground(new java.awt.Color(37, 71, 106));
        btn_crearMaestro.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearMaestro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_crearMaestro.setPreferredSize(new java.awt.Dimension(72, 22));

        txt_crearMaestro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_crearMaestro.setForeground(new java.awt.Color(255, 255, 255));
        txt_crearMaestro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_crearMaestro.setText("Crear");
        txt_crearMaestro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_crearMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_crearMaestroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_crearMaestroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_crearMaestroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_crearMaestroLayout = new javax.swing.GroupLayout(btn_crearMaestro);
        btn_crearMaestro.setLayout(btn_crearMaestroLayout);
        btn_crearMaestroLayout.setHorizontalGroup(
            btn_crearMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_crearMaestro, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        btn_crearMaestroLayout.setVerticalGroup(
            btn_crearMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_crearMaestro, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        img_checkMaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        img_checkMaestro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_checkMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_checkMaestroMouseClicked(evt);
            }
        });

        txt_sueldo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_sueldo.setText("Sueldo:");

        txt_lps.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_lps.setText("lps.");

        javax.swing.GroupLayout crearMaestro_blancoLayout = new javax.swing.GroupLayout(crearMaestro_blanco);
        crearMaestro_blanco.setLayout(crearMaestro_blancoLayout);
        crearMaestro_blancoLayout.setHorizontalGroup(
            crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearMaestro_blancoLayout.createSequentialGroup()
                .addGroup(crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearMaestro_blancoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btn_crearMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 926, Short.MAX_VALUE)
                        .addComponent(img_checkMaestro))
                    .addGroup(crearMaestro_blancoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crearMaestro_blancoLayout.createSequentialGroup()
                                .addComponent(txt_maestroID)
                                .addGap(18, 18, 18)
                                .addComponent(ff_maestroID, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crearMaestro_blancoLayout.createSequentialGroup()
                                    .addComponent(txt_contraseñaMaestro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_contraseñaMaestro))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crearMaestro_blancoLayout.createSequentialGroup()
                                    .addGroup(crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_nombreMaestro)
                                        .addComponent(txt_profesion)
                                        .addComponent(txt_sueldo)
                                        .addComponent(txt_usuarioMaestro))
                                    .addGap(26, 26, 26)
                                    .addGroup(crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_usuarioMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_maestroNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                            .addComponent(tf_profesion)
                                            .addGroup(crearMaestro_blancoLayout.createSequentialGroup()
                                                .addComponent(tf_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_lps)))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        crearMaestro_blancoLayout.setVerticalGroup(
            crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearMaestro_blancoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maestroID)
                    .addComponent(ff_maestroID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreMaestro)
                    .addComponent(tf_maestroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_profesion)
                    .addComponent(tf_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sueldo)
                    .addComponent(tf_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lps))
                .addGap(18, 18, 18)
                .addGroup(crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuarioMaestro)
                    .addComponent(tf_usuarioMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearMaestro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_contraseñaMaestro)
                    .addComponent(tf_contraseñaMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(btn_crearMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearMaestro_blancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_checkMaestro)
                .addContainerGap())
        );

        crearMaestro_frame.getContentPane().add(crearMaestro_blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 1080, 540));

        crearMaestro_azul.setBackground(new java.awt.Color(37, 71, 106));
        crearMaestro_azul.setPreferredSize(new java.awt.Dimension(100, 270));

        img_back_crearMaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_back_crearMaestro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_back_crearMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_back_crearMaestroMouseClicked(evt);
            }
        });

        txt_nuevoMaestro.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        txt_nuevoMaestro.setForeground(new java.awt.Color(255, 255, 255));
        txt_nuevoMaestro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nuevoMaestro.setText("Crear Maestro");

        javax.swing.GroupLayout crearMaestro_azulLayout = new javax.swing.GroupLayout(crearMaestro_azul);
        crearMaestro_azul.setLayout(crearMaestro_azulLayout);
        crearMaestro_azulLayout.setHorizontalGroup(
            crearMaestro_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearMaestro_azulLayout.createSequentialGroup()
                .addGroup(crearMaestro_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearMaestro_azulLayout.createSequentialGroup()
                        .addGap(581, 581, 581)
                        .addComponent(txt_nuevoMaestro))
                    .addGroup(crearMaestro_azulLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(img_back_crearMaestro)))
                .addContainerGap(560, Short.MAX_VALUE))
        );
        crearMaestro_azulLayout.setVerticalGroup(
            crearMaestro_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearMaestro_azulLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(img_back_crearMaestro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nuevoMaestro)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        crearMaestro_frame.getContentPane().add(crearMaestro_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        modificar_maestro.setText("Modificar");
        modificar_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_maestroActionPerformed(evt);
            }
        });
        pp_maestros.add(modificar_maestro);

        eliminar_maestro.setText("Eliminar");
        eliminar_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_maestroActionPerformed(evt);
            }
        });
        pp_maestros.add(eliminar_maestro);

        registro_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        registro_frame.setBackground(new java.awt.Color(236, 240, 245));
        registro_frame.setMinimumSize(new java.awt.Dimension(1370, 1370));
        registro_frame.setName("registro_frame"); // NOI18N
        registro_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_registroMouseClicked(evt);
            }
        });
        jScroll_registro.setViewportView(tabla_registro);
        if (tabla_registro.getColumnModel().getColumnCount() > 0) {
            tabla_registro.getColumnModel().getColumn(0).setResizable(false);
        }

        registro_frame.getContentPane().add(jScroll_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 1050, 550));

        registro_azul.setBackground(new java.awt.Color(37, 71, 106));
        registro_azul.setPreferredSize(new java.awt.Dimension(100, 270));

        img_backRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_backRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_backRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_backRegistroMouseClicked(evt);
            }
        });

        img_addRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addicon.png"))); // NOI18N
        img_addRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_addRegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout registro_azulLayout = new javax.swing.GroupLayout(registro_azul);
        registro_azul.setLayout(registro_azulLayout);
        registro_azulLayout.setHorizontalGroup(
            registro_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registro_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_backRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registro_azulLayout.createSequentialGroup()
                .addContainerGap(1189, Short.MAX_VALUE)
                .addComponent(img_addRegistro)
                .addGap(151, 151, 151))
        );
        registro_azulLayout.setVerticalGroup(
            registro_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registro_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_backRegistro)
                .addGap(28, 28, 28)
                .addComponent(img_addRegistro)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        registro_frame.getContentPane().add(registro_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        crearRegistro_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        crearRegistro_frame.setBackground(new java.awt.Color(236, 240, 245));
        crearRegistro_frame.setMinimumSize(new java.awt.Dimension(1370, 1370));
        crearRegistro_frame.setName("crear_clase_frame"); // NOI18N
        crearRegistro_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearRegistro_blanco.setBackground(new java.awt.Color(255, 255, 255));

        txt_usuarioRegistro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_usuarioRegistro.setText("Usuario:");

        txt_contraseñaRegistro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_contraseñaRegistro.setText("Contraseña:");

        btn_crearRegistro.setBackground(new java.awt.Color(37, 71, 106));
        btn_crearRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearRegistro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_crearRegistro.setPreferredSize(new java.awt.Dimension(72, 22));

        txt_crearRegistro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_crearRegistro.setForeground(new java.awt.Color(255, 255, 255));
        txt_crearRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_crearRegistro.setText("Crear");
        txt_crearRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_crearRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_crearRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_crearRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_crearRegistroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_crearRegistroLayout = new javax.swing.GroupLayout(btn_crearRegistro);
        btn_crearRegistro.setLayout(btn_crearRegistroLayout);
        btn_crearRegistroLayout.setHorizontalGroup(
            btn_crearRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_crearRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        btn_crearRegistroLayout.setVerticalGroup(
            btn_crearRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_crearRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        img_checkRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        img_checkRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_checkRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_checkRegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crearRegistro_blancoLayout = new javax.swing.GroupLayout(crearRegistro_blanco);
        crearRegistro_blanco.setLayout(crearRegistro_blancoLayout);
        crearRegistro_blancoLayout.setHorizontalGroup(
            crearRegistro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearRegistro_blancoLayout.createSequentialGroup()
                .addGroup(crearRegistro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearRegistro_blancoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btn_crearRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 926, Short.MAX_VALUE)
                        .addComponent(img_checkRegistro))
                    .addGroup(crearRegistro_blancoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(crearRegistro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_contraseñaRegistro)
                            .addComponent(txt_usuarioRegistro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(crearRegistro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_usuarioRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                            .addComponent(tf_contraseñaRegistro))
                        .addGap(0, 529, Short.MAX_VALUE)))
                .addContainerGap())
        );
        crearRegistro_blancoLayout.setVerticalGroup(
            crearRegistro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearRegistro_blancoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(crearRegistro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuarioRegistro)
                    .addComponent(tf_usuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(crearRegistro_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_contraseñaRegistro)
                    .addComponent(tf_contraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                .addComponent(btn_crearRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearRegistro_blancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_checkRegistro)
                .addContainerGap())
        );

        crearRegistro_frame.getContentPane().add(crearRegistro_blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 1080, 540));

        crearRegistro_azul.setBackground(new java.awt.Color(37, 71, 106));
        crearRegistro_azul.setPreferredSize(new java.awt.Dimension(100, 270));

        img_back_crearRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_back_crearRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_back_crearRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_back_crearRegistroMouseClicked(evt);
            }
        });

        txt_nuevoRegistro.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        txt_nuevoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        txt_nuevoRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nuevoRegistro.setText("Crear Registro");

        javax.swing.GroupLayout crearRegistro_azulLayout = new javax.swing.GroupLayout(crearRegistro_azul);
        crearRegistro_azul.setLayout(crearRegistro_azulLayout);
        crearRegistro_azulLayout.setHorizontalGroup(
            crearRegistro_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearRegistro_azulLayout.createSequentialGroup()
                .addGroup(crearRegistro_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearRegistro_azulLayout.createSequentialGroup()
                        .addGap(581, 581, 581)
                        .addComponent(txt_nuevoRegistro))
                    .addGroup(crearRegistro_azulLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(img_back_crearRegistro)))
                .addContainerGap(560, Short.MAX_VALUE))
        );
        crearRegistro_azulLayout.setVerticalGroup(
            crearRegistro_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearRegistro_azulLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(img_back_crearRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nuevoRegistro)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        crearRegistro_frame.getContentPane().add(crearRegistro_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        modificar_registro.setText("Modificar");
        modificar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_registroActionPerformed(evt);
            }
        });
        pp_registro.add(modificar_registro);

        eliminar_registro.setText("Eliminar");
        eliminar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_registroActionPerformed(evt);
            }
        });
        pp_registro.add(eliminar_registro);

        matricular_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        matricular_frame.setBackground(new java.awt.Color(236, 240, 245));
        matricular_frame.setMinimumSize(new java.awt.Dimension(1370, 1370));
        matricular_frame.setName("matricular_frame"); // NOI18N
        matricular_frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_matricular.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Hora", "Alumnos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_matricular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_matricularMouseClicked(evt);
            }
        });
        jScroll_matricular.setViewportView(tabla_matricular);
        if (tabla_matricular.getColumnModel().getColumnCount() > 0) {
            tabla_matricular.getColumnModel().getColumn(0).setResizable(false);
        }

        matricular_frame.getContentPane().add(jScroll_matricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 1050, 550));

        matricular_azul.setBackground(new java.awt.Color(37, 71, 106));
        matricular_azul.setPreferredSize(new java.awt.Dimension(100, 270));

        img_backMatricular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        img_backMatricular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_backMatricular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_backMatricularMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout matricular_azulLayout = new javax.swing.GroupLayout(matricular_azul);
        matricular_azul.setLayout(matricular_azulLayout);
        matricular_azulLayout.setHorizontalGroup(
            matricular_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matricular_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_backMatricular)
                .addContainerGap(1334, Short.MAX_VALUE))
        );
        matricular_azulLayout.setVerticalGroup(
            matricular_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matricular_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_backMatricular)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        matricular_frame.getContentPane().add(matricular_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        asignar_matricular.setText("Asignar alumno");
        asignar_matricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignar_matricularActionPerformed(evt);
            }
        });
        pp_matricular.add(asignar_matricular);

        quitar_matricular.setText("Quitar alumno");
        quitar_matricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitar_matricularActionPerformed(evt);
            }
        });
        pp_matricular.add(quitar_matricular);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Canvas");
        setBackground(new java.awt.Color(236, 240, 245));
        setExtendedState(6);
        setName("frame_principal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_blanco.setBackground(new java.awt.Color(255, 255, 255));

        inicioSesionTxt.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        inicioSesionTxt.setForeground(new java.awt.Color(77, 98, 123));
        inicioSesionTxt.setText("Inicio de sesión");

        accedeCuentaTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        accedeCuentaTxt.setForeground(new java.awt.Color(167, 207, 255));
        accedeCuentaTxt.setText("Accede a tu cuenta");

        ingresarUsuario.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        ingresarUsuario.setForeground(new java.awt.Color(177, 185, 189));
        ingresarUsuario.setText("Ingrese su nombre de usuario");
        ingresarUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ingresarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingresarUsuarioMousePressed(evt);
            }
        });

        ingresarContraseña.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        ingresarContraseña.setForeground(new java.awt.Color(177, 185, 189));
        ingresarContraseña.setText("*********");
        ingresarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingresarContraseñaMousePressed(evt);
            }
        });

        btn_ingresar.setBackground(new java.awt.Color(37, 71, 106));

        btn_ingresarTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_ingresarTxt.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ingresarTxt.setText("Ingresar");
        btn_ingresarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ingresarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ingresarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_ingresarLayout = new javax.swing.GroupLayout(btn_ingresar);
        btn_ingresar.setLayout(btn_ingresarLayout);
        btn_ingresarLayout.setHorizontalGroup(
            btn_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ingresarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_ingresarLayout.setVerticalGroup(
            btn_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ingresarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout login_blancoLayout = new javax.swing.GroupLayout(login_blanco);
        login_blanco.setLayout(login_blancoLayout);
        login_blancoLayout.setHorizontalGroup(
            login_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_blancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_blancoLayout.createSequentialGroup()
                        .addGroup(login_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingresarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                            .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ingresarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(login_blancoLayout.createSequentialGroup()
                        .addGroup(login_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accedeCuentaTxt)
                            .addComponent(inicioSesionTxt))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        login_blancoLayout.setVerticalGroup(
            login_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_blancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inicioSesionTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accedeCuentaTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ingresarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        getContentPane().add(login_blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 200, 500, 300));

        login_azul.setBackground(new java.awt.Color(37, 71, 106));

        javax.swing.GroupLayout login_azulLayout = new javax.swing.GroupLayout(login_azul);
        login_azul.setLayout(login_azulLayout);
        login_azulLayout.setHorizontalGroup(
            login_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        login_azulLayout.setVerticalGroup(
            login_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(login_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarUsuarioMousePressed
        if (ingresarUsuario.getText().equals("Ingrese su nombre de usuario")) {
            ingresarUsuario.setText("");
            ingresarUsuario.setForeground(Color.black);
        }
        if (String.valueOf(ingresarContraseña.getPassword()).isEmpty()) {
            ingresarContraseña.setText("*********");
            ingresarContraseña.setForeground(new Color(177, 185, 189));
        }
    }//GEN-LAST:event_ingresarUsuarioMousePressed

    private void ingresarContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarContraseñaMousePressed
        if (String.valueOf(ingresarContraseña.getPassword()).equals("*********")) {
            ingresarContraseña.setText("");
            ingresarContraseña.setForeground(Color.black);
        }
        if (ingresarUsuario.getText().isEmpty()) {
            ingresarUsuario.setText("Ingrese su nombre de usuario");
            ingresarUsuario.setForeground(new Color(177, 185, 189));
        }
    }//GEN-LAST:event_ingresarContraseñaMousePressed

    private void btn_ingresarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarTxtMouseClicked
        if (login()) {
            for (Usuario usuario : usuarios) {
                if (usuario instanceof Registro r) {
                    if (ingresarUsuario.getText().equals(r.getUser())
                            && String.valueOf(ingresarContraseña.getPassword()).equals(r.getPassword())) {
                        setFrame(BGregistro_frame);
                        this.setVisible(false);
                        txt_nombre.setText(ingresarUsuario.getText().toUpperCase());
                        txt_bienvenida.setText("¡Te damos la bienvenida " + ingresarUsuario.getText() + "!");
                    }
                }else if(usuario instanceof Maestro m){
                    if (ingresarUsuario.getText().equals(m.getUser())
                            && String.valueOf(ingresarContraseña.getPassword()).equals(m.getPassword())) {
                        setFrame(BGmaestro_frame);
                        this.setVisible(false);
                        int tamaño = m.getClasesList().size();
                        setClases(m, tamaño);
                        if(m.getClasesList().isEmpty()){
                            JOptionPane.showMessageDialog(this, "¡No hay clases asignadas!");
                        }
                    }
                }else if(usuario instanceof Alumno a){
                    if (ingresarUsuario.getText().equals(a.getUser())
                            && String.valueOf(ingresarContraseña.getPassword()).equals(a.getPassword())) {
                        setFrame(BGmaestro_frame);
                        this.setVisible(false);
                        int tamaño = a.getClasesList().size();
                        setClases(a,tamaño);
                        if(a.getClasesList().isEmpty()){
                            JOptionPane.showMessageDialog(this, "¡No hay clases matriculadas!");
                        }
                    }
                }
            }
        } else if (ingresarUsuario.getText().isEmpty()
                || ingresarUsuario.getText().equals("Ingrese su nombre de usuario")) {
            JOptionPane.showMessageDialog(this, "Debe de ingresar un usuario");
        } else if (String.valueOf(ingresarContraseña.getPassword()).isEmpty()
                || String.valueOf(ingresarContraseña.getPassword()).equals("*********")) {
            JOptionPane.showMessageDialog(this, "Debe de ingresar una contraseña");
        } else if (String.valueOf(ingresarContraseña.getPassword()).isEmpty()
                && ingresarUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe de ingresar un usuario y contraseña");
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta");
        }
    }//GEN-LAST:event_btn_ingresarTxtMouseClicked

    private void btn_ingresarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarTxtMouseEntered
        btn_ingresar.setBackground(new Color(28, 53, 80));
    }//GEN-LAST:event_btn_ingresarTxtMouseEntered

    private void btn_ingresarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarTxtMouseExited
        btn_ingresar.setBackground(new Color(37, 71, 106));
    }//GEN-LAST:event_btn_ingresarTxtMouseExited

    private void txt_cerrarSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cerrarSessionMouseClicked
        cerrarSesion(BGregistro_frame, evt);
    }//GEN-LAST:event_txt_cerrarSessionMouseClicked

    private void txt_cerrarSessionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cerrarSessionMouseEntered
        btn_cerrarSesion.setBackground(new Color(28, 53, 80));
    }//GEN-LAST:event_txt_cerrarSessionMouseEntered

    private void txt_cerrarSessionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cerrarSessionMouseExited
        btn_cerrarSesion.setBackground(new Color(37, 71, 106));
    }//GEN-LAST:event_txt_cerrarSessionMouseExited

    private void txt_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_salirMouseClicked
        salir();
    }//GEN-LAST:event_txt_salirMouseClicked

    private void txt_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_salirMouseEntered
        btn_salir.setBackground(new Color(28, 53, 80));
    }//GEN-LAST:event_txt_salirMouseEntered

    private void txt_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_salirMouseExited
        btn_salir.setBackground(new Color(37, 71, 106));
    }//GEN-LAST:event_txt_salirMouseExited

    private void btn_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alumnosMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabla_alumnos.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Alumno a){
                Object[] row = {a.getCuenta(), a.getNombre(), a.getCarrera(), a.getClases()};
                modelo.addRow(row);
            }
        }
        tabla_alumnos.setModel(modelo);
        
        img_checkQuitar.setVisible(false);
        BGregistro_frame.setVisible(false);
        setFrame(alumnos_frame);
        img_checkAsignar.setVisible(false);
        img_addAlumnos.setVisible(true);
    }//GEN-LAST:event_btn_alumnosMouseClicked

    private void btn_maestrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maestrosMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabla_maestros.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Maestro m){
                Object[] row = {m.getId(), m.getNombre(), m.getProfesion(), m.getSueldo(),
                    m.getClases()};
                modelo.addRow(row);
            }
        }
        tabla_maestros.setModel(modelo);

        BGregistro_frame.setVisible(false);
        setFrame(maestros_frame);
    }//GEN-LAST:event_btn_maestrosMouseClicked

    private void btn_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabla_usuarios.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            Object[] row = {user.getUser(),user.getRole()};
            modelo.addRow(row);
        }
        tabla_usuarios.setModel(modelo);

        BGregistro_frame.setVisible(false);
        setFrame(usuarios_frame);
    }//GEN-LAST:event_btn_usuariosMouseClicked

    private void btn_matricularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_matricularMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabla_matricular.getModel();
        modelo.setRowCount(0);
        for (Clase clase : clases) {
            Object[] row = {clase.getId(), clase.getNombre(), clase.getHora(), clase.getAlumnos()};
            modelo.addRow(row);
        }
        tabla_matricular.setModel(modelo);

        BGregistro_frame.setVisible(false);
        setFrame(matricular_frame);
    }//GEN-LAST:event_btn_matricularMouseClicked

    private void btn_adminClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adminClasesMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabla_clases.getModel();
        modelo.setRowCount(0);
        for (Clase clase : clases) {
            Object[] row = {clase.getId(), clase.getNombre(), clase.getHora(), clase.getUv(),
                clase.getPeriodo(), clase.getAño(), clase.getMaestro()};
            modelo.addRow(row);
        }
        tabla_clases.setModel(modelo);
        //agrega al combobox
        DefaultComboBoxModel modeloCombo = (DefaultComboBoxModel) cb_maestros.getModel();
        modeloCombo.removeAllElements();
        for (Usuario usuario : usuarios) {
            if(usuario instanceof Maestro m){
                modeloCombo.addElement(m);
            }
        }
        cb_maestros.setModel(modeloCombo);
        
        setFrame(clases_frame);
        BGregistro_frame.setVisible(false);
    }//GEN-LAST:event_btn_adminClasesMouseClicked

    private void img_backClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_backClasesMouseClicked
        setFrame(BGregistro_frame);
        clases_frame.setVisible(false);
    }//GEN-LAST:event_img_backClasesMouseClicked

    private void img_backUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_backUsuariosMouseClicked
        setFrame(BGregistro_frame);
        usuarios_frame.setVisible(false);
    }//GEN-LAST:event_img_backUsuariosMouseClicked

    private void img_backAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_backAlumnosMouseClicked
        setFrame(BGregistro_frame);
        alumnos_frame.setVisible(false);
    }//GEN-LAST:event_img_backAlumnosMouseClicked

    private void img_backMaestrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_backMaestrosMouseClicked
        setFrame(BGregistro_frame);
        maestros_frame.setVisible(false);
    }//GEN-LAST:event_img_backMaestrosMouseClicked

    private void img_backRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_backRegistroMouseClicked
        setFrame(BGregistro_frame);
        registro_frame.setVisible(false);
    }//GEN-LAST:event_img_backRegistroMouseClicked

    private void img_backMatricularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_backMatricularMouseClicked
        setFrame(BGregistro_frame);
        matricular_frame.setVisible(false);
    }//GEN-LAST:event_img_backMatricularMouseClicked

    private void btn_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registroMouseClicked
        DefaultTableModel modelo = (DefaultTableModel)tabla_registro.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Registro r){
                Object[] row = {r.getUser()};
                modelo.addRow(row);
            }
        }
        tabla_registro.setModel(modelo);
        
        img_checkRegistro.setVisible(false);
        setFrame(registro_frame);
        BGregistro_frame.setVisible(false);
    }//GEN-LAST:event_btn_registroMouseClicked

    private void txt_crearClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_crearClaseMouseClicked
        Clase clase = new Clase(
                tf_claseID.getText(),
                tf_claseNombre.getText(),
                String.valueOf(cb_horasClase.getSelectedItem()),
                Integer.parseInt(String.valueOf(cb_uvClase.getSelectedItem())),
                String.valueOf(cb_periodoClase.getSelectedItem()),
                añoClase.getYear(),
                (Maestro) cb_maestros.getSelectedItem()
        );
        
        
        if (clases.isEmpty()) {
            //agrega al ArrayList global
            clases.add(clase);
            JOptionPane.showMessageDialog(crearClase_frame, "¡Clase agregada exitosamente!");
            //agrega al binario
            clasesBin.escribirBinario(clase);
            
            if((Maestro) cb_maestros.getSelectedItem() != null){
                //agrega la clase al maestro
                ((Maestro) cb_maestros.getSelectedItem()).getClasesList().add(clase);
                usuarioBin.escribirBinario((Maestro) cb_maestros.getSelectedItem());
            }
            
        } else {
            boolean found = false;
            for (Clase c : clases) {
                if (c.getId().equals(clase.getId())) {
                    JOptionPane.showMessageDialog(this, "¡Ya existe una clase con los mismos credenciales!");
                    //agrega la clase al maestro
                    ((Maestro) cb_maestros.getSelectedItem()).getClasesList().add(clase);
                    found = true;
                    break;
                }
            }
            
            if((Maestro) cb_maestros.getSelectedItem() != null){
                //agrega la clase al maestro
                ((Maestro) cb_maestros.getSelectedItem()).getClasesList().add(clase);
                usuarioBin.escribirBinario((Maestro) cb_maestros.getSelectedItem());
            }
            
            if (!found) {
                //agrega al ArrayList global
                clases.add(clase);
                JOptionPane.showMessageDialog(crearClase_frame, "¡Clase agregada exitosamente!");
                //agrega la clase al binario
                clasesBin.escribirBinario(clase);
            }
        }
        
        //Vacía la combobox
        if (cb_maestros.getItemAt(0) == null) {
            DefaultComboBoxModel nuevaCombo = new DefaultComboBoxModel();
            cb_maestros.setModel(nuevaCombo);
        } else {
            cb_maestros.setSelectedIndex(0);
        }
        //Vacía los otros campos
        tf_claseID.setText("");
        tf_claseNombre.setText("");
        cb_horasClase.setSelectedIndex(0);
        cb_uvClase.setSelectedIndex(0);
        cb_periodoClase.setSelectedIndex(0);
        añoClase.setYear(2023);
    }//GEN-LAST:event_txt_crearClaseMouseClicked

    private void txt_crearClaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_crearClaseMouseEntered
        btn_crearClase.setBackground(new Color(28, 53, 80));
    }//GEN-LAST:event_txt_crearClaseMouseEntered

    private void txt_crearClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_crearClaseMouseExited
        btn_crearClase.setBackground(new Color(37, 71, 106));
    }//GEN-LAST:event_txt_crearClaseMouseExited

    private void img_checkClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_checkClaseMouseClicked
        int fila = tabla_clases.getSelectedRow();
        //obtiene el ID de la fila de la clase seleccionada
        Object cell = tabla_clases.getValueAt(fila, 0);

        boolean found = false;
        Clase clase = new Clase();
        for (Clase c : clases) {
            //compara el número de cuenta de la fila seleccionada con el número de cuenta de los usuarios alumnos
            if (c.getId().equals(String.valueOf(cell))) {
                found = true;
                clase = c;
            }
        }
        if(found){
            try {
                //elimina la clase del binario
                clasesBin.eliminarDato(clase);

                //Cambia los valores de la clase a los valores modiificados
                clase.setId(tf_claseID.getText());
                clase.setNombre(tf_claseNombre.getText());
                clase.setHora(String.valueOf(cb_horasClase.getSelectedItem()));
                clase.setUv(Integer.parseInt(String.valueOf(cb_uvClase.getSelectedItem())));
                clase.setPeriodo(String.valueOf(cb_periodoClase.getSelectedItem()));
                clase.setAño(añoClase.getYear());
                clase.setMaestro((Maestro) cb_maestros.getSelectedItem());

                JOptionPane.showMessageDialog(this, "¡Se ha modificado exitosamente!");
                setFrame(clases_frame);
                crearClase_frame.setVisible(false);

                //agrega la clase modificada al binario
                clasesBin.escribirBinario(clase);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        DefaultTableModel modelo = (DefaultTableModel) tabla_clases.getModel();
        modelo.setRowCount(0);
        for (Clase c : clases) {
            Object[] row = {c.getId(), c.getNombre(), c.getHora(), c.getUv(),
                c.getPeriodo(), c.getAño(), c.getMaestro()};
            modelo.addRow(row);
        }
        tabla_clases.setModel(modelo);
        //agrega al combobox
        DefaultComboBoxModel modeloCombo = (DefaultComboBoxModel) cb_maestros.getModel();
        modeloCombo.removeAllElements();
        for (Usuario usuario : usuarios) {
            if(usuario instanceof Maestro m){
                modeloCombo.addElement(m);
            }
        }
        cb_maestros.setModel(modeloCombo);
    }//GEN-LAST:event_img_checkClaseMouseClicked

    private void img_addClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_addClasesMouseClicked
        setFrame(crearClase_frame);
        clases_frame.setVisible(false);
        img_checkClase.setVisible(false);

        tf_claseID.setText("");
        tf_claseNombre.setText("");
        cb_horasClase.setSelectedIndex(0);
        cb_uvClase.setSelectedIndex(0);
        cb_periodoClase.setSelectedIndex(0);
        añoClase.setYear(2023);
        if (cb_maestros.getItemAt(0) == null) {
            JOptionPane.showMessageDialog(this, "¡No hay maestros que asignar!");
        } else {
            cb_maestros.setSelectedIndex(0);
        }
    }//GEN-LAST:event_img_addClasesMouseClicked

    private void img_back_crearClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_back_crearClaseMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabla_clases.getModel();
        modelo.setRowCount(0);
        for (Clase clase : clases) {
            Object[] row = {clase.getId(), clase.getNombre(), clase.getHora(), clase.getUv(),
                clase.getPeriodo(), clase.getAño(), clase.getMaestro()};
            modelo.addRow(row);
        }
        tabla_clases.setModel(modelo);
        //agrega al combobox
        DefaultComboBoxModel modeloCombo = (DefaultComboBoxModel) cb_maestros.getModel();
        modeloCombo.removeAllElements();
        for (Usuario usuario : usuarios) {
            if(usuario instanceof Maestro m){
                modeloCombo.addElement(m);
            }
        }
        cb_maestros.setModel(modeloCombo);
        
        setFrame(clases_frame);
        crearClase_frame.setVisible(false);
    }//GEN-LAST:event_img_back_crearClaseMouseClicked

    private void tabla_clasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_clasesMouseClicked
        if (evt.isMetaDown() && tabla_clases.getRowCount() > 0) {
            pp_clase.show(tabla_clases, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tabla_clasesMouseClicked

    private void modificar_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_claseActionPerformed
        img_checkClase.setVisible(true);
        btn_crearClase.setVisible(false);

        txt_nuevaClase.setText("Modificar Clase");

        setFrame(crearClase_frame);
        clases_frame.setVisible(false);

        Object cell = tabla_clases.getValueAt(tabla_clases.getSelectedRow(), 0);
        for (Clase c : clases) {
            //compara el número de cuenta de la fila seleccionada con el número de cuenta de los usuarios alumnos
            if (c.getId().equals(String.valueOf(cell))) {
                tf_claseID.setText(c.getId());
                tf_claseNombre.setText(c.getNombre());
                cb_horasClase.setSelectedItem(c.getHora());
                cb_uvClase.setSelectedIndex(c.getUv() - 1);
                cb_periodoClase.setSelectedItem(c.getPeriodo());
                añoClase.setYear(c.getAño());
                if (cb_maestros.getItemAt(0) == null) {
                    DefaultComboBoxModel nuevaCombo = new DefaultComboBoxModel();
                    cb_maestros.setModel(nuevaCombo);
                } else {
                    cb_maestros.setSelectedIndex(0);
                }
            }
        }
    }//GEN-LAST:event_modificar_claseActionPerformed

    private void eliminar_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_claseActionPerformed
        int x = JOptionPane.showConfirmDialog(clases_frame, "¿Desea eliminar la clase?", "Eliminar clase", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            //obtiene el número de cuenta de la fila seleccionada
            Object cell = tabla_clases.getValueAt(tabla_clases.getSelectedRow(), 0);

            boolean found = false;
            Clase clase = new Clase();
            for (Clase c : clases) {
                if (c.getId().equals(String.valueOf(cell))) {
                    found = true;
                    clase = c;
                }

            }
            if (found) {
                try {
                    //elimina el alumno del ArrayList
                    clases.remove(clase);
                    //elimina la clase del binario
                    clasesBin.eliminarDato(clase);
                } catch (FileDoesNotExist ex) {
                    ex.getMessage();
                }
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) tabla_clases.getModel();
        modelo.setRowCount(0);
        for (Clase clase : clases) {
            Object[] row = {clase.getId(), clase.getNombre(), clase.getHora(), clase.getUv(),
                clase.getPeriodo(), clase.getAño(), clase.getMaestro()};
            modelo.addRow(row);
        }
        tabla_clases.setModel(modelo);
    }//GEN-LAST:event_eliminar_claseActionPerformed

    private void modificar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_usuarioActionPerformed
        setFrame(modificarUsuario_frame);
        usuarios_frame.setVisible(false);

        Object cell = tabla_usuarios.getValueAt(tabla_usuarios.getSelectedRow(), 0);
        for (Usuario u : usuarios) {
            //compara el número de cuenta de la fila seleccionada con el número de cuenta de los usuarios alumnos
            if (u.getUser().equals(String.valueOf(cell))) {
                tf_usuario.setText(u.getUser());
                tf_password.setText(u.getPassword());
                cb_rol.setSelectedItem(u.getRole());
            }
        }
    }//GEN-LAST:event_modificar_usuarioActionPerformed

    private void eliminar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_usuarioActionPerformed
        int x = JOptionPane.showConfirmDialog(usuarios_frame, "¿Desea eliminar el usuario?", "Eliminar usuario", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            //obtiene el número de cuenta de la fila seleccionada
            Object cell = tabla_usuarios.getValueAt(tabla_usuarios.getSelectedRow(), 0);
            boolean found = false;
            Usuario usuario = new Usuario();

            for (Usuario u : usuarios) {
                if (u.getUser().equals(String.valueOf(cell))) {
                    found = true;
                    usuario = u;
                    break;
                }
            }

            if (found) {
                try {
                    //elimina el usuario del ArrayList
                    usuarios.remove(usuario);
                    //elimina el usuario del binario
                    usuarioBin.eliminarDato(usuario);
                } catch (FileDoesNotExist ex) {
                    ex.printStackTrace();
                }
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) tabla_usuarios.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            Object[] row = {user.getUser(),user.getRole()};
            modelo.addRow(row);
        }
        tabla_usuarios.setModel(modelo);
    }//GEN-LAST:event_eliminar_usuarioActionPerformed

    private void img_back_modificarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_back_modificarUsuarioMouseClicked
        setFrame(usuarios_frame);
        modificarUsuario_frame.setVisible(false);
    }//GEN-LAST:event_img_back_modificarUsuarioMouseClicked

    private void img_checkUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_checkUsuarioMouseClicked
        int fila = tabla_usuarios.getSelectedRow();
        //obtiene el ID de la fila de la clase seleccionada
        Object cell = tabla_usuarios.getValueAt(fila, 0);
        
        for (Usuario usuario : usuarios) {
            //compara el número de cuenta de la fila seleccionada con el número de cuenta de los usuarios alumnos
            if (usuario.getUser().equals(String.valueOf(cell))) {
                try {
                    //elimina la clase del binario
                    usuarioBin.eliminarDato(usuario);

                    //Cambia los valores de la clase a los valores modiificados
                    usuario.setUser(tf_usuario.getText());
                    usuario.setPassword(tf_password.getText());
                    usuario.setRole(String.valueOf(cb_rol.getSelectedItem()));

                    JOptionPane.showMessageDialog(this, "¡Se ha modificado exitosamente!");
                    setFrame(usuarios_frame);
                    modificarUsuario_frame.setVisible(false);

                    //agrega la clase modificada al binario
                    usuarioBin.escribirBinario(usuario);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        DefaultTableModel modelo = (DefaultTableModel) tabla_usuarios.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            Object[] row = {user.getUser(),user.getRole()};
            modelo.addRow(row);
        }
        tabla_usuarios.setModel(modelo);
    }//GEN-LAST:event_img_checkUsuarioMouseClicked

    private void txt_crearAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_crearAlumnoMouseClicked
        Alumno alumno = new Alumno(
                Integer.parseInt(ff_numCuenta.getText()),
                tf_alumnoNombre.getText(),
                String.valueOf(cb_carreras.getSelectedItem()),
                tf_usuarioAlumno.getText(),
                tf_contraseñaAlumno.getText(),
                "Alumno"
        );

        if (usuarios.isEmpty()) {
            //agrega al ArrayList global
            usuarios.add(alumno);
            JOptionPane.showMessageDialog(crearClase_frame, "¡Alumno agregado exitosamente!");
            //agrega al binario
            usuarioBin.escribirBinario(alumno);
        } else {
            boolean found = false;
            for (Usuario usuario : usuarios) {
                if (usuario instanceof Alumno a) {
                    if (a.getCuenta() == (alumno.getCuenta()) || a.getUser().equals(alumno.getUser())) {
                        JOptionPane.showMessageDialog(this, "¡Ya existe un usuario con los mismos credenciales!");
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                //agrega al ArrayList global
                usuarios.add(alumno);
                JOptionPane.showMessageDialog(crearClase_frame, "¡Alumno agregado exitosamente!");
                //agrega al binario
                usuarioBin.escribirBinario(alumno);
            }
        }

        ff_numCuenta.setText("");
        tf_alumnoNombre.setText("");
        cb_carreras.setSelectedIndex(0);
        tf_usuarioAlumno.setText("");
        tf_contraseñaAlumno.setText("");
    }//GEN-LAST:event_txt_crearAlumnoMouseClicked

    private void txt_crearAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_crearAlumnoMouseEntered
        btn_crearAlumno.setBackground(new Color(28, 53, 80));
    }//GEN-LAST:event_txt_crearAlumnoMouseEntered

    private void txt_crearAlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_crearAlumnoMouseExited
        btn_crearAlumno.setBackground(new Color(37, 71, 106));
    }//GEN-LAST:event_txt_crearAlumnoMouseExited

    private void img_checkAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_checkAlumnoMouseClicked
        int fila = tabla_alumnos.getSelectedRow();
        //obtiene el ID de la fila de la clase seleccionada
        Object cell = tabla_alumnos.getValueAt(fila, 0);

        for (Usuario usuario : usuarios) {
            if (usuario instanceof Alumno a) {
                //compara el número de cuenta de la fila seleccionada con el número de cuenta de los usuarios alumnos
                if (a.getCuenta() == (int) cell) {
                    try {
                        //elimina la clase del binario
                        usuarioBin.eliminarDato(a);

                        //Cambia los valores de la clase a los valores modiificados
                        a.setCuenta(Integer.parseInt(ff_numCuenta.getText()));
                        a.setNombre(tf_alumnoNombre.getText());
                        a.setCarrera(String.valueOf(cb_carreras.getSelectedItem()));

                        JOptionPane.showMessageDialog(this, "¡Se ha modificado exitosamente!");
                        setFrame(alumnos_frame);
                        crearAlumno_frame.setVisible(false);

                        //agrega la clase modificada al binario
                        usuarioBin.escribirBinario(a);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        
        DefaultTableModel modelo = (DefaultTableModel) tabla_alumnos.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Alumno a){
                Object[] row = {a.getCuenta(), a.getNombre(), a.getCarrera(), a.getClases()};
                modelo.addRow(row);
            }
        }
        tabla_alumnos.setModel(modelo);
    }//GEN-LAST:event_img_checkAlumnoMouseClicked

    private void img_back_crearAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_back_crearAlumnoMouseClicked
                DefaultTableModel modelo = (DefaultTableModel) tabla_alumnos.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Alumno a){
                Object[] row = {a.getCuenta(), a.getNombre(), a.getCarrera(), a.getClases()};
                modelo.addRow(row);
            }
        }
        tabla_alumnos.setModel(modelo);
        
        setFrame(alumnos_frame);
        img_checkAsignar.setVisible(false);
        img_addAlumnos.setVisible(true);
        crearAlumno_frame.setVisible(false);
    }//GEN-LAST:event_img_back_crearAlumnoMouseClicked

    private void modificar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_alumnoActionPerformed
        img_checkAlumno.setVisible(true);
        btn_crearAlumno.setVisible(false);

        txt_nuevoAlumno.setText("Modificar Alumno");

        setFrame(crearAlumno_frame);
        alumnos_frame.setVisible(false);

        Object cell = tabla_alumnos.getValueAt(tabla_alumnos.getSelectedRow(), 0);
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Alumno a) {
                //compara el número de cuenta de la fila seleccionada con el número de cuenta de los usuarios alumnos
                if (a.getCuenta() == (int) cell) {
                    ff_numCuenta.setText(String.valueOf(a.getCuenta()));
                    tf_alumnoNombre.setText(a.getNombre());
                    cb_carreras.setSelectedItem(a.getCarrera());
                    tf_usuarioAlumno.setText(a.getUser());
                    tf_contraseñaAlumno.setText(a.getPassword());
                }
            }
        }
    }//GEN-LAST:event_modificar_alumnoActionPerformed

    private void eliminar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_alumnoActionPerformed
        int x = JOptionPane.showConfirmDialog(alumnos_frame, "¿Desea eliminar el alumno?", "Eliminar alumno", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            //obtiene el número de cuenta de la fila seleccionada
            Object cell = tabla_alumnos.getValueAt(tabla_alumnos.getSelectedRow(), 0);

            boolean found = false;
            Alumno alumno = new Alumno();
            for (Usuario usuario : usuarios) {
                if (usuario instanceof Alumno a) {
                    if (a.getCuenta() == (int) cell) {
                        found = true;
                        alumno = a;
                    }
                }
            }
            if (found) {
                try {
                    //elimina el alumno del ArrayList
                    usuarios.remove(alumno);
                    //elimina la clase del binario
                    usuarioBin.eliminarDato(alumno);
                } catch (FileDoesNotExist ex) {
                    ex.getMessage();
                }
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) tabla_alumnos.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Alumno a){
                Object[] row = {a.getCuenta(), a.getNombre(), a.getCarrera(), a.getClases()};
                modelo.addRow(row);
            }
        }
        tabla_alumnos.setModel(modelo);
    }//GEN-LAST:event_eliminar_alumnoActionPerformed

    private void img_addAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_addAlumnosMouseClicked
        setFrame(crearAlumno_frame);
        alumnos_frame.setVisible(false);
        img_checkAlumno.setVisible(false);

        ff_numCuenta.setText("");
        tf_alumnoNombre.setText("");
        cb_carreras.setSelectedIndex(0);
        tf_usuarioAlumno.setText("");
        tf_contraseñaAlumno.setText("");
    }//GEN-LAST:event_img_addAlumnosMouseClicked

    private void tabla_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_alumnosMouseClicked
        if (evt.isMetaDown() && tabla_alumnos.getRowCount() > 0) {
            pp_alumnos.show(tabla_alumnos, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tabla_alumnosMouseClicked

    private void tabla_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuariosMouseClicked
        if (evt.isMetaDown() && tabla_usuarios.getRowCount() > 0) {
            pp_usuarios.show(tabla_usuarios, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tabla_usuariosMouseClicked

    private void txt_crearMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_crearMaestroMouseClicked
        Maestro maestro = new Maestro(
                Integer.parseInt(ff_maestroID.getText()),
                tf_maestroNombre.getText(),
                tf_profesion.getText(),
                Double.parseDouble(tf_sueldo.getText()),
                tf_usuarioMaestro.getText(),
                tf_contraseñaMaestro.getText(),
                "Maestro"
        );

        if (usuarios.isEmpty()) {
            //agrega al ArrayList global
            usuarios.add(maestro);
            JOptionPane.showMessageDialog(crearMaestro_frame, "¡Maestro agregado exitosamente!");
            //falta por escribir en el binario
        } else {
            boolean found = false;
            for (Usuario usuario : usuarios) {
                if (usuario instanceof Maestro m) {
                    if (m.getId() == (maestro.getId()) || m.getUser().equals(maestro.getUser())) {
                        JOptionPane.showMessageDialog(this, "¡Ya existe un usuario con los mismos credenciales!");
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                //agrega al ArrayList global
                usuarios.add(maestro);
                JOptionPane.showMessageDialog(crearMaestro_frame, "¡Maestro agregado exitosamente!");
                //falta por escribir en el binario
            }
        }

        ff_maestroID.setText("");
        tf_maestroNombre.setText("");
        tf_profesion.setText("");
        tf_sueldo.setText("");
        tf_usuarioMaestro.setText("");
        tf_contraseñaMaestro.setText("");
    }//GEN-LAST:event_txt_crearMaestroMouseClicked

    private void txt_crearMaestroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_crearMaestroMouseEntered
        btn_crearAlumno.setBackground(new Color(28, 53, 80));
    }//GEN-LAST:event_txt_crearMaestroMouseEntered

    private void txt_crearMaestroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_crearMaestroMouseExited
        btn_crearAlumno.setBackground(new Color(37, 71, 106));
    }//GEN-LAST:event_txt_crearMaestroMouseExited

    private void img_checkMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_checkMaestroMouseClicked
        int fila = tabla_maestros.getSelectedRow();
        //obtiene el ID de la fila de la clase seleccionada
        Object cell = tabla_maestros.getValueAt(fila, 0);

        for (Usuario usuario : usuarios) {
            if (usuario instanceof Maestro m) {
                //compara el número de cuenta de la fila seleccionada con el número de cuenta de los usuarios alumnos
                if (m.getId() == (int) cell) {
                    try {
                        //elimina la clase del binario
                        usuarioBin.eliminarDato(m);

                        //Cambia los valores de la clase a los valores modiificados
                        m.setId(Integer.parseInt(ff_maestroID.getText()));
                        m.setNombre(tf_maestroNombre.getText());
                        m.setProfesion(tf_profesion.getText());
                        m.setSueldo(Double.parseDouble(tf_sueldo.getText()));
                        m.setUser(tf_usuarioMaestro.getText());
                        m.setPassword(tf_contraseñaMaestro.getText());

                        JOptionPane.showMessageDialog(this, "¡Se ha modificado exitosamente!");
                        setFrame(maestros_frame);
                        crearMaestro_frame.setVisible(false);

                        //agrega la clase modificada al binario
                        usuarioBin.escribirBinario(m);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        
        DefaultTableModel modelo = (DefaultTableModel) tabla_maestros.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Maestro m){
                Object[] row = {m.getId(), m.getNombre(), m.getProfesion(), m.getSueldo(),
                    m.getClases()};
                modelo.addRow(row);
            }
        }
        tabla_maestros.setModel(modelo);
    }//GEN-LAST:event_img_checkMaestroMouseClicked

    private void img_back_crearMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_back_crearMaestroMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabla_maestros.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Maestro m){
                Object[] row = {m.getId(), m.getNombre(), m.getProfesion(), m.getSueldo(),
                    m.getClases()};
                modelo.addRow(row);
            }
        }
        tabla_maestros.setModel(modelo);
        
        setFrame(maestros_frame);
        crearMaestro_frame.setVisible(false);
    }//GEN-LAST:event_img_back_crearMaestroMouseClicked

    private void img_addMaestrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_addMaestrosMouseClicked
        setFrame(crearMaestro_frame);
        maestros_frame.setVisible(false);
        img_checkMaestro.setVisible(false);

        ff_maestroID.setText("");
        tf_maestroNombre.setText("");
        tf_profesion.setText("");
        tf_sueldo.setText("");
        tf_usuarioMaestro.setText("");
        tf_contraseñaMaestro.setText("");
    }//GEN-LAST:event_img_addMaestrosMouseClicked

    private void modificar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_maestroActionPerformed
        img_checkMaestro.setVisible(true);
        btn_crearMaestro.setVisible(false);

        txt_nuevoAlumno.setText("Modificar Maestro");

        setFrame(crearMaestro_frame);
        maestros_frame.setVisible(false);

        Object cell = tabla_maestros.getValueAt(tabla_maestros.getSelectedRow(), 0);
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Maestro m) {
                //compara el número de cuenta de la fila seleccionada con el número de cuenta de los usuarios alumnos
                if (m.getId() == (int) cell) {
                    ff_maestroID.setText(String.valueOf(m.getId()));
                    tf_maestroNombre.setText(m.getNombre());
                    tf_profesion.setText(m.getProfesion());
                    tf_sueldo.setText(String.valueOf(m.getSueldo()));
                    tf_usuarioMaestro.setText(m.getUser());
                    tf_contraseñaMaestro.setText(m.getPassword());
                }
            }
        }
    }//GEN-LAST:event_modificar_maestroActionPerformed

    private void eliminar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_maestroActionPerformed
        int x = JOptionPane.showConfirmDialog(maestros_frame, "¿Desea eliminar el maestro?", "Eliminar maestro", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            //obtiene el número de cuenta de la fila seleccionada
            Object cell = tabla_maestros.getValueAt(tabla_maestros.getSelectedRow(), 0);

            boolean found = false;
            Maestro maestro = new Maestro();
            for (Usuario usuario : usuarios) {
                if (usuario instanceof Maestro m) {
                    if (m.getId() == (int) cell) {
                        found = true;
                        maestro = m;
                    }
                }

            }
            if (found) {
                try {
                    //elimina el alumno del ArrayList
                    usuarios.remove(maestro);
                    //elimina la clase del binario
                    usuarioBin.eliminarDato(maestro);
                } catch (FileDoesNotExist ex) {
                    ex.getMessage();
                }
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) tabla_maestros.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Maestro m){
                Object[] row = {m.getId(), m.getNombre(), m.getProfesion(), m.getSueldo(),
                    m.getClases()};
                modelo.addRow(row);
            }
        }
        tabla_maestros.setModel(modelo);
    }//GEN-LAST:event_eliminar_maestroActionPerformed

    private void tabla_maestrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_maestrosMouseClicked
        if (evt.isMetaDown() && tabla_maestros.getRowCount() > 0) {
            pp_maestros.show(tabla_maestros, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tabla_maestrosMouseClicked

    private void txt_crearRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_crearRegistroMouseClicked
        Registro registro = new Registro(
                tf_usuarioRegistro.getText(),
                tf_contraseñaRegistro.getText(),
                "Registro"
        );

        if (usuarios.isEmpty()) {
            //agrega al ArrayList global
            usuarios.add(registro);
            JOptionPane.showMessageDialog(crearRegistro_frame, "¡Usuario registro agregada exitosamente!");
            //agrega al binario
            usuarioBin.escribirBinario(registro);
        } else {
            boolean found = false;
            for (Usuario usuario : usuarios) {
                if (usuario instanceof Registro r) {
                    if (r.getUser().equals(registro.getUser())) {
                        JOptionPane.showMessageDialog(this, "¡Ya existe un usuario con los mismos credenciales!");
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                //agrega al ArrayList global
                usuarios.add(registro);
                JOptionPane.showMessageDialog(crearRegistro_frame, "¡Usuario registro agregado exitosamente!");
                //agrega al binario
                usuarioBin.escribirBinario(registro);
            }
        }

        tf_usuarioRegistro.setText("");
        tf_contraseñaRegistro.setText("");
    }//GEN-LAST:event_txt_crearRegistroMouseClicked

    private void txt_crearRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_crearRegistroMouseEntered
        btn_crearAlumno.setBackground(new Color(28, 53, 80));
    }//GEN-LAST:event_txt_crearRegistroMouseEntered

    private void txt_crearRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_crearRegistroMouseExited
        btn_crearAlumno.setBackground(new Color(37, 71, 106));
    }//GEN-LAST:event_txt_crearRegistroMouseExited

    private void img_checkRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_checkRegistroMouseClicked
        int fila = tabla_registro.getSelectedRow();
        //obtiene el ID de la fila de la clase seleccionada
        Object cell = tabla_registro.getValueAt(fila, 0);

        for (Usuario usuario : usuarios) {
            if (usuario instanceof Registro r) {
                //compara el número de cuenta de la fila seleccionada con el número de cuenta de los usuarios alumnos
                if (r.getUser().equals(String.valueOf(cell))) {
                    try {
                        //elimina la clase del binario
                        usuarioBin.eliminarDato(r);

                        //Cambia los valores de la clase a los valores modiificados
                        r.setUser(tf_usuarioRegistro.getText());
                        r.setPassword(tf_contraseñaRegistro.getText());

                        JOptionPane.showMessageDialog(this, "¡Se ha modificado exitosamente!");
                        setFrame(registro_frame);
                        crearRegistro_frame.setVisible(false);

                        //agrega la clase modificada al binario
                        usuarioBin.escribirBinario(r);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        
        DefaultTableModel modelo = (DefaultTableModel)tabla_registro.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Registro r){
                Object[] row = {r.getUser()};
                modelo.addRow(row);
            }
        }
        tabla_registro.setModel(modelo);
    }//GEN-LAST:event_img_checkRegistroMouseClicked

    private void img_back_crearRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_back_crearRegistroMouseClicked
        DefaultTableModel modelo = (DefaultTableModel)tabla_registro.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Registro r){
                Object[] row = {r.getUser()};
                modelo.addRow(row);
            }
        }
        tabla_registro.setModel(modelo);
        
        setFrame(registro_frame);
        crearRegistro_frame.setVisible(false);
    }//GEN-LAST:event_img_back_crearRegistroMouseClicked

    private void img_addRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_addRegistroMouseClicked
        setFrame(crearRegistro_frame);
        registro_frame.setVisible(false);

        tf_usuarioRegistro.setText("");
        tf_contraseñaRegistro.setText("");
    }//GEN-LAST:event_img_addRegistroMouseClicked

    private void modificar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_registroActionPerformed
        img_checkRegistro.setVisible(true);
        btn_crearRegistro.setVisible(false);

        txt_nuevoRegistro.setText("Modificar Registro");

        setFrame(crearRegistro_frame);
        registro_frame.setVisible(false);

        Object cell = tabla_registro.getValueAt(tabla_registro.getSelectedRow(), 0);
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Registro r) {
                //compara el número de cuenta de la fila seleccionada con el número de cuenta de los usuarios alumnos
                if (r.getUser().equals(String.valueOf(cell))) {
                    tf_usuarioRegistro.setText(r.getUser());
                    tf_contraseñaRegistro.setText(r.getPassword());
                }
            }
        }
    }//GEN-LAST:event_modificar_registroActionPerformed

    private void eliminar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_registroActionPerformed
        int x = JOptionPane.showConfirmDialog(registro_frame, "¿Desea eliminar el usuario de registro?", "Eliminar registro", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            //obtiene el número de cuenta de la fila seleccionada
            Object cell = tabla_registro.getValueAt(tabla_registro.getSelectedRow(), 0);

            boolean found = false;
            Registro registro = new Registro();
            for (Usuario usuario : usuarios) {
                if (usuario instanceof Registro r) {
                    if (r.getUser().equals(String.valueOf(cell))) {
                        found = true;
                        registro = r;
                    }
                }

            }
            if (found) {
                try {
                    //elimina el alumno del ArrayList
                    usuarios.remove(registro);
                    //elimina la clase del binario
                    usuarioBin.eliminarDato(registro);
                } catch (FileDoesNotExist ex) {
                    ex.getMessage();
                }
            }
        }
        DefaultTableModel modelo = (DefaultTableModel)tabla_registro.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Registro r){
                Object[] row = {r.getUser()};
                modelo.addRow(row);
            }
        }
        tabla_registro.setModel(modelo);
    }//GEN-LAST:event_eliminar_registroActionPerformed

    private void tabla_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_registroMouseClicked
        if (tabla_registro.getRowCount() > 0 && evt.isMetaDown()) {
            pp_registro.show(tabla_registro, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tabla_registroMouseClicked

    private void asignar_matricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignar_matricularActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla_alumnos.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Alumno a){
                Object[] row = {a.getCuenta(), a.getNombre(), a.getCarrera(), a.getClases()};
                modelo.addRow(row);
            }
        }
        tabla_alumnos.setModel(modelo);
        
        img_checkQuitar.setVisible(false);
        img_checkAsignar.setVisible(true);
        img_addAlumnos.setVisible(false);
        setFrame(alumnos_frame);
        matricular_frame.setVisible(false);
    }//GEN-LAST:event_asignar_matricularActionPerformed

    private void quitar_matricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitar_matricularActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla_alumnos.getModel();
        modelo.setRowCount(0);
        for (Usuario user : usuarios) {
            if(user instanceof Alumno a){
                Object[] row = {a.getCuenta(), a.getNombre(), a.getCarrera(), a.getClases()};
                modelo.addRow(row);
            }
        }
        tabla_alumnos.setModel(modelo);
        
        img_checkQuitar.setVisible(true);
        img_checkAsignar.setVisible(false);
        img_addAlumnos.setVisible(false);
        setFrame(alumnos_frame);
        matricular_frame.setVisible(false);
    }//GEN-LAST:event_quitar_matricularActionPerformed

    private void tabla_matricularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_matricularMouseClicked
        if (evt.isMetaDown() && tabla_matricular.getRowCount() > 0) {
            pp_matricular.show(tabla_matricular, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tabla_matricularMouseClicked

    private void img_checkAsignarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_checkAsignarMouseClicked
        int[] filas = tabla_alumnos.getSelectedRows();       
        Clase clase = new Clase();
        for (Clase c : clases) {
            Object cell = tabla_matricular.getValueAt(tabla_matricular.getSelectedRow(), 0);
            if(c.getId().equals(String.valueOf(cell))){
                clase = c;
                break;
            }
        }

        Alumno al = new Alumno();
        try{
            ArrayList<Alumno> alumnosMatriculados = clase.getAlumnosList();
            for (Usuario usuario : usuarios) {
                if(usuario instanceof Alumno a){
                    for (int fila : filas) {
                        Object cell = tabla_alumnos.getValueAt(fila, 0);
                        if(a.getCuenta() == (int)cell){
                            try{
                                clasesBin.eliminarDato(clase);
                                usuarioBin.eliminarDato(a);
                            }catch(FileDoesNotExist ex){
                            }
                            
                            //si la clase a matricular no tiene alumnos se agrega
                            if(alumnosMatriculados.isEmpty()){
                                //se agrega el alumno a la clase
                                clase.getAlumnosList().add(a);
                                //al alumno se le agrega la clase
                                a.getClasesList().add(clase);
                                al = a;
                                //agrega al binario al alumno con la clase ya matriculada
                                usuarioBin.escribirBinario(al);
                                //agrega al binario la clase con los alumnos
                                clasesBin.escribirBinario(clase);
                                
                            //si la clase a matricular tiene alumnos revisa por repetidos
                            }else{
                                for (Alumno alumno : alumnosMatriculados) {
                                    if(a.getCuenta() != alumno.getCuenta()){
                                        //se agrega el alumno a la clase
                                        clase.getAlumnosList().add(a);
                                        //al alumno se le agrega la clase
                                        a.getClasesList().add(clase);
                                        al = a;
                                    }else{
                                        JOptionPane.showMessageDialog(this, "¡El alumno ya está matriculado!");
                                        break;
                                    }   
                                }
                                //agrega al binario al alumno con la clase ya matriculada
                                usuarioBin.escribirBinario(al);
                                //agrega al binario la clase con los alumnos
                                clasesBin.escribirBinario(clase);
                            }
                        }
                    }   
                }
            }
        }catch(Exception ex){
            ex.getMessage();
        }
        
        DefaultTableModel modelo = (DefaultTableModel) tabla_matricular.getModel();
        modelo.setRowCount(0);
        for (Clase c : clases) {
            Object[] row = {c.getId(), c.getNombre(), c.getHora(), c.getAlumnos()};
            modelo.addRow(row);
        }
        tabla_matricular.setModel(modelo);

        alumnos_frame.setVisible(false);
        setFrame(matricular_frame);
    }//GEN-LAST:event_img_checkAsignarMouseClicked

    private void img_checkQuitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_checkQuitarMouseClicked
        boolean found = false;
        Alumno a = new Alumno();
        Clase c = new Clase();
        try{
            for (Clase clase : clases) {
                Object cell = tabla_matricular.getValueAt(tabla_matricular.getSelectedRow(), 0);
                if(clase.getId().equals(String.valueOf(cell))){
                    
                    ArrayList<Alumno> alumnosMatriculados = clase.getAlumnosList();
                    for (Alumno alumno : alumnosMatriculados) {
                        Object cuenta = tabla_alumnos.getValueAt(tabla_alumnos.getSelectedRow(), 0);
                        if(alumno.getCuenta() == (int)cuenta){
                            a = alumno;
                            c = clase;
                            //elimina al alumno de la lista de la clase
                            clase.getAlumnosList().remove(alumno);
                            found = true;
                            //elimina del binario al alumno
                            usuarioBin.eliminarDato(alumno);
                            //elimina del binario a la clase
                            clasesBin.eliminarDato(clase);
                            
                            JOptionPane.showMessageDialog(this, "¡El alumno se ha quitado de la clase exitosamente!");
                        }
                    }
                }
            }
        }catch(Exception ex){
            ex.getMessage();
        }
        
        if(found){
            //escribe a la clase sin el alumno al binario
            usuarioBin.escribirBinario(a);
            //escribe al alumno sin la clase matriculada
            clasesBin.escribirBinario(c);
        }
        
       DefaultTableModel modelo = (DefaultTableModel) tabla_matricular.getModel();
        modelo.setRowCount(0);
        for (Clase cl : clases) {
            Object[] row = {cl.getId(), cl.getNombre(), cl.getHora(), cl.getAlumnos()};
            modelo.addRow(row);
        }
        tabla_matricular.setModel(modelo);

        alumnos_frame.setVisible(false);
        setFrame(matricular_frame);
    }//GEN-LAST:event_img_checkQuitarMouseClicked

    private void txt_tareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tareasMouseClicked
        if(MAESTRO != null){
            setFrame(BGtareas_frame);
            BGclase_frame.setVisible(false);
            
            tf_nombreTarea.setText("");
            escogerFecha_tarea.setDate(null);
            textA_descripcion.setText("");
            tf_horaTarea.setText("");
            tf_tamañoMax.setText("");
        }
    }//GEN-LAST:event_txt_tareasMouseClicked

    private void btn_crearTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearTareaMouseClicked
        Clase clase = new Clase();
        for (Clase c : clases) {
            if(nombreClase.equals(txt_ccNombre.getText())){
                clase = c;
                break;
            }
        }
        
        Tarea tarea = new Tarea(clase,tf_nombreTarea.getText(),escogerFecha_tarea.getDate(),textA_descripcion.getText());
        tarea.setEspacio(Long.parseLong(tf_tamañoMax.getText())); //error al parsear
        tarea.getFecha().setHours(Integer.parseInt(tf_horaTarea.getText()));
        
        //agrega la tarea a la clase
        clase.getTareas().add(tarea);
        
        jTextArea_tareas.setText("");
        jTextArea_examenes.setText("");
        txt_ccNombre.setText(jLabel1.getText());
        
        String tareas = "";
        for (Tarea t : clase.getTareas()) {
            tareas += t.toString() + "\n";
            
        }
        jTextArea_tareas.setText(tareas);
        jTextArea1.append(tareas);
        
        setFrame(BGclase_frame);
        BGtareas_frame.setVisible(false);
    }//GEN-LAST:event_btn_crearTareaMouseClicked

    private void bg_clase1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bg_clase1MouseClicked
        ImgHilo hilo = new ImgHilo(img_thread);
        hilo.start();
        
        jTextArea_tareas.setText("");
        jTextArea_examenes.setText("");
        txt_ccNombre.setText(jLabel1.getText());
        for (Clase clase : clases) {
            nombreClase = clase.getNombre().concat(clase.getId());
            if(nombreClase.equals(txt_ccNombre.getText())){
                if(!clase.getTareas().isEmpty()){
                    String tareas = "";
                    for (Tarea tarea : clase.getTareas()) {
                        tareas = tarea.toString() + "\n";
                    }
                    jTextArea_tareas.setText(tareas);
                }
                if(!clase.getExamen().isEmpty()){
                    String examenes = "";
                    for (Examen e : clase.getExamen()) {
                        examenes = e.toString() + "\n";
                    }
                    jTextArea_examenes.setText(examenes);
                }
                break;
            }
        }
        
        setFrame(BGclase_frame);
        BGmaestro_frame.setVisible(false);
    }//GEN-LAST:event_bg_clase1MouseClicked

    private void txt_cerrarSessionCanvasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cerrarSessionCanvasMouseClicked
        cerrarSesion(BGmaestro_frame, evt);
    }//GEN-LAST:event_txt_cerrarSessionCanvasMouseClicked

    private void txt_salirCanvasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_salirCanvasMouseClicked
        salir();
    }//GEN-LAST:event_txt_salirCanvasMouseClicked

    private void img_back_crearTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_back_crearTareasMouseClicked
        setFrame(BGclase_frame);
        BGtareas_frame.setVisible(false);
    }//GEN-LAST:event_img_back_crearTareasMouseClicked

    private void img_back_clasesFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_back_clasesFrameMouseClicked
        BGclase_frame.setVisible(false);
        setFrame(BGmaestro_frame);
    }//GEN-LAST:event_img_back_clasesFrameMouseClicked

    private void img_back_crearTareas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_back_crearTareas1MouseClicked
        setFrame(BGclase_frame);
        BGcontestarTareas_frame.setVisible(false);
    }//GEN-LAST:event_img_back_crearTareas1MouseClicked

    private void jTextArea_tareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea_tareasMouseClicked
        if(ALUMNO != null){
            nombreTarea = jTextArea_tareas.getSelectedText();
            for (Clase clase : clases) {
                for (Tarea tarea : clase.getTareas()) {
                    if(tarea.toString().equals(nombreTarea)){
                        txt_contestarTareas.setText(nombreTarea);
                        txt_fechaTareaEntrega.setText(tarea.getFecha().toString());
                        txt_descripcionContestar.setText(tarea.getDescripcion());
                        setFrame(BGcontestarTareas_frame);
                        if(tarea.isYaSeHizo() == true){
                            img_drop.setVisible(false);
                        }
                        break;
                    }
                }
            }
        }else if (MAESTRO != null){
            String n = jTextArea_tareas.getSelectedText();
            DefaultTableModel modelo = (DefaultTableModel)table_notasTareas.getModel();
            System.out.println(clases);
            for (Clase clase : clases) {
                for (Tarea tarea : clase.getTareas()) {
                    if(tarea.toString().equals(n) || tarea.toString().equals(nombreTarea)){
                        modelo.setRowCount(0);
                        for (Alumno a : clase.getAlumnosList()) {
                            Object[] cell = {a.getCuenta(),a.getNombre()};
                            modelo.addRow(cell);
                        }
                    }
                }
            }
            table_notasTareas.setModel(modelo);
            setFrame(BGevaluarTareas_frame);
            BGclase_frame.setVisible(false);
        }
    }//GEN-LAST:event_jTextArea_tareasMouseClicked

    private void img_back_evaluarTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_back_evaluarTareasMouseClicked
        BGevaluarTareas_frame.setVisible(false);
        setFrame(BGclase_frame);
    }//GEN-LAST:event_img_back_evaluarTareasMouseClicked

    private void img_dropMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_dropMouseClicked
        String nombre = jTextArea_tareas.getSelectedText();
        for (Clase clase : clases) {
            for (Tarea tarea : clase.getTareas()) {
                if(tarea.toString().equals(nombre)){
                    if(!tarea.getFecha().equals(new Date())){
                        JFileChooser jfc = new JFileChooser();
                        int seleccion = jfc.showSaveDialog(this);
                        if (seleccion == JFileChooser.APPROVE_OPTION) {
                            try {
                                File archivo = new File(jfc.getSelectedFile().getPath());
                                System.out.println(archivo.getTotalSpace());
                                if(archivo.getTotalSpace() <= tarea.getEspacio() && !tarea.getFecha().equals(new Date())){
                                    tarea.setFile(archivo);
                                    tarea.setYaSeHizo(true);
                                    JOptionPane.showMessageDialog(this, "¡La tarea ha sido entregada!");
                                }else{
                                    JOptionPane.showMessageDialog(this, "¡La tarea no es válida!");
                                }
                                BGcontestarTareas_frame.setVisible(false);
                                setFrame(BGclase_frame);
                            }catch(Exception ex){
                                ex.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_img_dropMouseClicked

    private void table_notasTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_notasTareasMouseClicked
        if(evt.isMetaDown() && table_notasTareas.getSelectedRow() >= 0){
            pp_evaluarTareas.show(table_notasTareas, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_table_notasTareasMouseClicked

    private void descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarActionPerformed
        System.out.println(nombreClase);
        for (Clase clase : clases) {
            for (Tarea tarea : clase.getTareas()) {
                System.out.println(tarea.toString());
                if(tarea.toString().equals(nombreClase)){
                    System.out.println("entró");
                    try {
                        File descarga = new File("./descargas/");
                        String pathStr = descarga.getAbsolutePath();
                        Path path = Paths.get(pathStr);
                        Files.move(tarea.getFile().toPath(), path, StandardCopyOption.ATOMIC_MOVE);
                        JOptionPane.showMessageDialog(this, "¡Descarga exitosa!");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }//GEN-LAST:event_descargarActionPerformed

    private void evaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluarActionPerformed
        System.out.println(nombreClase);
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota:"));
        for(Clase c : clases){
            for (Tarea tarea : c.getTareas()) {
                System.out.println(tarea.toString());
                if(tarea.toString().equals(nombreClase)){
                    System.out.println(nota);
                    tarea.setNota(nota);
                    txt_valorNota.setText(String.valueOf(nota));
                }
            }
        }
    }//GEN-LAST:event_evaluarActionPerformed

    private void salir() {
        System.exit(0);
    }

    private void cerrarSesion(JFrame frame, java.awt.event.MouseEvent evt) {
        ingresarUsuario.setText("Ingrese su nombre de usuario");
        ingresarContraseña.setText("*********");
        ingresarUsuarioMousePressed(evt);
        ingresarContraseñaMousePressed(evt);
        setFrame(this);
        frame.setVisible(false);
    }

    private void setFrame(JFrame frame) {
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(MAXIMIZED_BOTH);
    }

    
    private void setClases(Object o,int tamaño){
        bg_clase1.setVisible(false);
        bg_clase2.setVisible(false);
        bg_clase3.setVisible(false);
        bg_clase4.setVisible(false);
        bg_clase5.setVisible(false);
        bg_clase6.setVisible(false);
        
        if(o instanceof Maestro m){
            switch(tamaño){
                case 1->{
                    bg_clase1.setVisible(true);
                    jLabel1.setText(m.getClasesList().get(0).getNombre().concat(m.getClasesList().get(0).getId()));
                }
                case 2 ->{
                    bg_clase2.setVisible(true);
                    jLabel2.setText(m.getClasesList().get(1).getNombre().concat(m.getClasesList().get(1).getId()));
                    bg_clase1.setVisible(true);
                    jLabel1.setText(m.getClasesList().get(0).getNombre().concat(m.getClasesList().get(0).getId()));
                }
                case 3 ->{
                    bg_clase3.setVisible(true);
                    jLabel3.setText(m.getClasesList().get(2).getNombre().concat(m.getClasesList().get(2).getId()));
                    bg_clase2.setVisible(true);
                    jLabel2.setText(m.getClasesList().get(1).getNombre().concat(m.getClasesList().get(1).getId()));
                    bg_clase1.setVisible(true);
                    jLabel1.setText(m.getClasesList().get(0).getNombre().concat(m.getClasesList().get(0).getId()));
                }
                case 4 ->{
                    bg_clase4.setVisible(true);
                    jLabel4.setText(m.getClasesList().get(3).getNombre().concat(m.getClasesList().get(3).getId()));
                    bg_clase3.setVisible(true);
                    jLabel3.setText(m.getClasesList().get(2).getNombre().concat(m.getClasesList().get(2).getId()));
                    bg_clase2.setVisible(true);
                    jLabel2.setText(m.getClasesList().get(1).getNombre().concat(m.getClasesList().get(1).getId()));
                    bg_clase1.setVisible(true);
                    jLabel1.setText(m.getClasesList().get(0).getNombre().concat(m.getClasesList().get(0).getId()));
                }
                case 5 ->{
                    bg_clase5.setVisible(true);
                    jLabel5.setText(m.getClasesList().get(4).getNombre().concat(m.getClasesList().get(4).getId()));
                    bg_clase4.setVisible(true);
                    jLabel4.setText(m.getClasesList().get(3).getNombre().concat(m.getClasesList().get(3).getId()));
                    bg_clase3.setVisible(true);
                    jLabel3.setText(m.getClasesList().get(2).getNombre().concat(m.getClasesList().get(2).getId()));
                    bg_clase2.setVisible(true);
                    jLabel2.setText(m.getClasesList().get(1).getNombre().concat(m.getClasesList().get(1).getId()));
                    bg_clase1.setVisible(true);
                    jLabel1.setText(m.getClasesList().get(0).getNombre().concat(m.getClasesList().get(0).getId()));
                }
                case 6 ->{
                    bg_clase6.setVisible(true);
                    jLabel6.setText(m.getClasesList().get(5).getNombre().concat(m.getClasesList().get(5).getId()));
                    bg_clase5.setVisible(true);
                    jLabel5.setText(m.getClasesList().get(4).getNombre().concat(m.getClasesList().get(4).getId()));
                    bg_clase4.setVisible(true);
                    jLabel4.setText(m.getClasesList().get(3).getNombre().concat(m.getClasesList().get(3).getId()));
                    bg_clase3.setVisible(true);
                    jLabel3.setText(m.getClasesList().get(2).getNombre().concat(m.getClasesList().get(2).getId()));
                    bg_clase2.setVisible(true);
                    jLabel2.setText(m.getClasesList().get(1).getNombre().concat(m.getClasesList().get(1).getId()));
                    bg_clase1.setVisible(true);
                    jLabel1.setText(m.getClasesList().get(0).getNombre().concat(m.getClasesList().get(0).getId()));
                }
            }
        }else if (o instanceof Alumno a){
            switch(tamaño){
                case 1->{
                    bg_clase1.setVisible(true);
                    jLabel1.setText(a.getClasesList().get(0).getNombre().concat(a.getClasesList().get(0).getId()));
                }
                case 2 ->{
                    bg_clase2.setVisible(true);
                    jLabel2.setText(a.getClasesList().get(1).getNombre().concat(a.getClasesList().get(1).getId()));
                    bg_clase1.setVisible(true);
                    jLabel1.setText(a.getClasesList().get(0).getNombre().concat(a.getClasesList().get(0).getId()));
                }
                case 3 ->{
                    bg_clase3.setVisible(true);
                    jLabel3.setText(a.getClasesList().get(2).getNombre().concat(a.getClasesList().get(2).getId()));
                    bg_clase2.setVisible(true);
                    jLabel2.setText(a.getClasesList().get(1).getNombre().concat(a.getClasesList().get(1).getId()));
                    bg_clase1.setVisible(true);
                    jLabel1.setText(a.getClasesList().get(0).getNombre().concat(a.getClasesList().get(0).getId()));
                }
                case 4 ->{
                    bg_clase4.setVisible(true);
                    jLabel4.setText(a.getClasesList().get(3).getNombre().concat(a.getClasesList().get(3).getId()));
                    bg_clase3.setVisible(true);
                    jLabel3.setText(a.getClasesList().get(2).getNombre().concat(a.getClasesList().get(2).getId()));
                    bg_clase2.setVisible(true);
                    jLabel2.setText(a.getClasesList().get(1).getNombre().concat(a.getClasesList().get(1).getId()));
                    bg_clase1.setVisible(true);
                    jLabel1.setText(a.getClasesList().get(0).getNombre().concat(a.getClasesList().get(0).getId()));
                }
                case 5 ->{
                    bg_clase5.setVisible(true);
                    jLabel5.setText(a.getClasesList().get(4).getNombre().concat(a.getClasesList().get(4).getId()));
                    bg_clase4.setVisible(true);
                    jLabel4.setText(a.getClasesList().get(3).getNombre().concat(a.getClasesList().get(3).getId()));
                    bg_clase3.setVisible(true);
                    jLabel3.setText(a.getClasesList().get(2).getNombre().concat(a.getClasesList().get(2).getId()));
                    bg_clase2.setVisible(true);
                    jLabel2.setText(a.getClasesList().get(1).getNombre().concat(a.getClasesList().get(1).getId()));
                    bg_clase1.setVisible(true);
                    jLabel1.setText(a.getClasesList().get(0).getNombre().concat(a.getClasesList().get(0).getId()));
                }
                case 6 ->{
                    bg_clase6.setVisible(true);
                    jLabel6.setText(a.getClasesList().get(5).getNombre().concat(a.getClasesList().get(5).getId()));
                    bg_clase5.setVisible(true);
                    jLabel5.setText(a.getClasesList().get(4).getNombre().concat(a.getClasesList().get(4).getId()));
                    bg_clase4.setVisible(true);
                    jLabel4.setText(a.getClasesList().get(3).getNombre().concat(a.getClasesList().get(3).getId()));
                    bg_clase3.setVisible(true);
                    jLabel3.setText(a.getClasesList().get(2).getNombre().concat(a.getClasesList().get(2).getId()));
                    bg_clase2.setVisible(true);
                    jLabel2.setText(a.getClasesList().get(1).getNombre().concat(a.getClasesList().get(1).getId()));
                    bg_clase1.setVisible(true);
                    jLabel1.setText(a.getClasesList().get(0).getNombre().concat(a.getClasesList().get(0).getId()));
                }
            } 
        }
    }
    
    private void setBin(){        
        try {
            clasesBin = new ManejoBinarios("Clases.gabr");
            clases = clasesBin.getDatos();
        } catch (Exception ex) {
            ex.getMessage();
        }

        try {
            usuarioBin = new ManejoBinarios("Usuarios.gabr");
            usuarios = usuarioBin.getDatos();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        binTerminado = true;
    }
    private boolean login() {
        ALUMNO = null;
        MAESTRO = null;
        for (Usuario usuario : usuarios) {
            if (ingresarUsuario.getText().equals(usuario.getUser())
                    && String.valueOf(ingresarContraseña.getPassword()).equals(usuario.getPassword())) {
                if(usuario.getRole().equals("Alumno")){
                    ALUMNO = (Alumno)usuario;
                    bg_porHacer.setVisible(true);
                }else if(usuario.getRole().equals("Maestro")){
                    MAESTRO = (Maestro)usuario;
                    bg_porHacer.setVisible(false);
                }
                return true;
            }
        }
        return false;
    }

    private void setState() {
        this.pack();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);

        login_azul.setPreferredSize(new Dimension(1370, 300));
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Canvas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame BGclase_frame;
    private javax.swing.JFrame BGcontestarTareas_frame;
    private javax.swing.JPanel BGcrearTareas_blanco;
    private javax.swing.JPanel BGcrearTareas_blanco1;
    private javax.swing.JPanel BGcrearTareas_blanco2;
    private javax.swing.JFrame BGevaluarTareas_frame;
    private javax.swing.JPanel BGmaestro_azul;
    private javax.swing.JPanel BGmaestro_blanco;
    private javax.swing.JPanel BGmaestro_blanco1;
    private javax.swing.JFrame BGmaestro_frame;
    private javax.swing.JPanel BGmaestro_rojo;
    private javax.swing.JPanel BGregistro_azul;
    private javax.swing.JPanel BGregistro_bienvenida;
    private javax.swing.JFrame BGregistro_frame;
    private javax.swing.JFrame BGtareas_frame;
    private javax.swing.JLabel accedeCuentaTxt;
    private javax.swing.JPanel alumnos_azul;
    private javax.swing.JFrame alumnos_frame;
    private javax.swing.JMenuItem asignar_matricular;
    private com.toedter.calendar.JYearChooser añoClase;
    private javax.swing.JPanel bg_clase1;
    private javax.swing.JPanel bg_clase2;
    private javax.swing.JPanel bg_clase3;
    private javax.swing.JPanel bg_clase4;
    private javax.swing.JPanel bg_clase5;
    private javax.swing.JPanel bg_clase6;
    private javax.swing.JPanel bg_color1;
    private javax.swing.JPanel bg_color2;
    private javax.swing.JPanel bg_color3;
    private javax.swing.JPanel bg_color4;
    private javax.swing.JPanel bg_color5;
    private javax.swing.JPanel bg_color6;
    private javax.swing.JPanel bg_porHacer;
    private javax.swing.JPanel btn_adminClases;
    private javax.swing.JPanel btn_alumnos;
    private javax.swing.JPanel btn_cerrarSesion;
    private javax.swing.JPanel btn_cerrarSesionCanvas;
    private javax.swing.JPanel btn_crearAlumno;
    private javax.swing.JPanel btn_crearClase;
    private javax.swing.JPanel btn_crearMaestro;
    private javax.swing.JPanel btn_crearRegistro;
    private javax.swing.JButton btn_crearTarea;
    private javax.swing.JPanel btn_ingresar;
    private javax.swing.JLabel btn_ingresarTxt;
    private javax.swing.JPanel btn_maestros;
    private javax.swing.JPanel btn_matricular;
    private javax.swing.JPanel btn_registro;
    private javax.swing.JPanel btn_salir;
    private javax.swing.JPanel btn_salirCanvas;
    private javax.swing.JPanel btn_usuarios;
    private javax.swing.JComboBox<String> cb_carreras;
    private javax.swing.JComboBox<String> cb_horasClase;
    private javax.swing.JComboBox<String> cb_maestros;
    private javax.swing.JComboBox<String> cb_periodoClase;
    private javax.swing.JComboBox<String> cb_rol;
    private javax.swing.JComboBox<String> cb_uvClase;
    private javax.swing.JPanel clases_azul;
    private javax.swing.JFrame clases_frame;
    private javax.swing.JPanel crearAlumno_azul;
    private javax.swing.JPanel crearAlumno_blanco;
    private javax.swing.JFrame crearAlumno_frame;
    private javax.swing.JPanel crearClase_azul;
    private javax.swing.JPanel crearClase_blanco;
    private javax.swing.JFrame crearClase_frame;
    private javax.swing.JPanel crearMaestro_azul;
    private javax.swing.JPanel crearMaestro_blanco;
    private javax.swing.JFrame crearMaestro_frame;
    private javax.swing.JPanel crearRegistro_azul;
    private javax.swing.JPanel crearRegistro_blanco;
    private javax.swing.JFrame crearRegistro_frame;
    private javax.swing.JMenuItem descargar;
    private javax.swing.JMenuItem eliminar_alumno;
    private javax.swing.JMenuItem eliminar_clase;
    private javax.swing.JMenuItem eliminar_maestro;
    private javax.swing.JMenuItem eliminar_registro;
    private javax.swing.JMenuItem eliminar_usuario;
    private com.toedter.calendar.JDateChooser escogerFecha_tarea;
    private javax.swing.JMenuItem evaluar;
    private javax.swing.JFormattedTextField ff_maestroID;
    private javax.swing.JFormattedTextField ff_numCuenta;
    private javax.swing.JLabel img_addAlumnos;
    private javax.swing.JLabel img_addClases;
    private javax.swing.JLabel img_addMaestros;
    private javax.swing.JLabel img_addRegistro;
    private javax.swing.JLabel img_adminClases;
    private javax.swing.JLabel img_alumnos;
    private javax.swing.JLabel img_backAlumnos;
    private javax.swing.JLabel img_backClases;
    private javax.swing.JLabel img_backMaestros;
    private javax.swing.JLabel img_backMatricular;
    private javax.swing.JLabel img_backRegistro;
    private javax.swing.JLabel img_backUsuarios;
    private javax.swing.JLabel img_back_clasesFrame;
    private javax.swing.JLabel img_back_crearAlumno;
    private javax.swing.JLabel img_back_crearClase;
    private javax.swing.JLabel img_back_crearMaestro;
    private javax.swing.JLabel img_back_crearRegistro;
    private javax.swing.JLabel img_back_crearTareas;
    private javax.swing.JLabel img_back_crearTareas1;
    private javax.swing.JLabel img_back_evaluarTareas;
    private javax.swing.JLabel img_back_modificarUsuario;
    private javax.swing.JLabel img_checkAlumno;
    private javax.swing.JLabel img_checkAsignar;
    private javax.swing.JLabel img_checkClase;
    private javax.swing.JLabel img_checkMaestro;
    private javax.swing.JLabel img_checkQuitar;
    private javax.swing.JLabel img_checkRegistro;
    private javax.swing.JLabel img_checkUsuario;
    private javax.swing.JLabel img_drop;
    private javax.swing.JLabel img_maestros;
    private javax.swing.JLabel img_matricular;
    private javax.swing.JLabel img_registro;
    private javax.swing.JLabel img_thread;
    private javax.swing.JLabel img_unitec;
    private javax.swing.JLabel img_user;
    private javax.swing.JLabel img_usuarios;
    private javax.swing.JPasswordField ingresarContraseña;
    private javax.swing.JTextField ingresarUsuario;
    private javax.swing.JLabel inicioSesionTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScroll_alumnos;
    private javax.swing.JScrollPane jScroll_clases;
    private javax.swing.JScrollPane jScroll_maestros;
    private javax.swing.JScrollPane jScroll_matricular;
    private javax.swing.JScrollPane jScroll_registro;
    private javax.swing.JScrollPane jScroll_usuarios;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea_examenes;
    private javax.swing.JTextArea jTextArea_tareas;
    private javax.swing.JPanel login_azul;
    private javax.swing.JPanel login_blanco;
    private javax.swing.JPanel maestros_azul;
    private javax.swing.JFrame maestros_frame;
    private javax.swing.JPanel matricular_azul;
    private javax.swing.JFrame matricular_frame;
    private javax.swing.JPanel modificarUsuario_azul;
    private javax.swing.JPanel modificarUsuario_blanco;
    private javax.swing.JFrame modificarUsuario_frame;
    private javax.swing.JMenuItem modificar_alumno;
    private javax.swing.JMenuItem modificar_clase;
    private javax.swing.JMenuItem modificar_maestro;
    private javax.swing.JMenuItem modificar_registro;
    private javax.swing.JMenuItem modificar_usuario;
    private javax.swing.JPopupMenu pp_alumnos;
    private javax.swing.JPopupMenu pp_clase;
    private javax.swing.JPopupMenu pp_evaluarTareas;
    private javax.swing.JPopupMenu pp_maestros;
    private javax.swing.JPopupMenu pp_matricular;
    private javax.swing.JPopupMenu pp_registro;
    private javax.swing.JPopupMenu pp_usuarios;
    private javax.swing.JMenuItem quitar_matricular;
    private javax.swing.JPanel registro_azul;
    private javax.swing.JPanel registro_blanco;
    private javax.swing.JFrame registro_frame;
    private javax.swing.JTable tabla_alumnos;
    private javax.swing.JTable tabla_clases;
    private javax.swing.JTable tabla_maestros;
    private javax.swing.JTable tabla_matricular;
    private javax.swing.JTable tabla_registro;
    private javax.swing.JTable tabla_usuarios;
    private javax.swing.JTable table_notasTareas;
    private javax.swing.JTextArea textA_descripcion;
    private javax.swing.JTextField tf_alumnoNombre;
    private javax.swing.JTextField tf_claseID;
    private javax.swing.JTextField tf_claseNombre;
    private javax.swing.JTextField tf_contraseñaAlumno;
    private javax.swing.JTextField tf_contraseñaMaestro;
    private javax.swing.JTextField tf_contraseñaRegistro;
    private javax.swing.JTextField tf_horaTarea;
    private javax.swing.JTextField tf_maestroNombre;
    private javax.swing.JTextField tf_nombreTarea;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_profesion;
    private javax.swing.JTextField tf_sueldo;
    private javax.swing.JTextField tf_tamañoMax;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JTextField tf_usuarioAlumno;
    private javax.swing.JTextField tf_usuarioMaestro;
    private javax.swing.JTextField tf_usuarioRegistro;
    private javax.swing.JLabel txt_Hora;
    private javax.swing.JLabel txt_adminClases;
    private javax.swing.JLabel txt_alumnos;
    private javax.swing.JLabel txt_bienvenida;
    private javax.swing.JLabel txt_carrera;
    private javax.swing.JLabel txt_ccNombre;
    private javax.swing.JLabel txt_cerrarSession;
    private javax.swing.JLabel txt_cerrarSessionCanvas;
    private javax.swing.JLabel txt_claseAño;
    private javax.swing.JLabel txt_claseHora;
    private javax.swing.JLabel txt_claseID;
    private javax.swing.JLabel txt_claseMaestro;
    private javax.swing.JLabel txt_claseNombre;
    private javax.swing.JLabel txt_clasePeriodo;
    private javax.swing.JLabel txt_claseUV;
    private javax.swing.JLabel txt_contestarTareas;
    private javax.swing.JLabel txt_contestarTareas1;
    private javax.swing.JLabel txt_contraseñaAlumno;
    private javax.swing.JLabel txt_contraseñaMaestro;
    private javax.swing.JLabel txt_contraseñaRegistro;
    private javax.swing.JLabel txt_crearAlumno;
    private javax.swing.JLabel txt_crearClase;
    private javax.swing.JLabel txt_crearMaestro;
    private javax.swing.JLabel txt_crearRegistro;
    private javax.swing.JLabel txt_crearTareas;
    private javax.swing.JLabel txt_descripcion;
    private javax.swing.JLabel txt_descripcionContestar;
    private javax.swing.JLabel txt_examenes;
    private javax.swing.JLabel txt_fechaEntrega;
    private javax.swing.JLabel txt_fechaTareaEntrega;
    private javax.swing.JLabel txt_irrelevante;
    private javax.swing.JLabel txt_lps;
    private javax.swing.JLabel txt_maestroID;
    private javax.swing.JLabel txt_maestros;
    private javax.swing.JLabel txt_matricular;
    private javax.swing.JLabel txt_modificarUsuario;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_nombreAlumno;
    private javax.swing.JLabel txt_nombreMaestro;
    private javax.swing.JLabel txt_nombreTarea;
    private javax.swing.JLabel txt_nota;
    private javax.swing.JLabel txt_nuevaClase;
    private javax.swing.JLabel txt_nuevoAlumno;
    private javax.swing.JLabel txt_nuevoMaestro;
    private javax.swing.JLabel txt_nuevoRegistro;
    private javax.swing.JLabel txt_numCuenta;
    private javax.swing.JLabel txt_password;
    private javax.swing.JLabel txt_porHacer;
    private javax.swing.JLabel txt_presentacion;
    private javax.swing.JLabel txt_profesion;
    private javax.swing.JLabel txt_registro;
    private javax.swing.JLabel txt_rol;
    private javax.swing.JLabel txt_salir;
    private javax.swing.JLabel txt_salirCanvas;
    private javax.swing.JLabel txt_sueldo;
    private javax.swing.JLabel txt_tablero;
    private javax.swing.JLabel txt_tareaEntrega;
    private javax.swing.JLabel txt_tareas;
    private javax.swing.JLabel txt_usuario;
    private javax.swing.JLabel txt_usuarioAlumno;
    private javax.swing.JLabel txt_usuarioMaestro;
    private javax.swing.JLabel txt_usuarioRegistro;
    private javax.swing.JLabel txt_usuarios;
    private javax.swing.JLabel txt_valorNota;
    private javax.swing.JPanel usuarios_azul;
    private javax.swing.JFrame usuarios_frame;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Clase> clases = new ArrayList<>();

    private ManejoBinarios usuarioBin;
    private ManejoBinarios clasesBin;
    
    private String nombreClase = "";
   
    private Alumno ALUMNO;
    private Maestro MAESTRO;
    private boolean binTerminado = false;
    
    private String nombreTarea = "";
}
