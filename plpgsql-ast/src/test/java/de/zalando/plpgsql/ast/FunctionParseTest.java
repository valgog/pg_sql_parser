package de.zalando.plpgsql.ast;

import java.io.ByteArrayInputStream;

import org.junit.Test;

public final class FunctionParseTest 
{
	private static final String SIMPLE_EMPTY_FUNCTION = 
			"CREATE OR REPLACE FUNCTION increment(i integer) RETURNS integer AS $$ BEGIN END; $$ LANGUAGE plpgsql;";
	
	@Test
	public void test() throws Exception
	{
		ParseUtil.parse(new ByteArrayInputStream(SIMPLE_EMPTY_FUNCTION.getBytes()));
	}
}
