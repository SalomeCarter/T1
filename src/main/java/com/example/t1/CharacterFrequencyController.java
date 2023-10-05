package com.example.t1;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class CharacterFrequencyController {

    @GetMapping("/calculate-frequency")
    public List<CharacterFrequency> calculateFrequency(@RequestParam String input) {
        char[] characters = input.toCharArray();

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char character : characters) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }

        List<CharacterFrequency> result = new ArrayList<>();
        frequencyMap.forEach((character, frequency) -> {
            result.add(new CharacterFrequency(character, frequency));
        });

        result.sort((a, b) -> Integer.compare(b.getFrequency(), a.getFrequency()));

        return result;
    }
}

