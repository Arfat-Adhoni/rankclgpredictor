package com.rankclgpredictor.firstversion.controller;

import com.rankclgpredictor.firstversion.model.Eng2025Gen;
import com.rankclgpredictor.firstversion.repo.KeaRankClgPredictor_Engg_2024_Gen_Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/kea/api/v2025")
@CrossOrigin(origins = "*") // 
public class KeaRankClgPredictorController {

    @Autowired
    private KeaRankClgPredictor_Engg_2024_Gen_Repository repository;

    @GetMapping("/predict")
    public List<Eng2025Gen> getPredictedColleges(
            @RequestParam String category,
            @RequestParam Long rank
    ) {
        String upperCategory = category.toUpperCase();
        
        Long inputRank = rank;
        Long minRank = inputRank - 1500;
        Long maxRank = inputRank + 1500;

        List<Eng2025Gen> colleges = repository.findCollegesByCategoryAndRankRange(upperCategory, minRank, maxRank);
        
     
        
        List<Eng2025Gen> results = new ArrayList<>();

        for (Eng2025Gen e : colleges) {
            Eng2025Gen model = new Eng2025Gen();

            model.setSlNo((long) (results.size() + 1)); // Dynamic SL No.
            model.setClgCode(e.getClgCode());
            model.setBranch(e.getBranch());

            // Only set the field matching the category
            switch (upperCategory) {
                case "GMH" -> model.setGmh(e.getGmh());
                case "GMKH" -> model.setGmkh(e.getGmkh());
                case "GMRH" -> model.setGmrh(e.getGmrh());
                case "1H" -> model.setOneH(e.getOneH());
                case "1KH" -> model.setOneKH(e.getOneKH());
                case "1RH" -> model.setOneRH(e.getOneRH());
                case "2AH" -> model.setTwoAH(e.getTwoAH());
                case "2AKH" -> model.setTwoAKH(e.getTwoAKH());
                case "2ARH" -> model.setTwoARH(e.getTwoARH());
                case "2BH" -> model.setTwoBH(e.getTwoBH());
                case "2BKH" -> model.setTwoBKH(e.getTwoBKH());
                case "2BRH" -> model.setTwoBRH(e.getTwoBRH());
                case "3AH" -> model.setThreeAH(e.getThreeAH());
                case "3AKH" -> model.setThreeAKH(e.getThreeAKH());
                case "3ARH" -> model.setThreeARH(e.getThreeARH());
                case "3BH" -> model.setThreeBH(e.getThreeBH());
                case "3BKH" -> model.setThreeBKH(e.getThreeBKH());
                case "3BRH" -> model.setThreeBRH(e.getThreeBRH());
                case "SCH" -> model.setSch(e.getSch());
                case "SCKH" -> model.setSckh(e.getSckh());
                case "SCRH" -> model.setScrh(e.getScrh());
                case "STH" -> model.setSth(e.getSth());
                case "STKH" -> model.setStkh(e.getStkh());
                case "STRH" -> model.setStrh(e.getStrh());
                default -> {} // Do nothing if invalid category
            }

            results.add(model);
        }

        return results;
    }

}
