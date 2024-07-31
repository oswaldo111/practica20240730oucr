package servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import interfaces.Iproductooucr;
import interfazservices.Iproductoservice;
import modelos.productoOUCR;
@Service
public class productoservice implements Iproductoservice {
    @Autowired
    private Iproductooucr data;

    @Override
    public List<productoOUCR> Listar() {
        List<productoOUCR> productos = (List<productoOUCR>) data.findAll();
        // Imprime los productos recuperados
        System.out.println("Productos!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! recuperados: " + productos);
        return (List<productoOUCR>)data.findAll();
    }

    @Override
    public Optional<productoOUCR> ListarId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ListarId'");
    }

    @Override
    public int save(productoOUCR pro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
