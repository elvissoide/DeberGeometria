import java.util.Scanner;

public class areas {
    Scanner sc = new Scanner(System.in);
    float lado, base, altura, apotema, radio;
    float areaCuadrado, areaRectangulo, areaTriangulo;
    float areaPentagono, areaCirculo;

    //Calculo de areas de las diferentes figuras
    public void calcularAreaCuadrado(){
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = sc.nextFloat();
        areaCuadrado = 2 * lado;
        System.out.println("El área es: " + areaCuadrado);
    }

    public void calcularAreaRectangulo(){
        System.out.print("Ingrese la base del rectángulo: ");
        base = sc.nextFloat();
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = sc.nextFloat();
        areaRectangulo = base * altura;
        System.out.println("El área es: " + areaRectangulo);
    }

    public void calcularAreaTriangulo(){
        System.out.print("Ingrese la base del triángulo: ");
        base = sc.nextFloat();
        System.out.print("Ingrese la altura del triángulo: ");
        altura = sc.nextFloat();
        areaTriangulo = base * altura / 2;
        System.out.println("El área es: " + areaTriangulo);
    }

    public void calcularAreaPentagono(){
        System.out.print("Ingrese el lado del pentágono: ");
        lado = sc.nextFloat();
        System.out.print("Ingrese el apotema del pentágono: ");
        apotema = sc.nextFloat();
        areaPentagono = 5 * lado * apotema / 2;
        System.out.println("El área es: " + areaPentagono);
    }

    public void calcularAreaCirculo(){
        System.out.print("Ingrese el radio del círculo: ");
        radio = sc.nextFloat();
        areaCirculo = radio * radio * (float)Math.PI;
        System.out.println("El área es: " + areaCirculo);
    }

}
