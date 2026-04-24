package cor_html.implementare;


public class HandlerTagIframe extends AHandler {

    @Override
    public String filtreazaTag(String continutHtml) {
        System.out.println("HandlerTagIframe: elimin tag-urile <iframe>");
        String rezultat = continutHtml
                .replaceAll("(?i)<iframe[^>]*>.*?</iframe>", "<!-- iframe eliminat -->");

        if (getNextHandler() != null) {
            return getNextHandler().filtreazaTag(rezultat);
        }
        return rezultat;
    }
}
