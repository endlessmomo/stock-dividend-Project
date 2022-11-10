package yuki.dividendstock.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CompanyController {
    // 배당금 검색 자동완성
    @GetMapping("/company/autocomplete")
    public ResponseEntity <?> autocomplete(@RequestParam String keyword) {
        return null;
    }

    @GetMapping
    public ResponseEntity <?> searchCompany() {
        return null;
    }

    @PostMapping
    public ResponseEntity <?> addCompany() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity <?> deleteCompany() {
        return null;
    }
}
