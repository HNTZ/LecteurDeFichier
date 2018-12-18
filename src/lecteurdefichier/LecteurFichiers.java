/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecteurdefichier;

/**
 *
 * @author Lucas
 */
public interface LecteurFichiers {
    String read();
    void write();
    long getSize();
    String getName();
    boolean exists();
    long getLastModifDate();
}
