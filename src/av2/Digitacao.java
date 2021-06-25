/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av2;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JButton;

/**
 *
 * @author sergio felippe
 */
public class Digitacao extends javax.swing.JFrame {

    /**
     * Creates new form Digitacao
     */
    public Digitacao() {
        initComponents();
        corPadrao = btn0.getBackground();
        lblFrase.setText(pangramas[indiceAtualPangrama]);
        qtdIndicesPangrama = pangramas.length;
        qtdLetrasFrase = lblFrase.getText().length();
        frase = lblFrase.getText();
    }
    int indiceAtualPangrama = 0;
    int qtdIndicesPangrama = 0;
    String frase = "";
    
    String[] pangramas = {
        "Jovem craque belga prediz falhas no xote",
        "Um pequeno jabuti xereta viu dez cegonhas felizes",
        "Gazeta publica hoje breve nota de faxina na quermesse",
        "Juiz faz com que whisky de malte baixe logo preço de venda",
        "Zebras caolhas de Java querem mandar fax para moça gigante de New York."
    };
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTilde = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaRelatorio = new javax.swing.JTextArea();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnTab = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnAbreColchetes = new javax.swing.JButton();
        btnFechaColchetes = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnBarraInvertida = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnÇ = new javax.swing.JButton();
        btnDoisPontos = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnCaps = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnShift = new javax.swing.JButton();
        btnBaixo = new javax.swing.JButton();
        btnCima = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnDireita = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnInterrogacao = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnEsquerda = new javax.swing.JButton();
        btnEspaco = new javax.swing.JButton();
        btnAspas = new javax.swing.JButton();
        btnProximaFrase = new javax.swing.JButton();
        lblAcertos = new javax.swing.JLabel();
        lblErros = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFrase = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTilde.setText("~");
        getContentPane().add(btnTilde, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, -1, -1));

        txtAreaRelatorio.setEditable(false);
        txtAreaRelatorio.setColumns(20);
        txtAreaRelatorio.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtAreaRelatorio.setRows(6);
        txtAreaRelatorio.setEnabled(false);
        jScrollPane1.setViewportView(txtAreaRelatorio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 750, 140));

        btn1.setText("1");
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 146, -1, -1));

        btn2.setText("2");
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 146, -1, -1));

        btn4.setText("4");
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 146, -1, -1));

        btn5.setText("5");
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 146, -1, -1));

        btn6.setText("6");
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 146, -1, -1));

        btn8.setText("8");
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 146, -1, -1));

        btn3.setText("3");
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 146, -1, -1));

        btn7.setText("7");
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 146, -1, -1));

        btn9.setText("9");
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 146, -1, -1));

        btnMenos.setText("-");
        getContentPane().add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 146, -1, -1));

        btnMais.setText("+");
        getContentPane().add(btnMais, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 146, -1, -1));

        btnBackspace.setText("Backspace");
        getContentPane().add(btnBackspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 146, -1, -1));

        btn0.setText("0");
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 146, -1, -1));

        btnTab.setText("Tab");
        getContentPane().add(btnTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 67, -1));

        btnQ.setText("Q");
        getContentPane().add(btnQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 175, -1, -1));

        btnW.setText("W");
        getContentPane().add(btnW, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 175, -1, -1));

        btnE.setText("E");
        getContentPane().add(btnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 175, -1, -1));

        btnR.setText("R");
        getContentPane().add(btnR, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 175, -1, -1));

        btnT.setText("T");
        getContentPane().add(btnT, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 175, -1, -1));

        btnU.setText("U");
        getContentPane().add(btnU, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 175, -1, -1));

        btnI.setText("I");
        getContentPane().add(btnI, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 175, -1, -1));

        btnO.setText("O");
        getContentPane().add(btnO, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 175, -1, -1));

        btnP.setText("P");
        getContentPane().add(btnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 175, -1, -1));

        btnAbreColchetes.setText("[");
        getContentPane().add(btnAbreColchetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 175, -1, -1));

        btnFechaColchetes.setText("]");
        getContentPane().add(btnFechaColchetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 175, -1, -1));

        btnY.setText("Y");
        getContentPane().add(btnY, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 175, -1, -1));

        btnBarraInvertida.setText("\\");
            getContentPane().add(btnBarraInvertida, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 175, -1, -1));

            btnF.setText("F");
            getContentPane().add(btnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 204, -1, -1));

            btnG.setText("G");
            getContentPane().add(btnG, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 204, -1, -1));

            btnH.setText("H");
            getContentPane().add(btnH, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 204, -1, -1));

            btnJ.setText("J");
            getContentPane().add(btnJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 204, -1, -1));

            btnK.setText("K");
            getContentPane().add(btnK, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 204, -1, -1));

            btnL.setText("L");
            getContentPane().add(btnL, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 204, -1, -1));

            btnÇ.setText("Ç");
            getContentPane().add(btnÇ, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 204, -1, -1));

            btnDoisPontos.setText(":");
            getContentPane().add(btnDoisPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 204, -1, -1));

            btnEnter.setText("Enter");
            getContentPane().add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 204, -1, -1));

            btnCaps.setText("Caps");
            getContentPane().add(btnCaps, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 204, 67, -1));

            btnA.setText("A");
            getContentPane().add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 204, -1, -1));

            btnS.setText("S");
            getContentPane().add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 204, -1, -1));

            btnD.setText("D");
            getContentPane().add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 204, -1, -1));

            btnV.setText("V");
            getContentPane().add(btnV, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 233, -1, -1));

            btnN.setText("N");
            getContentPane().add(btnN, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 233, -1, -1));

            btnZ.setText("Z");
            getContentPane().add(btnZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 233, -1, -1));

            btnM.setText("M");
            getContentPane().add(btnM, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 233, -1, -1));

            btnShift.setText("Shift");
            getContentPane().add(btnShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 233, 96, -1));

            btnBaixo.setText("↓");
            getContentPane().add(btnBaixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 262, -1, -1));

            btnCima.setText("↑");
            getContentPane().add(btnCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 233, -1, -1));

            btnX.setText("X");
            getContentPane().add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 233, -1, -1));

            btnDireita.setText("→");
            getContentPane().add(btnDireita, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 262, -1, -1));

            btnC.setText("C");
            getContentPane().add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 233, -1, -1));

            btnVirgula.setText(",");
            getContentPane().add(btnVirgula, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 233, -1, -1));

            btnInterrogacao.setText("?");
            getContentPane().add(btnInterrogacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 233, -1, -1));

            btnB.setText("B");
            getContentPane().add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 233, -1, -1));

            btnPonto.setText(".");
            getContentPane().add(btnPonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 233, -1, -1));

            btnEsquerda.setText("←");
            getContentPane().add(btnEsquerda, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 262, -1, -1));

            btnEspaco.setText("   ");
            getContentPane().add(btnEspaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 262, 264, -1));

            btnAspas.setText("\"");
            getContentPane().add(btnAspas, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 204, -1, -1));

            btnProximaFrase.setText("Próxima frase");
            btnProximaFrase.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnProximaFraseActionPerformed(evt);
                }
            });
            getContentPane().add(btnProximaFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

            lblAcertos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            lblAcertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lblAcertos.setText("0");
            lblAcertos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
            getContentPane().add(lblAcertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 40, 40));

            lblErros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            lblErros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lblErros.setText("0");
            lblErros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
            getContentPane().add(lblErros, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 40, 40));

            jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel3.setText("ACERTOS");
            getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel4.setText("ERROS");
            getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

            lblFrase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            lblFrase.setText("jLabel1");
            getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

            txtArea.setColumns(20);
            txtArea.setRows(3);
            txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    txtAreaKeyPressed(evt);
                }
            });
            jScrollPane2.setViewportView(txtArea);

            getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 582, 80));

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnProximaFraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximaFraseActionPerformed
        // TODO add your handling code here:
        proximaFrase();
    }//GEN-LAST:event_btnProximaFraseActionPerformed

    private void txtAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyPressed
        marcarTeclaPressionada(evt);
        verificarAcertoOuErro(evt);
        verificarFimFrase(evt);
    }//GEN-LAST:event_txtAreaKeyPressed

    private void proximaFrase(){
        indiceAtualPangrama++;
        
        boolean ultimaFraseDoPangrama = indiceAtualPangrama == qtdIndicesPangrama;
        if(ultimaFraseDoPangrama){
            indiceAtualPangrama = 0;
        }
        
        frase = pangramas[indiceAtualPangrama];

        lblFrase.setText(frase);
        qtdLetrasFrase = frase.length();
        indiceAtualDigitadoFrase = 0;
        qtdAcertos = 0;
        lblAcertos.setText(String.valueOf(qtdAcertos));
        qtdErros = 0;
        lblErros.setText(String.valueOf(qtdErros));
        txtArea.setText("");
    }
    
    String relatorio = "";
    private void adicionarDadosNoRelatorio(KeyEvent evt){
        relatorio += "Frase: " + frase + '\n';
        int total = qtdAcertos + qtdErros;
        String percAcertos = (qtdAcertos * 100)/total + "%";
        String percErros = (qtdErros * 100)/total + "%";
        relatorio += "Total de teclas digitadas: " + total + '\n';
        relatorio += "O que foi digitado: " + txtArea.getText() + evt.getKeyChar() + '\n';
        relatorio += String.format("Qtd. de acertos: %d de %d - %s\n", qtdAcertos, total, percAcertos);
        relatorio += String.format("Qtd. de erros: %d de %d - %s\n\n", qtdErros, total, percErros);
        txtAreaRelatorio.setText(relatorio);
    }
    
    int qtdLetrasFrase = 0;
    
    private void verificarFimFrase(KeyEvent evt){
        boolean chegouFimDaFrase = indiceAtualDigitadoFrase == qtdLetrasFrase;
        if(chegouFimDaFrase){
            adicionarDadosNoRelatorio(evt);
            proximaFrase();
        }
    }
    
    int qtdErros = 0;
    int qtdAcertos = 0;
    int indiceAtualDigitadoFrase = 0;
    
    private void verificarAcertoOuErro(KeyEvent evt){
        if(teclaNaoRegistradaDigitada(evt)){
            return;
        }

        boolean digitouTeclaCorreta = frase.charAt(indiceAtualDigitadoFrase) == evt.getKeyChar();
        if(digitouTeclaCorreta){
            indiceAtualDigitadoFrase++;
            qtdAcertos++;
            lblAcertos.setText(String.valueOf(qtdAcertos));
            colorirLetraPraSerDigitada();
            return;
        }
        
        qtdErros++;
        lblErros.setText(String.valueOf(qtdErros));
    }
    
    private void colorirLetraPraSerDigitada(){
        boolean chegouFimDaFrase = indiceAtualDigitadoFrase == qtdLetrasFrase;
        if(chegouFimDaFrase){
            return;
        }
        
        String letrasPraSerDigitada = frase.substring(indiceAtualDigitadoFrase + 1);
        char letraAtual = frase.charAt(indiceAtualDigitadoFrase);
        
        if(indiceAtualDigitadoFrase == 0){
            String novaFrase = String.format("<html><font color=blue>%c</font>%s</html>", letraAtual, letrasPraSerDigitada);
            lblFrase.setText(novaFrase);
            return;
        }
        String letrasDigitadas = frase.substring(0, indiceAtualDigitadoFrase);
        String novaFrase = String.format("<html><font color=green>%s</font><font color=blue>%c</font>%s</html>", letrasDigitadas, letraAtual, letrasPraSerDigitada);
        lblFrase.setText(novaFrase);
    }
    
    /**
    Não registra erro ou acerto pra teclas como deletar, setas, shift, ctrl, caps, tab...
    */
    private boolean teclaNaoRegistradaDigitada(KeyEvent evt){
        int code = evt.getKeyCode();
        if(
            code == cimaCode ||
            code == baixoCode ||
            code == esquerdaCode ||
            code == direitaCode ||
            code == shiftCode ||
            code == tabCode ||
            code == ctrlCode ||
            code == enterCode ||
            code == capsCode ||
            code == backspaceCode
          ){
            return true;
        }
        return false;
    }
    
    final int shiftCode = 16;
    final int enterCode = 10;
    final int tildeCode = 131;
    final int capsCode = 20;
    final int tabCode = 9;
    final int ctrlCode = 17;
    final int espacoCode = 32;
    final int backspaceCode = 8; 
    final int esquerdaCode = 37; 
    final int cimaCode = 38; 
    final int direitaCode = 39; 
    final int baixoCode = 40; 
    
    JButton btnAnteriorPressionado;
    Color corPadrao;
    
    private void marcarTeclaPressionada(KeyEvent evt){
        char tecla = evt.getKeyChar();
        int code = evt.getKeyCode();
        
        btnShift.setBackground(corPadrao);
        if(btnAnteriorPressionado != null){
            btnAnteriorPressionado.setBackground(corPadrao);
        }
        
        switch(code){
            case shiftCode:
                btnShift.setBackground(Color.red);
                btnAnteriorPressionado = btnShift;
                break;
            case tildeCode:
                btnTilde.setBackground(Color.red);
                btnAnteriorPressionado = btnTilde;
                break;
            case capsCode:
                btnCaps.setBackground(Color.red);
                btnAnteriorPressionado = btnCaps;
                break;
            case esquerdaCode:
                btnEsquerda.setBackground(Color.red);
                btnAnteriorPressionado = btnEsquerda;
                break;
            case cimaCode:
                btnCima.setBackground(Color.red);
                btnAnteriorPressionado = btnCima;
                break;
            case direitaCode:
                btnDireita.setBackground(Color.red);
                btnAnteriorPressionado = btnDireita;
                break;
            case baixoCode:
                btnBaixo.setBackground(Color.red);
                btnAnteriorPressionado = btnBaixo;
                break;
            case backspaceCode:
                btnBackspace.setBackground(Color.red);
                btnAnteriorPressionado = btnBackspace;
                break;
        }
        
        switch(tecla){
            case '\n': 
                btnEnter.setBackground(Color.red);
                btnAnteriorPressionado = btnEnter;
                break;
            case '\t': 
                btnTab.setBackground(Color.red);
                btnAnteriorPressionado = btnTab;
                break;
            case ' ': 
                btnEspaco.setBackground(Color.red);
                btnAnteriorPressionado = btnEspaco;
                break;
            case '+': 
                btnShift.setBackground(Color.red);
                btnMais.setBackground(Color.red);
                btnAnteriorPressionado = btnMais;
                break;
            case '-': 
                btnMenos.setBackground(Color.red);
                btnAnteriorPressionado = btnMenos;
                break;
            case ':': 
                btnShift.setBackground(Color.red);
                btnDoisPontos.setBackground(Color.red);
                btnAnteriorPressionado = btnDoisPontos;
                break;
            case '?': 
                btnShift.setBackground(Color.red);
                btnInterrogacao.setBackground(Color.red);
                btnAnteriorPressionado = btnInterrogacao;
            break;
            case '[': 
                btnAbreColchetes.setBackground(Color.red);
                btnAnteriorPressionado = btnAbreColchetes;
            break;
            case ']': 
                btnFechaColchetes.setBackground(Color.red);
                btnAnteriorPressionado = btnFechaColchetes;
            break;
            case ',': 
                btnVirgula.setBackground(Color.red);
                btnAnteriorPressionado = btnVirgula;
            break;
            case '.': 
                btnPonto.setBackground(Color.red);
                btnAnteriorPressionado = btnPonto;
            break;
            case '\\': 
                btnBarraInvertida.setBackground(Color.red);
                btnAnteriorPressionado = btnBarraInvertida;
            break;
            case '"': 
                btnAspas.setBackground(Color.red);
                btnAnteriorPressionado = btnAspas;
            break;
            
            case '1': 
                btn1.setBackground(Color.red);
                btnAnteriorPressionado = btn1;
            break;
            case '2': 
                btn2.setBackground(Color.red);
                btnAnteriorPressionado = btn2;
            break;
            case '3': 
                btn3.setBackground(Color.red);
                btnAnteriorPressionado = btn3;
            break;
            case '4': 
                btn4.setBackground(Color.red);
                btnAnteriorPressionado = btn4;
            break;
            case '5': 
                btn5.setBackground(Color.red);
                btnAnteriorPressionado = btn5;
            break;
            case '6': 
                btn6.setBackground(Color.red);
                btnAnteriorPressionado = btn6;
            break;
            case '7': 
                btn7.setBackground(Color.red);
                btnAnteriorPressionado = btn7;
            break;
            case '8': 
                btn8.setBackground(Color.red);
                btnAnteriorPressionado = btn8;
            break;
            case '9': 
                btn9.setBackground(Color.red);
                btnAnteriorPressionado = btn9;
            break;
            case '0': 
                btn0.setBackground(Color.red);
                btnAnteriorPressionado = btn0;
            break;
            case 'q': 
                btnQ.setBackground(Color.red);
                btnAnteriorPressionado = btnQ;
            break;
            case 'w': 
                btnW.setBackground(Color.red);
                btnAnteriorPressionado = btnW;
            break;
            case 'e': 
                btnE.setBackground(Color.red);
                btnAnteriorPressionado = btnE;
            break;
            case 'r': 
                btnR.setBackground(Color.red);
                btnAnteriorPressionado = btnR;
            break;
            case 't': 
                btnT.setBackground(Color.red);
                btnAnteriorPressionado = btnT;
            break;
            case 'y': 
                btnY.setBackground(Color.red);
                btnAnteriorPressionado = btnY;
            break;
            case 'u': 
                btnU.setBackground(Color.red);
                btnAnteriorPressionado = btnU;
            break;
            case 'i': 
                btnI.setBackground(Color.red);
                btnAnteriorPressionado = btnI;
            break;
            case 'o': 
                btnO.setBackground(Color.red);
                btnAnteriorPressionado = btnO;
            break;
            case 'p': 
                btnP.setBackground(Color.red);
                btnAnteriorPressionado = btnP;
            break;
            case 'a': 
                btnA.setBackground(Color.red);
                btnAnteriorPressionado = btnA;
            break;
            case 's': 
                btnS.setBackground(Color.red);
                btnAnteriorPressionado = btnS;
            break;
            case 'd': 
                btnD.setBackground(Color.red);
                btnAnteriorPressionado = btnD;
            break;
            case 'f': 
                btnF.setBackground(Color.red);
                btnAnteriorPressionado = btnF;
            break;
            case 'g': 
                btnG.setBackground(Color.red);
                btnAnteriorPressionado = btnG;
            break;
            case 'h': 
                btnH.setBackground(Color.red);
                btnAnteriorPressionado = btnH;
            break;
            case 'j': 
                btnJ.setBackground(Color.red);
                btnAnteriorPressionado = btnJ;
            break;
            case 'k': 
                btnK.setBackground(Color.red);
                btnAnteriorPressionado = btnK;
            break;
            case 'l': 
                btnL.setBackground(Color.red);
                btnAnteriorPressionado = btnL;
            break;
            case 'ç': 
                btnÇ.setBackground(Color.red);
                btnAnteriorPressionado = btnÇ;
            break;
            case 'z': 
                btnZ.setBackground(Color.red);
                btnAnteriorPressionado = btnZ;
            break;
            case 'x': 
                btnX.setBackground(Color.red);
                btnAnteriorPressionado = btnX;
            break;
            case 'c': 
                btnC.setBackground(Color.red);
                btnAnteriorPressionado = btnC;
            break;
            case 'v': 
                btnV.setBackground(Color.red);
                btnAnteriorPressionado = btnV;
            break;
            case 'b': 
                btnB.setBackground(Color.red);
                btnAnteriorPressionado = btnB;
            break;
            case 'n': 
                btnN.setBackground(Color.red);
                btnAnteriorPressionado = btnN;
            break;
            case 'm': 
                btnM.setBackground(Color.red);
                btnAnteriorPressionado = btnM;
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
            java.util.logging.Logger.getLogger(Digitacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Digitacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Digitacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Digitacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Digitacao().setVisible(true);
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
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAbreColchetes;
    private javax.swing.JButton btnAspas;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnBaixo;
    private javax.swing.JButton btnBarraInvertida;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCaps;
    private javax.swing.JButton btnCima;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDireita;
    private javax.swing.JButton btnDoisPontos;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnEspaco;
    private javax.swing.JButton btnEsquerda;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnFechaColchetes;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnInterrogacao;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnProximaFrase;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnShift;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnTab;
    private javax.swing.JButton btnTilde;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton btnÇ;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAcertos;
    private javax.swing.JLabel lblErros;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextArea txtAreaRelatorio;
    // End of variables declaration//GEN-END:variables
}
