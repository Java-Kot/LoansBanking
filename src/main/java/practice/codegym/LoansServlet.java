package practice.codegym;

import com.sun.org.apache.xml.internal.serialize.Printer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoansServlet extends  HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        double loans = Double.parseDouble(request.getParameter("loans"));
        double rate = Double.parseDouble(request.getParameter("rate")) / 100;
        int months = Integer.parseInt(request.getParameter("months"));
        double sum = loans + (loans * rate * months);

        PrintWriter writer = response.getWriter();
        writer.print("\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>Loans Banking Summaray</title>\n" +
                "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n" +
                "    <style>\n" +
                "        form{\n" +
                "            width: 30%;\n" +
                "            margin: auto;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div>\n" +
                "    <ul>\n" +
                "        <li>Loans: " + loans + "$</li>\n" +
                "        <li>Rate: " + rate * 100 + "</li>\n" +
                "        <li>For: " + months + " months</li>\n" +
                "        <li>It will be: " + sum + "$</li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
    }
}
