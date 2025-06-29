package com.demo.issued.service;

import com.demo.issued.data.Issued;
import com.demo.issued.data.IssuedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssuedService {

    @Autowired
    private IssuedRepository issuedRepository; // ✅ FIXED: Injecting the repository, not the service itself

    public List<Issued> getAllIssuedRecords() {
        return issuedRepository.findAll();
    }

    public Issued issueBook(Issued record) {
        return issuedRepository.save(record);
    }

    public Issued updateIssuedRecord(Issued record) {
        return issuedRepository.save(record);
    }

    public void deleteIssuedRecord(int id) {
        issuedRepository.deleteById(id);
    }

    public List<Issued> findByUserId(int uid) {
        return issuedRepository.findByUid(uid);
    }

    public List<Issued> findByBookId(int bid) {
        return issuedRepository.findByBid(bid);
    }
}
