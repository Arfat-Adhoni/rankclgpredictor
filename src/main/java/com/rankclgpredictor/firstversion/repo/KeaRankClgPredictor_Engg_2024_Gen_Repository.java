package com.rankclgpredictor.firstversion.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rankclgpredictor.firstversion.model.Eng2025Gen;

import java.util.List;

@Repository
public interface KeaRankClgPredictor_Engg_2024_Gen_Repository extends JpaRepository<Eng2025Gen, Long> {

	@Query("SELECT e FROM Eng2025Gen e WHERE " +
		       "(:category = '1H' AND e.oneH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '1KH' AND e.oneKH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '1RH' AND e.oneRH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '2AH' AND e.twoAH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '2AKH' AND e.twoAKH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '2ARH' AND e.twoARH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '2BH' AND e.twoBH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '2BKH' AND e.twoBKH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '2BRH' AND e.twoBRH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '3AH' AND e.threeAH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '3AKH' AND e.threeAKH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '3ARH' AND e.threeARH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '3BH' AND e.threeBH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '3BKH' AND e.threeBKH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = '3BRH' AND e.threeBRH BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = 'GMH' AND e.gmh BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = 'GMKH' AND e.gmkh BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = 'GMRH' AND e.gmrh BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = 'SCH' AND e.sch BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = 'SCKH' AND e.sckh BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = 'SCRH' AND e.scrh BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = 'STH' AND e.sth BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = 'STKH' AND e.stkh BETWEEN :rankMin AND :rankMax) OR " +
		       "(:category = 'STRH' AND e.strh BETWEEN :rankMin AND :rankMax)")
		List<Eng2025Gen> findCollegesByCategoryAndRankRange(@Param("category") String category,
		                                                    @Param("rankMin") Long rankMin,
		                                                    @Param("rankMax") Long rankMax);


}
