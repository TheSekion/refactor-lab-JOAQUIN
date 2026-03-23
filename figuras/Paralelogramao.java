package figuras;

public class Paralelogramao {
    private double base;
    private double altura;
    private String tipo;

    public Paralelogramao(double a, double b) {
        base = a;
        altura = b;
    }

    public void mostrar() {
        tipo = "Rectángulo";
        System.out.println("Tipo: " + tipo);
        System.out.println("Ancho: " + base);
        System.out.println("Alto: " + altura);
    }

    public boolean compararTamaño(boolean exacto, Paralelogramao r) {
        if (exacto) {
            return this.base == r.base && this.altura == r.altura;
        } else {
            return Math.abs(this.base - r.base) < 1 &&
                    Math.abs(this.altura - r.altura) < 1;
        }
    }

    public void calcularPerimetro(){
        System.out.println("Perímetro: " + ((base * 2) + (altura * 2)));
    }

    public void calcularArea(){
        double area = base * altura;
        System.out.println("Área: " + area);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
