// Package Declaration
package me.iffa.bananaspace.gui;

// BananaSpace Imports
import me.iffa.bananaspace.BananaSpace;
import me.iffa.bananaspace.config.SpaceConfig;

// Bukkit Imports
import org.bukkit.World;
import org.bukkit.util.config.Configuration;

// Java Imports
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

/**
 * Interface for Pail, a Bukkit GUI.
 * 
 * @author iffa
 */
public class PailInterface extends javax.swing.JPanel {
    // Variables
    private BananaSpace plugin;
    public static Configuration config = SpaceConfig.getConfig();

    /** Creates new form PailInterface */
    public PailInterface(BananaSpace plugin) {
        this.plugin = plugin;
        initComponents();
        readConfigs();
    }

    /**
     * Reads the configuration files and changes the interface values to represent the configuration values.
     */
    private void readConfigs() {
        CheckBoxHelmet.setSelected(config.getBoolean("global.givehelmet", false));
        CheckBoxSuit.setSelected(config.getBoolean("global.givesuit", false));
        ArmorTypeBox.setText(config.getString("global.armortype", "iron"));
        HelmetBlockIdBox.setText(config.getString("global.blockid", "86"));
        SpaceList.setModel(new DefaultListModel());
        for (World world : BananaSpace.worldHandler.getSpaceWorlds()) {
            ((DefaultListModel) SpaceList.getModel()).addElement(world.getName());
        }
    }
    
    /**
     * Loads the configuration settings for the world selected in the list.
     * 
     * @param worldname Spaceworld name
     */
    private void loadSpaceListConfig(String worldname) {
    }

    /**
     * Adds a world to the list in the GUI.
     * 
     * @param worldname World name
     */
    public void addSpaceList(String worldname) {
        ((DefaultListModel) SpaceList.getModel()).addElement(worldname);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        CheckBoxHelmet = new javax.swing.JCheckBox();
        CheckBoxSuit = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ArmorTypeBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HelmetBlockIdBox = new javax.swing.JTextField();
        SpoutEnabled = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        SpaceList = new javax.swing.JList();
        CreateWorldButton = new javax.swing.JButton();
        DeleteWorldButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(850, 450));
        setMinimumSize(new java.awt.Dimension(850, 450));
        setPreferredSize(new java.awt.Dimension(850, 450));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel1.setText("Global settings");
        jLabel1.setToolTipText("Global settings. These affect every spaceworld.");

        CheckBoxHelmet.setSelected(true);
        CheckBoxHelmet.setText("Give helmet");
        CheckBoxHelmet.setToolTipText("Selected if a spacehelmet should be given when going to a space world.");
        CheckBoxHelmet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxHelmetActionPerformed(evt);
            }
        });

        CheckBoxSuit.setSelected(true);
        CheckBoxSuit.setText("Give suit");
        CheckBoxSuit.setToolTipText("Selected if a spacehelmet should be given when going to a space world.");
        CheckBoxSuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxSuitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Spacehelmets");
        jLabel2.setToolTipText("Global spacehelmet settings.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Other");
        jLabel3.setToolTipText("Other global settings.");

        ArmorTypeBox.setText("iron");
        ArmorTypeBox.setToolTipText("The spacesuit armortype. Can be diamond, chainmail, gold, iron or leather.");
        ArmorTypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArmorTypeBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Suit armortype:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Helmet block id:");
        jLabel5.setToolTipText("The block id that will be the helmet.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Spacesuits");
        jLabel6.setToolTipText("Global spacesuit settings.");

        HelmetBlockIdBox.setText("86");
        HelmetBlockIdBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelmetBlockIdBoxActionPerformed(evt);
            }
        });

        SpoutEnabled.setText("Use Spout features");
        SpoutEnabled.setToolTipText("Checked if you want to enable Spout features.");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Options");
        jLabel8.setToolTipText("General options, saving the settings etc.");

        SaveButton.setText("Save settings");
        SaveButton.setToolTipText("Saves the changes and reloads the server for changes to take effect.");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel9.setText("Spaceworlds");
        jLabel9.setToolTipText("All spaceworlds and settings for each one.");

        jSeparator4.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        SpaceList.setFont(new java.awt.Font("Arial", 0, 18));
        SpaceList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        SpaceList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        SpaceList.setToolTipText("All spaceworlds. Selecting a spaceworld on the list opens its settings on the right.");
        SpaceList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                SpaceListValueChanged(evt);
            }
        });
        SpaceList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SpaceListFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SpaceListFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(SpaceList);

        CreateWorldButton.setFont(new java.awt.Font("Arial", 0, 11));
        CreateWorldButton.setText("Create");
        CreateWorldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateWorldButtonActionPerformed(evt);
            }
        });

        DeleteWorldButton.setFont(new java.awt.Font("Arial", 0, 11));
        DeleteWorldButton.setText("Delete");
        DeleteWorldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteWorldButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset settings");
        ResetButton.setToolTipText("Not happy with the changes? Just press this button and all your changes will be reset!");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel10.setText("Spaceworld settings");
        jLabel10.setToolTipText("Settings for the chosen spaceworld (on the list)");

        jLabel12.setText("Coming soon...");

        jButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton1.setText("Contact");
        jButton1.setToolTipText("If you have a problem, use this button to contact the author(s).");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(HelmetBlockIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CheckBoxHelmet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ArmorTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBoxSuit)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel1)
                    .addComponent(SpoutEnabled)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(348, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateWorldButton)
                    .addComponent(DeleteWorldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(555, 555, 555))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckBoxHelmet)
                            .addComponent(CheckBoxSuit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HelmetBlockIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArmorTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpoutEnabled))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SaveButton)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(ResetButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(CreateWorldButton)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteWorldButton))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CheckBoxHelmetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxHelmetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxHelmetActionPerformed

    private void CheckBoxSuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxSuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxSuitActionPerformed

    private void ArmorTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArmorTypeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArmorTypeBoxActionPerformed

    private void HelmetBlockIdBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelmetBlockIdBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HelmetBlockIdBoxActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO config saving code
        config.setProperty("global.givesuit", CheckBoxSuit.isSelected());
        config.setProperty("global.givehelmet", CheckBoxHelmet.isSelected());
        config.setProperty("global.armortype", ArmorTypeBox.getText());
        config.setProperty("global.blockid", Integer.parseInt(HelmetBlockIdBox.getText()));
        config.setProperty("global.usespout", SpoutEnabled.isSelected());
        config.save();
        JOptionPane.showMessageDialog(this, "Your settings have been saved!", "Settings saved!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Your changes have been reset!", "Changes reset!", JOptionPane.INFORMATION_MESSAGE);
        readConfigs();
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void SpaceListFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SpaceListFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_SpaceListFocusLost

    private void SpaceListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SpaceListFocusGained
        // TODO add your handling code here:
}//GEN-LAST:event_SpaceListFocusGained

    private void SpaceListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SpaceListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_SpaceListValueChanged

private void CreateWorldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateWorldButtonActionPerformed
    PailCreateWorld worldbox = new PailCreateWorld(plugin);
    worldbox.setTitle("New spaceworld");
    Dimension dims = Toolkit.getDefaultToolkit().getScreenSize();
    int ws = worldbox.getSize().width;
    int hs = worldbox.getSize().height;
    int xs = (dims.width - ws) / 2;
    int ys = (dims.height - hs) / 2;
    worldbox.setLocation(xs, ys);
    worldbox.setVisible(true);
    //JOptionPane.showMessageDialog(this, "Creating spaceworlds is disabled because the feature doesn't work correctly at the moment. Please check back later with a newer version!", "Feature unfinished", JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_CreateWorldButtonActionPerformed

private void DeleteWorldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteWorldButtonActionPerformed
// TODO add your handling code here:
    if (SpaceList.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "You need to choose a world to delete from the list!", "Select a world", JOptionPane.WARNING_MESSAGE);
        return;
    }
    int n = JOptionPane.showConfirmDialog(
            this,
            "Deleting a spaceworld will only remove the world from the spaceworlds-list and unload it. The world itself will be saved. Do you want to continue?",
            "Delete a spaceworld",
            JOptionPane.YES_NO_OPTION);
    if (n == JOptionPane.YES_OPTION) {
        String s = (String) SpaceList.getModel().getElementAt(SpaceList.getSelectedIndex());
        BananaSpace.worldHandler.removeSpaceWorld(plugin, s, false);
        ((DefaultListModel) SpaceList.getModel()).remove(SpaceList.getSelectedIndex());
        JOptionPane.showMessageDialog(this, "The spaceworld was deleted successfully!", "Spaceworld deleted", JOptionPane.INFORMATION_MESSAGE);
    }
}//GEN-LAST:event_DeleteWorldButtonActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    try {
        Desktop.getDesktop().browse(java.net.URI.create("http://twitter.com/iffamies"));
    } catch (java.io.IOException e) {
        System.out.println(e.getMessage());
    }
}//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ArmorTypeBox;
    private javax.swing.JCheckBox CheckBoxHelmet;
    private javax.swing.JCheckBox CheckBoxSuit;
    private javax.swing.JButton CreateWorldButton;
    private javax.swing.JButton DeleteWorldButton;
    private javax.swing.JTextField HelmetBlockIdBox;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JList SpaceList;
    private javax.swing.JCheckBox SpoutEnabled;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
