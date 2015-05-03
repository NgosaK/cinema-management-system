package za.ac.cput.ngosa.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.ngosa.domain.Receipt;

/**
 * Created by User on 2015/05/03.
 */
public interface ReceiptRepository extends CrudRepository<Receipt,Long> {

    public Receipt findByCode(String code);
}
