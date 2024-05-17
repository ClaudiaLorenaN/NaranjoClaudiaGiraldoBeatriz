package dao;

import model.Odontologo;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOList implements iDao<Odontologo>{
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
        List<Odontologo> odontologos = new ArrayList<>();
        return odontologos;
    }
}
