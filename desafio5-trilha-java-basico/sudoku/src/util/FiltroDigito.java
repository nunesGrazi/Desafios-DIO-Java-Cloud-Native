package util;

import javax.swing.text.*;

public class FiltroDigito extends DocumentFilter {

    @Override
    public void insertString(FilterBypass fb, int offset, String texto, AttributeSet atributos) throws BadLocationException {

        if (valido(texto) && fb.getDocument().getLength() == 0) {
            super.insertString(fb, offset, texto, atributos);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String texto, AttributeSet atributos)
            throws BadLocationException {

        int tamanhoAtual = fb.getDocument().getLength();
        int novoTamanho = tamanhoAtual + texto.length() - length;

        if (valido(texto) && novoTamanho <= 1) {
            super.replace(fb, offset, length, texto, atributos);
        }
    }

    private boolean valido(String texto) {
        return texto.matches("[1-9]");
    }
}
