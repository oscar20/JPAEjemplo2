package com.beeva.jpa.Ejemplo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.jpa.implementacion.userDAOImpl;
import com.beeva.jpa.models.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("core-context.xml");
        userDAOImpl user_DAO = (userDAOImpl)context.getBean(userDAOImpl.class);
        System.out.println( "Ejecutando JPA Ejemplo 2......!" );
        
        User my_user = new User();
        my_user.setName("Raul");
        my_user.setAddress("Jilotepec #547, Estado de Mexico");
        User u = user_DAO.save(my_user);
        System.out.println(u.getId() + " " + u.getName() + " " + u.getAddress());
        
        System.out.println("ID: " + user_DAO.getUser(u.getId()).getId() + " " + 
        				   "Nombre: " + user_DAO.getUser(u.getId()).getName() + " " +
        				   "Direccion: " + user_DAO.getUser(u.getId()).getAddress());
    }
}
