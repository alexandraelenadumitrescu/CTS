package cor_html.implementare;


public class HandlerTagScript extends AHandler {

    @Override
    public String filtreazaTag(String continutHtml) {
        System.out.println("HandlerTagScript: elimin tag-urile <script>");
        String rezultat = continutHtml
                .replaceAll("(?i)<script[^>]*>.*?</script>", "<!-- script eliminat -->");

        if (getNextHandler() != null) {
            return getNextHandler().filtreazaTag(rezultat);
        }
        return rezultat;
    }
}