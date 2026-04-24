package cor_html.implementare;


public class ContinutHtml {
    private String html;
    private String sursa;

    public ContinutHtml(String sursa, String html) {
        this.sursa = sursa;
        this.html = html;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getSursa() {
        return sursa;
    }
}