package interfazservices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import modelos.productoOUCR;

public interface Iproductoservice {

      public List<productoOUCR>Listar();
        public Optional<productoOUCR>ListarId(int id);
        public int save(productoOUCR pro);
        public void  delete (int id);
}
