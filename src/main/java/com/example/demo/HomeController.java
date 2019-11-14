package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeComtroller {
    @GetMapping("/home")
    public String home(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"UTF-8\" />\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n" +
                "    <title>Zooner</title>\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"css/stylesheet.css\" type=\"Text/css\" />\n" +
                "    <script src=\"javascript.js\"></script>\n" +
                "  </head>\n" +
                "\n" +
                "  <body>\n" +
                "    <header id=\"mainHeader\">\n" +
                "      <div class=\"container\">\n" +
                "        <h1>Zooner</h1>\n" +
                "      </div>\n" +
                "    </header>\n" +
                "\n" +
                "    <nav id=\"navBar\">\n" +
                "      <div class=\"container\">\n" +
                "        <ul>\n" +
                "          <li><a href=\"#\">Home</a></li>\n" +
                "          <li><a href=\"#\">About</a></li>\n" +
                "          <li><a href=\"#\">Services</a></li>\n" +
                "          <li><a href=\"#\">Contact</a></li>\n" +
                "        </ul>\n" +
                "      </div>\n" +
                "    </nav>\n" +
                "\n" +
                "    <section id=\"showCase\">\n" +
                "      <div class=\"container\">\n" +
                "        <h2>With Zooner Your'e Faster Then Quicker</h2>\n" +
                "        <!-- <video width=\"520\" height=\"200\" controls>\n" +
                "          <source\n" +
                "            src=\"images/InvoiceWithGoogleCalendar-QuickBooksUS.mp4\"\n" +
                "            type=\"video/mp4\"\n" +
                "          />\n" +
                "          Your browser does not support this video tag\n" +
                "        </video> -->\n" +
                "      </div>\n" +
                "    </section>\n" +
                "\n" +
                "    <div>\n" +
                "      <section id=\"main\">\n" +
                "        <h2>Welcome</h2>\n" +
                "        <p>\n" +
                "          <span style=\"color:red\"> Lorem </span> ipsum dolor sit amet\n" +
                "          consectetur adipisicing elit. Reprehenderit at temporibus qui tenetur\n" +
                "          iusto adipisci, repellat, et ratione doloribus suscipit odit totam\n" +
                "          quibusdam mollitia atque sed ducimus, dicta hic vitae!\n" +
                "        </p>\n" +
                "      </section>\n" +
                "\n" +
                "      <div>\n" +
                "        <form>\n" +
                "          Enter Name <input type=\"text\" /> Enter Name\n" +
                "          <input type=\"text\" /> Enter Name <input type=\"text\" /> Enter Name\n" +
                "          <input type=\"text\" /> Enter Name <input type=\"text\" />\n" +
                "        </form>\n" +
                "      </div>\n" +
                "\n" +
                "      <aside id=\"sideBar\">\n" +
                "        Lorem ipsum dolor, sit amet consectetur adipisicing elit. Aliquam vel\n" +
                "        odio, blanditiis fuga necessitatibus iste rerum praesentium nesciunt\n" +
                "        odit facere quo reiciendis ullam quam molestias modi nam adipisci!\n" +
                "        Officia, fuga.\n" +
                "      </aside>\n" +
                "    </div>\n" +
                "\n" +
                "    <footer id=\"mainFooter\">\n" +
                "      <p>Copyright &copy;2019 Zooner</p>\n" +
                "    </footer>    \n" +
                "  </body>\n" +
                "</html>\n";
    }
}
