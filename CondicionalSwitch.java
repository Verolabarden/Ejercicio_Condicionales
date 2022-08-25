package paqprincipal;

public class CondicionalSwitch {
    public static void main(String[] args) {
        var estacion = "Verano";

        switch (estacion){
            case "Invierno":
                System.out.println("es invierno");
                break;
            case "Primavera":
                System.out.println("es primavera");
                break;
            case "Otoño":
                System.out.println("es otoño");
                break;
            case "Verano":
                System.out.println("es verano");
                break;
            default:
                System.out.println("no es una estación");

        }
    }
}
