package org.nhindirect.policy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.nhindirect.policy.impl.JavaSerializedObjectLexiconPolicyParser;
import org.nhindirect.policy.impl.XMLLexiconPolicyParser;

public class PolicyLexiconParserFactory_getInstanceTest
{
	@Test
	public void testGetInstance_assertParser() throws Exception
	{
		PolicyLexiconParser parser = PolicyLexiconParserFactory.getInstance(PolicyLexicon.XML);
		assertTrue(parser instanceof XMLLexiconPolicyParser);
		
		parser = PolicyLexiconParserFactory.getInstance(PolicyLexicon.JAVA_SER);
		assertTrue(parser instanceof JavaSerializedObjectLexiconPolicyParser);
	}

}
