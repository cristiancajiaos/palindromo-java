package modelo;

public class Modelo {

    private String texto1;
    private String texto2;
    private boolean sonPalindromos;

    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }

    public boolean isSonPalindromos() {
        return sonPalindromos;
    }

    public void setSonPalindromos(boolean sonPalindromos) {
        this.sonPalindromos = sonPalindromos;
    }

    public boolean sonTextosPalindromos(String texto1, String texto2) {
        this.setTexto1(texto1);
        this.setTexto2(texto2);

        char[] charTexto2 = new char[texto2.length()];

        for (int i = texto2.length() - 1; i >= 0; i--) {
            charTexto2[i] = texto2.toLowerCase().charAt(i);
        }

        String texto2Armado = String.valueOf(charTexto2);

        this.setSonPalindromos(texto1.equals(texto2Armado));
        return this.isSonPalindromos();
    }
}
