import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class WordPuzzleTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("puzzle on a new page");
  }
  @Test
  public void puzzleword() {
    goTo("http://localhost:4567");
    fill("#userPhrase").with("word");
    submit(".btn");
    assertThat(pageSource()).contains("Puzzle Phrase");
  }
  @Test
  public void inputToPuzzle_phraseinputA_aToDash() {
    WordPuzzle testInputToPuzzle = new WordPuzzle();
    assertEquals("wr-p",testInputToPuzzle.inputToPuzzle("wrap"));
  }
  @Test
  public void inputToPuzzle_phraseinputE_eToDash() {
    WordPuzzle testInputToPuzzle = new WordPuzzle();
    assertEquals("sp--d d-m-nd",testInputToPuzzle.inputToPuzzle("speed demand"));
  }
  @Test
  public void inputToPuzzle_phraseinputI_iToDash() {
    WordPuzzle testInputToPuzzle = new WordPuzzle();
    assertEquals("R-gg--",testInputToPuzzle.inputToPuzzle("Reggie"));
  }
  @Test
  public void inputToPuzzle_phraseinputo_OToDash() {
    WordPuzzle testInputToPuzzle = new WordPuzzle();
    assertEquals("Wh-ck - M-l-!",testInputToPuzzle.inputToPuzzle("Whack a Mole!"));
  }
  @Test
  public void inputToPuzzle_phraseinputu_UToDash() {
    WordPuzzle testInputToPuzzle = new WordPuzzle();
    assertEquals("-nd-rgr--nd R--gh R-gg-d -nd R-w",testInputToPuzzle.inputToPuzzle("Underground Rough Rugged and Raw"));
  }
  @Test
  public void inputToPuzzle_defaultexample_ReplaceAllVowels() {
    WordPuzzle testInputToPuzzle = new WordPuzzle();
    assertEquals("B-l--v- y-- c-n -nd y--r- h-lfw-y th-r- - Th--d-r- R--s-v-lt",testInputToPuzzle.inputToPuzzle("Believe you can and youre halfway there - Theodore Roosevelt"));
  }
}
