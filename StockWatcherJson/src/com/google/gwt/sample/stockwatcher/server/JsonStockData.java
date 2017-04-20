package com.google.gwt.sample.stockwatcher.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class JsonStockData extends HttpServlet {
	private static final double MAX_PRICE = 100.0;	// $100.00
	private static final double MAX_PRICE_CHANGE = 0.02;	// +/- 2%
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Random rdm = new Random();
		
		PrintWriter out = resp.getWriter();
		out.print("[\n");
		String[] stockSymbols = req.getParameter("q").split(" ");
		
		boolean firstSymbol = true;		
		for (String stockSymbol : stockSymbols) {
			double price = rdm.nextDouble() * MAX_PRICE;
			double change = price * MAX_PRICE_CHANGE * (rdm.nextDouble() * 2f - 1f);
			if (firstSymbol) {
				firstSymbol = false;
			} else {
				out.println(" ,");
			}
			out.println(" {");
			out.print("    \"symbol\": \"");
			out.print(stockSymbol);
			out.println("\",");
			out.print("    \"price\": ");
			out.print(price);
			out.println(',');
			out.print("    \"change\": ");
			out.println(change);			
			out.print(" }");
		}
		
		out.print("\n]");
		out.flush();
	}
		
}