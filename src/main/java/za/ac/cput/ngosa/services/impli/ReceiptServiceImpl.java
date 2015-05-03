package za.ac.cput.ngosa.services.impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.ngosa.domain.Receipt;
import za.ac.cput.ngosa.repository.ReceiptRepository;
import za.ac.cput.ngosa.services.ReceiptService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/05/03.
 */
@Service
public class ReceiptServiceImpl implements ReceiptService {
    @Autowired
    ReceiptRepository repository;

    @Override
    public List<Receipt> getReceipts() {

        List<Receipt> allReceipts= new ArrayList<Receipt>();
        Iterable<Receipt> receipts= repository.findAll();

        for(Receipt receipt: receipts)
        {
            allReceipts.add(receipt);
        }

        return allReceipts;
    }
}
