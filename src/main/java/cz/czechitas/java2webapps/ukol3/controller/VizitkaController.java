package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Adresa;
import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

    private final List<Vizitka> seznamVizitek = List.of(
            new Vizitka(
                    "Dita (Přikrylová) Formánková",
                    "Czechitas z. s.",
                    new Adresa("Václavské náměstí", "837/11", "11000"),
                    "dita@czechitas.cs",
                    "+420 800123456",
                    "www.czechitas.cz"
            ),
            new Vizitka(
                    "Barbora Bühnová",
                    "SomeCompany",
                    new Adresa("Václavské náměstí", "837/11", "11000"),
                    null,
                    "+420 800123456",
                    "www.czechitas.cz"
            ),
            new Vizitka(
                    "Monika Ptáčníková",
                    "Czechitas z. s.",
                    new Adresa("Václavské náměstí", "837/11", "11000"),
                    "monika@czechitas.cs",
                    "+420 800123456",
                    "www.czechitas.cz"
            ),
            new Vizitka(
                    "Mirka Zatloukalová",
                    "Czechitas z. s.",
                    new Adresa("Václavské náměstí", "837/11", "11000"),
                    "mirka@czechitas.cs",

                    null,
                    "www.czechitas.cz"
            ),
            new Vizitka(
                    "Jan Novotný",
                    "jan.novotny@firma.cz",
                    new Adresa("Čs. Ecilu", "2154/24", "14300"),
                    "Firma XYZ",
                    "+420 123456789",
                    null));


    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("/seznam");
        modelAndView.addObject("vizitkaList", seznamVizitek);
        return modelAndView;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("kontakt", seznamVizitek.get(id));
        return modelAndView;
    }
}
