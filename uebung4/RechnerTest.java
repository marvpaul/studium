
public class RechnerTest {

    public static void main(String[] args) {
        System.out.println("Test Normal:");
        String[][] testNormal = new String[][]{
            //Normalfaelle
            new String[]{"1", "add", "2"},
            new String[]{"4", "sub", "3"},
            new String[]{"5.0", "mul", "6"},
            new String[]{"6", "div", "7"},
            new String[]{"0", "div", "7"},
            };

        for (int i = 0; i < testNormal.length; i++) {
            Rechner.main(testNormal[i]);
        }

        System.out.println("\nTest negative Zahlen:");
        String[][] testNegativ = new String[][]{
            //Normalfaelle (aber negative Zahlen)
            new String[]{"1", "add", "-2.99"},
            new String[]{"-4", "sub", "-4.0"},
            new String[]{"-5", "mul", "-6"},
            new String[]{"-6", "div", "-7"},
            };
 
        for (int i = 0; i < testNegativ.length; i++) {
            Rechner.main(testNegativ[i]);
        }

        //Fehlerfaelle (falsche Eingaben)    
        System.out.println("\n\nTest Fehlerfaelle (falsche Eingaben):");
        System.out.println();

        //Zahlangabe fehlerhaft (1. Zahl)
        Rechner.main(new String[]{"eins", "add", "2"});
        System.out.println();
        //Zahlangabe fehlerhaft (2. Zahl)
        Rechner.main(new String[]{"4", "sub", "drei"});
        System.out.println();
        //Operator fehlerhaft ("multi" statt "mul")
        Rechner.main(new String[]{"5", "multi", "6"});
        System.out.println();
        //Anzahl fehlerhaft (zu wenig)
        Rechner.main(new String[]{"6", "div"});
        System.out.println();
        //Anzahl fehlerhaft (zu viel)
        Rechner.main(new String[]{"6", "div", "6", "7"});
        System.out.println();
        //Operation fehlerhaft (dividieren durch 0)
        Rechner.main(new String[]{"6", "div", "0"});
        System.out.println();
    }

}
