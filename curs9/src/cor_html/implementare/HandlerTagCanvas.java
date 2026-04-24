package cor_html.implementare;


public class HandlerTagCanvas extends AHandler {

    @Override
    public String filtreazaTag(String continutHtml) {
        System.out.println("HandlerTagCanvas: elimin tag-urile <canvas>");
        String rezultat = continutHtml
                .replaceAll("(?i)<canvas[^>]*>.*?</canvas>", "<!-- canvas eliminat -->");

        if (getNextHandler() != null) {
            return getNextHandler().filtreazaTag(rezultat);
        }
        return rezultat;
    }
}