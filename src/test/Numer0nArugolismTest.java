package test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import main.Numer0nArugolism;

import org.junit.Before;
import org.junit.Test;

public class Numer0nArugolismTest {
  private Numer0nArugolism arugolism;

  @Before
  public void setUp() {
    arugolism = new Numer0nArugolism();
  }

  @Test
  public void test_三桁の数字を一桁ずつの文字に分割して文字列型の配列に入れて返すことができる() {
    String[] actual = arugolism.splitNumber("123");
    assertThat(actual[0], is("1"));
    assertThat(actual[1], is("2"));
    assertThat(actual[2], is("3"));
  }

  @Test
  public void test_0eat0biteなら文字列で0コロン0が帰ってくる() {
    String actual = arugolism.analyze("813", "456");
    assertThat(actual, is("0:0"));
  }

  @Test
  public void test_1eatのみなら文字列で1コロン0が帰ってくる() {
    String actual = arugolism.analyze("813", "453");
    assertThat(actual, is("1:0"));
  }

  @Test
  public void test_1biteのみなら文字列で1コロン0が帰ってくる() {
    String actual = arugolism.analyze("813", "458");
    assertThat(actual, is("0:1"));
  }

  @Test
  public void test_2biteのみなら文字列で0コロン2が帰ってくる() {
    String actual = arugolism.analyze("813", "351");
    assertThat(actual, is("0:2"));
  }

  @Test
  public void test_3biteなら文字列で0コロン3が帰ってくる() {
    String actual = arugolism.analyze("813", "381");
    assertThat(actual, is("0:3"));
  }

  @Test
  public void test_2eatのみなら文字列で2コロン0が帰ってくる() {
    String actual = arugolism.analyze("813", "213");
    assertThat(actual, is("2:0"));
  }

  @Test
  public void test_3eatのみなら文字列で2コロン0が帰ってくる() {
    String actual = arugolism.analyze("813", "813");
    assertThat(actual, is("3:0"));
  }

  @Test
  public void test_1eat1biteなら文字列で1コロン1が帰ってくる() {
    String actual = arugolism.analyze("813", "218");
    assertThat(actual, is("1:1"));
  }

  @Test
  public void test_1eat2biteなら文字列で1コロン1が帰ってくる() {
    String actual = arugolism.analyze("813", "318");
    assertThat(actual, is("1:2"));
  }

  @Test
  public void test_拡張機能112と113がきたら２eat() {
    String actual = arugolism.analyze("112", "113");
    assertThat(actual, is("2:0"));
  }

  @Test
  public void test_拡張機能111と111がきたら3eat() {
    String actual = arugolism.analyze("111", "111");
    assertThat(actual, is("3:0"));
  }

  @Test
  public void test_拡張機能112と131がきたら1eat1bite() {
    String actual = arugolism.analyze("112", "131");
    assertThat(actual, is("1:1"));
  }

  @Test
  public void test_拡張機能121と313がきたら1bite() {
    String actual = arugolism.analyze("121", "313");
    assertThat(actual, is("0:1"));
  }

  @Test
  public void test_拡張機能313と121がきたら1bite() {
    String actual = arugolism.analyze("313", "121");
    assertThat(actual, is("0:1"));
  }

  @Test
  public void test_拡張機能313と131がきたら2bite() {
    String actual = arugolism.analyze("313", "131");
    assertThat(actual, is("0:2"));
  }

  @Test
  public void test_拡張機能188と853がきたら1bite() {
    String actual = arugolism.analyze("188", "853");
    assertThat(actual, is("0:1"));
  }

  @Test
  public void test_拡張機能853と188がきたら1bite() {
    String actual = arugolism.analyze("853", "188");
    assertThat(actual, is("0:1"));
  }

  @Test
  public void test_拡張機能818と853がきたら1eat() {
    String actual = arugolism.analyze("818", "853");
    assertThat(actual, is("1:0"));
  }

  @Test
  public void test_拡張機能118と121がきたら1eat1bite() {
    String actual = arugolism.analyze("118", "121");
    assertThat(actual, is("1:1"));
  }

  @Test
  public void test_拡張機能118と111がきたら2eat() {
    String actual = arugolism.analyze("118", "111");
    assertThat(actual, is("2:0"));
  }
}
