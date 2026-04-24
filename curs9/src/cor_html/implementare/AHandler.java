package cor_html.implementare;


public abstract class AHandler {
    private AHandler nextHandler;

    public AHandler setNextHandler(AHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler; // permite chaining: h1.setNext(h2).setNext(h3)
    }

    public AHandler getNextHandler() {
        return nextHandler;
    }

    public abstract String filtreazaTag(String continutHtml);
}
