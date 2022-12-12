import java.util.Scanner;

public class volumenes {
    Scanner sc = new Scanner(System.in);
    float lado, areaBase, altura, radio;
    float volumenCubo, volumenPrisma, volumenPiramide;
    float volumenCilindro, volumenEsfera;

    //Calculo de volumenes de las diferentes figuras
    public void calcularVolumenCubo(){
        System.out.print("Ingrese el lado del cubo: ");
        lado = sc.nextFloat();
        volumenCubo = (float)Math.pow(lado, 3);
        System.out.println("El volúmen es: " + volumenCubo);
    }

    public void calcularVolumenPrisma(){
        System.out.print("Ingrese la base del prisma: ");
        areaBase = sc.nextFloat();
        System.out.print("Ingrese la altura del prisma: ");
        altura = sc.nextFloat();
        volumenPrisma = areaBase * altura;
        System.out.println("El volúmen es: " + volumenPrisma);
    }

    public void calcularVolumenPiramide(){
        System.out.print("Ingrese la base del prisma: ");
        areaBase = sc.nextFloat();
        System.out.print("Ingrese la altura del prisma: ");
        altura = sc.nextFloat();
        volumenPiramide = areaBase * altura / 3;
        System.out.println("El volúmen es: " + volumenPiramide);
    }

    public void calcularVolumenCilindro(){
        System.out.print("Ingrese el radio del cilindro: ");
        radio = sc.nextFloat();
        System.out.print("Ingrese la altura del cilindro: ");
        altura = sc.nextFloat();
        volumenCilindro = (float)Math.PI * radio * radio * altura;
        System.out.println("El volúmen es: " + volumenCilindro);
    }

    public void calcularVolumenEsfera(){
        System.out.print("Ingrese el radio de la esfera: ");
        radio = sc.nextFloat();
        volumenEsfera = 4/3 * (float)Math.PI * (float)Math.pow(radio,3);
        System.out.println("El volúmen es: " + volumenEsfera);
    }

}
