package com.library;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get form data
        String title = request.getParameter("title");
        String id = request.getParameter("id");
        double price = Double.parseDouble(request.getParameter("price"));

        //create book object
        Book book = new Book(title, id, price);

        //save to file
        FileWriter fw = new FileWriter("books.txt", true);  //append mode
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(book.getDetails());
        bw.newLine();
        bw.close();

        //redirect back to the form or to a success page
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Book Added Successfully!</h2>");
        out.println("<a href='addBook.jsp'>Add Another Book</a>");
    }
}
