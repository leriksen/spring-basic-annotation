package com.springinaction.knight;

import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Knight;
import com.springinaction.knights.Quest;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class BraveKnightTest {
    @Test
    public void braveKnighShouldEmbarkOnQuest() {
        Quest quest = mock(Quest.class);

        Knight knight = new BraveKnight(quest);
        knight.embarkOnQuest();
        verify(quest, times(1)).embark();
    }
}
