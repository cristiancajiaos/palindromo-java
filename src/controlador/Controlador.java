package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener, KeyListener {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnVerificarTextos.addActionListener(this);
        this.vista.campoTexto1.addKeyListener(this);
        this.vista.campoTexto2.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.btnVerificarTextos) {
            String texto1 = this.vista.campoTexto1.getText();
            String texto2 = this.vista.campoTexto2.getText();
            boolean sonPalindromos = this.modelo.sonTextosPalindromos(texto1, texto2);
            this.vista.etiquetaResultado.setText(sonPalindromos ? "Son palindromos" : "No son palindromos");
            this.vista.etiquetaResultado.setBackground(sonPalindromos ? Color.blue : Color.red);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        String texto1 = this.vista.campoTexto1.getText();
        String texto2 = this.vista.campoTexto2.getText();
        boolean sonPalindromos = this.modelo.sonTextosPalindromos(texto1, texto2);
        this.vista.etiquetaResultado.setText(sonPalindromos ? "Son palindromos" : "No son palindromos");
        this.vista.etiquetaResultado.setBackground(sonPalindromos ? Color.blue : Color.red);
    }
    
    

}
