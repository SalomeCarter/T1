package com.example.t1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterFrequency {
    private char character;
    private int frequency;

    public CharacterFrequency(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }


}

