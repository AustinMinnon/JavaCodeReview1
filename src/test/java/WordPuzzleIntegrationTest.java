// import org.junit.ClassRule;
// import org.junit.Test;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//
// import static org.assertj.core.api.Assertions.assertThat;
//
// public class WordPuzzleTest extends FluentTest {
//   public WebDriver webDriver = new HtmlUnitDriver();
//   public WebDriver getDefaultDriver() {
//       return webDriver;
//   }
//
//   @ClassRule
//   public static ServerRule server = new ServerRule();
//
//   @Test
//   public void rootTest() {
//       goTo("http://localhost:4567/");
//       assertThat(pageSource()).contains("Cash Register, FOR CHANGE ONLY");
//   }
//   @Test
//   public void makeChange() {
//   goTo("http://localhost:4567");
//   fill("#changeDue").with("95");
//   submit(".btn");
//   assertThat(pageSource()).contains("Quarters: 3 Dimes: 2 Nickels: 0 Pennies: 0");
//   }
//   @Test
//   public void makeMoreChange() {
//     goTo("http://localhost:4567");
//     fill("#changeDue").with("11");
//     submit(".btn");
//     assertThat(pageSource()).contains("Quarters: 0 Dimes: 1 Nickels: 0 Pennies: 1");
//   }
//   @Test
//   public void replacePhrase_word_wDASHrd() {
//     WordPuzzle isWordPuzzle = new WordPuzzle();
//     assertEquals("w-rd", replacePhrase.isWordPuzzle("word"));
//   }
// }
