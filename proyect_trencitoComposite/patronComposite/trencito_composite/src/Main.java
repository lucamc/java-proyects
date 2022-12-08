import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //Creacion de Figuras Simples // Se pasan los atributos de acuerdo al tipo de figura que se quiera crear

        Figura rectangulo = new FiguraSimple("Rectangulo",5.0,4.0,null,null,null);
        Figura circulo1 = new FiguraSimple("Circulo",null,null,1.0,null,null);
        Figura circulo2 = new FiguraSimple("Circulo",null,null,1.0,null,null);
        Figura circulo3 = new FiguraSimple("Circulo",null,null,1.0,null,null);


        //Creacion de una lista de Figuras para poder crear un vagon

        List<Figura> figuras = new ArrayList<>();
        figuras.add(rectangulo);
        figuras.add(circulo1);
        figuras.add(circulo2);
        figuras.add(circulo3);



        //Creaccion de una Figura Compuesta (Vagon)

        Figura vagon = new FiguraCompuesta("Vagon", figuras);
        System.out.println("Area Total Vagón: " + vagon.area());



        //Creacion de Trencito

        Trencito trencito = new Trencito();
        trencito.agregarFigura(vagon);
        System.out.println("Area Total Trencito: " + trencito.areaTrencito());
    }
}