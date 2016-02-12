import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import org.fluentlenium.adapter.FluentTest;

import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class WordPuzzleTest {
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
}
