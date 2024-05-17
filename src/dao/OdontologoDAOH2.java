package dao;

import model.Odontologo;
import model.Paciente;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOH2 implements iDao<Odontologo> {
    private static final Logger logger= Logger.getLogger(OdontologoDAOH2.class);
    private static final String SQL_SELECT_ALL="SELECT * FROM ODONTOLOGOS";
    @Override
    public Odontologo guardar(Odontologo odontologo) {
        return null;
    }

    @Override
    public Odontologo buscarPorId(Integer id) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public void actualizar(Odontologo odontologo) {

    }

    @Override
    public List<Odontologo> buscarTodos() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Odontologo> odontologos = new ArrayList<>();
        try{
            connection= BD_OD.getConnection();
            //Statement statement= connection.createStatement();
            preparedStatement = connection.prepareStatement(SQL_SELECT_ALL);

            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                Integer id = result.getInt("id");
                Integer numero_matricula = result.getInt("numero_matricula");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                odontologos.add(new Odontologo(id, numero_matricula, nombre, apellido));

                System.out.println(id + numero_matricula + nombre + apellido);
            }

        }catch(Exception e){
            logger.error(e.getMessage());

        }
        return odontologos;
    }
}
