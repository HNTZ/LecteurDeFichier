package lecteurdefichier;
import java.io.File;

public class Read {
    public static void main(String[] args) {
        
        File badFile = new File("blablabla");
        
        System.out.println("Mauvais fichier: ------------------");
        TextReader badReader = new TextReader(badFile);
        badReader.display();
        
        File test = new File("src/lecteurDeFichier/test.txt");
        
        System.out.println("Texte à l'endroit: ----------------");
        TextReader testReader = new TextReader(test);
        testReader.display();
        
        System.out.println("Texte à l'envers: -----------------");
        TextReaderUpsideDown testReaderUpsideDown = new TextReaderUpsideDown(test);
        testReaderUpsideDown.display();
        
        System.out.println("Texte inversé: --------------------");
        TextReaderReverse testReaderReverse = new TextReaderReverse(test);
        testReaderReverse.display();
    }
}
