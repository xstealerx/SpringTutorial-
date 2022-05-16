package de.oette.course.E02;

import com.sun.tools.javac.util.List;
import java.util.ArrayList;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThDemoController {

  @GetMapping(value = { "/", "index.html" })
  public ModelAndView index(@RequestParam(defaultValue = "P1") Page page) {
    ArrayList<CardData> data = new ArrayList<CardData>();

    if (page.equals(Page.P1)) {
      data.add(createCardData("Lachs", "Bannane"));
      data.add(createCardData("Laich", "text"));
      data.add(createCardData("Glas", "Gel"));
    }
    if (page.equals(Page.P2)) {
    data.add(createCardData("Chapter2", "chapter2"));
    data.add(createCardData("Chapter2", "Cahpter2"));
    data.add(createCardData("Chapter2", "Cahpter2"));
    }

    ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.addObject("headerFragment", page.headerFragment);
    
    modelAndView.addObject("cardData", data);
    return modelAndView;
  }

  private CardData createCardData(String title, String text) {
    CardData cardData = new CardData();
    cardData.setText(title);
    cardData.setTitle(text);
    return cardData;
  }

  @GetMapping(value = { "/contact", "contact.html" })
  public ModelAndView contact() {
    return new ModelAndView("contact");
  }

  public static enum Page {
    P1("site-header"),
    P2("chapter2");
    public final String headerFragment;
    Page(String headerFragment){
        this.headerFragment = headerFragment;
    }
  }
}
