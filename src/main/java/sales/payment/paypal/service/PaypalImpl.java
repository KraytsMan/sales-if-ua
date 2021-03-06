package sales.payment.paypal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sales.payment.paypal.domain.Paypal;
import sales.payment.paypal.repository.PaypalRepository;

import java.util.List;

/**
 * Created by volodya on 28.07.15.
 */

@Service("paypalService")
@Transactional
public class PaypalImpl implements PaypalService{

    @Autowired
    PaypalRepository repository;


    @Override
    public Paypal get(long id) {
        return repository.findById(id);
    }

    @Override
    public Paypal getByUserId(long id) {
        return repository.findByUserId(id);
    }

    @Override
    public List<Paypal> getAll() {
        return repository.findAll();
    }

    @Override
    public Paypal save(Paypal paypal) {
        return repository.save(paypal);
    }

    @Override
    public void delete(long id) {
        repository.removeById(id);
    }
}
