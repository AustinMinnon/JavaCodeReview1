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
//       assertThat(pageSource()).contains("puzzle on a new page");
//   }
//   @Test
//   public void puzzleword() {
//   goTo("http://localhost:4567");
//   fill("#userPhrase").with("word");
//   submit(".btn");
//   assertThat(pageSource()).contains("Puzzle Phrase");
//   }
//   @Test
//   public void makeMoreChange() {
//     goTo("http://localhost:4567/detector");
//     fill("#userPhrase").with("gee wiz");
//     submit(".btn");
//     assertThat(pageSource()).contains("g-- w-z");
//   }
// }
