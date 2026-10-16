package Metodo_String;

public class Persona {
    public  static void main(String[] args) {
        String name = "Gabriel";    //0x00123
        String name1= "Tatiana";
        String name2= "Gabriel";    //0x00123

        System.out.println(name==name1);//False
        System.out.println(name==name2);//True

        System.out.println("Con clase");
        ClassPersona persona = new ClassPersona("Gabriel","Sossa");
        System.out.println(name==persona.getNombre());
        System.out.println(persona.toString());
    }
}
