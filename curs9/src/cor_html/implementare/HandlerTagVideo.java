package cor_html.implementare;


public class HandlerTagVideo extends AHandler {

    @Override
    public String filtreazaTag(String continutHtml) {
        System.out.println("HandlerTagVideo: elimin tag-urile <video>");
        String rezultat = continutHtml
                .replaceAll("(?i)<video[^>]*>.*?</video>", "<!-- video eliminat -->");

        if (getNextHandler() != null) {
            return getNextHandler().filtreazaTag(rezultat);
        }
        return rezultat;
    }
}