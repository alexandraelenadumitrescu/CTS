package cor_html.main;


import cor_html.implementare.*;

public class Main {
    public static void main(String[] args) {

        // Construire lant
        AHandler handlerVideo  = new HandlerTagVideo();
        AHandler handlerIframe = new HandlerTagIframe();
        AHandler handlerScript = new HandlerTagScript();
        AHandler handlerCanvas = new HandlerTagCanvas();

        handlerVideo
                .setNextHandler(handlerIframe)
                .setNextHandler(handlerScript)
                .setNextHandler(handlerCanvas);

        // Request
        String htmlBrut = """
                <html>
                  <body>
                    <h1>Titlu pagina</h1>
                    <video controls><source src="film.mp4"></video>
                    <iframe src="https://ads.com"></iframe>
                    <script>alert('xss')</script>
                    <canvas id="chart"></canvas>
                    <p>Continut normal</p>
                  </body>
                </html>
                """;

        ContinutHtml pagina = new ContinutHtml("pagina-principala.html", htmlBrut);

        System.out.println("=== HTML ORIGINAL ===");
        System.out.println(pagina.getHtml());

        // Pornire lant de la primul handler
        String htmlFiltrat = handlerVideo.filtreazaTag(pagina.getHtml());

        System.out.println("\n=== HTML FILTRAT ===");
        System.out.println(htmlFiltrat);
    }
}