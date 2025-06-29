package com.demo.issued.data;



import com.demo.issued.data.Issued;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssuedRepository extends JpaRepository<Issued, Integer> {
    List<Issued> findByUid(int uid);
    List<Issued> findByBid(int bid);
}
