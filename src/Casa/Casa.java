package Casa;

public class Casa {
    public static void main(String[] args) {
        ClaseCasa Micasa = new ClaseCasa(4,6,100);
        //Micasa.puertas = 4;
        //Micasa.ventanas = 6;
        //Micasa.tamanio = 100;

        System.out.println("La casa tiene "+ Micasa.puertas()+" puertas");
        System.out.println("La casa tiene "+ Micasa.ventanas()+" ventanas");
        //System.out.println("Y el tamaño es de "+Micasa.tamanio);
        ClaseCasa Micasa2 = new ClaseCasa();
        Micasa2.setPuertas(2);
        Micasa2.setVentanas(10);
        Micasa2.setTamanio(200);

        System.out.println("La casa 2 tiene "+ Micasa2.getPuertas()+" puertas");
        System.out.println("La casa 2 tiene "+ Micasa2.getVentanas()+" ventanas");
        System.out.println("El tamaño es "+ Micasa2.getTamanio());

    }
}
