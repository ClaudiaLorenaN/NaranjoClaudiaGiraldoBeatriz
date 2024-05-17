import dao.BD_OD;
import model.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.OdontologoService;

import java.util.List;

public class OdontologoServiceTest {
   /* @Test
    public void buscarPacientePorID(){
        BD.crearTablas();
        PacienteService pacienteService= new PacienteService();
        Integer id=2;
        Paciente paciente= pacienteService.buscarPorID(id);
        Assertions.assertTrue(paciente!=null);
    }*/

    @Test
    public void buscarOdontologos(){
        BD_OD.crearTablas();
        OdontologoService odontologoService= new OdontologoService();
        Integer id=2;
        List<Odontologo> odontologo= odontologoService.buscarTodos();

        Assertions.assertTrue(odontologo !=null);

    }

    @Test
    public void buscarOdontologosList(){
        OdontologoService odontologoService1= new OdontologoService();
        Odontologo odontologo1 = new Odontologo(1, 1212, "Lina", "Lopez");
        Odontologo odontologo2 = new Odontologo(2, 2558, "Tatiana", "Jaramillo");

        List<Odontologo> odontologo = odontologoService1.buscarTodos();
        odontologo.add(odontologo1);
        odontologo.add(odontologo2);


        Assertions.assertTrue(odontologo !=null);

    }

}
