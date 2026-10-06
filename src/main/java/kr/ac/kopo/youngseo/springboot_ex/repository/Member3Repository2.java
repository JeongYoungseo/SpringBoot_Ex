package kr.ac.kopo.youngseo.springboot_ex.repository;

import jakarta.transaction.Transactional;
import kr.ac.kopo.youngseo.springboot_ex.domain.Member3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Member3Repository2 extends JpaRepository<Member3, Integer> {
    //전체 행 (Entity) 조회
    @Transactional
    @Query(value = "select * from Member3", nativeQuery = true) //표준 SQL
    //@Query(value = "select entity from Member3 entity") //JPQL
    public List<Member3> selectMembers();

    //특정 아이디를 가진 한 행 조회
    @Transactional
    @Query(value = "select * from Member3 where id = ?", nativeQuery = true)
    //@Query(value = "select entity from Member3 entity where id = :e_id") //JPQL
    public List<Member3> selectByID(@Param("e_id")int id);

    //member3 삽입(insert)
    @Transactional
    @Modifying
    @Query(value = "insert into Member3(name,age,email) values(?,?,?)", nativeQuery = true)
    //@Query(value = "insert into Member3(name,age,email) values (:e_name, :e_age, :e_email)") //JPQL
    public int insertMember(@Param("e_name") String name, @Param("e_age")int age, @Param("e_email")String email);

    //member3 수정(update)
    @Transactional
    @Modifying
    @Query(value = "update Member3 set name=?, age=?,email=? where id=?", nativeQuery = true)
    // @Query(value = "update Member3 set name=:e_name, age=:e_age, email=:e_email, id=:e_id)
    public int updateMember(@Param("e_name") String name, @Param("e_age")int age, @Param("e_email") String email, @Param("e_id")int id);

    //member3 삭제(delete)
    @Transactional
    @Modifying
    @Query(value = "delete from Member3 where id =?", nativeQuery = true)
    // @Query(value = "delete from Member3 where id =:e_id") //JPQL
    public int deleteMember(@Param("e_id")int id);
}
