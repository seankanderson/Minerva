/*
 * ImportDialog.java
 *
 * Created on June 28, 2007, 2:05 PM
 */

package com.datavirtue.nevitiumpro.Legacy.datavirtue;
import de.schlichtherle.io.*;

/**
 *
 * @author  Data Virtue
 */
public class ImportDialog extends javax.swing.JDialog implements Runnable, ProgressDialogInterface {
  
    private File f; 
    private DbEngine db;
    private String dbname;
    private boolean prompt;
    private boolean skipHeader;
    private int [] toFields;
    private boolean overwrite = true;
    private boolean defbool = false;

    /** Creates new form ImportDialog */
    public ImportDialog(java.awt.Frame parent, boolean modal, File f, DbEngine db, String dbname,
            int [] toFields, boolean prompt, boolean overwrite, boolean defBool) {
        super(parent, true);
        initComponents();

        this.db = db;
        this.dbname = dbname;
                this.prompt = prompt;
                this.f = f;
                //this.skipHeader = skipHeader;
                this.toFields = toFields;
                this.overwrite = overwrite;
                this.defbool = defBool;
                if (overwrite) {

                    overRadio.setSelected(true);

                }else overRadio.setSelected(true);


        jProgressBar1.setMinimum(0);


        fileLabel.setText("Import? --> "+f.getName());

        new Thread(this).start();

        if (!prompt){

            this.setVisible(true);
           this.killbuttons();

            doImport();
            this.dispose();

        }else {

            java.awt.Dimension dim = DV.computeCenter((java.awt.Window) this);

            this.setLocation(dim.width, dim.height);
            this.setVisible(true);

        }

    }

    
    public ImportDialog(java.awt.Frame parent, boolean modal, File f, DbEngine db, String dbname,
            int [] toFields, boolean prompt, boolean overwrite) {
        super(parent, true);
        initComponents();
        
        this.db = db;
        this.dbname = dbname;
                this.prompt = prompt;
                this.f = f;
                //this.skipHeader = skipHeader;
                this.toFields = toFields;
                this.overwrite = overwrite;
                this.defbool = false;
                
                if (overwrite) {
                    
                    overRadio.setSelected(true);
                                        
                }else overRadio.setSelected(true);
                
                
        jProgressBar1.setMinimum(0);
         
         
        fileLabel.setText("Import? --> "+f.getName());        
        
        new Thread(this).start();
     
        if (!prompt){
        
            this.setVisible(true);
           this.killbuttons();
           
            doImport(); 
            this.dispose();
            
        }else {
            
            java.awt.Dimension dim = DV.computeCenter((java.awt.Window) this);
        
            this.setLocation(dim.width, dim.height);
            this.setVisible(true);
                        
        }       
        
    }
    
    /* This class implements Runnable, the work gets don in here 
       but you need to suspend it until notification ('GO'button press)
     */
    public void run () {
        
        try{synchronized(this){wait();}}
            catch (InterruptedException e){}
        
        int a = db.csvImport(dbname, f, true, toFields, this, overRadio.isSelected(), defbool);
                
    }
    
    private void doImport () {
        
        synchronized(this){notifyAll();}
               
    }
    
   
    /* Use this method to grey out the action buttons */
    private void killbuttons() {
        
        goButton.setEnabled(false);
        killButton.setEnabled(false);
        
    }
    
   
    /* Reach in methods to update the JProgressBar  */
    public void setBarMax(int value){
        
        jProgressBar1.setMaximum(value);
        
    }
    
    public void updateBar (int value){
        
        jProgressBar1.setValue(value);
        
    }
    public void close() {
        
        this.dispose();
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        fileLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        overRadio = new javax.swing.JRadioButton();
        appendRadio = new javax.swing.JRadioButton();
        goButton = new javax.swing.JButton();
        killButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nevitium Import");
        setAlwaysOnTop(true);
        setResizable(false);
        fileLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        fileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileLabel.setText("c:\\file.txt");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Press GO and wait for the import. Press Cancel to skip.");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        buttonGroup1.add(overRadio);
        overRadio.setSelected(true);
        overRadio.setText("Overwrite");
        overRadio.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        overRadio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        overRadio.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup1.add(appendRadio);
        appendRadio.setText("Append");
        appendRadio.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        appendRadio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appendRadio.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(overRadio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(appendRadio, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                    .add(jProgressBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jProgressBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(appendRadio)
                    .add(overRadio))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        goButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/go.gif")));
        goButton.setFocusable(false);
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        killButton.setText("Cancel");
        killButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                killButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jSeparator2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, fileLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 380, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(killButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 250, Short.MAX_VALUE)
                        .add(goButton))
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(fileLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(goButton)
                    .add(killButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void killButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_killButtonActionPerformed
        
        this.dispose();
        
        
    }//GEN-LAST:event_killButtonActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed


        this.killbuttons();
        doImport();
          //this.dispose();      
        
    }//GEN-LAST:event_goButtonActionPerformed
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton appendRadio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton killButton;
    private javax.swing.JRadioButton overRadio;
    // End of variables declaration//GEN-END:variables
    
}
