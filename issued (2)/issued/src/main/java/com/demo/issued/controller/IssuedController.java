package com.demo.issued.controller;


import com.demo.issued.data.Issued;
import com.demo.issued.service.IssuedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/issued")
public class IssuedController {

    @Autowired
    private IssuedService issuedService;

    @GetMapping
    public List<Issued> getAllIssuedBooks() {
        return issuedService.getAllIssuedRecords();
    }

    @PostMapping
    public Issued issueBook(@RequestBody Issued record) {
        return issuedService.issueBook(record);
    }

    @PutMapping
    public Issued updateIssuedRecord(@RequestBody Issued record) {
        return issuedService.updateIssuedRecord(record);
    }

    @DeleteMapping("/{id}")
    public void deleteIssuedRecord(@PathVariable int id) {
        issuedService.deleteIssuedRecord(id);
    }

    @GetMapping(params = "uid")
    public List<Issued> findIssuedByUser(@RequestParam int uid) {
        return issuedService.findByUserId(uid);
    }

    @GetMapping(params = "bid")
    public List<Issued> findIssuedByBook(@RequestParam int bid) {
        return issuedService.findByBookId(bid);
    }
}
