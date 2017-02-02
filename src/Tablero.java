
import java.awt.Color;
import java.awt.Component;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valen
 */
public class Tablero extends javax.swing.JFrame {
    char tab[][] = new char[8][8];
    JButton iconos[][] = new JButton[8][8];
    ImageIcon ficha;
    char fichaMat;
    DataInputStream entrada;
    DataOutputStream salida;
    Hilo receptor;
    boolean tuTurno;
    Tablero t;
    
    public Tablero(String s,char c,DataInputStream entrada, DataOutputStream salida) {
        initComponents();
        t = this;
        rellenarIconos();
        ficha = new ImageIcon(getClass().getResource("/circle_"+s+".png"));
        fichaMat = c;
        this.entrada = entrada;
        this.salida = salida;
        tuTurno = (fichaMat=='O'?true:false);
        if(tuTurno) {lblTurno.setText("ES TU TURNO!");lblTurno.setForeground(Color.blue);}
        else {lblTurno.setText("TURNO DE TU RIVAL");lblTurno.setForeground(Color.red);}
        receptor = new Hilo();
        receptor.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnColumna1 = new javax.swing.JButton();
        btnColumna2 = new javax.swing.JButton();
        btnColumna3 = new javax.swing.JButton();
        btnColumna4 = new javax.swing.JButton();
        btnColumna5 = new javax.swing.JButton();
        btnColumna6 = new javax.swing.JButton();
        btnColumna7 = new javax.swing.JButton();
        btnColumna8 = new javax.swing.JButton();
        lblTurno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnColumna1.setText("↓");
        btnColumna1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColumna1ActionPerformed(evt);
            }
        });

        btnColumna2.setText("↓");
        btnColumna2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColumna2ActionPerformed(evt);
            }
        });

        btnColumna3.setText("↓");
        btnColumna3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColumna3ActionPerformed(evt);
            }
        });

        btnColumna4.setText("↓");
        btnColumna4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColumna4ActionPerformed(evt);
            }
        });

        btnColumna5.setText("↓");
        btnColumna5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColumna5ActionPerformed(evt);
            }
        });

        btnColumna6.setText("↓");
        btnColumna6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColumna6ActionPerformed(evt);
            }
        });

        btnColumna7.setText("↓");
        btnColumna7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColumna7ActionPerformed(evt);
            }
        });

        btnColumna8.setText("↓");
        btnColumna8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColumna8ActionPerformed(evt);
            }
        });

        lblTurno.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTurno)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnColumna1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnColumna2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnColumna3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnColumna4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnColumna5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnColumna6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnColumna7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnColumna8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnColumna1)
                    .addComponent(btnColumna2)
                    .addComponent(btnColumna3)
                    .addComponent(btnColumna4)
                    .addComponent(btnColumna5)
                    .addComponent(btnColumna6)
                    .addComponent(btnColumna7)
                    .addComponent(btnColumna8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addComponent(lblTurno)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnColumna6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColumna6ActionPerformed
        if(tuTurno){
            insertarEn(6);
            tuTurno=false;
            lblTurno.setText("TURNO DE TU RIVAL");
            lblTurno.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnColumna6ActionPerformed

    private void btnColumna1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColumna1ActionPerformed
        if(tuTurno){
            insertarEn(1);
            tuTurno=false;
            lblTurno.setText("TURNO DE TU RIVAL");
            lblTurno.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnColumna1ActionPerformed

    private void btnColumna2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColumna2ActionPerformed
        if(tuTurno){
            insertarEn(2);
            tuTurno=false;
            lblTurno.setText("TURNO DE TU RIVAL");
            lblTurno.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnColumna2ActionPerformed

    private void btnColumna3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColumna3ActionPerformed
        if(tuTurno){
            insertarEn(3);
            tuTurno=false;
            lblTurno.setText("TURNO DE TU RIVAL");
            lblTurno.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnColumna3ActionPerformed

    private void btnColumna4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColumna4ActionPerformed
        if(tuTurno){
            insertarEn(4);
            tuTurno=false;
            lblTurno.setText("TURNO DE TU RIVAL");
            lblTurno.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnColumna4ActionPerformed

    private void btnColumna5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColumna5ActionPerformed
        if(tuTurno){
            insertarEn(5);
            tuTurno=false;
            lblTurno.setText("TURNO DE TU RIVAL");
            lblTurno.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnColumna5ActionPerformed

    private void btnColumna7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColumna7ActionPerformed
        if(tuTurno){
            insertarEn(7);
            tuTurno=false;
            lblTurno.setText("TURNO DE TU RIVAL");
            lblTurno.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnColumna7ActionPerformed

    private void btnColumna8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColumna8ActionPerformed
        if(tuTurno){
            insertarEn(8);
            tuTurno=false;
            lblTurno.setText("TURNO DE TU RIVAL");
            lblTurno.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnColumna8ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero("red",'X').setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColumna1;
    private javax.swing.JButton btnColumna2;
    private javax.swing.JButton btnColumna3;
    private javax.swing.JButton btnColumna4;
    private javax.swing.JButton btnColumna5;
    private javax.swing.JButton btnColumna6;
    private javax.swing.JButton btnColumna7;
    private javax.swing.JButton btnColumna8;
    private javax.swing.JLabel lblTurno;
    // End of variables declaration//GEN-END:variables
    private void insertarEn(int col){
        int fila = 7;
        boolean insertado = false;
        while(!insertado && fila>=0){
            if(tab[fila][col-1]=='.'){
                tab[fila][col-1] = fichaMat;
                iconos[fila][col-1].setIcon(ficha);
                insertado=true;
            }else{
                fila--;
            }
        }
        if(heGanado(fila,col-1)){
                JOptionPane.showMessageDialog(null,"HAS GANADO!");
                fila = col = -1;
            }
        try {
            salida.writeUTF(fila+"."+(col-1));
            salida.flush();
        } catch (IOException ex) {
            Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void rellenarIconos(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                tab[i][j] = '.';
                JButton b = new JButton();
                b.setLocation((i*47)+5, (j*40)+40);
                b.setSize(40, 40);
                b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circle_grey.png")));
                b.setBorder(null);
                b.setBorderPainted(false);
                b.setContentAreaFilled(false);
                b.setVisible(true);
                this.add(b);
                iconos[j][i] = b;
            }
        }
    }
    
    public void cerrar(){
        if(entrada!=null && salida!=null){
            try {
                entrada.close();
                salida.close();
                System.exit(0);
            } catch (IOException ex) {
            }       
        }
    }
    
    public boolean checkHorizontal(int f,int c){
        boolean flag = false;
        int counter = 0,i=c;
        while(i<8 && !flag){
            if(tab[f][i]==fichaMat){
                counter++;
            }else{flag=true;}
            if(counter>=4){
                return true;
            }
            i++;
        }
        i=c;flag=false;counter--;
        while(0<=i && !flag){
            if(tab[f][i]==fichaMat){
                counter++;
            }else{flag=true;}
            if(counter>=4){
                return true;
            }
            i--;
        }
        return false;
    }
    
    public boolean checkVertical(int f,int c){
       boolean flag = false;
        int counter = 0,i=f;
        while(i<8 && !flag){
            if(tab[i][c]==fichaMat){
                counter++;
            }else{flag=true;}
            if(counter>=4){
                return true;
            }
            i++;
        }
        i=f;flag=false;counter--;
        while(0<=i && !flag){
            if(tab[i][c]==fichaMat){
                counter++;
            }else{flag=true;}
            if(counter>=4){
                return true;
            }
            i--;
        }
        return false;
    }
    
    public boolean checkDiagonalForward(int f,int c){
        boolean flag = false;
        int counter = 0,i,j;
        for(i = f,j=c;0<=i && j<8 && !flag;i--,j++ ){
            if(tab[i][j]==fichaMat){
                counter++;
            }else{flag=true;}
            if(counter>=4){
                return true;
            }
        }flag=false;counter--;
        for(i = f,j=c;i<8 && 0<=j && !flag;i++,j-- ){
            if(tab[i][j]==fichaMat){
                counter++;
            }else{flag=true;}
            if(counter>=4){
                return true;
            }
        }
        return false;
    }
        
        public boolean checkDiagonalBack(int f, int c){
        boolean flag = false;
        int counter = 0,i,j;
        for(i = f,j=c;0<=i && 0<=j && !flag;i--,j-- ){
            if(tab[i][j]==fichaMat){
                counter++;
            }else{flag=true;}
            if(counter>=4){
                return true;
            }
        }flag=false;counter--;
        for(i = f,j=c;i<8 && j<8 && !flag;i++,j++ ){
            if(tab[i][j]==fichaMat){
                counter++;
            }else{flag=true;}
            if(counter>=4){
                return true;
            }
        }
        return false;
    }
    
    public boolean heGanado(int f,int c){
        boolean flag = false;
        if(checkVertical(f,c) || checkHorizontal(f,c) || checkDiagonalForward(f,c) || checkDiagonalBack(f,c)){
            flag = true;
        }
        return flag;
    }
        
    class Hilo extends Thread{
        public Hilo(){
            super();
        }
        public void run(){
            while(true){
                try {
                    String s = entrada.readUTF();
                    int fil = Integer.parseInt(String.valueOf(s.subSequence(0, s.indexOf('.'))));
                    int col = Integer.parseInt(String.valueOf(s.subSequence(s.indexOf('.')+1,s.length() )));
                    if(fil>=0 && col>=0){
                        tab[fil][col] = (fichaMat=='O' ? 'X':'O');
                        ImageIcon f = (fichaMat=='O' ? new ImageIcon(getClass().getResource("/circle_red.png")):new ImageIcon(getClass().getResource("/circle_blue.png")));
                        iconos[fil][col].setIcon(f);
                        tuTurno=true;
                        lblTurno.setText("ES TU TURNO!");
                        lblTurno.setForeground(Color.blue);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"HAS PERDIDO!");
                        cerrar();
                    }
                } catch (IOException ex) {
                    cerrar();
                }
            }
        }
    }

}
