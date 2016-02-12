import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WordPuzzle {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String userPhrase = request.queryParams("userPhrase");
      String result = inputToPuzzle(userPhrase);

      model.put("result", result);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
  public static String inputToPuzzle(String userPhrase) {
    String phraseReplaced = userPhrase.replaceAll("[aAeEiIoOuU]","-");
    return phraseReplaced;
  }
}
