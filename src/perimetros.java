import java.util.Scanner;

public class perimetros {
    Scanner sc = new Scanner(System.in);
    float lado, base, altura, radio;
    float perimetroCuadrado, perimetroRectangulo, perimetroTriangulo;
    float perimetroPentagono, perimetroCirculo;

    //Calculo de perimetros de las diferentes figuras
    public void calcularPerimetroCuadrado(){
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = sc.nextFloat();
        perimetroCuadrado = 4 * lado;
        System.out.println("El perímetro es: " + perimetroCuadrado);
    }

    public void calcularPerimetroRectangulo(){
        System.out.print("Ingrese la base del rectángulo: ");
        base = sc.nextFloat();
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = sc.nextFloat();
        perimetroRectangulo = 2 * base + 2 * altura;
        System.out.println("El perímetro es: " + perimetroRectangulo);
    }

    public void calcularPerimetroTriangulo(){
        System.out.print("Ingrese el lado del triángulo equilátero: ");
        lado = sc.nextFloat();
        perimetroTriangulo = 3 * lado;
        System.out.println("El perímetro es: " + perimetroTriangulo);
    }

    public void calcularPerimetroPentagono(){
        System.out.print("Ingrese el lado del pentágono: ");
        lado = sc.nextFloat();
        perimetroPentagono = 5 * lado;
        System.out.println("El perímetro es: " + perimetroPentagono);
    }

    public void calcularPerimetroCirculo(){
        System.out.print("Ingrese el radio del círculo: ");
        radio = sc.nextFloat();
        perimetroCirculo = 2 * radio * (float)Math.PI;
        System.out.println("El perímetro es: " + perimetroCirculo);
    }

}
