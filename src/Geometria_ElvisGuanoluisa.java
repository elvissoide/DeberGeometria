import java.util.Scanner;

public class Geometria_ElvisGuanoluisa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perimetros figurasPerimetro = new perimetros();
        areas figurasAreas = new areas();
        volumenes figurasVolumen = new volumenes();
        String opcionMenuPrincipal, opcionMenuSecundario;
        boolean opcionSalir;
        do{
            mostrarMenuPrincipal();
            System.out.print("Elija una opcion: ");
            opcionMenuPrincipal = sc.next().toUpperCase();
            opcionSalir = true;
            switch (opcionMenuPrincipal){
                case "A":
                    System.out.println("MENU PERIMETROS");
                    mostrarMenuPerimetroArea();
                    System.out.print("Elija una opcion: ");
                    opcionMenuSecundario = sc.next().toUpperCase();
                    switch (opcionMenuSecundario){
                        case "A":
                            figurasPerimetro.calcularPerimetroCuadrado();
                            break;
                        case "B":
                            figurasPerimetro.calcularPerimetroRectangulo();
                            break;
                        case "C":
                            figurasPerimetro.calcularPerimetroTriangulo();
                            break;
                        case "D":
                            figurasPerimetro.calcularPerimetroPentagono();
                            break;
                        case "E":
                            figurasPerimetro.calcularPerimetroCirculo();
                            break;
                    }
                    break;
                case "B":
                    System.out.println("MENU AREAS");
                    mostrarMenuPerimetroArea();
                    System.out.print("Elija una opcion: ");
                    opcionMenuSecundario = sc.next().toUpperCase();
                    switch (opcionMenuSecundario){
                        case "A":
                            figurasAreas.calcularAreaCuadrado();
                            break;
                        case "B":
                            figurasAreas.calcularAreaRectangulo();
                            break;
                        case "C":
                            figurasAreas.calcularAreaTriangulo();
                            break;
                        case "D":
                            figurasAreas.calcularAreaPentagono();
                            break;
                        case "E":
                            figurasAreas.calcularAreaCirculo();
                            break;
                    }
                    break;
                case "C":
                    System.out.println("MENU VOLUMENES");
                    mostrarMenuVolumen();
                    System.out.print("Elija una opcion: ");
                    opcionMenuSecundario = sc.next().toUpperCase();
                    switch (opcionMenuSecundario){
                        case "A":
                            figurasVolumen.calcularVolumenCubo();
                            break;
                        case "B":
                            figurasVolumen.calcularVolumenPrisma();
                            break;
                        case "C":
                            figurasVolumen.calcularVolumenPiramide();
                            break;
                        case "D":
                            figurasVolumen.calcularVolumenCilindro();
                            break;
                        case "E":
                            figurasVolumen.calcularVolumenEsfera();
                            break;
                    }
                    break;
                case "D":
                    opcionSalir = false;
                    break;
            }

        } while(opcionSalir);
    }

    static void mostrarMenuPrincipal(){
        System.out.println("A. Calcular perimetros");
        System.out.println("B. Calcular areas");
        System.out.println("C. Calcular volumenes");
        System.out.println("D. Salir");
    }

    static void mostrarMenuPerimetroArea(){
        System.out.println("A. Cuadrado");
        System.out.println("B. Rectángulo");
        System.out.println("C. Triángulo");
        System.out.println("D. Pentágono");
        System.out.println("E. Círculo");
    }

    static void mostrarMenuVolumen(){
        System.out.println("A. Cubo");
        System.out.println("B. Prisma");
        System.out.println("C. Piramide");
        System.out.println("D. Cilindro");
        System.out.println("E. Esfera");
    }

}
