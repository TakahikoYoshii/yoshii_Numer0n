package test;


import static org.junit.Assert.*;
import main.OutputMapping;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class OutputMappingTest {
	private OutputMapping mapping;
	
	@Before 
	public void setUp(){
		mapping = new OutputMapping();
	}
	
	@Test
	public void test_文字列で1コロン1と渡されると1Eat1Biteと返す() {
		String actual = mapping.getResultStatement("1:1");
		assertThat(actual, is("1Eat1Bite"));
	}

	@Test
	public void test_文字列で1コロン0と渡されると1Eatと返す() {
		String actual = mapping.getResultStatement("1:0");
		assertThat(actual, is("1Eat"));
	}

	@Test
	public void test_文字列で0コロン1と渡されると1Biteと返す() {
		String actual = mapping.getResultStatement("0:1");
		assertThat(actual, is("1Bite"));
	}

	@Test
	public void test_文字列で2コロン0と渡されると2Eatと返す() {
		String actual = mapping.getResultStatement("2:0");
		assertThat(actual, is("2Eat"));
	}

	@Test
	public void test_文字列で3コロン0と渡されると3Eatと返す() {
		String actual = mapping.getResultStatement("3:0");
		assertThat(actual, is("3Eat"));
	}

	@Test
	public void test_文字列で0コロン2と渡されると2Biteと返す() {
		String actual = mapping.getResultStatement("0:2");
		assertThat(actual, is("2Bite"));
	}

	@Test
	public void test_文字列で0コロン3と渡されると3Biteと返す() {
		String actual = mapping.getResultStatement("0:3");
		assertThat(actual, is("3Bite"));
	}

	@Test
	public void test_文字列で1コロン2と渡されると1Eat2Biteと返す() {
		String actual = mapping.getResultStatement("1:2");
		assertThat(actual, is("1Eat2Bite"));
	}
	
	@Test
	public void test_文字列で2コロン1と渡されると2Eat1Biteと返す() {
		String actual = mapping.getResultStatement("2:1");
		assertThat(actual, is("2Eat1Bite"));
	}

}
