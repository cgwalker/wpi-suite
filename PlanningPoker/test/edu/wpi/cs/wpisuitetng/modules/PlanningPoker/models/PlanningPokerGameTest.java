/*******************************************************************************
 * Copyright (c) 2012-2014 -- WPI Suite
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: team struct-by-lightning
 *******************************************************************************/
package edu.wpi.cs.wpisuitetng.modules.PlanningPoker.models;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Tests for the PlanningPokerGame class
 * 
 * @author Alec Thompson - ajthompson
 * @version Apr 15, 2014
 */
public class PlanningPokerGameTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public final void getGameNameTest() {
		PlanningPokerGame test = new PlanningPokerGame("test game name",
				"test description", "fibonacci", null, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertTrue(test.getGameName().equals("test game name"));
	}

	@Test
	public final void getDescriptionTest() {
		PlanningPokerGame test = new PlanningPokerGame("test game name",
				"test description", "fibonacci", null, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertTrue(test.getDescription().equals("test description"));
	}

	@Test
	public final void getDeckTypeTest() {
		PlanningPokerGame test = new PlanningPokerGame("test game name",
				"test description", "fibonacci", null, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertTrue(test.getDeckType().equals("fibonacci"));
	}

	@Test
	public final void getRequirementIdsTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("test game name",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertTrue(test.getRequirementIds().contains(1));
		assertTrue(test.getRequirementIds().contains(2));
		assertTrue(test.getRequirementIds().contains(3));
		assertTrue(test.getRequirementIds().contains(4));
		assertTrue(test.getRequirementIds().contains(5));
	}

	@Test
	public final void getIsFinishedTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("test game name",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		PlanningPokerGame test2 = new PlanningPokerGame("test game name",
				"test description", "fibonacci", testIds, true, true,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertFalse(test.isFinished());
		assertTrue(test2.isFinished());
	}

	@Test
	public final void getIsLiveTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("test game name",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		PlanningPokerGame test2 = new PlanningPokerGame("test game name",
				"test description", "fibonacci", testIds, true, true,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertFalse(test.isLive());
		assertTrue(test2.isLive());
	}

	@Test
	public final void getStartDateTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("test game name",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertEquals(2014, test.getStartDate().get(GregorianCalendar.YEAR));
		assertEquals(3, test.getStartDate().get(GregorianCalendar.MONTH));
		assertEquals(20, test.getStartDate()
				.get(GregorianCalendar.DAY_OF_MONTH));
	}

	@Test
	public final void getEndDateTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("test game name",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertEquals(2014, test.getEndDate().get(GregorianCalendar.YEAR));
		assertEquals(5, test.getEndDate().get(GregorianCalendar.MONTH));
		assertEquals(28, test.getEndDate().get(GregorianCalendar.DAY_OF_MONTH));
	}

	@Test
	public final void getModeratorTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("test game name",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertTrue(test.getModerator().equals("ajthompson"));
	}

	/**
	 * The constructor should convert ";"s in the game name to ":"s
	 */
	@Test
	public final void gameNameColonConversionTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("2014-05-28 11;08;15",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertTrue(test.getGameName().equals("2014-05-28 11:08:15"));
	}

	@Test
	public final void getDeckValuesTest() {
		// TODO currently based on the mock data returned by the method
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("2014-05-28 11;08;15",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertTrue(test.getDeckValues().contains(1));
		assertTrue(test.getDeckValues().contains(2));
		assertTrue(test.getDeckValues().contains(3));
		assertTrue(test.getDeckValues().contains(5));
		assertTrue(test.getDeckValues().contains(8));
	}

	@Test
	public final void hasEndDateTest() {
		// TODO currently based on the mock data returned by the method
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("2014-05-28 11;08;15",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");
		PlanningPokerGame test2 = new PlanningPokerGame("2014-05-28 11;08;15",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(9999,
						5, 28), "ajthompson");

		assertEquals(true, test.hasEndDate());
		assertEquals(false, test2.hasEndDate());
	}

	@Test
	public final void toJsonTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("2014-05-28 11;08;15",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		String testString = test.toJSON();

		assertTrue(testString.contains("gameName"));
		assertTrue(testString.contains("2014-05-28 11:08:15"));
		assertTrue(testString.contains("moderator"));
		assertTrue(testString.contains("ajthompson"));
		assertTrue(testString.contains("description"));
		assertTrue(testString.contains("test description"));
		assertTrue(testString.contains("deckType"));
		assertTrue(testString.contains("fibonacci"));
		assertTrue(testString.contains("requirements"));
		assertTrue(testString.contains("[1,2,3,4,5]"));
		assertTrue(testString.contains("isFinished"));
		assertTrue(testString.contains("false"));
		assertTrue(testString.contains("isLive"));
		assertTrue(testString.contains("false"));
		assertTrue(testString.contains("startDate"));
		assertTrue(testString.contains("2014-04-20T00:00:00.000-0400"));
		assertTrue(testString.contains("endDate"));
		assertTrue(testString.contains("2014-06-28T00:00:00.000-0400"));
	}

	@Test
	public final void toJsonNullTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame nulltest = new PlanningPokerGame("null test", null,
				null, null, false, false, new GregorianCalendar(2014, 3, 20),
				new GregorianCalendar(2014, 5, 28), null);

		String nullString = nulltest.toJSON();

		assertTrue(nullString.contains("gameName"));
		assertTrue(nullString.contains("null test"));
		assertTrue(nullString.contains("moderator"));
		assertTrue(nullString.contains("null"));
		assertTrue(nullString.contains("description"));
		assertTrue(nullString.contains("deckType"));
		assertTrue(nullString.contains("requirements"));
		assertTrue(nullString.contains("[]"));
		assertTrue(nullString.contains("isFinished"));
		assertTrue(nullString.contains("false"));
		assertTrue(nullString.contains("isLive"));
		assertTrue(nullString.contains("false"));
		assertTrue(nullString.contains("startDate"));
		assertTrue(nullString.contains("2014-04-20T00:00:00.000-0400"));
		assertTrue(nullString.contains("endDate"));
		assertTrue(nullString.contains("2014-06-28T00:00:00.000-0400"));
	}

	@Test
	public final void fromJsonTest() {
		String jsonString = "{\"gameName\":\"2014-05-28 11:08:15\",\"moderator\":\"ajthompson\",\"description\":\"test description\",\"deckType\":\"fibonacci\",\"requirements\":[1,2,3,4,5],\"isFinished\":false,\"isLive\":false,\"startDate\":\"2014-04-20T00:00:00.000-0400\",\"endDate\":\"2014-06-28T00:00:00.000-0400\",\"isArchived\":\"false\"}";

		PlanningPokerGame result = PlanningPokerGame.fromJSON(jsonString);

		assertTrue(result.getGameName().equals("2014-05-28 11:08:15"));
		assertEquals(null, result.getDescription()); // not currently used
		assertTrue(result.getDeckType().equals("fibonacci"));
		assertTrue(result.getRequirementIds().contains(1));
		assertTrue(result.getRequirementIds().contains(2));
		assertTrue(result.getRequirementIds().contains(3));
		assertTrue(result.getRequirementIds().contains(4));
		assertTrue(result.getRequirementIds().contains(5));
		assertEquals(false, result.isFinished());
		assertEquals(false, result.isLive());
		assertEquals(2014, result.getStartDate().get(GregorianCalendar.YEAR));
		assertEquals(3, result.getStartDate().get(GregorianCalendar.MONTH));
		assertEquals(20,
				result.getStartDate().get(GregorianCalendar.DAY_OF_MONTH));
		assertEquals(2014, result.getEndDate().get(GregorianCalendar.YEAR));
		assertEquals(5, result.getEndDate().get(GregorianCalendar.MONTH));
		assertEquals(28, result.getEndDate()
				.get(GregorianCalendar.DAY_OF_MONTH));
		assertTrue(result.getModerator().equals("ajthompson"));
	}

	@Test
	public final void fromJsonNullFieldsTest() {
		String jsonString = "{\"gameName\":\"null test\",\"moderator\":\"\",\"description\":\"\",\"deckType\":\"\",\"requirements\":[],\"isFinished\":false,\"isLive\":false,\"startDate\":\"2014-04-20T00:00:00.000-0400\",\"endDate\":\"2014-06-28T00:00:00.000-0400\",\"isArchived\":\"false\"}";

		PlanningPokerGame result2 = PlanningPokerGame.fromJSON(jsonString);

		assertTrue(result2.getGameName().equals("null test"));
		assertEquals(null, result2.getDescription()); // not currently used
		assertEquals(null, result2.getDeckType());
		assertTrue(result2.getRequirementIds().isEmpty());
		assertEquals(false, result2.isFinished());
		assertEquals(false, result2.isLive());
		assertEquals(2014, result2.getStartDate().get(GregorianCalendar.YEAR));
		assertEquals(3, result2.getStartDate().get(GregorianCalendar.MONTH));
		assertEquals(20,
				result2.getStartDate().get(GregorianCalendar.DAY_OF_MONTH));
		assertEquals(2014, result2.getEndDate().get(GregorianCalendar.YEAR));
		assertEquals(5, result2.getEndDate().get(GregorianCalendar.MONTH));
		assertEquals(28,
				result2.getEndDate().get(GregorianCalendar.DAY_OF_MONTH));
		assertEquals("", result2.getModerator());
	}

	@Test
	public final void getIDTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("2014-05-28 11;08;15",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertTrue(test.getID().equals("2014-05-28 11:08:15"));
	}

	@Test
	public final void getPrimaryKeyTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("2014-05-28 11;08;15",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertTrue(test.getPrimaryKey().equals("gameName"));
	}

	@Test
	public final void fromJsonArrayTest() {
		String jsonString = "[{\"gameName\":\"2014-05-28 11:08:15\",\"moderator\":\"ajthompson\",\"description\":\"test description\",\"deckType\":\"fibonacci\",\"requirements\":[1,2,3,4,5],\"isFinished\":false,\"isLive\":false,\"startDate\":\"2014-04-20T00:00:00.000-0400\",\"endDate\":\"2014-06-28T00:00:00.000-0400\",\"isArchived\":\"false\"},"
				+ "{\"gameName\":\"null test\",\"moderator\":\"\",\"description\":\"\",\"deckType\":\"\",\"requirements\":[],\"isFinished\":false,\"isLive\":false,\"startDate\":\"2014-04-20T00:00:00.000-0400\",\"endDate\":\"2014-06-28T00:00:00.000-0400\",\"isArchived\":\"false\"}]";

		PlanningPokerGame[] result = PlanningPokerGame
				.fromJsonArray(jsonString);

		assertTrue(result[0].getGameName().equals("2014-05-28 11:08:15"));
		assertEquals(null, result[0].getDescription()); // not currently used
		assertTrue(result[0].getDeckType().equals("fibonacci"));
		assertTrue(result[0].getRequirementIds().contains(1));
		assertTrue(result[0].getRequirementIds().contains(2));
		assertTrue(result[0].getRequirementIds().contains(3));
		assertTrue(result[0].getRequirementIds().contains(4));
		assertTrue(result[0].getRequirementIds().contains(5));
		assertEquals(false, result[0].isFinished());
		assertEquals(false, result[0].isLive());
		assertEquals(2014, result[0].getStartDate().get(GregorianCalendar.YEAR));
		assertEquals(3, result[0].getStartDate().get(GregorianCalendar.MONTH));
		assertEquals(20,
				result[0].getStartDate().get(GregorianCalendar.DAY_OF_MONTH));
		assertEquals(2014, result[0].getEndDate().get(GregorianCalendar.YEAR));
		assertEquals(5, result[0].getEndDate().get(GregorianCalendar.MONTH));
		assertEquals(28,
				result[0].getEndDate().get(GregorianCalendar.DAY_OF_MONTH));
		assertTrue(result[0].getModerator().equals("ajthompson"));

		assertTrue(result[1].getGameName().equals("null test"));
		assertEquals(null, result[1].getDescription()); // not currently used
		assertEquals(null, result[1].getDeckType());
		assertTrue(result[1].getRequirementIds().isEmpty());
		assertEquals(false, result[1].isFinished());
		assertEquals(false, result[1].isLive());
		assertEquals(2014, result[1].getStartDate().get(GregorianCalendar.YEAR));
		assertEquals(3, result[1].getStartDate().get(GregorianCalendar.MONTH));
		assertEquals(20,
				result[1].getStartDate().get(GregorianCalendar.DAY_OF_MONTH));
		assertEquals(2014, result[1].getEndDate().get(GregorianCalendar.YEAR));
		assertEquals(5, result[1].getEndDate().get(GregorianCalendar.MONTH));
		assertEquals(28,
				result[1].getEndDate().get(GregorianCalendar.DAY_OF_MONTH));
		assertEquals("", result[1].getModerator());
	}

	@Test
	public final void getSelectedCardIndicesTest() {
		// TODO this method returns a placeholder empty arraylist
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("2014-05-28 11;08;15",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertTrue(test.getSelectedCardIndices(null, null).isEmpty());
	}

	@Test
	public final void setIDTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("2014-05-28 11;08;15",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertTrue(test.getID().equals("2014-05-28 11:08:15"));
		// change the id
		test.setID("test");
		assertTrue(test.getID().equals("test"));
	}

	@Test
	public final void setGameNameTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("2014-05-28 11;08;15",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");

		assertTrue(test.getGameName().equals("2014-05-28 11:08:15"));
		// change the id
		test.setGameName("test");
		assertTrue(test.getGameName().equals("test"));
	}

	@Test
	public final void removeRequirementTest() {
		List<Integer> testIds = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		PlanningPokerGame test = new PlanningPokerGame("2014-05-28 11;08;15",
				"test description", "fibonacci", testIds, false, false,
				new GregorianCalendar(2014, 3, 20), new GregorianCalendar(2014,
						5, 28), "ajthompson");
		
		assertTrue(test.getRequirementIds().contains(1));
		assertTrue(test.getRequirementIds().contains(2));
		assertTrue(test.getRequirementIds().contains(3));
		assertTrue(test.getRequirementIds().contains(4));
		assertTrue(test.getRequirementIds().contains(5));
		
		boolean remove = test.removeRequirement(3);
		
		assertTrue(test.getRequirementIds().contains(1));
		assertTrue(test.getRequirementIds().contains(2));
		assertFalse(test.getRequirementIds().contains(3));
		assertTrue(test.getRequirementIds().contains(4));
		assertTrue(test.getRequirementIds().contains(5));
		
		assertEquals(true, remove);
	}
}
