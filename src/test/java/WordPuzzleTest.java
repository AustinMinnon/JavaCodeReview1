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
}
