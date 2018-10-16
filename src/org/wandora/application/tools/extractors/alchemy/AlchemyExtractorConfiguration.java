/*
 * WANDORA
 * Knowledge Extraction, Management, and Publishing Application
 * http://wandora.org
 *
 * Copyright (C) 2004-2016 Wandora Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * AlchemyExtractorConfiguration.java
 *
 * Created on 29.10.2009, 22:00
 */

package org.wandora.application.tools.extractors.alchemy;




import javax.swing.*;
import org.wandora.utils.*;
import org.wandora.application.gui.*;





/**
 * A dialog used to configure AlchemyAPI extractors.
 *
 * @author  akivela
 */
public class AlchemyExtractorConfiguration extends javax.swing.JDialog {


	private static final long serialVersionUID = 1L;
	
	private JFrame parent = null;
    private Options options = null;
    private AbstractAlchemyExtractor parentTool = null;
    
    
    /** Creates new form AlchemyExtractorConfiguration */
    public AlchemyExtractorConfiguration(JFrame parent, Options options, AbstractAlchemyExtractor parentTool) {
        super(parent, true);
        this.parent = parent;
        this.options = options;
        this.parentTool = parentTool;
        initComponents();
        this.setSize(320, 150);
        UIBox.centerWindow(this, parent);
    }

    
    
    public void forgetExtractorAuthorization() {
        if(parentTool != null) {
            parentTool.forgetAuthorization();
        }
    }
    
    
    
    
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        contentPanel = new javax.swing.JPanel();
        clearAuthButton = new org.wandora.application.gui.simple.SimpleButton();
        footerPanel = new javax.swing.JPanel();
        fillerPanel = new javax.swing.JPanel();
        closeButton = new org.wandora.application.gui.simple.SimpleButton();

        setTitle("Alchemy Extraction Configuration");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        contentPanel.setLayout(new java.awt.GridBagLayout());

        clearAuthButton.setText("Forget Alchemy APIKEY");
        clearAuthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAuthButtonActionPerformed(evt);
            }
        });
        contentPanel.add(clearAuthButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(contentPanel, gridBagConstraints);

        footerPanel.setLayout(new java.awt.GridBagLayout());

        fillerPanel.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout fillerPanelLayout = new javax.swing.GroupLayout(fillerPanel);
        fillerPanel.setLayout(fillerPanelLayout);
        fillerPanelLayout.setHorizontalGroup(
            fillerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        fillerPanelLayout.setVerticalGroup(
            fillerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        footerPanel.add(fillerPanel, gridBagConstraints);

        closeButton.setText("Close");
        closeButton.setPreferredSize(new java.awt.Dimension(70, 23));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        footerPanel.add(closeButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(footerPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void clearAuthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAuthButtonActionPerformed
    forgetExtractorAuthorization();
}//GEN-LAST:event_clearAuthButtonActionPerformed

private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
    this.setVisible(false);
}//GEN-LAST:event_closeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearAuthButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel fillerPanel;
    private javax.swing.JPanel footerPanel;
    // End of variables declaration//GEN-END:variables

}
