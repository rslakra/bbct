/*
 * This file is part of BBCT.
 *
 * Copyright 2012 codeguru <codeguru@users.sourceforge.net>
 *
 * BBCT is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BBCT is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package bbct.gui;

import java.awt.CardLayout;
import java.awt.Container;

/**
 * TODO: JavaDoc
 *
 * @author codeguru <codeguru@users.sourceforge.net>
 */
public class MenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPanel
     */
    public MenuPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JButton addCardsButton = new javax.swing.JButton();
        javax.swing.JButton findCardsButton = new javax.swing.JButton();
        javax.swing.JButton aboutButton = new javax.swing.JButton();
        javax.swing.JButton exitButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(75, 110, 75, 110));
        setMinimumSize(new java.awt.Dimension(370, 370));
        setName("mainPanel");
        setPreferredSize(new java.awt.Dimension(370, 370));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        setLayout(new java.awt.GridLayout(4, 1, 0, 30));

        addCardsButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addCardsButton.setText("Add Cards");
        addCardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCardsButtonActionPerformed(evt);
            }
        });
        add(addCardsButton);

        findCardsButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        findCardsButton.setText("Find Cards");
        findCardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCardsButtonActionPerformed(evt);
            }
        });
        add(findCardsButton);

        aboutButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        add(aboutButton);

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        add(exitButton);
    }// </editor-fold>//GEN-END:initComponents

    private void addCardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCardsButtonActionPerformed
        Container parent = this.getParent();
        CardLayout cl = (CardLayout) parent.getLayout();

        cl.show(parent, BBCTFrame.ADD_CARDS_CARD_NAME);
    }//GEN-LAST:event_addCardsButtonActionPerformed

    private void findCardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCardsButtonActionPerformed
        Container parent = this.getParent();
        CardLayout cl = (CardLayout) parent.getLayout();

        cl.show(parent, BBCTFrame.FIND_CARDS_MENU_CARD_NAME);
    }//GEN-LAST:event_findCardsButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        Container parent = this.getParent();
        CardLayout cl = (CardLayout) parent.getLayout();

        cl.show(parent, BBCTFrame.ABOUT_CARD_NAME);
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        BBCTFrame frame = (BBCTFrame) this.getParent().getParent().getParent().getParent().getParent();

        frame.setTitle(GUIResources.MAIN_PANEL_TITLE);
        frame.setInstructions("Chose an option:");
    }//GEN-LAST:event_formAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
