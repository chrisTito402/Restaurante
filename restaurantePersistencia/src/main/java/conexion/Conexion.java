/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import exeption.PersistenceExeption;
import interfaces.IConexion;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author multaslokas33
 */
public class Conexion implements IConexion {

    @Override
    public Conexion crearConexion() throws PersistenceExeption {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
            System.out.println("Conexión exitosa");
            emf.close();
        } catch (Exception e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
        return null;
    }

}
