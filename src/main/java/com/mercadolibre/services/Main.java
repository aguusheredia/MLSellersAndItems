package com.mercadolibre.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mercadolibre.vo.*;

public class Main {

	static String URL_API_ITEMS;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Selección de un ID user
		Scanner scan = new Scanner (System.in);
		System.out.println("Choose an Id user");
		
		int userId = scan.nextInt();
		String responseItems = parseJSON(generateURL (userId));
		
		if (responseItems.length() > 0) {
			ArrayList <VOPublication> publications = JSONItemsToList(responseItems);
		
			
			try {
			        FileWriter writer = new FileWriter("C:/Users/Usuario/desktop/items.txt");
			        BufferedWriter bw = new BufferedWriter (writer);
			        
			        for (VOPublication p: publications) {
			        	StringBuilder str = new StringBuilder ();
			        	str.append(p.toString());
			        	bw.write(str.toString());
			        	bw.newLine();
			        }
			        
			        bw.close();

			} catch (IOException e) {
			        e.printStackTrace();
			}
		}
		
		else {
			System.out.print("The user " + userId + "is invalid");
		}
	}
	
	public static ArrayList <VOPublication> JSONItemsToList (String response) {
		
		ArrayList <VOPublication> publications = new ArrayList <VOPublication>();
		
		String json = response;
		
		JSONObject obj = new JSONObject (json);
		JSONArray array = obj.getJSONArray("results");
		
		for (int i = 0 ; i < array.length(); i ++) {
			
			VOPublication publication = new VOPublication();
			publication.setId(array.getJSONObject(i).getString("id"));
			publication.setTitle(array.getJSONObject(i).getString("title"));
			publication.setCategoryId(array.getJSONObject(i).getString("category_id"));
			String category = array.getJSONObject(i).getString("domain_id");
			category = category.substring(4);
			publication.setName(category);
			
			
			publications.add(publication);
		}
		
		return publications;
	}

	public static String generateURL (int idSeller) {
		
		return "https://api.mercadolibre.com/sites/MLA/search?seller_id=" + idSeller;
	}
	
	public static String parseJSON (String url) {
		
		try {
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target(url);
			String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
			String json = response;
			return response;
		}catch(Exception e) {
			System.out.print(e);
			return "";
		}
		
		
		
	}
	
}
