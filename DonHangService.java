package spring.api.apistart.service;// ⚠️ Package phải đúng!

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import spring.api.apistart.entity.DonHang;
import spring.api.apistart.repository.DonHangrepo;

import java.util.List;

@Service
public class DonHangService {
    @Autowired
    private DonHangrepo repo;

    public List<DonHang> getAll() {
        return repo.findAll();
    }
}

