

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John Herrold
 */
public class Group2_Calc extends javax.swing.JFrame {

    String display, remover, bin, oct, hex, currentBase;
    
    double current, equals, value2, value1, ctr, one;
    int ope, flag, integer, x;
    long fin;
    /**
     * Creates new form Group2_Calc
     */
    public Group2_Calc() {
        initComponents();
        rbtnDec.setSelected(rootPaneCheckingEnabled);
        currentBase = rbtnDec.getText();
    }
    
    public void setDec(){
        if(currentBase.equals("Hexadecimal")){
            String hexa = txtDis.getText();
            int decimal=Integer.parseInt(hexa,16); 
            value2 = decimal;
        }else if(currentBase.equals("Octal")){
            oct = txtDis.getText();
            int decimal = Integer.parseInt(oct,8); 
            value2 = decimal;
        }else if(currentBase.equals("Binary")){
            bin = txtDis.getText();
            int decimal=Integer.parseInt(bin,2); 
            value2 = decimal;
        }else if(currentBase.equals("Decimal")){
            value2 = Integer.parseInt(txtDis.getText());
        }
    }
    
    public void displayDec(){
        x = (int) (value2);
        txtDis.setText(String.valueOf(x));
    }
    
    public void octClick(){
        if(txtDis.getText().equals("")){
            baseOct();
            
        }else{
            
            if(currentBase.equals("Decimal")){
                integer = Integer.parseInt(txtDis.getText());
                oct = Integer.toOctalString(integer);
                txtDis.setText(oct);
                baseOct();
                
            }else if(currentBase.equals("Hexadecimal")){
                String hexa = (txtDis.getText());
                int val = Integer.parseInt(hexa, 16);
                oct = Integer.toOctalString(val);
                txtDis.setText(oct);
                baseOct();
                
            }else if(currentBase.equals("Binary")){
                integer = Integer.parseInt(txtDis.getText());
                String integerString = String.valueOf(integer);
                int val = Integer.parseInt(integerString, 2);
                oct = Integer.toOctalString(val);
                txtDis.setText(oct);
                baseOct();
               
            }
            
        }
    }
    
    public void binClick(){
        if(txtDis.getText().equals("")){
            baseBin();
            
        }else{
            
            if(currentBase.equals("Decimal")){
                integer = Integer.parseInt(txtDis.getText());
                bin = Integer.toBinaryString(integer);
                txtDis.setText(bin);
                baseBin();
                
            }else if(currentBase.equals("Hexadecimal")){
                String hexa = (txtDis.getText());
                int val = Integer.parseInt(hexa, 16);
                bin = Integer.toBinaryString(val);
                txtDis.setText(bin);
                baseBin();
                
            }else if(currentBase.equals("Octal")){
                integer = Integer.parseInt(txtDis.getText());
                String integerString = String.valueOf(integer);
                int val = Integer.parseInt(integerString, 8);
                bin = Integer.toBinaryString(val);
                txtDis.setText(bin);
                baseBin();
                
            }
            
            
            
        }
    }
    
    public void hexClick(){
        if(txtDis.getText().equals("")){
            baseHex();
            
        }else{
            
            if(currentBase.equals("Decimal")){
                integer = Integer.parseInt(txtDis.getText());
                hex = Integer.toHexString(integer);
                txtDis.setText(hex);
            
                baseHex();
                
            }else if(currentBase.equals("Octal")){
                integer = Integer.parseInt(txtDis.getText());
                String integerString = String.valueOf(integer);
                int val = Integer.parseInt(integerString, 8);
                hex = Integer.toHexString(val);
                txtDis.setText(hex);

                baseHex();
                
            }else if(currentBase.equals("Binary")){
                integer = Integer.parseInt(txtDis.getText());
                String integerString = String.valueOf(integer);
                int val = Integer.parseInt(integerString, 2);
                hex = Integer.toHexString(val);
                txtDis.setText(hex);
                baseHex();
                
            }
            
            
            
        }
    }
    
    
    public void baseDec(){
        try{
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn6.setEnabled(true);
            btn5.setEnabled(true);
            btn4.setEnabled(true);
            btn3.setEnabled(true);
            btn2.setEnabled(true);

            btnHexA.setEnabled(false);
            btnHexB.setEnabled(false);
            btnHexC.setEnabled(false);
            btnHexD.setEnabled(false);
            btnHexE.setEnabled(false);
            btnHexF.setEnabled(false);
            
            currentBase = rbtnDec.getText();
        }catch(Exception e){
            
        }
    }
    
    public void baseOct(){
        try{
            btn8.setEnabled(false);
            btn9.setEnabled(false);

            btnHexA.setEnabled(false);
            btnHexB.setEnabled(false);
            btnHexC.setEnabled(false);
            btnHexD.setEnabled(false);
            btnHexE.setEnabled(false);
            btnHexF.setEnabled(false);
            
            currentBase = rbtnOct.getText();
        }catch(Exception e){
            
        }
        
    }

    public void baseHex(){
        try{
            btnHexA.setEnabled(true);
            btnHexB.setEnabled(true);
            btnHexC.setEnabled(true);
            btnHexD.setEnabled(true);
            btnHexE.setEnabled(true);
            btnHexF.setEnabled(true);
            
            currentBase = rbtnHex.getText();
        }catch(Exception e){
            
        }
    }
    
    public void baseBin(){
        try{
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            btn6.setEnabled(false);
            btn5.setEnabled(false);
            btn4.setEnabled(false);
            btn3.setEnabled(false);
            btn2.setEnabled(false);

            btnHexA.setEnabled(false);
            btnHexB.setEnabled(false);
            btnHexC.setEnabled(false);
            btnHexD.setEnabled(false);
            btnHexE.setEnabled(false);
            btnHexF.setEnabled(false);
            
            currentBase = rbtnBin.getText();
        }catch(Exception e){
            
        }
    }
    
    public void displayEquals(){
        
        
        setDec();
        
        
            switch(ope){
                case 0: //division
                    equals = current / value2;
                    break; 

                case 1: //multiplication
                    equals = current * value2;
                    break;

                case 2: //subraction
                    equals = current - value2;
                    break;

                case 3: //addition
                    equals = current + value2;
                    break;

                case 4: //remainder
                    equals = current % value2;
                    break;

                case 5: //exponent y
                    equals = Math.pow(current, value2);
                    break;

                case 6: //Exponential
                    current = Math.pow(10, value2);
                    equals = value1 * current;
                    break;

                case 7: //tan
                    value1 = Double.parseDouble(txtDis.getText());
                    equals = Math.tan(value1);
                    break;

                case 8:
                    value1 = Double.parseDouble(txtDis.getText());
                    equals = Math.cos(value1);
                    break;

                case 9:
                    value1 = Double.parseDouble(txtDis.getText());
                    equals = Math.sin(value1);
                    break;
            }
        
            if(currentBase.equals("Decimal")){
                fin = (int) equals;
            }else if(currentBase.equals("Binary")){
                bin = Integer.toBinaryString((int) equals);
                fin = Integer.parseInt(bin);
            }else if(currentBase.equals("Octal")){
                oct = Integer.toOctalString((int) equals);
                fin = Integer.parseInt(oct);
            }else if(currentBase.equals("Hexadecimal")){
                hex = Integer.toHexString((int) equals);
            }
            
            if(currentBase.equals("Hexadecimal")){
                txtDis.setText(hex);
            }else{
                txtDis.setText(String.valueOf(fin));
            }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        g1 = new javax.swing.ButtonGroup();
        txtDis = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbtnDec = new javax.swing.JRadioButton();
        rbtnHex = new javax.swing.JRadioButton();
        rbtnOct = new javax.swing.JRadioButton();
        rbtnBin = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btnNegEx = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClearEnt = new javax.swing.JButton();
        btnModulo = new javax.swing.JButton();
        btnSqua = new javax.swing.JButton();
        btnFacto = new javax.swing.JButton();
        btnAbsolute = new javax.swing.JButton();
        btnExponential = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnCube = new javax.swing.JButton();
        btnExpon = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnSqRt = new javax.swing.JButton();
        btnCbRt = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPer = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnDiv = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEqu = new javax.swing.JButton();
        btnHexA = new javax.swing.JButton();
        btnHexB = new javax.swing.JButton();
        btnHexC = new javax.swing.JButton();
        btnHexD = new javax.swing.JButton();
        btnHexE = new javax.swing.JButton();
        btnHexF = new javax.swing.JButton();
        txtTan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDis.setEditable(false);
        txtDis.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Base"));
        jPanel1.setToolTipText("");

        g1.add(rbtnDec);
        rbtnDec.setText("Decimal");
        rbtnDec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnDecMouseClicked(evt);
            }
        });

        g1.add(rbtnHex);
        rbtnHex.setText("Hexadecimal");
        rbtnHex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnHexMouseClicked(evt);
            }
        });

        g1.add(rbtnOct);
        rbtnOct.setText("Octal");
        rbtnOct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnOctMouseClicked(evt);
            }
        });

        g1.add(rbtnBin);
        rbtnBin.setText("Binary");
        rbtnBin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnBinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbtnDec)
                .addGap(91, 91, 91)
                .addComponent(rbtnHex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtnOct)
                .addGap(126, 126, 126)
                .addComponent(rbtnBin)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnDec)
                    .addComponent(rbtnHex)
                    .addComponent(rbtnBin)
                    .addComponent(rbtnOct))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNegEx.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnNegEx.setText("1/x");
        btnNegEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegExActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClearEnt.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnClearEnt.setText("CE");
        btnClearEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearEntActionPerformed(evt);
            }
        });

        btnModulo.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnModulo.setText("Mod");
        btnModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloActionPerformed(evt);
            }
        });

        btnSqua.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnSqua.setText("x^2");
        btnSqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquaActionPerformed(evt);
            }
        });

        btnFacto.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnFacto.setText("n!");
        btnFacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactoActionPerformed(evt);
            }
        });

        btnAbsolute.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnAbsolute.setText("ABS");
        btnAbsolute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsoluteActionPerformed(evt);
            }
        });

        btnExponential.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnExponential.setText("EXP");
        btnExponential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExponentialActionPerformed(evt);
            }
        });

        btnTan.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btnCube.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnCube.setText("x^3");
        btnCube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCubeActionPerformed(evt);
            }
        });

        btnExpon.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnExpon.setText("x^y");
        btnExpon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExponActionPerformed(evt);
            }
        });

        btnCos.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnSqRt.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnSqRt.setText("√");

        btnCbRt.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnCbRt.setText("√3");

        btnSin.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAbsolute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCube)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSqRt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNegEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSqua))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClearEnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExponential, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExpon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCbRt)
                            .addComponent(btnSin))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNegEx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSqua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFacto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbsolute, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCube, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSqRt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExponential, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExpon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCbRt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPer.setText(".");
        btnPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnMul.setText("*");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEqu.setText("=");
        btnEqu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquActionPerformed(evt);
            }
        });

        btnHexA.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        btnHexA.setText("A");
        btnHexA.setEnabled(false);
        btnHexA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexAActionPerformed(evt);
            }
        });

        btnHexB.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        btnHexB.setText("B");
        btnHexB.setEnabled(false);
        btnHexB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexBActionPerformed(evt);
            }
        });

        btnHexC.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        btnHexC.setText("C");
        btnHexC.setEnabled(false);
        btnHexC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexCActionPerformed(evt);
            }
        });

        btnHexD.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        btnHexD.setText("D");
        btnHexD.setEnabled(false);
        btnHexD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexDActionPerformed(evt);
            }
        });

        btnHexE.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        btnHexE.setText("E");
        btnHexE.setEnabled(false);
        btnHexE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexEActionPerformed(evt);
            }
        });

        btnHexF.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        btnHexF.setText("F");
        btnHexF.setEnabled(false);
        btnHexF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEqu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHexA)
                    .addComponent(btnHexB)
                    .addComponent(btnHexC)
                    .addComponent(btnHexD)
                    .addComponent(btnHexE)
                    .addComponent(btnHexF))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(btnHexA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnHexB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnHexC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnHexD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnHexE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnHexF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnEqu, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTan.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDis, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDis, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtDis.setText(txtDis.getText() + btn9.getText());
        flag = 1;
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       txtDis.setText(txtDis.getText() + btn8.getText());
       flag = 1;
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtDis.setText(txtDis.getText() + btn7.getText());
        flag = 1;
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtDis.setText(txtDis.getText() + btn4.getText());
        flag = 1;
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtDis.setText(txtDis.getText() + btn5.getText());
        flag = 1;
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtDis.setText(txtDis.getText() + btn6.getText());
        flag = 1;
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtDis.setText(txtDis.getText() + btn1.getText());
        flag = 1;
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       txtDis.setText(txtDis.getText() + btn2.getText());
       flag = 1;
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtDis.setText(txtDis.getText() + btn3.getText());
        flag = 1;
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtDis.setText(txtDis.getText() + btn0.getText());
        flag = 1;
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerActionPerformed
        txtDis.setText(txtDis.getText() + btnPer.getText());
        flag = 1;
    }//GEN-LAST:event_btnPerActionPerformed

    private void btnEquActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquActionPerformed
        value2 = Double.parseDouble(txtDis.getText());
        displayEquals();
        txtTan.setText("");
    }//GEN-LAST:event_btnEquActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
       
        if(currentBase.equals("Hexadecimal")){
            String hexa = txtDis.getText();
            int decimal=Integer.parseInt(hexa,16); 
            value1 = decimal;
            current = value1;
            ope = 0;
            txtDis.setText("");
        }else{
            value1 = Double.parseDouble(txtDis.getText());
            current = value1;
            ope = 0;
            txtDis.setText("");
        }
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        value1 = 0;
        value2 = 0;
        equals = 0;
        ctr = 0;
        txtDis.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        
        if(currentBase.equals("Hexadecimal")){
            String hexa = txtDis.getText();
            int decimal=Integer.parseInt(hexa,16); 
            value1 = decimal;
            current = value1;
            ope = 1;
            txtDis.setText("");
        }else{
            value1 = Double.parseDouble(txtDis.getText());
            current = value1;
            ope = 1;
            txtDis.setText("");
        }
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        if(flag == 0){
            txtDis.setText(txtDis.getText() + btnSub.getText());
            flag = 1;
        }else if(flag == 1){
            if(currentBase.equals("Hexadecimal")){
            String hexa = txtDis.getText();
            int decimal=Integer.parseInt(hexa,16); 
            value1 = decimal;
            ope = 2;
            txtDis.setText("");
            flag = 0;
        }else{
            value1 = Double.parseDouble(txtDis.getText());
            current = value1;
            ope = 2;
            txtDis.setText("");
            flag = 0;
        }
        }
        
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
        if(currentBase.equals("Hexadecimal")){
            String hexa = txtDis.getText();
            int decimal=Integer.parseInt(hexa,16); 
            value1 = decimal;
            current = value1;
            ope = 3;
            txtDis.setText("");
        }else{
            value1 = Double.parseDouble(txtDis.getText());
            current = value1;
            ope = 3;
            txtDis.setText("");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearEntActionPerformed
        txtDis.setText("");
    }//GEN-LAST:event_btnClearEntActionPerformed

    private void btnModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloActionPerformed
        value1 = Double.parseDouble(txtDis.getText());
        current = value1;
        ope = 4;
        txtDis.setText("");
    }//GEN-LAST:event_btnModuloActionPerformed

    private void btnNegExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegExActionPerformed
        setDec();
        
        equals = Math.pow(value2, -1);
        
        if(currentBase.equals("Decimal")){
            txtDis.setText(String.valueOf(equals));
        }else if(currentBase.equals("Hexadecimal")){
            hex = Integer.toHexString((int) equals);
            txtDis.setText(hex);
        }else if(currentBase.equals("Binary")){
            bin = Integer.toBinaryString((int) equals);
            txtDis.setText(bin);
        }else if(currentBase.equals("Octal")){
            oct = Integer.toOctalString((int) equals);
            txtDis.setText(oct);
        }
    }//GEN-LAST:event_btnNegExActionPerformed

    private void btnSquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquaActionPerformed
        setDec();

        equals = Math.pow(value2, 2);
        
        if(currentBase.equals("Decimal")){
            txtDis.setText(String.valueOf(equals));
        }else if(currentBase.equals("Hexadecimal")){
            hex = Integer.toHexString((int) equals);
            txtDis.setText(hex);
        }else if(currentBase.equals("Binary")){
            bin = Integer.toBinaryString((int) equals);
            txtDis.setText(bin);
        }else if(currentBase.equals("Octal")){
            oct = Integer.toOctalString((int) equals);
            txtDis.setText(oct);
        }
        
    }//GEN-LAST:event_btnSquaActionPerformed

    private void btnCubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCubeActionPerformed
        setDec();
        
        
        equals = Math.pow(value2, 3);
        
        if(currentBase.equals("Decimal")){
            txtDis.setText(String.valueOf(equals));
        }else if(currentBase.equals("Hexadecimal")){
            hex = Integer.toHexString((int) equals);
            txtDis.setText(hex);
        }else if(currentBase.equals("Binary")){
            bin = Integer.toBinaryString((int) equals);
            txtDis.setText(bin);
        }else if(currentBase.equals("Octal")){
            oct = Integer.toOctalString((int) equals);
            txtDis.setText(oct);
        }
    }//GEN-LAST:event_btnCubeActionPerformed

    private void btnExponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExponActionPerformed
        value1 = Double.parseDouble(txtDis.getText());
        current = value1;
        ope = 5;
        txtDis.setText("");
    }//GEN-LAST:event_btnExponActionPerformed

    private void btnFactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactoActionPerformed
        
        setDec();
        
        
        
        
        
        ctr = value2 - 1;
            equals = value2;
            while(ctr != 0){
                equals = equals * ctr;
                ctr--;
            }
            
        if(currentBase.equals("Decimal")){
            txtDis.setText(String.valueOf(equals));
        }else if(currentBase.equals("Hexadecimal")){
            hex = Integer.toHexString((int) equals);
            txtDis.setText(hex);
        }else if(currentBase.equals("Binary")){
            bin = Integer.toBinaryString((int) equals);
            txtDis.setText(bin);
        }else if(currentBase.equals("Octal")){
            oct = Integer.toOctalString((int) equals);
            txtDis.setText(oct);
        }
        
    }//GEN-LAST:event_btnFactoActionPerformed

    private void btnAbsoluteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsoluteActionPerformed
        value1 = Double.parseDouble(txtDis.getText());
        current = value1;
        equals = Math.abs(current);
        txtDis.setText(String.valueOf(equals));
    }//GEN-LAST:event_btnAbsoluteActionPerformed

    private void btnExponentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExponentialActionPerformed
        value1 = Double.parseDouble(txtDis.getText());
        ope = 6;
        txtDis.setText("");
    }//GEN-LAST:event_btnExponentialActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        ope = 7;
        txtTan.setText("tan(");
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        ope = 8;
        txtTan.setText("cos(");
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        ope = 9;
        txtTan.setText("sin(");
    }//GEN-LAST:event_btnSinActionPerformed

    private void rbtnDecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnDecMouseClicked
        if(txtDis.getText().equals("")){
            baseDec();
            
        }else{
            setDec();
            displayDec();
            baseDec();
            
        }
        
    }//GEN-LAST:event_rbtnDecMouseClicked

    private void rbtnBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnBinMouseClicked
        
       
        binClick();
        
    }//GEN-LAST:event_rbtnBinMouseClicked

    private void rbtnHexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnHexMouseClicked
        
        
        hexClick();
        
    }//GEN-LAST:event_rbtnHexMouseClicked

    private void rbtnOctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnOctMouseClicked
        
        
        octClick();
       
        
    }//GEN-LAST:event_rbtnOctMouseClicked

    private void btnHexAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexAActionPerformed
        txtDis.setText(txtDis.getText() + "A");
        flag = 1;
    }//GEN-LAST:event_btnHexAActionPerformed

    private void btnHexBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexBActionPerformed
        txtDis.setText(txtDis.getText() + "B");
        flag = 1;
    }//GEN-LAST:event_btnHexBActionPerformed

    private void btnHexCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexCActionPerformed
        txtDis.setText(txtDis.getText() + "C");
        flag = 1;
    }//GEN-LAST:event_btnHexCActionPerformed

    private void btnHexDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexDActionPerformed
        txtDis.setText(txtDis.getText() + "D");
        flag = 1;
    }//GEN-LAST:event_btnHexDActionPerformed

    private void btnHexEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexEActionPerformed
        txtDis.setText(txtDis.getText() + "E");
        flag = 1;
    }//GEN-LAST:event_btnHexEActionPerformed

    private void btnHexFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexFActionPerformed
        txtDis.setText(txtDis.getText() + "F");
        flag = 1;
    }//GEN-LAST:event_btnHexFActionPerformed

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
            java.util.logging.Logger.getLogger(Group2_Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Group2_Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Group2_Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Group2_Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Group2_Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAbsolute;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCbRt;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearEnt;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnCube;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEqu;
    private javax.swing.JButton btnExpon;
    private javax.swing.JButton btnExponential;
    private javax.swing.JButton btnFacto;
    private javax.swing.JButton btnHexA;
    private javax.swing.JButton btnHexB;
    private javax.swing.JButton btnHexC;
    private javax.swing.JButton btnHexD;
    private javax.swing.JButton btnHexE;
    private javax.swing.JButton btnHexF;
    private javax.swing.JButton btnModulo;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnNegEx;
    private javax.swing.JButton btnPer;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSqRt;
    private javax.swing.JButton btnSqua;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnTan;
    private javax.swing.ButtonGroup g1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton rbtnBin;
    private javax.swing.JRadioButton rbtnDec;
    private javax.swing.JRadioButton rbtnHex;
    private javax.swing.JRadioButton rbtnOct;
    private javax.swing.JTextField txtDis;
    private javax.swing.JTextField txtTan;
    // End of variables declaration//GEN-END:variables
}
