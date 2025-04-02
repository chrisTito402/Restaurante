/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeption;

/**
 *
 * @author multaslokas33
 */
public class PersistenceExeption extends Exception {

    public PersistenceExeption() {
    }

    public PersistenceExeption(String message) {
        super(message);
    }

    public PersistenceExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public PersistenceExeption(Throwable cause) {
        super(cause);
    }

    public PersistenceExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
