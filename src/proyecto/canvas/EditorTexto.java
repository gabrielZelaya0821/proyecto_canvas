/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.canvas;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author osman.mejia
 */
public class EditorTexto extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public EditorTexto() {
        initComponents();
        doc = tp_texto.getStyledDocument();
        estilo = tp_texto.addStyle("miEstilo", null);

        DefaultComboBoxModel modelo=(DefaultComboBoxModel) cb_font.getModel();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fontNames[] = ge.getAvailableFontFamilyNames();
        for (int i = 0; i < fontNames.length; i++) {
            modelo.addElement(fontNames[i]);
        }
        cb_font.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tp_texto = new javax.swing.JTextPane();
        jToolBar1 = new javax.swing.JToolBar();
        cb_font = new javax.swing.JComboBox<>();
        cb_tamaño = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor Texto");
        setBackground(new java.awt.Color(255, 255, 255));

        tp_texto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(tp_texto);

        jToolBar1.setRollover(true);

        cb_font.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_fontItemStateChanged(evt);
            }
        });
        jToolBar1.add(cb_font);

        cb_tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "18", "24", "36", "48", "60", "72" }));
        cb_tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tamañoActionPerformed(evt);
            }
        });
        jToolBar1.add(cb_tamaño);
        jToolBar1.add(jSeparator2);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negrita.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(32, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(32, 25));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cursiva.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(32, 25));
        jButton3.setMinimumSize(new java.awt.Dimension(32, 25));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Subrayado.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator1);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/letra.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        try {

            StyleConstants.setBackground(estilo,
                    JColorChooser.showDialog(this,
                            "Seleccione Color", Color.yellow)
            );

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        try {

            StyleConstants.setForeground(estilo,
                    JColorChooser.showDialog(this,
                            "Seleccione Color", Color.red)
            );

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        try {
            StyleConstants.setBold(estilo, true);

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        try {
            StyleConstants.setItalic(estilo, true);

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        try {
            StyleConstants.setUnderline(estilo, true);

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void cb_tamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tamañoActionPerformed
        // TODO add your handling code here:
        StyleConstants.setFontSize(estilo, Integer.parseInt(cb_tamaño.getSelectedItem().toString()));
        doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("miEstilo"),
                true);
    }//GEN-LAST:event_cb_tamañoActionPerformed

    private void cb_fontItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_fontItemStateChanged
        // TODO add your handling code here:
        StyleConstants.setFontFamily(estilo, cb_font.getSelectedItem().toString());
        //StyleConstants.setFontSize(estilo, Integer.parseInt(cb_tamaño.getSelectedItem().toString()));
        doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("miEstilo"),
                true);
    }//GEN-LAST:event_cb_fontItemStateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new EditorTexto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_font;
    private javax.swing.JComboBox<String> cb_tamaño;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextPane tp_texto;
    // End of variables declaration//GEN-END:variables

    StyledDocument doc;
    Style estilo;
    JTextPane panel = tp_texto;

}
