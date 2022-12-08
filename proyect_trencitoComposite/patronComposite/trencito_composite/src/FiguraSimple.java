public class FiguraSimple implements Figura {


    //Attributes
    private String nombre;
    private Double alto, largo, radio, base, altura;


    //Constructor
    public FiguraSimple(String nombre, Double alto, Double largo, Double radio, Double base, Double altura) {
        this.nombre = nombre;
        this.alto = alto;
        this.largo = largo;
        this.radio = radio;
        this.base = base;
        this.altura = altura;
    }


    @Override
    public Double area() {
        Double area = 0.0;
        if (this.nombre.toUpperCase().equals("RECTANGULO")) {
            area = (this.alto * this.largo);
        } else {
            if (this.nombre.toUpperCase().equals("CIRCULO")) {
                area = (Math.pow(this.radio, 2) * Math.PI);
            } else {
                if (this.nombre.toUpperCase().equals("TRIANGULO")) {
                    area = (this.base * this.altura / 2);
                } else {
                    System.out.println("No se puede reconocer que tipo de Figura es");
                }
            }
        }
        return area;
    }

    @Override
    public String toString() {
        return "FiguraSimple{" +
                "nombre='" + nombre + '\'' +
                ", alto=" + alto +
                ", largo=" + largo +
                ", radio=" + radio +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}

