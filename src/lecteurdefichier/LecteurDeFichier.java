/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecteurdefichier;
import java.io.File;
/**
 *
 * @author Lucas
 */
public abstract class LecteurDeFichier implements LecteurFichiers {
    protected File file;
    
    public LecteurDeFichier(File file) {
        this.file = file;
    }
    
    public String getName() {
        return this.file.getName();
    }
    
    public boolean exists() {
        return this.file.exists();
    } 
    
    public long getSize() {
        return this.file.length();
    }
    
    public long getLastModifDate() {
        return this.file.lastModified();
    }
}
