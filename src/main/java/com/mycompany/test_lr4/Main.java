package com.mycompany.test_lr4;

import convert.ConLenght;
import convert.ConWeight;
import javax.swing.JOptionPane;

/**
 *
 * Приложение - конвертер различных величин: американская, старорусская системы,СИ
 * @author neyrobiolog
 */
public class Main extends javax.swing.JFrame {

    //Enum категорий конвертирования: масса | длина
    public enum Categoria { 
        WEIGHT(0), 
        LENGHT(1); 
    
        private int id;
        
        Categoria(int id) {
            this.id = id;
        }
        
        public int getId() {
            return id;
        }
    }
    
    //Объявление enum категорий конвертирования
    Categoria[] categoria = Categoria.values();
    Categoria curCategoria = Categoria.WEIGHT;
    
    //Массив единиц измерения веса
    public static String[] weight = {
        "грамм", "килограмм", "тонна", "квитал", "квартер", "стоун", "лот", "золотник", "доля"
    };
    
    //Массив единиц измерения длины
    public static String[] length = {
        "сантиметр", "метр", "километр", "миля", "фут", "ярд", "верста", "сажень", "аршин"
    };
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        initSystems(); //Первоначальная инициализация
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConvert = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbConverter = new javax.swing.JComboBox();
        cbSystem1 = new javax.swing.JComboBox();
        cbSystem2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfValue = new javax.swing.JTextField();
        tfResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConvert.setText("Конвертировать");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Конвертер  СИ, Старорусской и ");

        jLabel5.setText("Выбор категории");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Американской систем длин и масс");

        cbConverter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Масса", "Длина" }));
        cbConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConverterActionPerformed(evt);
            }
        });

        jLabel3.setText("Куда конвертируем");

        jLabel2.setText("Что конвертируем");

        tfResult.setText("Конверированное значение");
        tfResult.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnConvert)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel4)))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(196, 196, 196))))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfValue)
                    .addComponent(cbSystem1, 0, 164, Short.MAX_VALUE))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfResult, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(cbSystem2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(cbConverter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSystem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSystem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Выбор категории расчета - масса или длины 
     * @param evt событие DropDownButton
     */
    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        //Сосчитали значение для конвертирования
        String val = tfValue.getText();

        //Если ничего нет в поле для конвертирования
        if(val.equals(""))
        JOptionPane.showMessageDialog(this, "Укажите значение");

        else
        {
            try
            {
                double buf = Double.parseDouble(val);

                switch(curCategoria)
                {
                    case WEIGHT:
                    {
                        double result = ConWeight.converting(cbSystem1.getSelectedIndex(), buf, cbSystem2.getSelectedIndex());
                        tfResult.setText(String.valueOf(result));
                    } break;

                    case LENGHT:
                    {
                        double result = ConLenght.converting(cbSystem1.getSelectedIndex(), buf, cbSystem2.getSelectedIndex());
                        tfResult.setText(String.valueOf(result));
                    } break;
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this, "Укажите корректное значение");
            }
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    /**
     * Собственно конвертация
     * @param evt событие Button
     */
    private void cbConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConverterActionPerformed
        //Сосчитали значение категории
        int item = cbConverter.getSelectedIndex();
        curCategoria = categoria[item];

        //Инициализация ComboBox единицами измерения
        initSystems();

        tfValue.setText("");
        tfResult.setText("Конвертированное значение");
    }//GEN-LAST:event_cbConverterActionPerformed

    /**
     * Инициализия ComboBox с единицами измерения
     */
    public void initSystems() {
        //Очистили значения
        cbSystem1.removeAllItems();
        cbSystem2.removeAllItems();
        
        //Заполняем ComboBox единицами измерения из массива
        switch(curCategoria)
        {
            case WEIGHT:
                for(int i = 0; i < weight.length; i++) 
                {
                    cbSystem1.addItem(weight[i]);
                    cbSystem2.addItem(weight[i]);
                }
                break;
            
            case LENGHT:
                for(int i = 0; i < length.length; i++) 
                {
                    cbSystem1.addItem(length[i]);
                    cbSystem2.addItem(length[i]);
                }
                break;
        }
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JComboBox cbConverter;
    private javax.swing.JComboBox cbSystem1;
    private javax.swing.JComboBox cbSystem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfResult;
    private javax.swing.JTextField tfValue;
    // End of variables declaration//GEN-END:variables
}
