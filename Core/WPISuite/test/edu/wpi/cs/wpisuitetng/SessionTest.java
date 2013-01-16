/*******************************************************************************
 * Copyright (c) 2012 -- WPI Suite
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    twack
 *******************************************************************************/

package edu.wpi.cs.wpisuitetng;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;

import org.junit.*;

import edu.wpi.cs.wpisuitetng.Session;
import edu.wpi.cs.wpisuitetng.modules.core.models.User;

/**
 * Unit tests for the Session class. Runs tests across the Session class.
 * @author twack
 *
 */
public class SessionTest {
	Session ses1;
	User u1;
	
	@Before
	public void setUp()
	{
		this.u1 = new User("Tyler", "twack", null, 0);
		this.ses1 = new Session(u1);
	}
	
	/* Testing Session accessors */
	
	@Test
	public void testUsername()
	{
		assertTrue(this.ses1.getUsername().equals("twack"));
	}
	
	@Test
	/**
	 * Test the LoginTime generation. Should initialize to the current time (new Date())
	 */
	public void testLoginTime()
	{
		Date now = new Date();
		
		assertTrue(now.equals(this.ses1.getLoginTime()));
	}
	
	@Test
	public void testToString()
	{
		// DateFormat for the gson serializer: MMM d, yyyy h:mm:ss a
		SimpleDateFormat format = new SimpleDateFormat("MMM d, yyyy h:mm:ss a");
		Date loginTime = this.ses1.getLoginTime();
		
		String json = "{\"user\":" + this.u1.toString() + ",\"loginTime\":\"" + format.format(loginTime) + "\"}";		
		
		assertTrue(json.equals(this.ses1.toString()));
	}
	
	@Test
	/**
	 * Tests the cookie serialization of the Session object.
	 * 	The header is expected to be in the format: "WPISUITE-[username]"
	 * 	The body is expected to be the JSON representation generated by Session.toString()
	 */
	public void testCookie()
	{
		Cookie cook = this.ses1.toCookie();
		String header = "WPISUITE-twack";
		String body = this.ses1.toString();
		
		assertTrue(cook.getName().equals(header)); // test cookie Header correctness
		assertTrue(cook.getValue().equals(body)); // test cookie Body correctness
	}
}
