package com.mycompany.app;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
       public static boolean search(ArrayList<Integer> array, int e) {
        System.out.println("inside search");
        if (array == null) return false;
  
        for (int elt : array) {
          if (elt == e) return true;
        }
        return false;
      }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public int sum(int a,int b,int c)
    {
	return a+b+c;
    }
}
	
