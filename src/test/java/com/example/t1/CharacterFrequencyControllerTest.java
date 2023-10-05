package com.example.t1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CharacterFrequencyControllerTest {
    private CharacterFrequencyController characterFrequencyController;

    @BeforeEach
    public void setUp() {
        characterFrequencyController = new CharacterFrequencyController();
    }

    @Test
    public void testCalculateFrequencyWithValidInput() {
        String input = "aaaaabcccc";

        List<CharacterFrequency> result = characterFrequencyController.calculateFrequency(input);

        assertEquals(3, result.size());

        assertEquals('a', result.get(0).getCharacter());
        assertEquals(5, result.get(0).getFrequency());

        assertEquals('c', result.get(1).getCharacter());
        assertEquals(4, result.get(1).getFrequency());

        assertEquals('b', result.get(2).getCharacter());
        assertEquals(1, result.get(2).getFrequency());
    }

    @Test
    public void testCalculateFrequencyWithEmptyInput() {
        String input = "";

        List<CharacterFrequency> result = characterFrequencyController.calculateFrequency(input);

        assertEquals(0, result.size());
    }

    @Test
    public void testCalculateFrequencyWithNullInput() {
        String input = null;

        List<CharacterFrequency> result = characterFrequencyController.calculateFrequency(input);

        assertEquals(0, result.size());
    }
}