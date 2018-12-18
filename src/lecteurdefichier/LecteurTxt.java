/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecteurdefichier;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 * @author Lucas
 */
public class LecteurTxt extends LecteurDeFichier {
    
    public LecteurTxt(File file) {
        super(file); 
    }
    
    public String read() {
        try {
            Scanner scan = new Scanner(this.file);
        }
        catch (FileNotFoundException e) {
            
        }
    }
    public void write() {
        
    }
    
}
