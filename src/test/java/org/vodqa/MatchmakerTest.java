package org.vodqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.vodqa.Matchmaker.Gender.FEMALE;
import static org.vodqa.Matchmaker.Gender.MALE;

public class MatchmakerTest {

    Matchmaker agent = new Matchmaker();

    @Test
    public void test21YearOldMale() {
        assertTrue(agent.isEligibleForMarriage(21, MALE));
    }

    @Test
    public void test19YearOldFemale() {
        assertTrue(agent.isEligibleForMarriage(19, FEMALE));
    }

    @Test
    public void testAllMales() {
        assertFalse(agent.isEligibleForMarriage(17, MALE));
        assertFalse(agent.isEligibleForMarriage(18, MALE));
        assertFalse(agent.isEligibleForMarriage(19, MALE));
        assertFalse(agent.isEligibleForMarriage(20, MALE));
        assertTrue(agent.isEligibleForMarriage(21, MALE));
        assertTrue(agent.isEligibleForMarriage(22, MALE));
        assertFalse(agent.isEligibleForMarriage(17, FEMALE));
        assertTrue(agent.isEligibleForMarriage(18, FEMALE));
        assertTrue(agent.isEligibleForMarriage(19, FEMALE));
        assertTrue(agent.isEligibleForMarriage(20, FEMALE));
        assertTrue(agent.isEligibleForMarriage(21, FEMALE));
        assertTrue(agent.isEligibleForMarriage(22, FEMALE));
        assertFalse(agent.isEligibleForMarriage(17, null));
        assertFalse(agent.isEligibleForMarriage(18, null));
        assertFalse(agent.isEligibleForMarriage(20, null));
        assertTrue(agent.isEligibleForMarriage(21, null));
        assertTrue(agent.isEligibleForMarriage(22, null));
    }
}
