package kr.ac.kopo.youngseo.springboot_ex.repository;

import kr.ac.kopo.youngseo.springboot_ex.domain.Member3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Entity 이름과 Repository 이름 일치
@Repository
public interface Member3Repository extends JpaRepository<Member3, Integer> {
}
