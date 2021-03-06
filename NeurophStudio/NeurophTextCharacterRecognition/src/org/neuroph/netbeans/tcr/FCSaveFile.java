/***
 * Neuroph  http://neuroph.sourceforge.net
 * Copyright by Neuroph Project (C) 2008
 *
 * This file is part of Neuroph framework.
 *
 * Neuroph is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Neuroph is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Neuroph. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neuroph.netbeans.tcr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Ivana Jovicic, Vladimir Kolarevic, Marko Ivanovic
 */
public class FCSaveFile extends javax.swing.JDialog {

    TCRTopComponent parent;

    /** Creates new form FCSaveFile */
    public FCSaveFile() {
        initComponents();
        setModal(true);
        jFileChooser1.setApproveButtonText("Save");
    }

    public void setParent(TCRTopComponent gui) {
        this.parent = gui;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Save text file");
        setResizable(false);

        FileNameExtensionFilter f [] = new FileNameExtensionFilter[2];
        f[0]=new FileNameExtensionFilter("Word doc", "doc");
        f[1]=new FileNameExtensionFilter("Text txt", "txt");
        jFileChooser1 = new javax.swing.JFileChooser();

        jFileChooser1.setFileFilter(f[0]);
        jFileChooser1.setFileFilter(f[1]);
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-608)/2, (screenSize.height-457)/2, 608, 457);
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        if (evt.getActionCommand().equals("ApproveSelection")) {
            File f = jFileChooser1.getSelectedFile();
            if (f != null) {

                System.out.println(jFileChooser1.getFileFilter().getDescription());
                String[] s = jFileChooser1.getFileFilter().getDescription().split(" ");
                String extension = s[1];
                String path = f.getAbsolutePath();

                try {
                    writtingFile(parent.getRecognizedTextArea().getText(), path + "." + extension);
                    parent.getjLabel2().setText("Text is saved in " + path + "." + extension + " file");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FCSaveFile.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(FCSaveFile.class.getName()).log(Level.SEVERE, null, ex);
                }


            }

            setVisible(false);
        } else {
            setVisible(false);
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    /**
     * This method writes the input text (from JTextArea) into txt or doc file
     * @param text - the input text that will be written in file
     * @param path - the defined path where the file will be saved
     * @throws FileNotFoundException - if file could not be created
     * @throws UnsupportedEncodingException - if encoding is not supported
     */
    public void writtingFile(String text, String path) throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println(text);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File(path)), "UTF8"));
        for (int i = 0; i < text.length(); i++) {
            pw.write(text.charAt(i));

        }
        System.out.println("The file is saved!");
        pw.flush();
        pw.close();

    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
