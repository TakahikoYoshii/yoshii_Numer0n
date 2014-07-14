package test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import main.Main;

import org.junit.Test;

public class MainTest {

  @Test
  public void test_入力が無いときisBlanckメソッドはfalseを返す() {
    String[] args = new String[] {};
    assertThat(Main.isBlanck(args), is(false));
  }

  @Test
  public void test_入力があるときはisBlanckメソッドはtrueを返す() {
    String[] args = new String[] {"", "any"};
    assertThat(Main.isBlanck(args), is(true));
  }

  @Test
  public void test_入力が足りない時はisBlanckメソッドはfalseを返す() {
    String[] args = new String[] {""};
    assertThat(Main.isBlanck(args), is(false));
  }

  @Test
  public void test_入力が数字以外の時はcheckInputメソッドはfalseを返す() {
    assertThat(Main.checkInput("a"), is(false));
  }

  @Test
  public void test_入力が数字以外の時はcheckInputメソッドはfalseを返す2() {
    assertThat(Main.checkInput("あ"), is(false));
  }

  @Test
  public void test_入力が数字の時はcheckInputメソッドはtrueを返す() {
    assertThat(Main.checkInput("123"), is(true));
  }

  @Test
  public void test_入力が数字の桁数が足りない時はcheckInputメソッドはfalseを返す() {
    assertThat(Main.checkInput("1"), is(false));
  }

  @Test
  public void test_入力が数字の桁数が足りない時はcheckInputメソッドはfalseを返す2() {
    assertThat(Main.checkInput("12"), is(false));
  }

  @Test
  public void test_入力が数字の桁数が多い時もcheckInputメソッドはfalseを返す() {
    assertThat(Main.checkInput("1234"), is(false));
  }
}
