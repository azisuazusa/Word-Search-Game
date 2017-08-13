package com.paperplanes.wordsearch.presentation.model;

import com.paperplanes.wordsearch.domain.model.UsedWord;
import com.paperplanes.wordsearch.presentation.custom.StreakView;
import com.paperplanes.wordsearch.presentation.model.mapper.StreakLineMapper;

/**
 * Created by abdularis on 18/07/17.
 */

public class UsedWordViewModel {

    private static StreakLineMapper sStreakLineMapper = new StreakLineMapper();

    private UsedWord mUsedWord;

    public UsedWordViewModel(UsedWord usedWord) {
        mUsedWord = usedWord;
    }

    public StreakView.StreakLine getStreakLine() {
        return sStreakLineMapper.map(mUsedWord.getAnswerLine());
    }

    public UsedWord getUsedWord() {
        return mUsedWord;
    }

    public int getId() {
        return mUsedWord.getId();
    }

    public void setId(int id) {
        mUsedWord.setId(id);
    }

    public String getString() {
        return mUsedWord.getString();
    }

    public void setString(String string) {
        mUsedWord.setString(string);
    }

    public boolean isAnswered() {
        return mUsedWord.isAnswered();
    }

    public void setAnswered(boolean answered) {
        mUsedWord.setAnswered(answered);
    }

}
