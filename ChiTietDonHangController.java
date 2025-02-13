package spring.api.apistart.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.repository.DonHangrepo;
import spring.api.apistart.service.DonHangService;

@RestController
@RequestMapping("/api/donhang")
public class ChiTietDonHangController {
    @Autowired
    private DonHangService service;
    @Autowired
    private DonHangrepo repo;

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getAll());
    }


}

