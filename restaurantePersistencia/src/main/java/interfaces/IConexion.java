/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import conexion.Conexion;
import exeption.PersistenceExeption;

/**
 *
 * @author multaslokas33
 */
public interface IConexion {
        public Conexion crearConexion() throws PersistenceExeption;
}
