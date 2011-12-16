package org.springframework.issues;

import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Unit test that reproduces an issue reported against SPR JIRA. @Test methods
 * within need not pass with the green bar! Rather they should fail in such a
 * way that demonstrates the reported issue.
 */
public class ReproTests
{
	/**
	 * You will likely need to run this test more than once to get the desired
	 * error.
	 * 
	 * Caused by: java.beans.IntrospectionException: type mismatch between
	 * indexed and non-indexed methods: rowHeight.
	 * 
	 * The stacktrace to expact can be found in src/test/resources/stacktrace
	 */
	@Test
	public void repro()
	{
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:org/springframework/issues/ReproTests-context.xml");
		ctx.refresh();
	}
}
