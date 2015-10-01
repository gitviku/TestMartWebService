package org.koushik.javabrains.business;

import java.util.ArrayList;
import java.util.List;

import org.koushik.javabrains.model.Product;


public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl() {
		bookList.add("The Householder");
		bookList.add("Gandhi");
		bookList.add("The Yoga Sutras of Patanjli");
		
		musicList.add("Hard Days Night");
		musicList.add("James Taylor");
		musicList.add("Zakir HUssain and Hasriprasad Chaurasia");
		
		movieList.add("Lawrence of Arabia");
		movieList.add("The Sound of Music");
		movieList.add("Mother India");
		
	}
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category) {
		switch(category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product) {
		
		switch(category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}
	
	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Brains Book", "1234", 999999.99));
		productList.add(new Product("Another Book", "ABC", 12.50));
		System.out.println(productList);
		return productList;
	}
}
;