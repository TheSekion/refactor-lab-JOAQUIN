package app;

import figuras.Paralelogramao;

public class AppRectangulo {
    public static void main(String[] args) {

        Paralelogramao r1 = new Paralelogramao(10.5, 20.3);
        Paralelogramao r2 = new Paralelogramao(11.1, 19.7);
        Paralelogramao r3 = new Paralelogramao(10.5, 20.3);

        r1.mostrar();
        r2.mostrar();
        r3.mostrar();

        if (r1.compararTamaño(true, r3)) {
            System.out.println("r1 y r3 son iguales (exactos)");
        }

        if (r1.compararTamaño(false, r2)) {
            System.out.println("r1 y r2 son aproximadamente iguales");
        }
    }
}
