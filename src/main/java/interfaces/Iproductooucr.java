package interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import modelos.productoOUCR;
@Repository
public interface Iproductooucr extends CrudRepository<productoOUCR, Integer> {

}
